/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Dandi
 */
import java.util.Scanner;

public class Hitungluas {
	static int panjang;
	static int lebar;
	static double luas;
	static Scanner s;
	
	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		System.out.print("Masukkan Panjang : ");
		panjang = s.nextInt();
		
		System.out.print("Masukkan Lebar : ");
		lebar = s.nextInt();
		
		luas = (panjang*lebar);
		
		System.out.print("(" + panjang + " * " + lebar + ") = " + luas);
	}

}
