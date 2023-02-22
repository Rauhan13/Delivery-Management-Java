/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg2;

import javax.management.relation.Role;

/**
 *
 * @author rauha
 */
public class Admin extends Login {
    private String department;

    public Admin(String username, String password, String department) {
        super(username, password, Role.ADMIN);
        this.department = department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void addNewUser(Customer ) {
        // Code to add a new user to the system
        // Here, you might have a UserList or a UserDAO class that allows you to
        // add users to the system. For example:
        UserList userList = UserList.getInstance(); // assuming a singleton UserList class
        userList.addUser(user);
    }

    public void deleteExistingUser(User user) {
        // Code to delete an existing user from the system
        // Here, you might have a UserList or a UserDAO class that allows you to
        // delete users from the system. For example:
        UserList userList = UserList.getInstance(); // assuming a singleton UserList class
        userList.deleteUser(user);
    }

    // Other methods specific to the admin role
}

