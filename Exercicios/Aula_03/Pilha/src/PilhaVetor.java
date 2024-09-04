public class PilhaVetor {

    /*
     * Metodos Obrigatórios
     * Empilhar(Obj elemento)
     * Obj Desempilhar()
     * Booleano Pilha Vazia()
     * Booleano Pilha Cheia()
     */

    Object[] elementos;
    int indice;

    // ****** Construtor ******
    public PilhaVetor(int tamanho) {
        this.elementos = new Object[tamanho];
        indice = 0;
    }

    public boolean pilhaVazia() {
        if (indice == 0)
            return true;
        else
            return false;
    }

}
