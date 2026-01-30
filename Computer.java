public class Computer {

    private String marca;
    private String processore;
    private int capacitaRAM;

    public Computer(String marca, String processore, int capacitaRAM) {
        this.marca = marca;
        this.processore = processore;
        this.capacitaRAM = capacitaRAM;
    }

    public String getMarca() {
        return marca;
    }

    public String getProcessore() {
        return processore;
    }

    public int getCapacitaRAM() {
        return capacitaRAM;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setProcessore(String processore) {
        this.processore = processore;
    }

    public void setCapacitaRAM(int capacitaRAM) {
        this.capacitaRAM = capacitaRAM;
    }

    public int compareTo(Computer c) {
        if (this.capacitaRAM < c.capacitaRAM)
            return -1;
        else if (this.capacitaRAM > c.capacitaRAM)
            return 1;
        else
            return 0;
    }

    public String toString() {
        return "Computer [Marca=" + marca +
                ", Processore=" + processore +
                ", RAM=" + capacitaRAM + "GB]";
    }
}
