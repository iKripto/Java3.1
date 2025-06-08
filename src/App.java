public class App {
        public static void main(String[] args) {
        Numero num = new Numero(42);

        num.imprimirValor();

        System.out.println("Referência (simulada como endereço): " + System.identityHashCode(num));

        num.setValor(99);
        System.out.println("Novo valor após alteração:");
        num.imprimirValor();
    }
}
