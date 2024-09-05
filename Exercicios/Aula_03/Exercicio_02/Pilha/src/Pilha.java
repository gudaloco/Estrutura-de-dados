import java.util.ArrayList;

public class Pilha {

    ArrayList<Object> elementos;


    //Construtor
    public Pilha(){
        elementos=new ArrayList<Object>();
    }

    //metodo Verifica Pilha Cheia
    public boolean pilhaVazia(){
        if(elementos.size()==0) return true;
        else return                    false;
    }
    public void empilhar(Object item){

    }

    public Object desempilhar(){
        
    }



    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
