
import java.rmi.Naming;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BOE
 */
public class Server{
    private static final String host = "localhost";
    public static void main(String[] args) throws Exception
    {
        // khởi tạo lớp FindMaxMinInArrayImplement
        FindMaxMinInArrayImplement objImplement = new FindMaxMinInArrayImplement();
        //  biến chuỗi giữ URL đối tượng
        String rmiObjectName="rmi://"+host+"/maxmin";
        // Binding the object reference to the object name.
        Naming.rebind(rmiObjectName, objImplement);
        // Thông báo quá trình này đã hoàn tất
        System.out.println("Binding complete...\n");
    }
}
