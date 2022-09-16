public class Anggota {
    private String ktp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String ktp, String nama, int limitPinjaman){
        this.ktp = ktp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public void setnama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return this.nama;
    }
    public void setLimitPinjaman(int limitPinjaman){
        this.limitPinjaman = limitPinjaman;
    }
    public int getLimitPinjaman(){
        return this.limitPinjaman;
    }
    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }

    public void pinjam(int jumlahpinjam){
        if(jumlahpinjam > this.limitPinjaman){
            System.out.println("Maaf, total jumlah peminjaman melebihi limit");
        }else{
            this.jumlahPinjaman = jumlahpinjam;
        }  
    }
    public void angsur(int jumlahAngsur){
        if(jumlahAngsur < (limitPinjaman/10)){
            System.out.println("Maaf jumlah angsuran pinjaman minimal 10% dari limit peminjaman");
        }else{
            jumlahPinjaman -= jumlahAngsur;
        }
    }
}

