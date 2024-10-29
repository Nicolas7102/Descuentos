public class App {
    public static void main(String[] args) {
        int precioBase = 500;
        System.out.println("Precio base: " + precioBase);

        FactoryDescuento factoryFijo = new FactoryDescuentoFijo(100);
        Descuento descuento1 = factoryFijo.crearDescuento();
        System.out.println("Precio con descuento fijo: " + descuento1.aplicarDescuento(precioBase));

        FactoryDescuento factoryPorcentaje = new FactoryDescuentoPorcentaje(50);
        Descuento descuento2 = factoryPorcentaje.crearDescuento();
        System.out.println("Precio con descuento porcentual: " + descuento2.aplicarDescuento(precioBase));
    }
}
