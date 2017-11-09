package pembayaran;

import Penyewa.Penyewa;

/**
 *
 * @author RobyHuzwandar
 */
public class Pembayaran {

    private int id;
    private double uangPelunasan;
    private double totHarga;

    private Penyewa penyewa;
    private String keterangan;

    public double getTotHarga() {
        return totHarga;
    }

    public void setTotHarga(double totHarga) {
        this.totHarga = totHarga;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getUangPelunasan() {
        return uangPelunasan;
    }

    public void setUangPelunasan(double uangPelunasan) {
        this.uangPelunasan = uangPelunasan;
    }

    public Penyewa getPenyewa() {
        return penyewa;
    }

    public void setPenyewa(Penyewa penyewa) {
        this.penyewa = penyewa;
    }

}
