
package operadoraritmetico;

import java.util.Scanner;


public class OperadorAritmetico {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opcion;
        System.out.println("OPERADOR ARITMETICO");
        System.out.println("Indique el numero de la operacion que desea realizar");
        System.out.println("----------------------------------------");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACION");
        System.out.println("4. DIVISION");
        opcion=teclado.nextInt();
        
        int numero1, numero2;
        switch(opcion){
        
        case 1:
                System.out.println("SUMA");
                System.out.println("Ingrese el primer numero");
                numero1=teclado.nextInt();
                 System.out.println("Ingrese el segundo numero");
                numero2=teclado.nextInt();
                System.out.println("El resultado de la suma es:"+ (numero1+numero2));
                break;
        
        case 2:
                System.out.println("RESTA");
                System.out.println("Ingrese el primer numero");
                numero1=teclado.nextInt();
                 System.out.println("Ingrese el segundo numero");
                numero2=teclado.nextInt();
                System.out.println("El resultado de la resta es:"+ (numero1-numero2));
                break;
        
        case 3:
                System.out.println("MULTIPLICACION");
                System.out.println("Ingrese el primer numero");
                numero1=teclado.nextInt();
                 System.out.println("Ingrese el segundo numero");
                numero2=teclado.nextInt();
                System.out.println("El resultado de la multiplicacion es:"+ (numero1*numero2));
                break;
        
        case 4:
                System.out.println("DIVISION");
                System.out.println("Ingrese el primer numero");
                numero1=teclado.nextInt();
                 System.out.println("Ingrese el segundo numero");
                numero2=teclado.nextInt();
                System.out.println("El resultado de la division es:"+ (numero1/numero2));
                break;
                
        default:
            System.out.println("OPCION NO VALIDA");
            break;
        
        }   
    }
    
}
