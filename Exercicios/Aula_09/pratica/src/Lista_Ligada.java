public class Lista_Ligada {
    private Node inicio;
    private Node fim;
    private int tamanho;

    // Criando um construtor para permitir instanciar
    // uma lista ligada vazia.
    public Lista_Ligada() {
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
        Node aux, anterior;
        Node novoNo;
        if (indice == 0) {
            aux inicio;
            novoNo = new Node(info, aux);
            inicio = novoNo;
            tamanho++;
        } else if (indice < tamanho) {
            // Retorna o Nó definido pelo indice
            aux = percorreLista(indice);
            novoNo = new Node(info, aux);
            anterior = percorreLista(indice - 1);
            anterior.setproximoNo(novoNo);
            tamanho++;
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
