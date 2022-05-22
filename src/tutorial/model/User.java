package tutorial.model;

/**
 * Created by ME99735 on 30.07.2018 - 12:24
 * part of project: tutorialProject1
 */
public class User {
    private int id;
    private String name;
    private int addressId;
    private int companyId;
    private Address address;
    private Customer company;

    public User(int id, String name, int addressId, int companyId, Address address, Customer company) {
        this.id = id;
        this.name = name;
        this.addressId = addressId;
        this.companyId = companyId;
        this.address = address;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Customer getCompany() {
        return company;
    }

    public void setCompany(Customer company) {
        this.company = company;
    }
}
