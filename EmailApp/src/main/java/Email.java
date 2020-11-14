
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nicole
 */
public class Email {

    private Person employee;
    private String companyName;
    private String email;
    private String password;
    private int mailBoxCapacity;
    private int defaultPasswordLength;

    public Email(Person employee) {

        this.employee = employee;

        this.companyName = "nini.com.br";

        this.defaultPasswordLength = 10;

        this.password = randomPassword(defaultPasswordLength);
        //System.out.println("Your password is: " + this.password);

        this.email = employee.getFirstName().toLowerCase() + "." + employee.getLastName().toLowerCase() + "@" + employee.getDepartment() + companyName;
        //System.out.println("Your email is: " + email);

        this.mailBoxCapacity = 500;

    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVXZ0123456789!@#$%^&*~";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return this.mailBoxCapacity;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Hi! Your new e-mail adress is: " + this.email + " and your new password is: " + this.password + ".Your email capacity is: " + this.mailBoxCapacity + " Contact the IT team if you would like to set up a new password.";
    }

}
