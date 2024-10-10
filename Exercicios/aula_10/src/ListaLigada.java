public class ListaLigada {
    private Node inicio;
    private Node fim;
    private int tamanho;

    // Criando um construtor para permitir instanciar
    // uma lista ligada vazia.
    public ListaLigada() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    // criando um construtor que receberá o nó inicial
    /*
     * public Lista_Ligada(Node no) {
     * 
     * }
     */

    public void adicionar(Object info) {
        // Adiciona um novo nó na ultima posição da lista ligada.

        Node novoNo;
        if (tamanho == 0) {
            // Criando o primeiro nó que aponta para null
            novoNo = new Node(info, null);
            // Atribui o ponteiro inicio e fim para o primeiro Nó
            inicio = fim = novoNo;
            tamanho++; // Incrementa tamanho
        } else {
            novoNo = new Node(info, null);
            // Atribui o ponteiro do ultimo Nó para o novoNo
            fim.setproximoNo(novoNo);
            // Atribui o ponteiro fim para o NovoNo
            fim = novoNo;
            // Incremento tamanho
            tamanho++;
        }
    }

    public void adicionar(Object info, int indice) {
        // adiciona na posição definida pelo indice.
        Node novo, aux;
        if (indice == 0) {
            // se índice for 0 irá adicionar na primeira posição
            novo = new Node(info, inicio);
            inicio = novo;
            tamanho++;
        } else if (indice < tamanho) {
            // Adiciona nas demais posições.
            aux = percorreLista(indice - 1);
            // aux aponta para o Nó que está na posição anterior
            // a posição que será adicionada.
            novo = new Node(info, aux.getproximoNo());
            aux.setproximoNo(novo);
            tamanho++;
        } else if (indice == tamanho) {
            // Adiciona na ultima posição
            adicionar(info);
            tamanho++;
        }
    }

    public void remover(int indice) {
        if (indice == 0) {
            inicio = inicio.getproximoNo();
            tamanho--;

        } else if (indice < tamanho - 1) {
            Node aux = percorreLista(indice - 1);
            aux.setproximoNo(aux.getproximoNo().getproximoNo());
            tamanho--;
        } else if (indice == tamanho - 1) {
            Node aux = percorreLista(indice - 1);
            aux.setproximoNo(null);
            fim = aux;
            tamanho--;
        }
    }

    public Object getLista(int indice) {
        // Retornará o info do nó apontado índice
        return percorreLista(indice).getInfo();
    }

    private Node percorreLista(int indice) {
        // Percorre a lista ligada e retorna o node referente ao índice
        Node aux = inicio;// Atribui o primeiro Nó a aux
        if (indice <= tamanho) { // verifica se o índice é válido
            for (int i = 0; i < indice; i++) {
                // percorre a lista até a posição indicada pelo índice
                aux = aux.getproximoNo();
            }
            return aux;
        } else {
            return null;
        }

    }

    public int getTamanho() {
        // retorna o tamanho da lista
        return tamanho;
    }
}
