package pruebagit;

import java.util.Scanner;

public class PruebaGit{
    public static void main(String[] args){
    int num1, num2, suma;
    System.out.println("Ingrese el num1: ");
    Scanner ingreso=new Scanner(System.in);
    num1=ingreso.nextInt();
    System.out.println("Ingrese el num2: ");
    num2=ingreso.nextInt();
    suma=num1+num2;
    System.out.println("La suma es: "+suma);
    }
   
}
