/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg2;
import java.util.ArrayList;
import javax.swing.JFrame;


/**
 *
 * @author rauha
 */
public class Customer extends Registration {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    private String accountNumber;
    
    public Customer(String name, String address, String phoneNumber, String emailAddress, String accountNumber) {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
    this.accountNumber = accountNumber;
}
    
    public static void main(String[] args) {
        Registration r = new Registration();
        r.setVisible(true);
    }
        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void updateCustomerInfo(String name, String address, String phoneNumber, String emailAddress, String accountNumber) {
        setName(name);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setEmailAddress(emailAddress);
        setaccountNumber(accountNumber);
    
    }
    
    Customer customer = new Customer("John","123 main street", "09875612", "john@example.com", "123" );
    
    ArrayList<Customer> customers = new ArrayList<>();
    Customer.add(Customer);

//public static void main(String[] args){
      //      System.out.print("test check");
    //}

    private void setaccountNumber(String accountNumber) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}