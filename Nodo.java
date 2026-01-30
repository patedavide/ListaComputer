public class Nodo {

    private Computer valore;
    private Nodo next;

    public Nodo(Computer valore){
        this.valore = valore;
        this.next = null;
    }

    public Computer getValore() {
        return valore;
    }
    public void setValore(Computer valore) {
        this.valore = valore;
    }
    public Nodo getNext() {
        return next;
    }
    public void setNext(Nodo next) {
        this.next = next;
    }

    public String toString(){
        return "Nodo[valore: " + valore + "next: " + next +"]";
    }

}