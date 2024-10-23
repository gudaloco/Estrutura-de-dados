public class NoArvoreBinaria {
    // O nó deverá possuir um campo info
    // e dois ponteiros para Nós
    private Object info;
    private NoArvoreBinaria noEsquerda, noDireita;

    public NoArvoreBinaria(Object info, NoArvoreBinaria noEsquerda, NoArvoreBinaria noDireita) {
        this.info = info;
        this.noEsquerda = noEsquerda;
        this.noDireita = noDireita;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public void setNoEsquerda(NoArvoreBinaria noEsquerda) {
        this.noEsquerda = noEsquerda;
    }

    public void setNoDireita(NoArvoreBinaria noDireita) {
        this.noDireita = noDireita;
    }

    public Object getInfo() {
        return info;
    }

    public NoArvoreBinaria getNoEsquerda() {
        return noEsquerda;
    }

    public NoArvoreBinaria getNoDireita() {
        return noDireita;
    }

}
