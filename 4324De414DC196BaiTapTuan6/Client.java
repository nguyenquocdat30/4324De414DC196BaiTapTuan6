import java.rmi.ConnectException;
import java.rmi.Naming;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BOE
 */
public class Client {
    private static final String host ="localhost";
    public static void main(String args[]) throws Exception
    {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so luong mang : ");
        do
        {
            n = input.nextInt();
            if(n<=0)
            {
                System.out.println("Nhap lai so luong mang > 0");
            }
        }while(n<=0);
        // khởi tạo mảng với n giá trị
        int[] array = new int [n];
        // nhập mảng
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap Array["+i+"]:");
            array[i] = input.nextInt();
        }
        // danh sách mảng
	System.out.println("DANH SACH MANG");
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+"  ");
        }
        try
        {
            // biến chuỗi chưa URL đối tượng
            String rmiObjectName="rmi://"+host+"/maxmin";
            IFindMaxMinInArray obj_message = (IFindMaxMinInArray) Naming.lookup(rmiObjectName);
            System.out.println("\nConnection Successfully");
            System.out.println("Max in Array : "+obj_message.MaxInArray(array, n));
            System.out.println("Max in Array : "+obj_message.MinInArray(array, n));
        }catch(ConnectException conEx)
        {
            System.out.println("Unable to connect to Server ");
            System.exit(1);
        }catch(Exception Ex)
        {
            System.exit(1);
        }
    }
}
