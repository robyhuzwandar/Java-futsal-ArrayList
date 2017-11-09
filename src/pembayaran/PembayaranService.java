package pembayaran;

import Penyewa.Penyewa;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RobyHuzwandar
 */
public interface PembayaranService {

    public void insert(Pembayaran pembayaran);

    public void edit(int index, Pembayaran pembayaran);

    public void delete(int index);

    public DefaultTableModel view();

    public List<Penyewa> loadPenyewaan();

}
