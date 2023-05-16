import java.util.Scanner;
public class Tiempos
{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int numciclistas;
       CiclistaPOO[] losCiclistas = new CiclistaPOO[50];
       String dorsal, nombre, categoria;
       double tiempo1, tiempo2, tiempo3;
       double promedio = 0;
       System.out.println("Digite la cantida de Ciclistas: ");
       numciclistas = sc.nextInt();
       for (int i = 0; i < numciclistas; i++){
           System.out.println("Digite el dorsal del ciclista: ");
           dorsal = sc.next();
           System.out.println("Digite el nombre del ciclista: ");
           nombre = sc.next();
           System.out.println("Digite la categoria del ciclista: ");
           categoria = sc.next();
           System.out.println("Digite el tiempo 1 del ciclista: ");
           tiempo1 = sc.nextDouble();
           System.out.println("Digite el tiempo 2 del ciclista: ");
           tiempo2 = sc.nextDouble();
           System.out.println("Digite el tiempo 3 del ciclista: ");
           tiempo3 = sc.nextDouble();
           CiclistaPOO unCiclista = new CiclistaPOO();
           unCiclista.dorsal = dorsal;
          unCiclista.nombre = nombre;
           unCiclista.categoria = categoria;
           unCiclista.tiempouno = tiempo1;
           unCiclista.tiempodos = tiempo2;
           unCiclista.tiempotres = tiempo3;
           losCiclistas[i] = unCiclista; 
       }
       
       for(int i = 0; i < numciclistas; i++){
           double sum = (losCiclistas[i].tiempouno + losCiclistas[i].tiempodos + losCiclistas[i].tiempotres)/3;
           promedio = promedio + sum / numciclistas;
       }
       System.out.println("El promedio de tiempos es: " + promedio);
    }
}