
package suma2;

import java.util.Scanner;
public class Suma2punto3 {
    
    public static int suma2pto3(){
    Scanner entrada = new Scanner(System.in);
    
    int numero1;
    int numero2;
    int suma;
    
    System.out.print("Ingrese el primer numero: ");
    numero1 = entrada.nextInt();
    
    System.out.print("Ingrese el segundo numero: ");
    numero2 = entrada.nextInt();
    
    suma = numero1 + numero2;
           
    System.out.print("La suma es: " + suma);
    return suma;
}
}
