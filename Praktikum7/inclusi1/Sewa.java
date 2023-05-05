public class Sewa {
    public static void main(String[] args){
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        kendaraan.carRent(10,1000);
        mobil.carRent(10,1000);
        bis.carRent(10,1000);
        
    }
}
