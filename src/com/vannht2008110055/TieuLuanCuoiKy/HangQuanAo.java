/*
* ngày tạo: Dec 03, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.TieuLuanCuoiKy;

import java.text.ParseException;
import java.text.DecimalFormat;

public class HangQuanAo extends HangHoa {

    private Object xuatXu;

    public HangQuanAo(String maHang, String tenHangHoa, long giaNhap, int soLuongTonKho, String ngayNhapKho, String string)
            throws ParseException {
        super(maHang, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho);
       
    }
    public String getXuatXu() {
        return (String) xuatXu;
    }
    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }
    DecimalFormat ft = new DecimalFormat("###,###,### VND");
    @Override
    public String toString() {
        String s;
        s = super.toString() + String.format("%-20s|%-20s|",getXuatXu(),ft.format(tinhTien()));
        return s;
    }
   
    
}
