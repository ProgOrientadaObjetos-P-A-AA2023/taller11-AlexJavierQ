package paquete01;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

    private String nombreCliente;
    private double iva;
    private List<Menu> listaMenu;
    private double valorTotal;

    public Cuenta(String nombreCliente, double iva, List<Menu> listaMenu) {
        this.nombreCliente = nombreCliente;
        this.iva = iva;
        this.listaMenu = listaMenu;
        this.valorTotal = calcularValorTotal();
    }

    public void establecerNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void establecerIva(double iva) {
        this.iva = iva;
    }

    public void establecerListaMenu(List<Menu> listaMenu) {
        this.listaMenu = listaMenu;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public double obtenerIva() {
        return iva;
    }

    public List<Menu> obtenerListaMenu() {
        return listaMenu;
    }

    public double obtenerValorTotal() {
        return valorTotal;
    }

    protected double calcularValorTotal() {
        double subtotal = 0;
        for (Menu menu : listaMenu) {
            subtotal += menu.calcularSubtotal();
        }
        return subtotal + (subtotal * iva / 100.0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factura\n");
        sb.append("Cliente: ").append(nombreCliente).append("\n\n");
        for (Menu menu : listaMenu) {
            sb.append(menu).append("\n\n");
        }
        sb.append("Subtotal: ").append(valorTotal / (1 + (iva / 100.0))).append("\n");
        sb.append("IVA: ").append(iva).append("%\n");
        sb.append("Total a pagar: ").append(valorTotal);
        return sb.toString();
    }
}
