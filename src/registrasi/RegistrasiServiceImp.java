package registrasi;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RobyHuzwandar
 */
public class RegistrasiServiceImp implements RegistrasiService {

    @Override
    public void insert(Registrasi registrasi) {
        DataRegistrasi.listRegistrasi.add(registrasi);
    }

    @Override
    public void update(int index, Registrasi registrasi) {
        DataRegistrasi.listRegistrasi.set(index, registrasi);
    }

    @Override
    public void delete(int index) {
        DataRegistrasi.listRegistrasi.remove(index);
    }

    @Override
    public DefaultTableModel view() {
        DefaultTableModel dtm;
        String[] colHeader = {"ID", "Nama Team", "Penanggung Jawab", "No Hp"};
        dtm = new DefaultTableModel(null, colHeader);
        for (Registrasi b : DataRegistrasi.listRegistrasi) {
            Object[] isi = new Object[4];
            isi[0] = b.getId();
            isi[1] = b.getTeam();
            isi[2] = b.getpenanggungJawab();
            isi[3] = b.getNoHp();

            dtm.addRow(isi);
        }
        return dtm;
    }

}
