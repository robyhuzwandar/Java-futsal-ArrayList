package Penyewa;

import Penyewa.Penyewa;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RobyHuzwandar
 */
public interface PenyewaService {

    public void insert(Penyewa penyewa);

    public void delete(int index);

    public DefaultTableModel view();

    public DefaultTableModel detailsView(int index);

}
