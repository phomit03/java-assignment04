package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MonHocDaiCuong extends MonHoc{
    ArrayList<LopHoc> danhSachLopHoc = new ArrayList<>();

    @Override
    public void themLopHoc(String name, int soluonghocsinh){
        for(LopHoc lh : danhSachLopHoc){    //nếu lớp học có trong danh sách
            if (lh.tenLop == name){
                System.out.println("Lớp: " + name + " đã tồn tại!");
                return;
            }
        }
        danhSachLopHoc.add(new LopHoc(name, soluonghocsinh));   //thêm lớp học khi lớp đó chưa nằm trong danh sách
    }

    @Override
    public void xoaLopHoc(String name){
        for(LopHoc lh : danhSachLopHoc){    //nếu lớp học có trong danh sách
            if (lh.tenLop == name){
                danhSachLopHoc.remove(lh);
                return;
            }
        }
        System.out.println("Lớp: " + name + " đã tồn tại!");
    }

    @Override
    public void sapXep(){   // sắp xếp các lớp theo số lượng học sinh tham gia
        int sstg;
        String tltg;
        for(int i=0;i<danhSachLopHoc.size();i++){
            for(int j=i+1;j<danhSachLopHoc.size();j++){
                if(danhSachLopHoc.get(i).siso>danhSachLopHoc.get(j).siso){
                    sstg = danhSachLopHoc.get(j).siso;
                    tltg = danhSachLopHoc.get(j).tenLop;
                    danhSachLopHoc.get(j).siso = danhSachLopHoc.get(i).siso;
                    danhSachLopHoc.get(j).tenLop = danhSachLopHoc.get(i).tenLop;
                    danhSachLopHoc.get(i).siso = sstg;
                    danhSachLopHoc.get(i).tenLop = tltg;
                }
            }
        }
    }

    @Override
    public void inDanhSach(){   // in ra danh sách các lớp đang học môn này và danh sách học sinh tham gia
        for(LopHoc lh : danhSachLopHoc){    //nếu lớp học có trong danh sách
            System.out.println("Lớp: " + lh.tenLop + ", sĩ số: " + lh.siso);
            System.out.println("Học sinh tham gia: " + lh.danhSachHocSinh);
        }
    }


}
