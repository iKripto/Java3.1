public class Numero {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public void imprimirValor() {
        System.out.println("Valor do atributo: " + valor);
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
