public class FactoryDescuentoFijo extends FactoryDescuento{
    private float cantidad;

    public FactoryDescuentoFijo(float cantidad){
        this.cantidad = cantidad;
    }

    @Override
    public Descuento crearDescuento() {
        return new DescuentoFijo(cantidad);
    }
}
