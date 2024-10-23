public class TesteArvoreBinaria {
    public static void main(String[] args) {

        ArvoreBinaria Arvore = new ArvoreBinaria();
        arvore.adicionar(100);
        arvore.adicionar(200);
        arvore.adicionar(10);
        arvore.adicionar(50);
        arvore.adicionar(10);
        arvore.adicionar(180);

        System.out.println(arvore.getInfo());
    }
}
