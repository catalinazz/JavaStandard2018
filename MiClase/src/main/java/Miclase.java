
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mhg
 */
public class Miclase {

    public static void main(String[] args) {
        //if (args.length == 0) {
        //System.out.println("Por favor pasarparametros ay b");
        //return; } else {

        Scanner scanner = new Scanner(System.in);
        System.out.println("quiere operar?");
        boolean quiereOperar = scanner.nextBoolean();
        while (quiereOperar == true) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("ingrese a");
            String a = scanner2.nextLine();

            System.out.println("ingrese b");
            String b = scanner2.nextLine();
            System.out.println("ingrese operacion");
            String operacion = scanner2.nextLine();
            
            int ValorA = Integer.parseInt(a);
            int ValorB = Integer.parseInt(b);
            
            
            switch (operacion) {
                case "+":
                    System.out.println("resultado=" + (ValorA + ValorB));
                    break;
                case "-":
                    System.out.println("resultado=" + (ValorA - ValorB));
                    break;
                case "*":
                    System.out.println("resultado=" + (ValorA * ValorB));
                    break;
                case "/":
                    System.out.println("resultado=" + (ValorA / ValorB));
                    break;
                default:
                    System.out.println("Por favor escriba uaa operacion");
                    break;
            
            
            }
             System.out.println("quiere operar?");
             boolean quiereOperar2 = scanner2.nextBoolean();
          quiereOperar =  quiereOperar2 ;
        }

        System.out.println("salir");

    }
}
