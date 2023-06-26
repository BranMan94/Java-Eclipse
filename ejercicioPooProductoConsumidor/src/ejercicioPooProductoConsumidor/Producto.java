package ejercicioPooProductoConsumidor;

public class Producto {
    //1. definimos atributos
    public String nombreLibro;
    public String genero;
    public double precio;

    //2.definimos el constructor
    public Producto(String nombreLibro, String genero, double precio) {
        this.nombreLibro = nombreLibro;
        this.genero = genero;
        this.precio=precio;
    }

    //3. definimos los metodos

    //metodo para mostrar la informacion
    public void mostrarInformacion() {
        System.out.println("La informacion del producto");
        System.out.println("Nombre del libro: " + this.nombreLibro);
        System.out.println("Genero del libro: " + this.genero);
        System.out.println("Precio del libro: " + this.precio);
    }

    //metodo para aplicar el descuento del libro

    public void aplicarDescuento(double descuento){
        double resultado = ((100-descuento)/100)*this.precio;
        System.out.println("El libro con descuento es: " + resultado);
    }
}
