
package lapangan;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RobyHuzwandar
 */
public interface LapanganService {
      public void insert(Lapangan lapangan);

    public void update(int index, Lapangan lapangan);

    public void delete(int index);

    public DefaultTableModel view();
    
}
