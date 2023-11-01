package ejercicio06;
public class Ejercicio06 {
    public static void main(String[] args) {
             //Resolucion del ejercicio06:
             int var = 81;
             int var1 = 9;
             int var2 = 3;
             int var4 = 10;
             int var5 = 1;
             boolean rta1;
             boolean rta2;
             boolean rtadef;
             rta1 = ((Math.sqrt(var)+ var1)/var2)==var1 ;
             rta2= var4>var5;
             rtadef= rta1 && rta2;
             
        System.out.println("Proposicion 1 es "+ rta1);
        System.out.println("Proposicion 2 es "+ rta2);
        System.out.println("Por lo tanto la resuesta es " +  rtadef);
        //AUTOR : LADY ROBALINO
    }
    
}
