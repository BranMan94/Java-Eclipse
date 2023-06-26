package ejercicioPooProductoConsumidor;

public class Consumidor extends Producto{

    public String nombreConsumidor;
    public String identificador;

    //definimos el constructor
    public Consumidor(String nombreLibro, String genero, double precio, String nombreConsumidor, String identificador) {
        super(nombreLibro, genero, precio);
        this.nombreConsumidor = nombreConsumidor;
        this.identificador = identificador;
        // TODO Auto-generated constructor stub
    }

    //definimos el metodo para mostrar la informacion
    public void mostrarDatosConsumidor() {
        mostrarInformacion();
        System.out.println("Nombre del consumidor: " + this.nombreConsumidor);
        System.out.println("Identificador del consumidor: " + this.identificador);
    }
    //definimos el metodo para mostrar el descuento
    public void informacionDescuento(double descuento) {
        System.out.println("El descuento a aplicar para: " + this.nombreLibro +", es de " + descuento+" por ciento, lo cual equivale a: " + ((this.precio/100)*descuento));
    }

    //aplicar el descuento, ya lo heredamos de producto

    public static void main(String[] args) {

        Consumidor consumidorcito = new Consumidor("La biblia", "biblico", 1000.0d, "Angel", "123456");

        consumidorcito.mostrarDatosConsumidor(); //llamamos al metodo mostrar datos consumidor
        System.out.println("--------------------");
        consumidorcito.informacionDescuento(15.0);//llamamos al metodo informacion del descuento
        System.out.println("--------------------");
        consumidorcito.aplicarDescuento(15.0);//llamamos al metodo aplicar descuento que es metodo heredado de producto
        System.out.println("--------------------");

    }

}