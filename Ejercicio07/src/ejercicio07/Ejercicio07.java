
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
        op1 = ((Math.sqrt(var1)+ var2)/var3)==var2 ;
        boolean op2;
        op2 = var4 > var5;
        boolean disy; 
        disy = op1 || op2;
        double op3 ;
        op3 = ((var6/var7)+ (Math.sqrt(var6)));
        
        //boolean rta = disy && ? no se establecio condicion de op3 ;
        
        op1= ((Math.sqrt(var1)+ var2)/ var3) == var2;
        op2 = (var4 > var5);
       
        System.out.println("La respuesta a la primera operacion es:"+ op1);
        System.out.println("La respuesta a la segunda operacion es:"+ op2);
        System.out.println("La respuesta de la disyuncion entre las dos primeras operaciones es: "+ disy);
        System.out.println("La respuesta a la tercera operacion ((100/25)+Math.sqrt(100)) es:" + op3);
        System.out.println("Por lo tanto si "+ op3 +" es un valor numerico, no podemos determinar su posicion de verdadero o falso en conjuncion con la disyuncion que obtuvimos previamente, es decir ("+ disy +")");
        //Este ejercicio no tiene solucion porque la opcion 1 y la opcion2 dan resultado numerico y la tercera respuesta nos da en true or false.
        
        //AUTORes: LADY ROBALINO , Marco Abarca
        
        
    }
    
}
