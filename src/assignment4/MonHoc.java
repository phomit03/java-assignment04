package assignment4;

public abstract class MonHoc {
    abstract void themLopHoc(String name,int soluonghocsinh);
    abstract void xoaLopHoc(String name);
    abstract void sapXep(); // sắp xếp các lớp theo số lượng học sinh tham gia
    abstract void inDanhSach(); // in ra danh sách các lớp đang học môn này và danh sách học sinh tham gia
}
