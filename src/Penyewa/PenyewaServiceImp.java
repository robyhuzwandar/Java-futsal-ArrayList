package Penyewa;

import javax.swing.table.DefaultTableModel;
import Item.Item;

/**
 *
 * @author RobyHuzwandar
 */
public class PenyewaServiceImp implements PenyewaService {

    @Override
    public void insert(Penyewa penyewa) {
        DataPenyewa.listPenyewa.add(penyewa);
    }

    @Override
    public void delete(int index) {
        DataPenyewa.listPenyewa.remove(index);
    }

    @Override
    public DefaultTableModel view() {
        DefaultTableModel dtm;
        String[] colHeader = {"ID", "Team", "Sewa", "Main", "Jam", "Jumlah Lap.", "Durasi",
            "Harga", "Total Harga", "Uang Boking", "Sisa Bayar"};
        dtm = new DefaultTableModel(null, colHeader);
        for (Penyewa p : DataPenyewa.listPenyewa) {
            Object[] isi = new Object[11];
            isi[0] = p.getId();
            isi[1] = p.getRegistrasi().getTeam();
            isi[2   ] = p.getTglSewa();
            isi[3] = p.getTglMain();
            isi[4] = p.getJamMain();
            isi[5] = p.getJumLap();
            isi[6] = p.getDurasi();
            isi[7] = p.getHarga();
            isi[8] = p.getTotHarga();
            isi[9] = p.getUangBoking();
            isi[10] = p.getSisaBayar();
            dtm.addRow(isi);
        }
        return dtm;
    }

    @Override
    public DefaultTableModel detailsView(int index) {
        DefaultTableModel dtm;
        String[] colHeader = {"Id", "Nama Lapangan", "Jenis"};
        dtm = new DefaultTableModel(null, colHeader);
        for (Item il : DataPenyewa.listPenyewa.get(index).getListItemLapangan()) {
            Object[] isi = new Object[3];
            isi[0] = il.getLapangan().getId();
            isi[1] = il.getLapangan().getNmLapangan();
            isi[2] = il.getLapangan().getJenisLapangan();
            dtm.addRow(isi);
        }
        return dtm;
    }

}
