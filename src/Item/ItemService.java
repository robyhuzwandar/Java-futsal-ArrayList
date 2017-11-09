/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import lapangan.Lapangan;
import registrasi.Registrasi;

/**
 *
 * @author RobyHuzwandar
 */
public interface ItemService {

    public List<Lapangan> loadLapangan();

    public List<Registrasi> loadRegistrasi();

    public void addItem(Item itemLapangan);

    public void delete(int index);

    public DefaultTableModel itemView();

}
