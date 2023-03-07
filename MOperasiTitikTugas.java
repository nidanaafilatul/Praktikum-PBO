public class MOperasiTitikTugas {
    public static void main(String[] args){
        Titik t1, t2, t3;
        OperasiTitikTugas o;

        t1 = new Titik(17,19);
        System.out.println("Titik :(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        o = new OperasiTitikTugas();

        t2 = o.refleksiX(t1);
        System.out.println("Titik :(" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
        t3 = o.refleksiY(t1);

        
        System.out.println("Titik :(" + t3.getAbsis() + "," + t3.getOrdinat() + ")");
    }
}
