public interface SistemaTienda {

    void venderProducto();
    void generarFactura();
    void procesarPago();

    void consultarInventario();
    void actualizarInventario();
    void recibirMercancia();

    void procesarDevolucion();
    void gestionarReclamo();

    void generarReporteVentas();
}

public class TiendaD1Sistema implements SistemaTienda {

    public void venderProducto() {
        System.out.println("Venta realizada");
    }

    public void generarFactura() {
        System.out.println("Factura generada");
    }

    public void procesarPago() {
        System.out.println("Pago procesado");
    }

    public void consultarInventario() {
        System.out.println("Inventario consultado");
    }

    public void actualizarInventario() {
        System.out.println("Inventario actualizado");
    }

    public void recibirMercancia() {
        System.out.println("Mercancía recibida");
    }

    public void procesarDevolucion() {
        System.out.println("Devolución procesada");
    }

    public void gestionarReclamo() {
        System.out.println("Reclamo gestionado");
    }

    public void generarReporteVentas() {
        System.out.println("Reporte generado");
    }
}
