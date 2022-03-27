package lab1;

import java.util.*;

public class PhoneBook extends Phone{
    ArrayList<PhoneNumber> phoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone){
        for (PhoneNumber p : phoneList) {
            if (p.name == name){    //nếu có tên hoặc trùng tên
                for (String s: p.phone) {   //duyệt mảng ktra phone
                    if (s == phone){    //nếu phone trong phoneList (có rồi) thì return
                        return;
                    }
                }
                p.phone.add(phone);     //phone khác (chưa có) thì add phone
                return;
            }
        }
        //chưa có tên thì thêm liên hệ (name, phone)
        phoneList.add(new PhoneNumber(name, phone));

    }

    @Override
    public void removePhone(String name) {
        for (PhoneNumber p: phoneList){
            if (name == p.name){
                phoneList.remove(p);
                return;
            }
        }

    }

    @Override
    public void updatePhone(String name, String newphone){  //cập nhật số điện thoại
        for (PhoneNumber p: phoneList){
            if (name == p.name){
                p.phone.removeAll(p.phone); //Xoá all danh bạ
                p.phone.add(newphone);
                System.out.println("Successfully updated contact " + p.name + " number phone: " + p.phone);
                return;
            }
        }
    }

    @Override
    public void searchPhone(String name){    //kiểu PhoneNumber, tìm kiếm số trong danh bạ
        for (PhoneNumber p : phoneList) {
            if (p.name.equals(name)){   //equals: so sánh chuỗi: p.name == name
                System.out.println("The user's name is: " + name);
                System.out.println("The user's phone is: " + p.phone);
            }
        }
    }

    @Override
    public void sort(){
        Collections.sort(phoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.name.compareTo(o2.name);
            }
        });
    }
}
