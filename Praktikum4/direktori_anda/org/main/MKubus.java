/*
MKubus 22/03/2023
Penulis : Nida' Naafilatul Haniifah
Deskripsi : File Reallisasi dari Class Kubus
*/

package org.main;

import org.bangunruang.*;
import org.bangundatar.*;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar persegi = new BujurSangkar(10);
		
		Kubus kubus = new Kubus(persegi);

		System.out.println("Volume Kubus :" + kubus.hitungVolume());
		
		System.out.println("Luas Alas Kubus :" + kubus.hitungLuasAlas());
	}
}