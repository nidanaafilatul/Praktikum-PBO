public class Car extends Vehicle{
    void carRent(int jarak, float harga){
        float fare = jarak * harga;
        fare = fare - 100000;
        System.out.println("harag sewa mobil = " + fare);
    }
}
