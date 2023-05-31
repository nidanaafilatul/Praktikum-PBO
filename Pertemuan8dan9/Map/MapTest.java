/**
 * Nama : Nida' Naafilatul Haniifah
 * Nim  : 24060121120039
 */


import java.util.*;

class MapTest {
    public static void main(String[] args){
         // kunci -> integer, nilai -> string
        Map<Integer, String>  map = new HashMap<Integer, String>();

        //menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        map.put(3,"tiga");
        map.put(1000,"seribu");
        //mengambil elemen pertama
        System.out.println("Elemen pertama: " + map.get(1));
        System.out.println("Elemen keseribu: " + map.getOrDefault(1000, "seribu"));

        //mengambil keseluruhan kunci seabagi objek collection set
        Set<Integer> keys = map.keySet();
        for (Integer key : keys){
            System.out.println("Elemen Kunci: " + key + " Nilai: " + map.get(key));
        }

        //mengambil keseluruhan kunci
        for(Integer key : keys){
            System.out.println("Elemen Kunci: " + key);
        }

        //mengambil keseluruhan nilai
        Collection<String> values = map.values();
        for (String value : values){
            System.out.println("Elemen Nilai: " + value);
        }
    }
}
