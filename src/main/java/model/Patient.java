package model;

import java.io.Serializable;

/**
 * Created by User on 01.05.2016.
 */
public class Patient implements Serializable {

    private Integer id_patient;
    private String firstName;
    private String lastName;
    private String middleName;
    private String birthday;
    private Integer phoneNumber;
    private String passport;
    private String allergy;
    private Integer addressId;

    private Address patientAddress;

    public Patient(){}

    @Override
    public String toString(){
        return firstName + " " + lastName + " " + middleName + ", " +
                birthday + ", " + passport + ", " + phoneNumber + ", "
                + allergy;
    }

    public Address getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(Address patientAddress) {
        this.patientAddress = patientAddress;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getId_patient() {
        return id_patient;
    }

    public void setId_patient(Integer id_patient) {
        this.id_patient = id_patient;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String password) {
        this.passport = password;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

}
