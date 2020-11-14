/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicole
 */
public class EmailApp {
    public static void main(String[] args) {
       
        Person fabioFa = new Person("Fabio", "Faria");
       
        System.out.println(fabioFa);
        
        Email novo1 = new Email(fabioFa);
        System.out.println(novo1);
        
     novo1.changePassword("nininini10");
     System.out.println(novo1.getPassword());
        
     
       
       
       
    }
}
