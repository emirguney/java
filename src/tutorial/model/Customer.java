package tutorial.model;

/**
 * Created by ME99735 on 30.07.2018 - 12:22
 * part of project: tutorialProject1
 */
public class Customer {
    private int id;
    private String name;
    private String surname;
    private int tel;



    public Customer( String name, String surname ,int tel) {
        this.name = name;
        this.surname = surname;
        this.tel= tel;

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

    public void setName() {
        this.name = name;
    }

    public String getSurname(){return surname;}

    public void setSurname (){this.surname = surname;}

    public int getTel (){return tel;}

    public void setTel(int tel){this.tel=tel;}



}
