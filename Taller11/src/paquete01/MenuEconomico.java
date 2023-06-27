package paquete01;

public class MenuEconomico extends Menu {

    private double porcentajeDescuento;

    public MenuEconomico(String nombrePlato, double valorMenu, double valorInicialMenu,
            double porcentajeDescuento) {
        super(nombrePlato, valorMenu, valorInicialMenu);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public void establecerPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public double calcularSubtotal() {
        double descuento = valorInicialMenu * porcentajeDescuento / 100.0;
        return valorMenu - descuento;
    }

    public String toString() {
        return super.toString() + "\nPorcentaje Descuento: " + porcentajeDescuento;
    }
}
