package Productos;

public class ProductoControlador {

    private Producto producto[];

    private int contador;

    public ProductoControlador(int size)
    {
        this.producto = new Producto[size];

        this.contador = 0;
    }

    public void crear(int codigo, String nombres, double precio)
    {
        this.producto[this.contador] = new Producto(codigo, nombres, precio);

        this.contador++;
    }

    public Producto buscar(int codigo)
    {
        int i;

        for(i=0; i<this.contador; i++)
        {
            if(this.producto[i].getCodigo()==(codigo))
            {
                break;
            }
        }

        if(i == this.contador)
        {
            return null;

        } else {

            return this.producto[i];
        }
    }

    public Producto[] listar()
    {
        return this.producto;
    }
    
}