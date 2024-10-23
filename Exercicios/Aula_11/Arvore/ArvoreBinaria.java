public class ArvoreBinaria {
    // Devemos criar uma classe que permita adiconar de forma ordenada de valores
    // inteiros, sem valores duplicados

    // Atributos da Árvores
    private NoArvoreBinaria raiz = null;

    public void adicionar(int info) {
        // Implente o código necessario para permitir adicionar novos nós na árvore
        // binária de forma ordenada, utilizando a seguinte regra: Se o valor de info
        // for maior que o valor do nó Adiciona a direita senão esquerda. Se o valor
        // for duplicado encerra sem adicionar.

        if (raiz == null) {// se raiz for nula cria o primeiro nó raiz
            raiz = new NoArvoreBinaria(info, null, null);
        } else {// Senão chama a adicionarRescursivo e passa a raiz como parametros
            adicionarRecursivo(info, raiz);
        }
    }

    public void preOrdem(NoArvoreBinaria node) {
        if (node != null) {
            // Impre Pai
            System.out.println(node.getInfo());
            // Imprime a Esquerda
            preOrdem(node.getNoEsquerda());
            // Imprime a Direita
            preOrdem(node.getNoDireita());
        }
    }

    private void adicionarRecursivo(int info, NoArvoreBinaria raiz) {
        if (info > Integer.parseInt(raiz.getInfo().toString())) {
            if (raiz.getNoDireita() == null) {
                raiz = new NoArvoreBinaria(info, null, noDireita.getInfo);
            } else {
                adicionarRecursivo(info, raiz.noDireita());
            }
        } else if (info < Integer.parseInt(raiz.getInfo().toString())) {
            if (raiz.getNoEsquerda() == null) {
                raiz = new NoArvoreBinaria(info, noEsquerda.getInfo, null);
            } else {
                adicionarRecursivo(info, raiz.noEsquerda());
            }
        } else {
            adicionarRecursivo(null, null);
        }
    }
}
