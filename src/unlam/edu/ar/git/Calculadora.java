package unlam.edu.ar.git;
import java.util.Scanner;

public class Calculadora {
public static void main(String[] args) {
 int a;
 int b;
 int opcion;
 int resultado;
 Scanner teclado = new Scanner(System.in);
 
 do{
	 System.out.println("Ingrese su operación /n 1 para sumar /n 2 para restar /n 3 para multiplicar /n 4 para dividir");
	 opcion = teclado.nextInt();
 }while(opcion < 1 && opcion > 4);

System.out.println("Ingrese el primer numero");
a = teclado.nextInt();
System.out.println("Ingrese el segundo numero");
b = teclado.nextInt();


 if(opcion==1){
 	resultado = a + b;
 }else if(opcion==2){
 resultado = a - b;
 }else if(opcion==3){
 resultado = a * b;
 }else{
 resultado = a / b;
 }
 System.out.println("El resultado es " + resultado);
 }
}
