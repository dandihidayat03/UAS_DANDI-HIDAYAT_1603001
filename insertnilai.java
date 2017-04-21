/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dandi
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class insertnilai {
     public static void main(String args[])throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SIAK", "root", "");
        
        PreparedStatement smt=con.prepareStatement("insert into nilai(nim,kode_mk,nilai)"+"values(?,?,?)");
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukan nim Anda :");
        int nim=sc.nextInt();
        System.out.print("Masukan kode_mk Anda :");
        int kode_mk=sc.nextInt();
        System.out.print("Masukan nilai Anda :");
        int nilai=sc.nextInt();
        smt.setInt(1, nim);
        smt.setInt(2, kode_mk);
        smt.setInt(3, nilai);
        
        smt.executeUpdate();
        System.out.println("Datanya telah ditambahkan");
        con.close();
    }
}