/**
 * Nama : Nida' Naafilatul Haniifah
 * Nim  : 24060121120039
 */


import java.util.*;

class ArrayListTest{
    public static void main(String[] args){
        //inisialisasi ArrayList yang hanya dapat 
        //berisi objek String
        List<String> strings = new ArrayList<>();
        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        
        //menghapus elemen
        strings.remove("praktikum");
        
        //iterasi pada keseluruhan ArrayList
        for(String s : strings){
            System.out.println( s + " ");
        }
    }
}