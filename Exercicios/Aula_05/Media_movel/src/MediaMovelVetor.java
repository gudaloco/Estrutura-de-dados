
public class MediaMovelVetor {
    /*
     * Em estatística, a média móvel é um recurso utilizado para se
     * identificar a tendência de um conjunto de dados dispostos em uma série de
     * tempo.
     * A média móvel é calculada com base em uma janela de amostras que se desloca
     * ao longo do tempo.
     */

    int[] vetorAmostras;// Armazena todos os dados da amostra
    int[] mediaMovel; // Armazena os dados da janela móvel
    int janela;// Tamanho da janela móvel

    public MediaMovelVetor(int tamanhoAmostras, int janela) {
        this.janela = janela;
        vetorAmostras = new int[tamanhoAmostras];
        mediaMovel = new int[tamanhoAmostras - janela];
        preencherAmostras();
    }

    public void calculaMediaMovel() {
        // Calcula a média das amostras considerando a janela estipulada

        System.out.println("Médias: ");
        /*
         * === implemente o calculo da media m�vel aqui ====
         */

        // primeira tentativa com IA:
        /*
         * for (int i = 0; i < mediaMovel.length; i++) {
         * int media = 0;
         * for (int j = 1; j < janela; j++) {
         * media += vetorAmostras[i + j];
         * }
         * mediaMovel[i] = media / janela;
         * System.out.println("Media " + (i + 1) + ": " + mediaMovel[i]);
         * }
         */

        // Segunda tentativa entendendo melhor e mais organizado:
        for (int i = 0; i < vetorAmostras.length - janela; i++) {
            int media = 0;
            for (int j = 0; j < janela; j++) {
                media += vetorAmostras[j + i];
            }

            mediaMovel[i] = media / janela;
            System.out.println("Media " + (i + 1) + ": " + mediaMovel[i]);
        }
    }

    private void preencherAmostras() {
        // Preenche o vetor de amostras com valores aleatórios
        Double numeroRandomico;
        System.out.println("Amostras: ");
        for (int i = 0; i < vetorAmostras.length; i++) {
            numeroRandomico = (Math.random() * 400);
            vetorAmostras[i] = numeroRandomico.intValue();
            System.out.print(vetorAmostras[i] + " | ");
        }
    }

}
