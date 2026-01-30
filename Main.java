public class Main {

    public static void main(String[] args) {

        Lista listaComputer = new Lista();

        Computer c1 = new Computer("HP", "I9", 64);
        Computer c2 = new Computer("Dell", "Ryzen 7", 32);
        Computer c3 = new Computer("Lenovo", "I7", 16);

        System.out.println("La lista comprende i computer:");

        listaComputer.inserimentoOrdinato(c1);
        listaComputer.inserimentoOrdinato(c2);
        listaComputer.inserimentoOrdinato(c3);

        listaComputer.stampaLista();
    }
}
