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
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class SIAK {

    
    public static void main(String[] args) {
      try{
          Class.forName("com.mysql.jdbc.Driver");
      }catch(Exception ex){
      System.err.println("Error :"+ex);
      System.exit(1);
      }
      Connection koneksi=null;
      try{
          koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/SIAK", "root", "");
          System.out.println("Selamat Koneksi Anda Telah Berhasil");
      }catch (Exception ex){
      System.out.println("error 2 :"+ex);
      System.exit(1);
      }
      ResultSet hasilQuery=null;
      try{
          Statement stm=koneksi.createStatement();
          hasilQuery=stm.executeQuery("Select * from mahasiswa");
      }catch(Exception ex){
      System.err.println("Error 3:"+ex);
      System.exit(1);
      }
      System.out.println("NIM"+"     "+"Nama"+"       "+"Tgl_Lahir");
      try {
          while (hasilQuery.next()){
              
          int nim=hasilQuery.getInt("nim");
          String nama=hasilQuery.getString("nama");
          Date tgl_lahir=hasilQuery.getDate("tgl_lahir");
          
          System.out.println(nim+"   "+nama+"   "+tgl_lahir);
        }
      }catch(Exception ex){
          System.out.println("error 4:"+ex);
          System.exit(1);
      }
      try{
          Statement stm=koneksi.createStatement();
          hasilQuery=stm.executeQuery("Select * from matakuliah");
      }catch(Exception ex){
      System.err.println("Error 3:"+ex);
      System.exit(1);
      }
          System.out.println();
          System.out.println("kode_mk"+"    "+"nama_mk"+"   "+"sks");
      try {
          while (hasilQuery.next()){
          int kode_mk=hasilQuery.getInt("kode_mk");
          String nama_mk=hasilQuery.getString("nama_mk");
          int sks=hasilQuery.getInt("sks");
          
          System.out.println(kode_mk+"         "+nama_mk+"         "+sks);
        }
      }catch(Exception ex){
          System.out.println("error 5:"+ex);
          System.exit(1);
      }
      try{
          Statement stm=koneksi.createStatement();
          hasilQuery=stm.executeQuery("Select nim,kode_mk,nilai,case when nilai >=80 then 'A' when nilai >=70 then 'B' when nilai >=60 then 'C' when nilai >=50 then 'D' when nilai <50 then 'E' when nilai is null then '(null)' end as huruf from nilai");
      }catch(Exception ex){
      System.err.println("Error :"+ex);
      System.exit(1);
      }
          System.out.println();
          System.out.println("nim"+"        "+"kode_mk"+"      "+"nilai"+"  "+"huruf");
      try {
          while (hasilQuery.next()){
          int nim=hasilQuery.getInt("nim");
          int kode_mk=hasilQuery.getInt("kode_mk");
          int nilai=hasilQuery.getInt("nilai");
          String huruf=hasilQuery.getString("huruf");
          
          System.out.println(nim+"         "+kode_mk+"         "+nilai+"      "+huruf);
        }
      }catch(Exception ex){
          System.out.println("error 6:"+ex);
          System.exit(1);
      }
    }
    
}
        
