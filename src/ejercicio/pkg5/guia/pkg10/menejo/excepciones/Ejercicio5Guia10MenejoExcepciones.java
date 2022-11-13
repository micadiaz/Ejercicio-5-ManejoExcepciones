package ejercicio.pkg5.guia.pkg10.menejo.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5Guia10MenejoExcepciones {

    public static void main(String[] args) {
        Ejercicio5Guia10MenejoExcepciones e=new Ejercicio5Guia10MenejoExcepciones();
        e.muestra();
    }
       public void muestra() throws InputMismatchException{
       
           Scanner leer=new Scanner(System.in);
           int aleatorio=(int)(Math.random()*500);
            System.out.println("adivine el numero");
            int adivina=leer.nextInt();
            int cont=0;
               
             try{
               do {    
                  if(aleatorio>adivina){System.out.println("el numero es mayor al ingresado");
                  cont++;} //poder saber la cantidad de veces que ingreso el numero
                  
                  else{System.out.println("el numero es menor al ingresado");
                  cont++;} //poder saber la cantidad de veces que ingreso el numero
                  
                  System.out.println("ingrese otro numero");
                  adivina=leer.nextInt();

              }while(aleatorio!=adivina);
                  System.out.println("Adivinaste el numero!! Ingresaste "+(cont+1)+" numeros en total" ); }     
             
             catch(InputMismatchException a){
                 System.out.println("Lo que ingreso no es un numero "+a.getMessage());
                 System.out.println("Este caracter se cuenta como un intento por lo tanto ingresaste "+(cont+1)+" veces entre el caracter y los numeros"); }
           }
        }
           
       
    

/*Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.*/