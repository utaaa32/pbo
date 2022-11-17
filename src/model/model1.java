/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import VIEW.view1;
import controller.controller1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import koneksi.koneksi1;

/**
 *
 * @author LAB 1
 */
public class model1 implements controller1 {
String jk;

    @Override
    public void Simpan(view1 tampil) throws SQLException {
           tampil.txtALAMAT.setText("");
        tampil.txtTTL.setText("");
        tampil.txtnama.setText("");
    }

    @Override
    public void Ubah(view1 tampil) throws SQLException {
        if (tampil.rbtnGENDER.isSelected()){
            jk = "Laki Laki";
        } else {
            jk = "Perempuan";
        }
        try{
            Connection con = koneksi1.getcon();
            String sql = "UPDATE data SET ALAMAT=?, TTL=?"+ "GENDER=? WHERE ID=?";
            PreparedStatement prepare = con.prepareStatement(sql);
            prepare.setString(5, tampil.txtnama.getText());
            prepare.setString(2, tampil.txtTTL.getText());
            prepare.setString(1, tampil.txtALAMAT.getText());
            prepare.setString(4, tampil.rbtnGENDER.getText());
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DIUBAH");
            prepare.close();
        }catch (Exception e){
            System.out.println();
        }finally{
            Tampil (tampil);
           tampil.SetLebarKolom();
           Baru(tampil);
        }
    }

    @Override
    public void Hapus(view1 tampil) throws SQLException {
        try{
            Connection con = koneksi1.getcon();
            String sql = "DELETE FORM tampil WHERE NIS=?";
            PreparedStatement prepare = con.prepareStatement(sql);
            prepare.setString(1, tampil.txtnama.getText());
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(null,"DATA BERHASIL DIHAPUS");
            }catch (Exception e){
            System.out.println();
        }finally{
            Tampil (tampil);
           tampil.SetLebarKolom();
           Baru(tampil);
        }
    }

    @Override
    public void Baru(view1 tampil) throws SQLException {
        tampil.txtnama.setText("");
        tampil.txtTTL.setText("");
        tampil.rbtnGENDER.setText("");
    }

    @Override
    public void Klik_Tabel(view1 tampil) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Tampil(view1 tampil) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}