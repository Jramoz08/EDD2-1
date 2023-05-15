# Historia de Usuario:

Yo *como* Entrenador de Ciclismo. *Quiero* poder medir tres tiempos de diferentes etapas de un ciclista en especifico y obtener el promedio del tiempo total de las tres. 

*Para* calcular el promedio de los tiempos de la general y resaltar al ganador. 

Escenario 1: Ingrese la información de los ciclistas de una categoría. Dado que soy un Entrenador de un equipo de ciclismo y ingreso correctamente el dorsal del ciclista y que ingreso correctamente el nombre del ciclista y que ingreso correctamente los tres tiempos obtenidos. Cuando seleccione la opción calcular promedio entonces debo poder guardar la información del ciclista como: su dorsal y el nombre completo. y el tiempo uno y el tiempo dos y el tiempo tres y obtener el promedio de estos tres tiempos y calcular el tiempo total de los tiempos ingresados

<p align="left">  <img src="https://i.ibb.co/jTGXmKn/hu.png">  </p>

# Caso de usuario:



<p align="left">  <img src="https://i.ibb.co/xCVFqCT/Diagrama-en-blanco-1.png">  </p>

# Descripcion Caso de uso:

Nombre: Calcular Promedio Notas Estudiantes
Actores: Coordinador Académico
Propósito: Guardar identificación, nombre, curso y tres notas del
Estudiante para calcular su promedio.
Curso Normal de Eventos:
1. El Coordinador ingresa la cantidad de estudiantes.
2. El Coordinador ingresa la identificación, nombre, curso, la nota 1,
la nota 2 y la nota 3 del Estudiante.
3. Se calcula el promedio a partir de:
( ∑(nota 1, nota 2, nota 3) / Total Notas) / Cantidad Estudiantes
4. Se Muestra el promedio de los Estudiantes del Curso
Postcondiciones: Promedio de Notas Calculado

<p align="left">  <img src="https://img.shields.io/badge/STATUS-EN%20DESAROLLO-green">  </p>


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
