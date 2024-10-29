public class FactoryDescuentoPorcentaje extends FactoryDescuento {
    private float porcentaje;

    public FactoryDescuentoPorcentaje(float porcentaje){
        this.porcentaje = porcentaje;
    }

    @Override
    public Descuento crearDescuento() {
        return new DescuentoPorcentaje(porcentaje);
    }
}
