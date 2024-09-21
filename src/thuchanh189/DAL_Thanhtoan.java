/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh189;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author bqd14
 */
public class DAL_Thanhtoan extends SSMS {
    private String Hoten, Maphong, Gia, Ngayden, Ngaydi, Tinhtrang;

    public DAL_Thanhtoan() {}

    public DAL_Thanhtoan(String Hoten, String Maphong, String Gia, String Ngayden, String Ngaydi, String Tinhtrang) {
        this.Hoten = Hoten;
        this.Maphong = Maphong;
        this.Gia = Gia;
        this.Ngayden = Ngayden;
        this.Ngaydi = Ngaydi;
        this.Tinhtrang = Tinhtrang;
    }
    
    public DefaultTableModel Select(String mkh){
        String sql = "select Hoten, Phong.Maphong , Gia, Ngayden, Ngaydi\n" +
"from Khachhang, Phong, Thuephong\n" +
"where Thuephong.Maphong = Phong.Maphong\n" +
"	and Thuephong.Makh = Khachhang.Makh\n" +
"	and Khachhang.Makh = '" + mkh + "'";
        return super.Select_all(sql);
    }
    
    public String Thanhtoan(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate ngayden = LocalDate.parse(Ngayden, formatter);
        LocalDate ngaydi = LocalDate.parse(Ngaydi, formatter);
        long songay = ChronoUnit.DAYS.between(ngayden, ngaydi);
        float thanhtien = Float.parseFloat(Gia) * songay;
        return ""+thanhtien;
    }
    
    public void update_tt(DAL_Thanhtoan tt){
        String sql = "update Phong set Tinhtrang = 0 where Maphong ='" +tt.Maphong+"'";
        super.Excute(sql);
        sql = "update Thuephong set Trangthai ='Da thanh toan' where Maphong='"+tt.Maphong+"'";
        super.Excute(sql);
    }
   
}
