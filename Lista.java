public class Lista {

    private int size;
    private Nodo head;
    private Nodo cursor;

    public Lista() {
        size = 0;
        head = null;
        cursor = null;
    }

    public int getSize() {
        return size;
    }

    public Nodo getHead() {
        return head;
    }

    public Nodo getCursor() {
        return cursor;
    }

    public void setCursor(Nodo cursor) {
        this.cursor = cursor;
    }

    public void accodaNodo(Computer valore) {
        Nodo nuovoNodo = new Nodo(valore);

        if (head == null) {
            head = nuovoNodo;
            cursor = head;
        } else {
            Nodo temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(nuovoNodo);
        }
        size++;
    }

    public Computer leggiNodo(int indice) {
        if (indice < 0 || indice >= size) {
            System.out.println("Indice non valido");
            return null;
        }

        Nodo temp = head;
        for (int i = 0; i < indice; i++) {
            temp = temp.getNext();
        }
        return temp.getValore();
    }

    public Computer visitaNodo() {
        if (cursor == null)
            return null;

        Computer valore = cursor.getValore();
        cursor = cursor.getNext();
        return valore;
    }

    public void inserimentoNodo(Computer valore, int indice) {
        if (indice < 0 || indice > size) {
            System.out.println("Indice non valido");
            return;
        }

        Nodo nuovoNodo = new Nodo(valore);

        if (indice == 0) {
            nuovoNodo.setNext(head);
            head = nuovoNodo;
        } else {
            Nodo temp = head;
            for (int i = 0; i < indice - 1; i++) {
                temp = temp.getNext();
            }
            nuovoNodo.setNext(temp.getNext());
            temp.setNext(nuovoNodo);
        }
        size++;
    }

    public int ricercaNodo(Computer valore) {
        Nodo temp = head;
        int indice = 0;

        while (temp != null) {
            if (temp.getValore().equals(valore))
                return indice;
            temp = temp.getNext();
            indice++;
        }
        return -1;
    }

    public void eliminaNodo(int indice) {
        if (indice < 0 || indice >= size) {
            System.out.println("Indice non valido");
            return;
        }

        if (indice == 0) {
            head = head.getNext();
        } else {
            Nodo temp = head;
            for (int i = 0; i < indice - 1; i++) {
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }
        size--;
    }

    public void eliminaTuttiValori(Computer valore) {
        while (head != null && head.getValore().equals(valore)) {
            head = head.getNext();
            size--;
        }

        Nodo temp = head;
        while (temp != null && temp.getNext() != null) {
            if (temp.getNext().getValore().equals(valore)) {
                temp.setNext(temp.getNext().getNext());
                size--;
            } else {
                temp = temp.getNext();
            }
        }
    }

    public void inserimentoOrdinato(Computer valore) {
        Nodo nuovoNodo = new Nodo(valore);

        if (head == null || head.getValore().compareTo(valore) >= 0) {
            nuovoNodo.setNext(head);
            head = nuovoNodo;
        } else {
            Nodo temp = head;
            while (temp.getNext() != null &&
                    temp.getNext().getValore().compareTo(valore) < 0) {
                temp = temp.getNext();
            }
            nuovoNodo.setNext(temp.getNext());
            temp.setNext(nuovoNodo);
        }
        size++;
    }

    public void stampaLista() {
        Nodo temp = head;
        while (temp != null) {
            System.out.println(temp.getValore());
            temp = temp.getNext();
        }
    }
}
