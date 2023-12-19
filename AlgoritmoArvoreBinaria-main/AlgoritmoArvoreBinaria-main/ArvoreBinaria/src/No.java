public class No<T> {
    private T valor;
    private No<T> direita;
    private No<T> esquerda;

    public No(T novoValor) {
        this.valor = novoValor;
        this.esquerda = null;
        this.direita = null;
    }

    public No<T> getDireita() {
        return direita;
    }

    public void setDireita(No<T> direita) {
        this.direita = direita;
    }

    public No<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No<T> esquerda) {
        this.esquerda = esquerda;
    }

    public T getvalor() {
        return valor;
    }

    public void setvalor(T valor) {
        valor = valor;
    }
}
