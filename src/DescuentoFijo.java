public class DescuentoFijo extends Descuento{
    private float cantidad;

    public DescuentoFijo(float cantidad){
        this.cantidad = cantidad;
    }

    @Override
    public float aplicarDescuento(float precio) {
        return precio - this.cantidad;
    }
}
