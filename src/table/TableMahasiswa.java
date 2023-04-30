/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package table;

package table;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import entity.Mahasiswa;


/**
 * Kelas    : PBO C
 * Anggota :
 * 1. Calvin Donisia Rahardjo       (210711299)
 * 2. I Made Wisnu Dharmapranaya    (210711352)
 * 3. Kevin Edgard Halim            (210711376)
 */
public class TableMahasiswa extends AbstractTableModel{
    private List<Mahasiswa> list;
    
    public TableMahasiswa(List<Mahasiswa> list) {
        this.list = list;
    }    
    
    @Override
    public int getRowCount() {
        return list.size();
    }
    
    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getNPM();
            case 1:
                return list.get(rowIndex).getNamaMahasiswa();
            case 2:
                return list.get(rowIndex).getProdi().getNamaProdi();
            case 3:
                return list.get(rowIndex).getProdi().getKodeProdi();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NPM";
            case 1:
                return "Nama Mahasiswa";
            case 2:
                return "Program Studi";
            default:
                return null;
        }
    }

}
