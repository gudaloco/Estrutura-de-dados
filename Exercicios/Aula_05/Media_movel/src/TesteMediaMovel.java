
import javax.swing.SwingUtilities;


public class TesteMediaMovel {
    
    public static void main(String[] args) {
        int tamanhoAmostras=200;
        int tamanhoJanela=40;
        MediaMovelVetor media=new MediaMovelVetor(tamanhoAmostras,tamanhoJanela);
        media.calculaMediaMovel();
        
        int[] amostras =media.vetorAmostras;
        int[] mediasMovel =media.mediaMovel;
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            DesenhoJanela janela=new DesenhoJanela(amostras,mediasMovel);
            }
        });
    }
    
   
}
