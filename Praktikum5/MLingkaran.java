/**
 * MLingkaran.java 04/05/2023
 * Penulis : Nida' Naafilatul Haniifah
 * Deskripsi : implementasi cara menghitung luas lingkaran        
 * 
 */ 
 import java.util.Scanner;

 public class MLingkaran{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan jari jari lingkaran : ");
		double r = in.nextDouble();
		Lingkaran l = new Lingkaran(r);
		System.out.println("Luas lingkaran dengan"+ 
			"jejari 10.2 satuan adalah "+l.hitungLuas());
		in.close();
	}

 }
  