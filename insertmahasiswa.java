/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dandi
 */
import java.sql.*;
import java.util.*;
public class insertmahasiswa {
    public static void main(String args[])throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SIAK", "root", "");
        
        PreparedStatement smt=con.prepareStatement("insert into mahasiswa(nim,nama,tgl_lahir)"+"values(?,?,?)");
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukan NIM Anda :");
        int nim=sc.nextInt();
        System.out.print("Masukan Nama Anda :");
        String nama=sc.next();
        System.out.print("Masukan Tgl_lahir Anda :");
        String tgl_lahir=sc.next();
        smt.setInt(1, nim);
        smt.setString(2, nama);
        smt.setString(3, tgl_lahir);
        
        smt.executeUpdate();
        System.out.println("Data telah ditambahkan");
        con.close();
    }
  
    
}
