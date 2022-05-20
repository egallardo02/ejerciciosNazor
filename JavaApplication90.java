package javaapplication90;
import java.util.Scanner;

public class JavaApplication90 {

    
    public static void main(String[] args) {
        System.out.println("Ejercicio 1 - Parte 1: ");
        System.out.println("");
        ejercicioUno();
        System.out.println("Ejercicio 1 - Parte 2: ");
        System.out.println("");
        ejercicioUno2();
        System.out.println("Ejercicio 2 - Parte 1: ");
        System.out.println("");
        ejercicioDos();
        System.out.println("Ejercicio 2 - Parte 2: ");
        System.out.println("");
        ejercicioDos2();
        System.out.println("Ejercicio 3: ");
        System.out.println("");
        ejercicioTres();
        
    }
    private static void ejercicioUno(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola, escribe un número");
        int numero = leer.nextInt();
        int par = 0;
        for (int i = 0; i < numero; i++) {
            
            System.out.println("los numeros pares son: "+par);
            par= par+2;
        }
    }
    
    private static void ejercicioUno2(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola, escribe un número");
        int numero = leer.nextInt();
        int par = 2;
        for (int i = 0; i < numero; i++) {
            
            System.out.println("los numeros pares son: "+par);
            par= par+2;
        }
    }
    private static void ejercicioDos(){
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola, escribe un número");
        int numero = leer.nextInt();
        int impar = 1;
        int sumaimpar=0;
        for (int i = 0; impar<=numero; i++) {
            sumaimpar=impar+sumaimpar;
            impar= impar+2;
        }
        System.out.println("La suma de los impares es: "+sumaimpar);
    }
    
    private static void ejercicioDos2(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola, escribe el límite inferior: ");
        int min = leer.nextInt();
        System.out.println("Hola, escribe el límite superior: ");
        int max = leer.nextInt();
        int impar=0;
        int sumaimpar=0;
        
        for (int i = min; i<=max; i++) {
            if (i%2!=0){
                sumaimpar=i+impar;
                impar=sumaimpar;
            }    
        } 
        System.out.println("la suma de los impares es: "+impar);
    }
    
    private static void ejercicioTres(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola, escribe un número: ");
        int max = leer.nextInt();
        int fibonacci = 0;
        int num1 = 0;
        int num2 = 1;
        
        for (int i = 0; i < max; i++) {
            
            fibonacci = num1 + num2;
            num1=num2;
            num2=fibonacci;
            System.out.println("Los numero de fibonacci son: " +num1);
        }
    }
    
}
