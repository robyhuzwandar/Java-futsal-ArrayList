package pembayaran;

import Penyewa.DataPenyewa;
import Penyewa.Penyewa;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RobyHuzwandar
 */
public class PembayaranServiceImp implements PembayaranService {

    @Override
    public void insert(Pembayaran pembayaran) {
        DataPembayaran.listPembayaran.add(pembayaran);
    }

    @Override
    public void edit(int index, Pembayaran pembayaran) {
        DataPembayaran.listPembayaran.set(index, pembayaran);
    }

    @Override
    public void delete(int index) {
        DataPembayaran.listPembayaran.remove(index);
    }

    @Override
    public List<Penyewa> loadPenyewaan() {
        return DataPenyewa.listPenyewa;
    }

    @Override
    public DefaultTableModel view() {
        DefaultTableModel dtm;
        String[] colHeader = {"Id", "Team ", "Total Harga", "Keterangan"};
        dtm = new DefaultTableModel(null, colHeader);
        for (Pembayaran p : DataPembayaran.listPembayaran) {
            Object[] isi = new Object[4];
            isi[0] = p.getId();
            isi[1] = p.getPenyewa().getRegistrasi().getTeam();
            isi[2] = p.getTotHarga();
            isi[3] = p.getKeterangan();

            dtm.addRow(isi);
        }
        return dtm;

    }

}
