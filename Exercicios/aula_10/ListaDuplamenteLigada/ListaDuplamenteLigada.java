public class ListaDuplamenteLigada {
    NodeDuplo inicio, fim;
    int tamanho;

    public ListaDuplamenteLigada() {
        tamanho = 0;
        inicio = fim = null;
    }

    // Método para adiciona na ultima posição da lista
    public void adicionar(Object info) {

        // se inicio e fim forem null a lista está vazia.
        if (inicio == null) {
            // Adiciona na primeira posição
            NodeDuplo novoNo = new NodeDuplo(info, null, null);
            inicio = fim = novoNo;
            tamanho++;
        } else {
            // adiciona na ultima posição
            // Cria o novo Nó com o próximo apontando para NULL
            NodeDuplo novoNo = new nodeDuplo(info, null, fim);
            // Seta ProximoNo do ultimo Nó para o Novo Nó
            fim.setProximo(novoNo);
            // Altera o ponteiro do ultimo Nó para o novoNó
            fim = novoNo;
            tamanho++;
        }
    }

    public void adicionar(Object info, int indice) {
        // Adiciona em qualquer posição
        NodeDuplo novoNo;
        if (indice == 0) {
            novoNo = new NodeDuplo(info, inicio, null);
            inicio.setAnterior(novoNo);
            inicio = novoNo;
            tamanho++;
        } else if (indice == tamanho - 1) {
            adicionar(info);
        } else if (indice < tamanho - 1) {
            NodeDuplo aux = percorreLista(indice);
            novoNo = new nodeDuplo(info, aux, aux.getAnterior());

        }
    }

    public Object getLista(int indice) {
        // Retorna a informação do nó pelo índice
        return null;
    }

    private nodeDuplo percorreLista(int indice) {
        // percorre a lista e retorna o nó referente ao índice
        NodeDuplo aux;
        if (indice < tamanho / 2) {
            // Percorre a lista do inicio para o fim.
            aux = inicio;
            for (int i = 0; i < indice; i++) {
                aux = aux.getProximo();
            }
            return aux;
        } else {
            // Percorre a lista do fim para o inicio.
            aux = fim;
            for (int i = tamanho - 1; i > indice; i--) {
                aux = aux.getAnterior();
            }
            return aux;
        }

    }

    public void imprimirTodaLista() {
        // Percorre a lista até proximoNo == NULL
        NodeDuplo aux = inicio;
        while (aux != null) {
            System.out.println(aux.getInfo().toString());
            // Percorre a lista
            aux = aux.getProximo();
        }
    }
}
