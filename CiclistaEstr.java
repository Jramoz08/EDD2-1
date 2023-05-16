import java.util.Scanner;

public class CiclistaEstr
{
   public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String[] dorsales = new String[50];
        String[] nombres = new String[50];
        String[] categorias = new String[50];
        double[] tiempouno = new double[50];
        double[] tiempodos = new double[50];
        double[] tiempotres = new double[50];
        
        int numciclistas;
        String dorsal, nombre, categoria;
        double tiempo1, tiempo2, tiempo3;
        double promedio = 0;
        System.out.println("Digite la cantidad de ciclistas: ");
        numciclistas = sc.nextInt();
        for(int i = 0; i < numciclistas; i++){
            System.out.println("Digite el dorsal del ciclistas: ");
            dorsal = sc.next();
            System.out.println("Digite el nombre del ciclista: ");
            nombre = sc.next();
            System.out.println("Digite el categoria a la que pertenece el ciclista: ");
            categoria = sc.next();
            System.out.println("Digite el tiempo uno del ciclista: ");
            tiempo1 = sc.nextDouble();
            System.out.println("Digite el tiempo dos del ciclista: ");
            tiempo2 = sc.nextDouble();
            System.out.println("Digite el tiempo tres del ciclista: ");
            tiempo3 = sc.nextDouble();
            dorsales[i] = dorsal;
            nombres[i] = nombre;
            categorias[i] = categoria;
            tiempouno[i] = tiempo1;
            tiempodos[i] = tiempo2;
            tiempotres[i] = tiempo3;
        }
        for(int i = 0; i < numciclistas; i++){
            promedio = promedio + ((tiempouno[i] + tiempodos[i] + tiempotres[i]) / 3) / numciclistas;
        }
        
        System.out.println("El promedio de tiempo del grupo es: "+ promedio);
            
}
}
