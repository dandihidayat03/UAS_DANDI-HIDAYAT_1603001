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
public class insertmatakuliah {
public static void main(String args[])throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SIAK", "root", "");
        
        PreparedStatement smt=con.prepareStatement("insert into matakuliah(kode_mk,nama_mk,sks)"+"values(?,?,?)");
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukan kode_mk Anda :");
        int koedmk=sc.nextInt();
        System.out.print("Masukan nama_matkul Anda :");
        String matkul=sc.next();
        System.out.print("Masukan sks Anda :");
        int sks=sc.nextInt();
        int kodemk = 0;
        smt.setInt(1, kodemk);
        smt.setString(2, matkul);
        smt.setInt(3, sks);
        
        smt.executeUpdate();
        System.out.println("Datanya telah ditambahkan");
        con.close();
    }
    
}    
