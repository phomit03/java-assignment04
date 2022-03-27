package assignment4;

import java.util.ArrayList;

public class LopHoc {
    public String tenLop;
    public int siso;
    ArrayList<String> danhSachHocSinh = new ArrayList<String>();

    public LopHoc(String name, int soluonghocsinh) {
        tenLop = name;
        siso = soluonghocsinh;
    }

    public LopHoc(String tenLop, int siso, ArrayList<String> danhSachHocSinh) {
        this.tenLop = tenLop;
        this.siso = siso;
        this.danhSachHocSinh = danhSachHocSinh;
    }

    public void themHocSinh(String tenHocSinh) {
        for (String tenHs : danhSachHocSinh) {
            if (tenHs == tenHocSinh) {
                System.out.println("Học sinh đã tồn tại");
                return;
            }
        }
        danhSachHocSinh.add(tenHocSinh);
        return;
    }

}
