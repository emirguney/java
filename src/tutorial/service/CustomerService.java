package tutorial.service;

import tutorial.dao.AddressDao;
import tutorial.dao.CustomerDao;
import tutorial.model.Address;
import tutorial.model.Customer;
import tutorial.model.DatabaseManager;
import java.sql.Connection;

import java.util.List;
import java.util.Scanner;

public class CustomerService {

    public void addCustom(){
        Connection d = DatabaseManager.getConnection();
        CustomerDao cstm = new CustomerDao();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Eklemek istediginiz musteri bilgilerini giriniz...");
        System.out.print("Ad: ");
        final String name = scanner.next();
        System.out.print("Soyad: ");
        final String surname = scanner.next();
        System.out.println("Tel No: ");
        int tel = -1;
        try {
            tel = scanner.nextInt();
        }
        catch (Exception e) {
            System.err.println("Düzgün girsene!!!");
            System.exit(1);
        }
        Customer cst1 = new Customer(name,surname,tel);
        cstm.add(cst1);

    }
    public void deleteCustom(){
        Connection d = DatabaseManager.getConnection();
        CustomerDao cstm = new CustomerDao();

        Scanner scanner = new Scanner (System.in);
        System.out.print("Silmek istediginiz musterinin ID bilgisini giriniz.");
        System.out.print("ID: ");
        try{
            int id =scanner.nextInt();
            cstm.delete(id);
        }
        catch (Exception e) {
            System.err.println("Düzgün girsene!!!\n");
            return;
        }
        }
    public void getAll(){
        CustomerDao dao = new CustomerDao();
        List<Customer> cstList = dao.getAll();
        for (Customer cst:cstList){
            System.out.println(cst);
        }
    }
    public void tabloBosalt(){
        Connection d = DatabaseManager.getConnection();
        CustomerDao cstm = new CustomerDao();

        Scanner scanner = new Scanner(System.in);
        try{
            cstm.tablobosalt();
        }
        catch (Exception e ){
            System.err.println("Düzgün girsene!!!\n");
            return;
        }
    }
    }



