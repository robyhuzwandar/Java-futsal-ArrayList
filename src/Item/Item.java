package Item;

import Penyewa.Penyewa;
import lapangan.Lapangan;
import registrasi.Registrasi;

/**
 *
 * @author RobyHuzwandar
 */
public class Item {

    private Lapangan lapangan;
    private Registrasi registrasi;

    public Registrasi getRegistrasi() {
        return registrasi;
    }

    public void setRegistrasi(Registrasi registrasi) {
        this.registrasi = registrasi;
    }

    public Lapangan getLapangan() {
        return lapangan;
    }

    public void setLapangan(Lapangan lapangan) {
        this.lapangan = lapangan;
    }

}
