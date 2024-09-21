/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh189;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bqd14
 */
public class DAL_Thuephong extends SSMS{
    private String Makh, Maphong,Ngayden, Ngaydi, Trangthai;

    public DAL_Thuephong() {}

    public DAL_Thuephong(String Makh, String Maphong, String Ngayden, String Ngaydi, String Trangthai) {
        this.Makh = Makh;
        this.Maphong = Maphong;
        this.Ngayden = Ngayden;
        this.Ngaydi = Ngaydi;
        this.Trangthai = Trangthai;
    }
    
    public DefaultTableModel Select(){
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select * from Thuephong";
        return  super.Select_all(sql);
    }
    
    public boolean Insert(DAL_Thuephong tmp){
        String sql="Insert into Thuephong values('"+tmp.Makh+"','"+tmp.Maphong+"','"+tmp.Ngayden+"','"+tmp.Ngaydi+"','Chua thanh toan')";
        return super.Excute(sql);
    }
    public boolean Update(DAL_Thuephong tmp){
        String sql="Update ThuePhong set Maphong='"+tmp.Maphong+"',Ngayden='"+tmp.Ngayden+"', Ngaydi='"+Ngaydi+"' where Makh='"+tmp.Makh+"'";
        return super.Excute(sql); 
    }
    public boolean Delete(DAL_Thuephong tmp){
        String sql="Delete from ThuePhong where Makh='"+tmp.Makh+"'";
        return super.Excute(sql); 
    }
    
    public boolean Update_tinhtrang(String maphong){
        String sql = "update Phong set Tinhtrang = 1 where Maphong ='" +maphong+"'";
        return super.Excute(sql);
    }
}
