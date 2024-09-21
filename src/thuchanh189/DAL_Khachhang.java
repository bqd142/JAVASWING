/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh189;

import javax.swing.table.DefaultTableModel;


public class DAL_Khachhang extends SSMS {
    private String Makh;
    private String Hoten;

    public String getMakh() {
        return Makh;
    }

    public DAL_Khachhang() {}

    public DAL_Khachhang(String Makh, String Hoten) {
        this.Makh = Makh;
        this.Hoten = Hoten;
    }
    public DefaultTableModel Select(){
        return super.Select_all("Select * from Khachhang");
    }
    
    public DefaultTableModel Select_tt(){
        return super.Select_all("Select Makh from Khachhang");
    }
    public boolean Insert(DAL_Khachhang tmp){
        String sql = "insert into Khachhang values('" + tmp.Makh+"', '" + tmp.Hoten +"')";
        return super.Excute(sql);
    }
    public boolean Update(DAL_Khachhang tmp){
        String sql = "UPDATE Khachhang set Hoten = '"+tmp.Hoten +"' where Makh = '" +tmp.Makh +"'";
        return super.Excute(sql);
    }
    public boolean Delete(DAL_Khachhang tmp){
        String sql = "Delete Khachhang where Makh = '" +tmp.Makh +"'";
        return super.Excute(sql);
    }
}
