
package ejercicio07;
public class Ejercicio07 {
//Resolucion ejercicio 07
    public static void main(String[] args){
        int var1= 81; 
        int var2= 9;
        int var3= 3;
        int var4= 10;
        int var5= 1;
        int var6= 100;
        int var7= 25;
        boolean op1;
        boolean op2;
        boolean rta = true;
        
        op1= ((Math.sqrt(var1)+ var2)/ var3) == var2;
        op2 = (var4 > var5);
        double resultado = ((var6/var7)+ (Math.sqrt(var6)));
        System.out.println("La respuesta a la primera operacion es:"+ op1);
        System.out.println("La respuesta a la segunda operacion es:"+ op2);
        System.out.println("La respuesta de las dos primeras operaciones es: "+ rta);
        System.out.println("La respuesta a la tercera opcion es:" + resultado);
        
        //Este ejercicio no tiene solucion porque la opcion 1 y la opcion2 dan resultado numerico y la tercera respuesta nos da en true or false.
        
        //AUTOR: LADY ROBALINO
        
               
        
        
        
        
        
        
        
        
        
        System.out.println("Respuesta: " + resultado);
    }
    
}
