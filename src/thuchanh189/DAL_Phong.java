/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh189;

import javax.swing.table.DefaultTableModel;


public class DAL_Phong extends SSMS {
    private String Maphong,Tenphong,Gia, Tinhtrang;

    public DAL_Phong() {}

    public DAL_Phong(String Maphong, String Tenphong, String Gia, String Tinhtrang) {
        this.Maphong = Maphong;
        this.Tenphong = Tenphong;
        this.Gia = Gia;
        this.Tinhtrang = Tinhtrang;
    }

    public String getMaphong() {
        return Maphong;
    }
    public DefaultTableModel Select(){
        return super.Select_all("Select * from Phong");
    }
     public DefaultTableModel Select_tt(){
        return super.Select_all("Select Maphong from Phong where (Tinhtrang = 0 or Tinhtrang is null)");
    }
    
    
    public boolean Update(DAL_Phong p){
        String sql ="Update Phong set Tenphong='"+p.Tenphong+"',Gia='"+p.Gia+"', Tinhtrang='"+p.Tinhtrang+"' where Maphong='"+p.Maphong+"'";
        return super.Excute(sql);
    }
    
    public boolean Insert (DAL_Phong p){
        String sql="Insert into Phong(Maphong,Tenphong,Gia) values('"+p.Maphong+"','"+p.Tenphong+"','"+p.Gia+"')";
        return super.Excute(sql);
    }
    public boolean Delete (DAL_Phong p){
        String sql="Delete from Phong where Maphong='"+p.Maphong+"'";
        return super.Excute(sql);
    } 
    
  
    
}
