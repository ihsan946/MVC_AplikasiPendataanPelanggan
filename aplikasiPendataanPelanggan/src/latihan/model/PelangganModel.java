/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.model;

import javax.swing.JOptionPane;
import latihan.event.PelangganListener;

/**
 **NIM : 10118037
 * Nama : Muhammad Ihsan
 * Kelas : IF-1 2018
 * Deskripsi : membuat method Model
 * @author Muhammad Ihsan
 */
public class PelangganModel {
    private String nama;
    private String email;
    private String telp;
    
    private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }
    
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
        fireOnChange();
    }
    
    protected void  fireOnChange(){
           if(pelangganListener!=null){
               pelangganListener.onChange(this);
           }
    }
    
   public void resetForm(){
       setNama("");
       setEmail("");
       setTelp("");
    
   }
   
   public void simpanForm(){
       JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
       resetForm();
   }
}
