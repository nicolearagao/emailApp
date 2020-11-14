
import java.util.Scanner;


public class Person {
    private String firstName;
    private String lastName;
    private String department;
    private String alternateEmail;
    
    
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        
        
        this.department = setDepartment();
        this.alternateEmail = setAlternateEmail();
        
        
        
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    private String setDepartment(){
        System.out.println("New employee, welcome to the company!");
        System.out.println("Enter the department code: ");
        System.out.println("1 - Sales");
        System.out.println("2 - Development");
        System.out.println("3 - Accounting");
        System.out.println("0 - none");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        
        
        if(departmentChoice == 1){
            return "sales";
        }
        
        if (departmentChoice == 2){
            return "dev";
        }
        if(departmentChoice == 3){
            return "acct";
        }
        else{
            return "";
        }
        
    }
    
    private String setAlternateEmail(){
        System.out.println("Please type an alternative e-mail below:");
        Scanner in = new Scanner(System.in);
        String altmail = in.nextLine();
        
        return altmail;
    }

    public String getDepartment() {
        return department;
    }
    
    @Override
    public String toString(){
      return "Welcome " +this.firstName +" " +this.lastName +"!" +" You are allocated at the " +this.department +" department and have set " +this.alternateEmail +" to be your alternate e-mail.";
    }
    
}
