
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BOE
 */
public class FindMaxMinInArrayImplement extends UnicastRemoteObject implements IFindMaxMinInArray
{
    public FindMaxMinInArrayImplement() throws RemoteException
    {
        // constructor
    }
    @Override
    public int MaxInArray(int array[],int n) throws RemoteException {
        int max = 0;
        if(n>0)
        {
            max = array[0];
            for(int i=0;i<n;i++)
            {
                if(array[i]>= max)
                {
                    max = array[i];
                }
            }
        }
        return max;
    }

    @Override
    public int MinInArray(int array[],int n) throws RemoteException {
        int min = 0;
        if(n>0)
        {
            min = array[0];
            for(int i=0;i<n;i++)
            {
                if(array[i]<= min)
                {
                    min = array[i];
                }
            }
        }
        return min;
    }
}
