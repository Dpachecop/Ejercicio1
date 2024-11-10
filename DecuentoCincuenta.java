public class DecuentoCincuenta  extends Descuento{

    @Override
    public void descontar(double precioOriginal) {
        
        System.out.println("Su descuento es del 50%! Por lo tanto su precio final seria: " + (precioOriginal - precioOriginal * 0.5 ) );
    }
    
}
