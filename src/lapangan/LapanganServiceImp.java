package lapangan;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RobyHuzwandar
 */
public class LapanganServiceImp implements LapanganService {

    @Override
    public void insert(Lapangan lapangan) {
        DataLapangan.listLapangan.add(lapangan);
    }

    @Override
    public void update(int index, Lapangan lapangan) {
        DataLapangan.listLapangan.set(index, lapangan);
    }

    @Override
    public void delete(int index) {
        DataLapangan.listLapangan.remove(index);
    }

    @Override
    public DefaultTableModel view() {
        DefaultTableModel dtm;

        String[] colHeader = {"ID", "Nama Lapangan", "Jenis"};
        dtm = new DefaultTableModel(null, colHeader);

        for (Lapangan l : DataLapangan.listLapangan) {
            Object[] isi = new Object[3];
            isi[0] = l.getId();
            isi[1] = l.getNmLapangan();
            isi[2] = l.getJenisLapangan();

            dtm.addRow(isi);
        }
        return dtm;
    }

}
