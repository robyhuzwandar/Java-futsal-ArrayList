package Penyewa;

import java.util.List;
import Item.Item;
import registrasi.Registrasi;

/**
 *
 * @author RobyHuzwandar
 */
public class Penyewa {

    private int id;
    private String tglSewa;
    private String tglMain;
    private String jamMain;
    private int jumLap;
    private int durasi;
    private double harga;
    private double totHarga;
    private double uangBoking;
    private double sisaBayar;

    private Registrasi registrasi;
    private List<Item> listItemLapangan;

    public int getJumLap() {
        return jumLap;
    }

    public void setJumLap(int jumLap) {
        this.jumLap = jumLap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTglSewa() {
        return tglSewa;
    }

    public void setTglSewa(String tglSewa) {
        this.tglSewa = tglSewa;
    }

    public String getTglMain() {
        return tglMain;
    }

    public void setTglMain(String tglMain) {
        this.tglMain = tglMain;
    }

    public String getJamMain() {
        return jamMain;
    }

    public void setJamMain(String jamMain) {
        this.jamMain = jamMain;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getTotHarga() {
        return totHarga;
    }

    public void setTotHarga(double totHarga) {
        this.totHarga = totHarga;
    }

    public double getUangBoking() {
        return uangBoking;
    }

    public void setUangBoking(double uangBoking) {
        this.uangBoking = uangBoking;
    }

    public double getSisaBayar() {
        return sisaBayar;
    }

    public void setSisaBayar(double sisaBayar) {
        this.sisaBayar = sisaBayar;
    }

    public Registrasi getRegistrasi() {
        return registrasi;
    }

    public void setRegistrasi(Registrasi registrasi) {
        this.registrasi = registrasi;
    }

    public List<Item> getListItemLapangan() {
        return listItemLapangan;
    }

    public void setListItemLapangan(List<Item> listItemLapangan) {
        this.listItemLapangan = listItemLapangan;
    }

}
