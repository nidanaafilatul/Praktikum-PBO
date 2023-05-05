class Pegawai{
    private String nama;
    private int gajiPokok = 5000000;
    
    void setNama(String nama){
        this.nama = nama;
    }

    void tampilData(){
        System.out.println("Nama : " + nama + ", Gaji Pokok : " + gajiPokok);
    }
}

class Manajer extends Pegawai{
    private int tunjangan = 700000;

    Manajer(String nama){
        setNama(nama);
    }

    void tampilData() {
        super.tampilData();
        System.out.println("tunjangan : " + tunjangan);
    }
}


class Programmer extends Pegawai{
    private int bonus = 450000;

    Programmer(String nama){
        setNama(nama);
    }

    void tampilData() {
        super.tampilData();
        System.out.println("bonus : " + bonus);
    }
}

class Payroll{
    void cetakGaji(Pegawai p){
        p.tampilData();
    }
}

public class PegawaiDanGaji{
    public static void main(String[] args){
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}