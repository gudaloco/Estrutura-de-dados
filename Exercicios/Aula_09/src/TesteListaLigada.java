public class TesteListaLigada {

    public static void main(String[] args) {
        ListaLigada minhaLista = new ListaLigada();
        minhaLista.adicionar("Rodrigo");
        minhaLista.adicionar("pedro");
        minhaLista.adicionar("carlos");
        minhaLista.adicionar("creusa");
        for (int i = 0; i < 4; i++) {
            System.out.println(i + " - " + minhaLista.getLista(i));
        }
        // minhaLista.adicionar("Rafael", 4);
        minhaLista.remover(0);
        System.out.println("==============");
        for (int i = 0; i < minhaLista.getTamanho(); i++) {
            System.out.println(i + " - " + minhaLista.getLista(i));
        }

        // Para etregar na proxima aula.
        // Altere a método adicionarpara permitir adiciona no indice 0;
    }
}