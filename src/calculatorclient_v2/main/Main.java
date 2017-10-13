/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorclient_v2.main;

import calculatorclient_v2.client.CalculatorClient;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vitor
 */
public class Main {

    public static void main(String[] args) {
        try {
            CalculatorClient client = new CalculatorClient();
            Scanner entrada = new Scanner(System.in);
            int opc = -1;
            double argA, argB;
            do {
                System.out.println("/tInforme o número da operação:");
                System.out.println("/t: 1 - Soma");
                System.out.println("/t: 2 - Subtração");
                System.out.println("/t: 3 - Multiplicação");
                System.out.println("/t: 4 - Divisão");
                System.out.println("/t: 0 - Sair");
                String aux = entrada.nextLine();
                try {
                    opc = Integer.parseInt(aux);
                    System.out.println("/tDigite o primeiro número:");
                    argA = Double.parseDouble(entrada.nextLine());
                    System.out.println("/tDigite o segundo número:");
                    argB = Double.parseDouble(entrada.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, digite somente números!");
                    continue;
                }
                switch (opc) {
                    case 1:
                        System.out.println("Resultado: " + client.getCalculator().add(argA, argB));
                        break;
                    case 2:
                        System.out.println("Resultado: " + client.getCalculator().subtract(argA, argB));
                        break;
                    case 3:
                        System.out.println("Resultado: " + client.getCalculator().multiply(argA, argB));
                        break;
                    case 4:
                        System.out.println("Resultado: " + client.getCalculator().divide(argA, argB));
                        break;
                    default:
                        System.out.println("Por favor, utiliza somente opções válidas!");
                        break;
                }

            } while (opc != 0);
        } catch (RemoteException | NotBoundException | MalformedURLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
