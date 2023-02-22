/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg2;

/**
 *
 * @author rauha
 */
public class StaffInfo extends UserInfo {
    private String Name;
    private String Gender;
    private String race;
    private String religion;
    private String nationality;
    private String marital;
    private String contact;
    private String Address;
    private String Email;
 
    
    public StaffInfo(String x, String Name, String ic, String Gender, String race, String religion, String nationality, String marital, String contact, String Address, int postcode, String state, String Email, String y, String z ){
        super(x, y, z);
        this.Name = Name;
        this.Gender = Gender;
        this.race = race;
        this.religion = religion;
        this.nationality = nationality;
        this.marital = marital;
        this.contact = contact;
        this.Address = Address;
        this.Email = Email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
}
