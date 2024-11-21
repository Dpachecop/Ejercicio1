
public class MainGestor{
    

    public static void main(String[] args) {
    
    
        GestorDescuento gestorDescuento = new GestorDescuento();
        Descuento DescuentoVeinte = new DescuentoVeinte();
        Descuento DecuentoCincuenta = new DecuentoCincuenta();
        Descuento DescuentoTreinta = new DescuentoTreinta();
        
        gestorDescuento.realizarDescuento(DescuentoVeinte, 100);
        gestorDescuento.realizarDescuento(DescuentoTreinta, 100);
        gestorDescuento.realizarDescuento(DecuentoCincuenta, 100);
        
        
            
        }

   
}

