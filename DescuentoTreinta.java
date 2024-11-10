public class DescuentoTreinta extends Descuento {

    @Override
    public void descontar(double precioOriginal) {
        System.out.println("Su descuento es del 30%! Por lo tanto su precio final seria: " + (  precioOriginal - precioOriginal * 0.3 ) );
    }
     
}
