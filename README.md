# Enunciado:

En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que
necesita un Entrenador de ciclismo de la liga de ciclismo de bogota, que desea calcular el promedio de 3 (tres) tiempo de un ciclista en una carrera determinada de su categoria correspondiente. Este entrenador evalúa a los
ciclistas de forma permanente y calcula el promedio general de sus corredores. Como información básica
de cada ciclista se debe registrar el número de dorsal, su nombre y su categoria.
Aclaraciones:
• Se supondrá que la aplicación solo se requiere para calcular el promedio de una unica carrera
especifica.
• Para efectos de mantener la simplicidad del ejemplo no se contemplan manejar persistencia
en el almacenamiento de los datos.
• No se realiza validación, ni se verifica calidad en los datos ingresados.

# Historia de Usuario:

<p align="left">  <img src="https://i.ibb.co/jTGXmKn/hu.png">  </p>

# Caso de usuario:



<p align="left">  <img src="https://i.ibb.co/xCVFqCT/Diagrama-en-blanco-1.png">  </p>

# Descripcion Caso de uso:

Nombre: Calcular Tiempos de una carrera de ciclismo  
Actores: Entrenador De Ciclismo.  
Propósito: Guardar dorsal, nombre, categoria y tres tiempos del ciclista para calcular su promedio.  
Carrera normal Eventos:  
1. El entrenador ingresa la cantidad de corredores.  
2. El entrenador ingresa el dorsal, nombre, categoria, tiempo 1,  
tiempo 2 y tiempo 3 del ciclista.  
3. Se calcula el promedio a partir de:  
( ∑(tiempo 1, tiempo 2, tiempo 3) / tiempo total) / Cantidad corredores  
4. Se Muestra el proemedio de los ciclistas de su categoria,  
Postcondiciones: Promedio de tiempos Calculado.  



# Diagrama de flujo: 

<p align="left">  <img src="https://i.ibb.co/dpMRr3F/diagramadf.png">  </p>


# Pseudocodigo: 
Caracteres: dorsales [50], nombres[50], categorias[50]  
real: tiempouno[50], tiempodos[50], tiempotres[50]  
caracteres: dorsal, nombre, categoria  
Entero: numciclistas, i  
real: tiempo1, tiempo2, tiempo3, promedio <- 0  
imprimir: "Digite el numero de ciclistas: "  
asignar: numciclistas  
para i=0 hasta numciclistas - 1, 1  
imprimir: "Digite el dorsal del ciclista: "  
asignar: dorsal  
Imprimir: ‘Digite el nombre del ciclista:’  
Asignar: nombre  
Imprimir: ‘Digite la categoria del ciclista:’  
Asignar: categoria  
Imprimir: ‘Digite el tiempo 1 del ciclistas:’  
Asignar: tiempo1  
Imprimir: ‘Digite el tiempo 2 del ciclistas:’  
Asignar: tiempo2  
Imprimir: ‘Digite el tiempo 3 del ciclistas’  
Asignar: tiempo3  
dorsales[i] <- dorsal  
nombres [i] <- nombre  
categorias [i] <- categoria  
tiempouno[i] <- tiempo1  
tiempodos[i] <- tiempo2  
tiempotres[i] <- tiempo3  
finPara  
Para i=0 hasta numciclistas -1, 1  
promedio <-  
promedio +((tiempouno[i]+tiempodos[i]+tiempotres[i])/3)numciclistas  
finPara  
Imprimir: ‘El promedio es:’ + promedio  

************************************
# Codigo del ejercicio personalizado en programacion estructurado en java:
```
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
```
*******************************************************************
Funcionamiento del Codigo:
<p align="left">  <img src="https://i.ibb.co/pRmvjDJ/code1.png">  </p>

# Codigo del ejercicio personalizado en programacion orientada a objetos usando java:

CiclistasPOO:


```
public class CiclistaPOO
{
  String dorsal;
  String nombre;
  String categoria;
  double tiempouno;
  double tiempodos;
  double tiempotres;
}
```
***************************************************************************

Tiempos: 
```
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
```
<p align="left">  <img src="https://i.ibb.co/zZzTs4g/ssss.png">  </p>


# Funcionamiento del codigo:
<p align="left">  <img src="https://i.ibb.co/fMwZZw1/cdh.png">  </p>


