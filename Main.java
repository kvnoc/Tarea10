package Productos;

public class Main {

    public static void main(String args[])
    {
        ProductoControlador productoControlador = new ProductoControlador(5);

        productoControlador.crear( 119269, "LAPTOP HP", 1299);
        productoControlador.crear( 116962, "PROCESADOR INTEL CORE I9", 3109);
        productoControlador.crear( 118209, "LAPTOP ASUS", 1119);
        productoControlador.crear( 121082, "LAPTOP ACER", 1419);
        productoControlador.crear( 120277, "PROCESADOR AMD RYZEN 9", 3649);

        System.out.println("******* Productos Creados *******");

        for (Producto p: productoControlador.listar()){

            System.out.println("Codigo: "+p.getCodigo());
            System.out.println("Nombre: "+p.getNombres());
            System.out.println("Precio: S/"+p.getPrecio());
            System.out.println();
        }

        System.out.println("******* Buscar Producto *******");

        int codigo = 116962;

        Producto encontrado;

        encontrado = productoControlador.buscar(codigo);

        if(encontrado != null)
        {
            System.out.println("Producto: "+encontrado.getNombres());
            System.out.println("Precio: S/:"+ encontrado.getPrecio());

        } else {

            System.out.println("Producto no encontrado con el codigo: "+codigo);
        }

    }
}
