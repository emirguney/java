package tutorial.dao;

import tutorial.model.Address;
import tutorial.model.Customer;
import tutorial.model.DatabaseManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {

    Connection d = DatabaseManager.getConnection();

    public void add (Customer cst){

        try{
            try (Statement stm = d.createStatement()) {
                String query = "insert into customer(name,surname,tel) values ('" + cst.getName() + "' ,'" + cst.getSurname() +"' ,'" + cst.getTel() + "')";
                System.out.println(query);

                stm.executeUpdate(query);
                stm.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Customer delete(int cstId) throws SQLException {

        try {
            Statement stm = d.createStatement();
            String query = "delete from customer where id= '" + cstId + "'";

            stm.execute(query);
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;}
    public List<Customer> getAll(){
        List<Customer> cstList;
        try{
            Statement stm = d.createStatement();
            ResultSet resultSet = stm.executeQuery("select * from customer");
            cstList = new ArrayList<Customer>();
            Customer cst;
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int tel = resultSet.getInt("tel");
                cst = new Customer (name,surname,tel);
                cst.setId(id);
                cstList.add(cst);
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Customer failed");
    }
        return cstList;

}
    public Customer tablobosalt () {

        try {
            Statement stm = d.createStatement();
            String query;
            query = "DELETE FROM  customer";

            stm.execute(query);
            stm.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
