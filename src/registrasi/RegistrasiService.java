package registrasi;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RobyHuzwandar
 */
public interface RegistrasiService {

    public void insert(Registrasi registrasi);

    public void update(int index, Registrasi registrasi);

    public void delete(int index);

    public DefaultTableModel view();
}
