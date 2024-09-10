import java.util.ArrayList;

public class Pilha {

    ArrayList<Object> elementos;


    //Construtor
    public Pilha(){
        this.elementos=new ArrayList<Object>();
    }

    //metodo Verifica Pilha Cheia
    public boolean pilhaVazia(){
        if(elementos.size()==0) return true;
        else return                    false;
    }
    public void empilhar(Object item){
        elementos.add(item);
    }

    public Object desempilhar(){
        if(pilhaVazia())
        return elementos.remove(elementos.size() -1);
        return nulll;
    }
}
