package tutorial.dao;

import tutorial.model.Address;
import tutorial.model.DatabaseManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ME99735 on 30.07.2018 - 13:58
 * part of project: tutorialProject1
 */

public class AddressDao {
    Connection d = DatabaseManager.getConnection();

    public void add(Address adres) {
        try {
            Statement stm = d.createStatement();
            String query = "insert into adress(city,street,no) values ('" + adres.getCity() + "', '" + adres.getStreet() + "', '" + adres.getNo() + "')";
            System.out.println(query);

            stm.executeUpdate(query);
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public List<Address> getAll() {
        List<Address> addressList;
        try {
            Statement stm = d.createStatement();
            ResultSet resultSet = stm.executeQuery("select * from adress");
            addressList = new ArrayList<Address>();
            Address adres;
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String city = resultSet.getString("city");
                String street = resultSet.getString("street");
                int no = resultSet.getInt("no");
                adres = new Address(city, street, no);
                adres.setId(id);
                addressList.add(adres);
            }


        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Adress failed");
        }

        return addressList;
    }


    public Address delete(int adrresId) throws SQLException {

        try {
            Statement stm = d.createStatement();
            String query = "delete from adress where id= '" + adrresId + "'";

            stm.execute(query);
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Address tablobosalt () {

        try {
            Statement stm = d.createStatement();
            String query;
            query = "DELETE FROM  adress";

            stm.execute(query);
            stm.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
