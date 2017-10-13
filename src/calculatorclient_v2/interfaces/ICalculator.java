/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorclient_v2.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Vitor
 */
public interface ICalculator extends Remote{
    public double add(double argA, double argB) throws RemoteException;
    public double subtract(double argA, double argB) throws RemoteException;
    public double multiply(double argA, double argB) throws RemoteException;
    public double divide(double argA, double argB) throws RemoteException;
}
