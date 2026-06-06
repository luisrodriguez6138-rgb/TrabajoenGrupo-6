/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosgrupo6;

import java.util.Scanner;

public class EjerciciosGrupo6 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
  
        System.out.println("=========Trabajo Grupo 6=========");
        System.out.println("        Menu de opciones");
        System.out.println("=================================");
        System.out.println("1.Validacion de contraseña");
        System.out.println("2.Registro de numeros positivos");
        System.out.println("3.Validacion de nota");
        System.out.println("4.Acceso a cajero automatico");
        System.out.println("5.Conteo de numeros pares e impares");
        System.out.println("6.Registro de ventas diarias");
        System.out.println("7.Ingreso hasta numero positivo");
        System.out.println("8.Tabla de multiplicar");
        System.out.println("9.Calculo de factorial");
        System.out.println("10.Conteo de positivos,negativos y ceros");
        System.out.println("11.Promedio de calificaciones");
        System.out.println("12.Serie de Fibonacci");
        System.out.println("13.Numero mayor y menor");
        System.out.println("14.Suma de numeros pares");
        System.out.println("15.Verificacion de numero primo");
        System.out.println("16.Salir");
       
        System.out.println("Seleccione una opcion: ");
        int opc = sc.nextInt();
        
        switch(opc){
            
            case 1:
                sistemaLogin();
                break;
            case 2:
                numerosPositivos();
                break;
            case 3:
                notaCeroDiez();
                break;
                //ahi le siguen agregando los cases para los ejercicios que faltan
            default:
                System.out.println("Ingrese una opcion valida");
            
        }
    }
    public static void sistemaLogin(){
        String contraseñaCorrecta = "admin123";
        String contraseña;
        int intentos = 0;
        
        do{
        
           System.out.println("Ingrese la contraseña: ");
           contraseña = sc.next();
        
           intentos ++;
        
           if(!contraseña.equals(contraseñaCorrecta)){
            System.out.println("contraseña incorrecta");
           }
        
        }while(!contraseña.equals(contraseñaCorrecta));
        
            System.out.println("Acceso permitido");
            System.out.println("Intentos realizados " + intentos);
        }
       
    public static void numerosPositivos(){
        
        int numero;
        int cantidad = 0;
        int suma = 0;
        double promedio;
        
        do{
            
           System.out.println("Ingrese un numero positivo (negativo para terminar): ");
           numero = sc.nextInt();
           
           if(numero >=0){
               suma += numero;
               cantidad++;
           }
           
        }while(numero >=0);
        
        if(cantidad > 0){
           
            promedio = (double) suma / cantidad;
        
           System.out.println("Cantidad de numeros: " + cantidad);
           System.out.println("Suma total: " + suma);
           System.out.println("Promedio: " + promedio);
           
        }else{
            System.out.println("No se ingresaron numeros positivos"); 
        }
    }
    

    public static void notaCeroDiez(){
        int nota;
        
    }
} 
