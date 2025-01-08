package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double num1, num2, resultado = 0;
        char operador;
        boolean operacionValida = true;      
        
        System.out.println("Escribe el primer numero: ");
        num1 = scan.nextDouble();
        System.out.println("Escribe el segundo numero: ");
        num2 = scan.nextDouble();
        System.out.println("Introduce operacion: ( +, -, *, / )");
        operador = scan.next().charAt(0);
        
        if(operador== '+') {
        	
        }
        	
        
    }}
