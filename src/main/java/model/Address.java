package model;

/**
 * Created by User on 23.03.2017.
 */
public class Address {

    public Integer id_address;
    public String city;
    public String street;
    public String house;
    public String apartment;

    public Address(){}

    public String toString(){
        return city + ", " + street + ",д. " + house + ",кв. " + apartment;
    }

    /*get-set*/
    public Integer getId_address() {
        return id_address;
    }

    public void setId_address(Integer id_address) {
        this.id_address = id_address;
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

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}
