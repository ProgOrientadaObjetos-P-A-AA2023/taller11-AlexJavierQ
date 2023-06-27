package paquete01;

public abstract class Menu {

    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;

    public Menu(String nombrePlato, double valorMenu, double valorInicialMenu) {
        this.nombrePlato = nombrePlato;
        this.valorMenu = valorMenu;
        this.valorInicialMenu = valorInicialMenu;
    }

    public void establecerNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public void establecerValorMenu(double valorMenu) {
        this.valorMenu = valorMenu;
    }

    public void establecerValorInicialMenu(double valorInicialMenu) {
        this.valorInicialMenu = valorInicialMenu;
    }

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

    public double obtenerValorInicialMenu() {
        return valorInicialMenu;
    }

    public abstract double calcularSubtotal();

    public String toString() {
        return "Plato: " + nombrePlato + "\nValor Inicial: " + valorInicialMenu
                + "\nValor del Menú: " + valorMenu;
    }
}
