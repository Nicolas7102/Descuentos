public class DescuentoPorcentaje extends Descuento{
    private float porcentaje;

    public DescuentoPorcentaje(float porcentaje){
        this.porcentaje = porcentaje;
    }

    @Override
    public float aplicarDescuento(float precio) {
        return precio - (precio * (porcentaje / 100));
    }
}
