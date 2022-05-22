package tutorial.model;

/**
 * Created by ME99735 on 30.07.2018 - 12:21
 * part of project: tutorialProject1
 */
public class Address {
    private int id;
    private String city;
    private String street;
    private int no;

    public Address(int id) {
    }

    public Address(String city, String street, int no) {
        this.city = city;
        this.street = street;
        this.no = no;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", no=" + no +
                '}';
    }
}
