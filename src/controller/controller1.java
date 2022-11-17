/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import VIEW.view1;
import java.sql.SQLException;

/**
 *
 * @author LAB 1
 */
public interface controller1 {
    public void Simpan(view1 tampil) throws SQLException;
    public void Ubah(view1 tampil) throws SQLException;
    public void Hapus(view1 tampil) throws SQLException;
    public void Baru(view1 tampil) throws SQLException;
    public void Klik_Tabel(view1 tampil) throws SQLException;
    public void Tampil(view1 tampil) throws SQLException;
}
 