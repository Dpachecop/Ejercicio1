public class DescuentoVeinte  extends Descuento{



    

    @Override
    public void descontar(double precioOriginal) {
      
        System.out.println("Su descuento es del 20%! Por lo tanto su precio final seria: " + ( precioOriginal -precioOriginal * 0.2) );
    }
    
}
