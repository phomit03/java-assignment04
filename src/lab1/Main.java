package lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();

        System.out.println("User information is: ");
        pb.insertPhone("A", "123");
        pb.insertPhone("D", "456");
        pb.insertPhone("B", "234");
        pb.insertPhone("C", "345");
        for (PhoneNumber pn : pb.phoneList){
            System.out.println("The user's name is: " + pn.name);
            System.out.println("The user's phone is: " + pn.phone);
        }

        System.out.println("\nUser information after deletion is: ");
        pb.removePhone("A");
        for (PhoneNumber pn : pb.phoneList){
            System.out.println("The user's name is: " + pn.name);
            System.out.println("The user's phone is: " + pn.phone);
        }

        //update
        System.out.println("\nUser information after update is: ");
        pb.updatePhone("B", "000");
        pb.updatePhone("C", "111");
        for (PhoneNumber pn : pb.phoneList){
            System.out.println("The user's name is: " + pn.name);
            System.out.println("The user's phone is: " + pn.phone);
        }

        //search
        System.out.println("\nEnter the username to search for: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        pb.searchPhone(name);

        //sort
        System.out.println("\nAscending username contact list is: ");
        pb.sort();
        for (PhoneNumber pn : pb.phoneList){
            System.out.println("The user's name is: " + pn.name);
            System.out.println("The user's phone is: " + pn.phone);
        }


    }
}
