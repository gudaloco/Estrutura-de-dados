public class Grafo_Matriz_Adjacencias {
    int[][] matrizAdjacencias;
    String[] vertices;
    int indiceVertices;

    // Instancia a matriz conforme a quantidade de vertices.
    public Grafo_Matriz_Adjacencias(int qtdVertices) {
        this.matrizAdjacencias = new int[qtdVertices][qtdVertices];
        this.vertices = new String[qtdVertices];
        indiceVertices = 0;
    }

    // Método para criar um novo vertice
    public void addVertice(String nome) {
        if (indiceVertices < vertices.length) {
            vertices[indiceVertices] = nome;
            indiceVertices++;
        }
    }

    // Método para remover o último vertice
    public void removeVertice() {
        if (indiceVertices > 0) {
            vertices[indiceVertices - 1] = "";
            indiceVertices--;
        }
    }

    // Método para adicionar as relações (bidirecionais) entre dois vertices do
    // grafo.
    public void addArestaBidirecionais(int iVerticeA, int iVerticeB, int valor) {
        matrizAdjacencias[iVerticeA][iVerticeB] = valor;
        matrizAdjacencias[iVerticeB][iVerticeA] = valor;
    }

    // Método para adicionar a relação inidirecional entre o Vertice A para o B
    public void addArestaUnidirecionais(int iVerticeA, int iVerticeB, int valor) {
        matrizAdjacencias[iVerticeA][iVerticeB] = valor;
    }

    // Retorna as relações do vertice indicado pelo iVertice
    public String relacoesVertices(int iVertice) {
        String relacoes = "";
        for (int i = 0; i < vertices.length; i++) {
            relacoes += "\n Vertice: " + i + "=>";
            for (int j = 0; j < vertices.length; j++) {
                if (matrizAdjacencias[i][j] != 0) {
                    relacoes = relacoes + " Vertice " + j + "(" + matrizAdjacencias[i][j] + ")";
                }
            }
        }
        return relacoes;
    }

    // Implementar o método buscaProfundidade(iVerticeInicial, iVeticeFinal) que irá
    // buscar em profundidade até encontrar o vertice Final retornando um String com
    // o caminho percorrido
    // EXemplo: vertice inicial 0 => 2 => 3 => 1 ==FIM==

    public String buscaProfundidade(int iVerticeInicial, int iVerticeFinal) {
        return "";
    }

    public String buscaLargura(int iVerticeInicial, int iVerticeFinal) {
        return "";
    }

    public String buscaGulosa(int iVerticeInicial, int iVerticeFinal) {
        return "";
    }

    public static void main(String[] args) {
        Grafo_Matriz_Adjacencias meuGrafo = new Grafo_Matriz_Adjacencias(4);
        meuGrafo.addArestaBidirecionais(0, 2, 10);
        meuGrafo.addArestaBidirecionais(0, 3, 5);
        meuGrafo.addArestaBidirecionais(0, 1, 2);
        meuGrafo.addArestaUnidirecionais(2, 3, 8);
        meuGrafo.addArestaUnidirecionais(3, 1, 7);

        System.out.println(meuGrafo.relacoesVertices(0));
    }

}