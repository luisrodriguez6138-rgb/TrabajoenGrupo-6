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
                    pareseimpares();
                    break;
                case 6:
                    ventasdiarias();
                    break;
                case 7:
                    numeronegativo();
                    break;
                case 8:
                    tablamultiplicar();
                    break;
                case 9:
                    factorialnumero();
                    break;
                case 10:
                    contadornumeros();
                    break;
                case 11:
                    promedioCurso();
                    break;
                case 12:
                    secuenciadefibonacci();
                    break;
                case 13:
                    mayorymenorde10numeros();
                    break;
                case 14:
                    sumadenumerosparesentre1y200();
                case 15:
                    numeroprimo();
                    break;
                case 16:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("\nOpcion invalida. Intente de nuevo...");   
            }
        }while (opc != 16);
    }
    //--------------------------------------
    //EJERCICIO 1: SOLICITUD DE CONTRASEÑA.
    //--------------------------------------
    public static void sistemaLogin(){
        String contraseñaCorrecta = "admin123";
        String contraseña;
        int intentos = 0;
        System.out.println("PROGRAMA QUE SOLICITA LA CONTRASEÑA DEL USUARIO.");
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
    //---------------------------------------
    //EJERCICIO 2: CANTIDAD, SUMA Y PROMEDIO.
    //--------------------------------------- 
    public static void numerosPositivos(){
        
        int numero;
        int cantidad = 0;
        int suma = 0;
        double promedio;
        System.out.println("PROGRAMA QUE FINALIZARA CUANDO SE INGRESE UN NUMERO NEGATIVO");
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
    //------------------------------------
    //EJERCICIO 3: NOTA ENTRE CERO Y DIEZ.
    //------------------------------------
    public static void notaCeroDiez(){
        
        int nota;
        System.out.println("PROGRAMA QUE SOLICITA UNA NOTA ENTRE 0 Y 10."); 
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
        double venta;
        double totalVentas = 0;
        int cantidad = 0;
        System.out.println("PROGRAMA PARA INGRESAR VENTAS DIARIAS DE UNA TIENDA");
        System.out.print("Ingrese las ventas (0 para terminar): ");
        do {
            System.out.print("Venta: $");
            venta = sc.nextDouble();
            if (venta > 0) {
                totalVentas += venta;
                cantidad++;
            } else if (venta < 0) {
                System.out.println("Valor invalido, ingrese un valor positivo o 0 para terminar.");
            }
        } while (venta != 0);
        System.out.println("Cantidad de ventas registradas: " + cantidad);
        System.out.printf("Total vendido: $%.2f%n", totalVentas);
    }
    //-----------------------------------------------------
    //EJERCICIO 7: SOLICITUD DE NUMEROS HASTA UN NEGATIVO.
    //-----------------------------------------------------
    public static void numeronegativo(){
        int numero;
        System.out.println("PROGRAMA QUE SOLICITA NUMEROS HASTA QUE SE INGRESE UNO NEGATIVO");
        System.out.println("Ingrese los numeros que desee (Ingrese un negativo para terminar)");
        do {
            System.out.print("Numero: ");
            numero = sc.nextInt();
            if (numero >= 0) {
                System.out.println("Numero registrado: " + numero);
            }
        } while (numero >= 0);
        System.out.println("Se ingreso un numero negativo. PROGRAMA TERMINADO.");
        
    }
    //------------------------------------------------------------------
    //EJERCICIO 8:Generador de Tabla de Multiplicar del 1 hasta el 20
    //------------------------------------------------------------------
    public static void tablamultiplicar() {
        System.out.println("TABLA DE MULTIPLICAR");
        System.out.print("Ingrese un numero entero positivo: ");
        int numero = sc.nextInt();
        for (int i = 1; i <= 20; i++) {

}
        int i = 0;
        int resultado = numero * i;
        System.out.println(numero + " x " + i + " = " + resultado);
        System.out.println("Proceso finalizado");
}
    
    //------------------------------------------------------------------
    //EJERCICIO 9:Factorial de un numero
    //------------------------------------------------------------------
    public static void factorialnumero() {
        System.out.println("FACTORIAL DE UN NUMERO");
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {

}
        int i = 0;
        factorial = factorial * i;
        System.out.println("El factorial es: " + factorial);

}
    //------------------------------------------------------------------
    //EJERCICIO 10:Contador de positivos negativos y ceros
    //------------------------------------------------------------------
    public static void contadornumeros() {
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        for (int i = 1; i <= 15; i++) {

}
        System.out.print("Ingrese un numero: ");

        int numero = sc.nextInt();
        if (numero > 0) {

    positivos++;

}
        else if (numero < 0) {

    negativos++;

}
        else {

    ceros++;

}
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        

}
   
 //------------------------------------------------------------------
 //EJERCICIO 11:Promedio general del curso
 //------------------------------------------------------------------
    public static void promedioCurso() {
        double suma = 0;
        for (int i = 1; i <= 20; i++) {

}
        System.out.print("Ingrese calificacion: ");

        double nota = sc.nextDouble();
        suma = suma + nota;
        double promedio = suma / 20;
        System.out.println("Promedio general: " + promedio);

}
 //------------------------------------------------------------------
 //EJERCICIO 12:Secuencia de fibonacci
 //------------------------------------------------------------------
    
  
    public static void secuenciadefibonacci(){
        System.out.println("SECUENCIA DE FIBONACCI");
        System.out.print("Ingrese la cantidad de terminos: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sn;
        System.out.println("Serie Fibonacci: ");
        for(int i=1;i<=n;i++) {
            System.out.print(a + " ");
            sn = a + b;
            a = b;
            b = sn;
        }
    }
    //--------------------------------------
    //EJERCICIO 13: MAYOR Y MENOR DE 10 NUMEROS.
    //--------------------------------------
    public static void mayorymenorde10numeros(){
        System.out.println("MAYOR Y MENOR DE 10 NUMEROS");
        int num;
        System.out.print("Ingrese el numero 1: ");
        num = sc.nextInt();
        int mayor = num;
        int menor = num;
        for(int i = 2; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            num = sc.nextInt();
            if(num > mayor) {
            mayor = num;
            }
            if(num < menor) {
            menor = num;
            }
        }
        System.out.println("El numero mayor: " + mayor);
        System.out.println("El numero menor: " + menor);    
    }
    //--------------------------------------
    //EJERCICIO 14: SUMA DE NUMEROS PARES ENTRE 1 Y 200.
    //--------------------------------------
    public static void sumadenumerosparesentre1y200(){
        System.out.println("SUMA DE NUMEROS PARES ENTRE 1 Y 200");
        int suma = 0;
        for(int i=1; i<=200; i++) {
            if(i % 2 == 0) {
            suma = suma + i;
            }
        }
        System.out.println("La suma de los numeros pares: " + suma);
    }
    //--------------------------------------
    //EJERCICIO 15: NUMERO PRIMO.
    //--------------------------------------
    public static void numeroprimo(){
        System.out.println("NUMERO PRIMO");
        System.out.print("Ingrese un numero entero: ");
        int numero = sc.nextInt();
        int divisores = 0;
        for(int i=1; i<=numero; i++) {
            if(numero % i == 0) {
            divisores++;
            }
        }
        if(divisores == 2) {
            System.out.println("numero primo");
        } else {
            System.out.println("numero no primo");
        }
    }
} 
