package Item;

import Penyewa.DataPenyewa;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lapangan.DataLapangan;
import lapangan.Lapangan;
import registrasi.DataRegistrasi;
import registrasi.Registrasi;

/**
 *
 * @author RobyHuzwandar
 */
public class ItemSerivceImp implements ItemService {

    @Override
    public List<Lapangan> loadLapangan() {
        return DataLapangan.listLapangan;
    }

    @Override
    public void addItem(Item itemLapangan) {
        DataItem.listItem.add(itemLapangan);
        JOptionPane.showMessageDialog(null, "Item Berhasil di tambahkan");
    }

    @Override
    public List<Registrasi> loadRegistrasi() {
        return DataRegistrasi.listRegistrasi;
    }

    @Override
    public DefaultTableModel itemView() {
        DefaultTableModel dtm;
        String[] colHeader = {"ID", "Nama Lapangan"};
        dtm = new DefaultTableModel(null, colHeader);
        for (Item il : DataItem.listItem) {
            Object[] isi = new Object[2];
            isi[0] = il.getLapangan().getId();
            isi[1] = il.getLapangan().getNmLapangan();
            dtm.addRow(isi);
        }
        return dtm;
    }

    @Override
    public void delete(int index) {
        DataItem.listItem.remove(index);
    }

}
