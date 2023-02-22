/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg2;

/**
 *
 * @author rauha
 */
public class CustomerDetails extends UserInfo {
    private String Name;
    private String Gender;
    private String religion;
    private String contact;
    private String Address;
    private String Email;

    public CustomerDetails(String x, String Name, String ic, String Gender, String race, String religion, String nationality, String marital, String contact, String Address, int postcode, String state, String Email, String y, String z) {
        super(x, y, z);
        this.Name = Name;
        this.Gender = Gender;
        this.religion = religion;
        this.contact = contact;
        this.Address = Address;
        this.Email = Email;
    }
    
    public CustomerDetails(String x) {
        super(x);
    }

    public CustomerDetails(String Name, String contact, String Address, String x) {
        super(x);
        this.Name = Name;
        this.contact = contact;
        this.Address = Address;
    }

    public String getLoginUsername() {
        return loginUsername;
    }

    public void setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}
