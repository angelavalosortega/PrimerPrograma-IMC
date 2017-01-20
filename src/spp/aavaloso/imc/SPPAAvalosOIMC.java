/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.aavaloso.imc;
import java.util.Scanner;
/**
 *
 * @author Angel Avalos
 */
public class SPPAAvalosOIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora IMC");
        //Paso 1. Declaracion de vaiables (identificadores)
        double w, l, imc;
        String eIMC;
        //En la siguiente linea le indico a Java que utilizare un teclado
        Scanner keyboard= new Scanner(System.in); 
        //Paso 2. Asignar valores a las variables.
        System.out.println("Introduce el peso");
        w=keyboard.nextDouble();
        System.out.println("Introduce la estatura");
        l=keyboard.nextDouble();
        //Paso 3. Resolver el problema
        imc= w/ Math.pow (l,2);
        //Paso 3.1 Evaluamos IMC.
        if (imc>25){
            eIMC="Sobrepeso";
        }else if(imc<19){
            eIMC="Desnutricion";
        }else{
            eIMC="Normal"; 
        }
        //Paso 4. Mostrar resultado
        System.out.println("Peso= "+w);
        System.out.println("Altura= "+l);
        System.out.println("IMC= "+imc);
        System.out.println(eIMC);
         
        
        // TODO code application logic here
    }
    
}
