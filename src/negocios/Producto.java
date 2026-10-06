package negocios;

public class Producto {
    public String nombre;
    public double precio;
    String categoria;

    public void mostrarInformacion(){
        System.out.println("Nombre: " +nombre+ "\nPrecio: " +precio);
    }

    void mostrarCategoria(){
        System.out.println("Categoria: " +categoria);
    }
}
