/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorclient_v2.client;

import calculatorclient_v2.interfaces.ICalculator;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Vitor
 */
public class CalculatorClient {
    private ICalculator _calculator;

    public CalculatorClient() throws RemoteException, NotBoundException, MalformedURLException {
        System.out.println("Buscando objeto no servidor...");
        this._calculator = (ICalculator) Naming.lookup("Calculator");
        System.out.println("Objeto encontrado e pronto para uso!");
    }

    public ICalculator getCalculator() {
        return _calculator;
    }

    public void setCalculator(ICalculator _calculator) {
        this._calculator = _calculator;
    }
    
    
}
