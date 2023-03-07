public class OperasiTitikTugas {
    private void refleksiSumbuX(Titik T){
        double y;
        y = T.getOrdinat();
        y *= -1;
        T.setOrdinat(y);
    }

    private void refleksiSumbuY(Titik T){
        double x;
        x = T.getAbsis();
        x *= -1;
        T.setAbsis(x);
    }

    public Titik refleksiX(Titik T){
        refleksiSumbuX(T);
        return T;
    }

    public Titik refleksiY(Titik T){
        refleksiSumbuY(T);
        return T;
    }

}
