/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorclient_v2.vo;

import calculatorclient_v2.interfaces.ICalculator;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Vitor
 */
public class Calculator extends UnicastRemoteObject implements ICalculator{

    public Calculator() throws RemoteException {
        super();
    }


    @Override
    public double add(double argA, double argB) throws RemoteException {
        return argA + argB;
    }

    @Override
    public double subtract(double argA, double argB) throws RemoteException {
        return argA - argB;
    }

    @Override
    public double multiply(double argA, double argB) throws RemoteException {
        return argA * argB;
    }

    @Override
    public double divide(double argA, double argB) throws RemoteException {
        if(argB == 0){
            throw new ArithmeticException("Erro de divisão por zero (0).");
        }
        return argA / argB;
    }
    
}
