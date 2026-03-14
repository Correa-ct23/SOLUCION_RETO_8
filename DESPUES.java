public interface Caja {

    void venderProducto();
    void generarFactura();
    void procesarPago();
}

public interface Bodega {

    void consultarInventario();
    void actualizarInventario();
    void recibirMercancia();
}

public interface SoporteCliente {

    void procesarDevolucion();
    void gestionarReclamo();
}

public interface Reportes {

    void generarReporteVentas();
}

public class SistemaCaja implements Caja {

    public void venderProducto() {
        System.out.println("Venta realizada");
    }

    public void generarFactura() {
        System.out.println("Factura generada");
    }

    public void procesarPago() {
        System.out.println("Pago procesado");
    }
}

public class SistemaBodega implements Bodega {

    public void consultarInventario() {
        System.out.println("Inventario consultado");
    }

    public void actualizarInventario() {
        System.out.println("Inventario actualizado");
    }

    public void recibirMercancia() {
        System.out.println("Mercancía recibida");
    }
}

public class SistemaSoporte implements SoporteCliente {

    public void procesarDevolucion() {
        System.out.println("Devolución procesada");
    }

    public void gestionarReclamo() {
        System.out.println("Reclamo gestionado");
    }
}

public class SistemaReportes implements Reportes {

    public void generarReporteVentas() {
        System.out.println("Reporte de ventas generado");
    }
}
