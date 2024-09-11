import javax.sound.sampled.SourceDataLine;

public class testePilha {

    public static void main(String[] args) {
        PilhaVetor minhaPilha = new PilhaVetor(10);
        System.out.println("pilha esta vazia?: " + minhaPilha.pilhaVazia());

        System.out.println("pilha esta Cheia?: " + minhaPilha.pilhaCheia());

        for (int i = 0; i < 10; i++) {
            minhaPilha.empilhar(i);
            // System.out.println(i);
        }

        System.out.println("\n===================\n");

        for (int i = 0; i < 10; i++) {
            System.out.println(minhaPilha.desempilha());
        }

        //*********************Pilha com lista************************

    Pilha minhaPilha2 = new Pilha();
    System.out.println("pilha esta vazia?: ");

    System.out.println("pilha esta Cheia?: ");

    for (int i = 0; i < 10; i++) {
        minhaPilha2.empilhar(i);
        // System.out.println(i);
    }
    
    System.out.println("eeee");
    for (int i = 0; i < 10; i++) {
        //System.out.print(minhaPilha2.desempilha());
    }

    }
}
