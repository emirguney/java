package tutorial.resource;

import tutorial.model.Address;
import tutorial.service.AdressService;
import tutorial.service.CustomerService;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws SQLException {

        while (true){

            System.out.println("Kayit servisine hosgeldiniz.\n");
            System.out.println("Adres icin 1'e Müsteriler icin 2'ye Calisanlar icin 3'e basiniz.");
            Scanner scan = new Scanner(System.in);
            int a=scan.nextInt();
            AdressService adressService = new AdressService();

                switch (a){

                    case 1:{
                        System.out.println("ADRES eklemek icin 1'e cikarmak icin 2'ye listelemek icin 3'e basiniz.");
                        System.out.println("tabloyu bosaltmak icin 4'e basiniz.");
                        Scanner scan1 = new Scanner(System.in);
                        int b=scan1.nextInt();
                        switch (b) {
                            case 1:
                                adressService.addAdress();
                                break;
                            case 2:
                                adressService.deleteAdress();
                                break;
                            case 3:
                                adressService.getAll();
                                break;
                            case 4:
                                adressService.tablobosalt();
                                break;
                        }
                    }
                    case 2: {
                        System.out.println("MUSTERI eklemek icin 1'e cikarmak icin 2'ye listelemek icin 3'e basiniz.");
                        System.out.println("tabloyu bosaltmak icin 4'e basiniz.");
                        Scanner scan2 = new Scanner(System.in);
                        int c=scan2.nextInt();
                        CustomerService cstservice = new CustomerService();
                            switch (c){

                                case 1:
                                    cstservice.addCustom();
                                        break;
                                case 2:
                                    cstservice.deleteCustom();
                                        break;
                                case 3:
                                    cstservice.getAll();
                                        break;
                                case 4:
                                    cstservice.tabloBosalt();
                                        break;
                    }

                    }

                    }
                }








    }
}
