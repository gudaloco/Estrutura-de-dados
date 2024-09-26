
package AC1;

import Pilha.Pilha;

public class ValidaBalanceamento {

    public static boolean ValidaBalanceamento(String expressao) {

        Pilha pilha = new Pilha();

        // implementando o for para ler os caracteres
        for (int i = 0; i < expressao.length(); i++) {
            // da nome a um Object e armazena um paramatro i
            char character = expressao.charAt(i);

            // se o caracter é um simbolo de logica de abertura então enpilhar o mesmo
            // simbolo so que de fechar
            if (character == '{') {
                pilha.empilhar('}');
            } else if (character == '[') {
                pilha.empilhar(']');
            } else if (character == '(') {
                pilha.empilhar(')');
            }

            // se todos os caracteres desses citados acima estiverem na pilha
            // então retorna ==true== se não retorna ==false==
            else if (character == '}' || character == ']' || character == ')') {
                if (pilha.pilhaVazia()) {
                    return false;
                }
                // pega o elemento do topo da fila o converte para char
                char exibirTopo = (char) pilha.desempilhar();
                // se caracter for diferente do exibido então returna falso
                if (exibirTopo != character) {
                    return false;
                }

            }

        }
        // no final do processo retorna o valor da pilhaVazia
        return pilha.pilhaVazia();
    }
}
