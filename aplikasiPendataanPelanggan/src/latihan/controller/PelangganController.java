/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.controller;

import javax.swing.JOptionPane;
import latihan.model.PelangganModel;
import latihan.view.PelangganView;

/**
 *NIM : 10118037
 * Nama : Muhammad Ihsan
 * Kelas : IF-1 2018
 * Deskripsi : membuat method controller
 * @author Muhammad Ihsan
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    
    public void resetForm(PelangganView view){
            
            String nama = view.getTxtNama().getText();
            String email = view.getTxtEmail().getText();
            String noTlp = view.getTxtNoTelp().getText();
            
            if(nama.equals("") && email.equals("") && noTlp.equals("")){
            
            }else {
                model.resetForm();
            }
            
            
        }
        
        public void simpanForm(PelangganView view){
        
            String nama = view.getTxtNama().getText();
            String email = view.getTxtEmail().getText();
            String noTlp = view.getTxtNoTelp().getText();
            
           if(nama.trim().equals("")){
              JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
           }else  if(email.trim().equals("")){
               JOptionPane.showMessageDialog(view, "Email Masih Kosong");
           } else  if(noTlp.trim().equals("")){
               JOptionPane.showMessageDialog(view, "No Telp Masih Kosong");
           } else{
             model.simpanForm();
           }
        
       }
}
