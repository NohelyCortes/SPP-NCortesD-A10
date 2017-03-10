/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ncortesd.a10;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class SPPNCortesDA10 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamaño=solicitaTamaño();
        int [][] a = arreglo ("A", tamaño);
        int [][] b = arreglo ("B", tamaño);
        
        sumaMatriz(a,b);
        restaMatriz(a,b);
        multiplicaciónMatriz(a,b);
    }
    public static int solicitaEntero(){
        Scanner kb= new Scanner (System.in);
        boolean flag;
        int n=0;
        do{
            System.out.println("Introduce un número entero");
            try{
                n=kb.nextInt();
                flag=false;
                
            }
            catch(Exception er){
                System.out.println("Lo que introdujo no es un entero, Inténtalo de nuevo");
                flag=true;
                kb.nextLine();
            }
        }while (flag);
        
        return n;
    }
    public static int solicitaTamaño(){
        Scanner key = new Scanner (System.in);
        boolean flag;
        int a = 0;
        do{
            try{
                System.out.println("Escribe el tamaño del arreglo: ");
                a = key.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println("Error");
                key.next();
                flag = true;
            }
        }
        while (flag);
        return a;
    }
    public static int [][] arreglo (String a, int tamaño){
        int [][]arreglo = new int [tamaño][tamaño];
        System.out.println("Arreglo: " + a);
        for (int i = 0; i < arreglo.length; i++){
        for (int j = 0; j < arreglo[i].length; j++){
        arreglo [i][j] = solicitaEntero();
        }
        }
        return arreglo;
    }
    //realizar la suma de matrices en un metodo
    
    public static int [][] sumaMatriz (int [][]a, int[][]b){
        int [][] resultado = new int [a.length] [a.length];
        System.out.println("Suma: ");
        for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a[i].length; j++){
        resultado[i][j] = a[i][j] + b[i][j];
        System.out.println("["+resultado[i][j]+"]");   
    }
        System.out.println("");   
    }
        return resultado; 
    }
    
    //Realizar resta de matrices
    public static int [][] restaMatriz (int [][]a, int[][]b){
        int [][] resultado = new int [a.length] [a.length];
        System.out.println("Resta: ");
        for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a[i].length; j++){
        resultado[i][j] = a[i][j] - b[i][j];
        System.out.println("["+resultado[i][j]+"]");   
    }
        System.out.println("");   
    }
        return resultado; 
    }
    //Realizar multiplicación de matrices
    public static int [][] multiplicaciónMatriz (int [][]a, int[][]b){
        int [][] resultado = new int [a.length] [a.length];
        System.out.println("Multiplicación: ");
        for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a[i].length; j++){
        resultado[i][j] = a[i][j] * b[i][j];
        System.out.println("["+resultado[i][j]+"]");   
    }
        System.out.println("");   
    }
        return resultado; 
    }
    
}