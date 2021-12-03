/*
* ngày tạo: Dec 03, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.TieuLuanCuoiKy;

import java.sql.Date;
import java.text.DecimalFormat;
import java.text.ParseException;

public class HangThucPham extends HangHoa {

    private Date ngayHetHan;
    public HangThucPham(String maHang, String tenHangHoa, long giaNhap, int soLuongTonKho, String ngayNhapKho)
            throws ParseException {
        super(maHang, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho);
        
    }
    public Date getNgayHetHan() {
        return getNgayHetHan();
    }
    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
    DecimalFormat ft = new DecimalFormat("###,###,### VND");
    @Override
    public String toString() {
        String s ;
        s = super.toString() + String.format( "%-20s|%-20s|", chuyenNgaySangChuoi(getNgayHetHan()) , ft.format(tinhTien()));
        return s;
    }
  
    
    private Object chuyenNgaySangChuoi(Date ngayHetHan2) {
        return null;
    }
  
    
}
