/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg175314127_pbo2_20181;

/**
 *
 * @author Alexander Adam
 */
public class Pasien {
   private String noRekamMedis;
   private String nama,alamat;
   private String TempatLahir;
   private int TanggalLahir;
   private int BulanLahir;
   private int TahunLahir;

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatLahir() {
        return TempatLahir;
    }

    public void setTempatLahir(String TempatLahir) {
        this.TempatLahir = TempatLahir;
    }

    public int getTanggalLahir() {
        return TanggalLahir;
    }

    public void setTanggalLahir(int TanggalLahir) throws Exception {
        if (TanggalLahir > 0) {           
            if (TanggalLahir < 32) {
                this.TanggalLahir = TanggalLahir;
            }else{
                System.out.println("Tanggal Lahir tidak wajar");
            }
        }else{
            System.out.println("Tanggal Lahir tidak boleh nol");
        }
    }

    public int getBulanLahir() {
        return BulanLahir;
    }

    public void setBulanLahir(int BulanLahir) throws Exception {
        if (BulanLahir > 0 ) {
            if (BulanLahir <= 12) {
                this.BulanLahir = BulanLahir;
            }else{
                System.out.println("Bulan Lahir tidak wajar");
            }
        }else{
            System.out.println("Bulan Lahir tidak boleh nol");
        }
    }

    public int getTahunLahir() {
        return TahunLahir;
    }

    public void setTahunLahir(int TahunLahir) {
        this.TahunLahir = TahunLahir;
    }
   
   
}