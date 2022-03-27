package lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneNumber {
    String name;
    ArrayList<String> phone = new ArrayList<String>();

    //contructor
    public PhoneNumber(String name, String phone) {
        this.name = name;
        this.phone.add(phone);
    }
}
