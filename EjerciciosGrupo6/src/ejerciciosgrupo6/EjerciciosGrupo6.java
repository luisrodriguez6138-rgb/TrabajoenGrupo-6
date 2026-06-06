/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosgrupo6;

import java.util.Scanner;

public class EjerciciosGrupo6 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opc;
        do{
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
            opc = sc.nextInt();

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
                case 4:
                    cajeroautomatico();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;

                    //ahi le siguen agregando los cases para los ejercicios que faltan
                case 16:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("\nOpcion invalida. Intente de nuevo...");   
            }
        }while (opc != 16);
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
        
        do{
        
           System.out.println("Ingrese una nota entre 0 y 10: ");
           nota = sc.nextInt();
        
           if(nota < 0 || nota > 10){
              System.out.println("Nota invalida");
        }
        }while(nota < 0 || nota > 10);
        
        System.out.println("Nota ingresada: " + nota);
    }
    //----------------------------------------
    //EJERCICIO 4: CAJERO AUTOMATICO.
    //----------------------------------------
    public static void cajeroautomatico(){
        String claveCorrecta = "JESUS1727";
        String intento;
        int intentos = 0;
        boolean accesoPermitido = false;
        System.out.println("\n--CAJERO AUTOMÁTICO BANCARIO--");
        while (intentos < 3) {
            System.out.print("Ingrese su clave: ");
            intento = sc.next();
            intentos++;
            if (intento.equals(claveCorrecta)) {
                accesoPermitido = true;
                break;
            } else {
                System.out.println("Clave incorrecta. Intentos restantes: " + (3 - intentos));
            }
        }
        if (accesoPermitido) {
            System.out.println("BIENVENIDO! Acceso concedido a su cuenta bancaria.");
        } else {
            System.out.println("ACCESO BLOQUEADO! Demasiados intentos fallidos.");
        } 
    }
    //----------------------------------------
    //EJERCICIO 5: NUMEROS PARES E IMPARES.
    //----------------------------------------
    public static void pareseimpares(){
        int numero;
        int pares = 0;
        int impares = 0;
        System.out.println("PROGRAMA PARA INGRESAR NUMEROS ENTEROS E INDICAR CUANTOS SON NUMEROS PARES E IMPARES");
        System.out.print("Ingrese números enteros (0 para terminar): ");
        do {
            System.out.print("Numero: ");
            numero = sc.nextInt(); 
            if (numero != 0) {
                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        } while (numero != 0);
        System.out.println("Cantidad de numeros pares: " + pares);
        System.out.println("Cantidad de numeros impares: " + impares);
    }
    //-------------------------------------------
    //EJERCICIO 6: VENTAS DIARIAS DE UNA TIENDA.
    //-------------------------------------------
    public static void ventasdiarias(){
        
    }
 //aqui pueden igual seguir agregando las funciones  
} 
