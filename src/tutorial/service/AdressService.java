package tutorial.service;

import tutorial.dao.AddressDao;
import tutorial.dao.CustomerDao;
import tutorial.model.Address;
import tutorial.model.DatabaseManager;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class AdressService {

    public void addAdress(){
        Connection c = DatabaseManager.getConnection();
        AddressDao dao = new AddressDao();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Eklemek istediginiz adres bilgilerini giriniz...");
        System.out.print("City: ");
        final String city = scanner.next();
        System.out.print("Street: ");
        final String street = scanner.next();
        System.out.println("No: ");
        int no = -1;
        try {
            no = scanner.nextInt();
        }
        catch (Exception e) {
            System.err.println("Düzgün girsene!!!");
            System.exit(1);
        }

        Address address = new Address(city, street, no);
        dao.add(address);
    }

    public void deleteAdress(){
        Connection c = DatabaseManager.getConnection();
        AddressDao dao = new AddressDao();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cikarmak istediginiz adresin ID bilgisini giriniz...");
        System.out.print("ID: ");

        try {
            int id = scanner.nextInt();
            dao.delete(id);
            System.out.println("İsleminiz basariyla gerceklestirilmistir.\n");
        }
        catch (Exception e) {
            System.err.println("Düzgün girsene!!!\n");
            return;
        }


    }

    public void getAll(){
        AddressDao dao = new AddressDao();
        List<Address> addressList = dao.getAll();
        for (Address address:addressList){
            System.out.println(address);
        }
    }

    public void updateAdres(){
        Connection c = DatabaseManager.getConnection();
        AddressDao up = new AddressDao();

        Scanner scan=new Scanner(System.in);
        System.out.println("Guncelleme yapmak istediginiz adresin Id sini giriniz...");
        System.out.println("ID: \n");

        /*try {
            int id = scan.nextInt();
            up.update(id);

        }*/
    }

    public void tablobosalt(){
        Connection d = DatabaseManager.getConnection();
        AddressDao dao = new AddressDao();


        try{
            dao.tablobosalt();
        }
        catch (Exception e ){
            System.err.println("Düzgün girsene!!!\n");
            return;
        }
    }

}
