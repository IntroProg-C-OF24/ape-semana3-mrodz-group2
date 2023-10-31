package ejercicio08;
public class Ejercicio08 {
    public static void main(String[] args) {
        //Pasos
        int var1 = 10 ;
        int var2 = 9 ;
        int var3 = 10*2 ;
        int var4 = 10*50 ;
        int var5 = 2 ;
        int var6 = (int) Math.pow(3,2) ;
        int var7 = 10*20 ;
        
        int var8 = 10*5 ;
        int var9 ;
        var9 = var8 + 1;
        
        boolean Respuesta ;
        Respuesta = ((var1*var2)+var3-(var4/var5)+var6>=var7) ;
        boolean Respuesta2 ;
        Respuesta2 = (var8>=var8-var8+var9) ;
        
        boolean Respuesta3 ;
        Respuesta3 =  Respuesta || Respuesta2 ;
                
        System.out.println("El valor de la primera proposicion es: " + Respuesta);
        System.out.println("El valor de la segunda proposicion es: " + Respuesta2);
        System.out.println("Por lo tanto la operacion de la disyuncion es: " + Respuesta3);

        // * @author Marco Abarca Rodríguez
    }
    
}
