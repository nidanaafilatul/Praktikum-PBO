/*
BujurSangkar 22/03/2023
Penulis : Nida' Naafilatul Haniifah
Deskripsi : File Class Bujur Sangkar
*/

package org.bangundatar;

import org.poligon.Poligon;


public class BujurSangkar extends Poligon{
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi){
		this.panjangSisi = panjangSisi;
		this.jumlahSisi = 4;
	}
	
	public double hitungLuas(){
		return panjangSisi * panjangSisi;
	}
	
	public double getPanjangSisi(){
		return this.panjangSisi;
	}
}