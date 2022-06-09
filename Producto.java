package Productos;

public class Producto {

    private int codigo;

    private String nombres;

    private double precio;

    public Producto(int codigo, String nombres, double precio)
    {
        this.nombres = nombres;

        this.codigo = codigo;

        this.precio = precio;
    }

    public String getNombres() {
        return nombres;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }
}
