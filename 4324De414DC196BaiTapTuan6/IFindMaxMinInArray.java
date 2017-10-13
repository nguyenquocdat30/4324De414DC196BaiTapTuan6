
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BOE
 */
public interface IFindMaxMinInArray extends Remote{
    int MaxInArray(int array[],int n) throws RemoteException;
    int MinInArray(int array[],int n) throws RemoteException;
}
