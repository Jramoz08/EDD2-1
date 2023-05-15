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

Yo *como* Entrenador de Ciclismo. *Quiero* poder medir tres tiempos de diferentes etapas de un ciclista en especifico y obtener el promedio del tiempo total de las tres. 

*Para* calcular el promedio de los tiempos de la general y resaltar al ganador. 

Escenario 1: Ingrese la información de los ciclistas de una categoría. Dado que soy un Entrenador de un equipo de ciclismo y ingreso correctamente el dorsal del ciclista y que ingreso correctamente el nombre del ciclista y que ingreso correctamente los tres tiempos obtenidos. Cuando seleccione la opción calcular promedio entonces debo poder guardar la información del ciclista como: su dorsal y el nombre completo. y el tiempo uno y el tiempo dos y el tiempo tres y obtener el promedio de estos tres tiempos y calcular el tiempo total de los tiempos ingresados

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

<p align="left">  <img src="https://img.shields.io/badge/STATUS-EN%20DESAROLLO-green">  </p>


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
codigo:

import java.util.Scanner;
public class EstudianteEstr
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String[] identificaciones = new String[50];
        String[] nombres = new String[50];
        String[] cursos = new String[50];
        double[] notauno = new double[50];
        double[] notados = new double[50];
        double[] notatres = new double[50];
        
        int numeroEstudiantes;
        String identificacion, nombre, curso;
        double nota1, nota2, nota3;
        double promedio = 0;
        System.out.println("Digite la cantidad de estudiantes: ");
        numeroEstudiantes = sc.nextInt();
        for(int i = 0; i < numeroEstudiantes; i++){
            System.out.println("Digite la identificacion del estudiante: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del estudiante: ");
            nombre = sc.next();
            System.out.println("Digite el curso del estudiante: ");
            curso = sc.next();
            System.out.println("Digite la nota uno del estudiante: ");
            nota1 = sc.nextDouble();
            System.out.println("Digite la nota dos del estudiante: ");
            nota2 = sc.nextDouble();
            System.out.println("Digite la nota tres del estudiante: ");
            nota3 = sc.nextDouble();
            identificaciones[i] = identificacion;
            nombres[i] = nombre;
            cursos[i] = curso;
            notauno[i] = nota1;
            notados[i] = nota2;
            notatres[i] = nota3;
        }
        for(int i = 0; i < numeroEstudiantes; i++){
            promedio = promedio + ((notauno[i] + notados[i] + notatres[i]) / 3) / numeroEstudiantes;
        }
        System.out.println("El promedio de notas es: " + promedio);
    }
}

****************************************************
