package ejercicio10;
public class Ejercicio10 {
    public static void main(String[] args) {
       int var1 = (int) Math.sqrt(25) ;
       int var2 = 10 ;
       int var3 = var2*10 ;
       
       int var4 = var2/2 ;
       int var5= var2/5 ;
       
       boolean Respuesta ; 
       Respuesta = var1*var2>=var3 ;
       
       boolean Respuesta2 ;
       Respuesta2= var2/var4>=var5 ;
       
        boolean PrimConj ;
        PrimConj  = Respuesta && true;
       
        boolean PrimDisy ;
        PrimDisy = false || Respuesta2 ;
        
        boolean DisyMain ;
        DisyMain = PrimConj || PrimDisy ;
        System.out.println("La respuesta de la primera proposicion es: "+ PrimConj);
        System.out.println("La respuesta de la segunda proposicion es: "+ PrimDisy);
        System.out.println("Por lo tanto la respuesta de toda la operacion es: "+ DisyMain);
    // Autor: 💚 Marco Abarca Rodríguez💚
    }
    
}
