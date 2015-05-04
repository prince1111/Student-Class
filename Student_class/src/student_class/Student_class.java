/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_class;

/**
 *
 * @author anualli
 */
public class Student_class {

    /**
     * @param args the command line arguments
     */
    
    
    
        // fields created including name, address, and phone number set has varible 
               String name; int Age; String Address; String Phonenumber; 
       
        //   Writen appropriate accessor functions or methods 
               
               public String getname(){return name ;}
               public String getAddress(){ return Address;}
               public int getage(){ return Age;}
               public String getPhonenumber(){return Phonenumber;}
               
               
           // mutator methods // name assigns new name to name etc with the rest 
               
             public void setname(String newname ){ name = newname;}
             public void setAddress(String newAddress){ Address = newAddress;}
             public void setAge(int newAge){ Age = newAge;}
             public void setPhonenumber( String newPhonenumber){ Phonenumber = newPhonenumber;}
             
             
           // Demonstrating the class by writing a program that creates three instances of it. 
             
                  
    
                public static void main(String[] args) {
                    
                    Student_class Student1; 
                    Student1 = new Student_class();
                    
                    Student1.setname("prince");
                    Student1.setAge(20);
                    Student1.setAddress("300 jay street");
                    Student1.setPhonenumber("9178906875");
                    
                    
                    System.out.println(Student1.getname());
                    System.out.println(Student1.getage());
                    System.out.println(Student1.getAddress());
                    System.out.println(Student1.getPhonenumber());
                    
        
                    
                    Student_class Student2; 
                    Student2 = new Student_class();
                    
                    Student2.setname("ola kunle");
                    Student2.setAge(17);
                    Student2.setAddress("300 jay street");
                    Student2.setPhonenumber("9178906875");
                    
                    
                    System.out.println(Student2.getname());
                    System.out.println(Student2.getage());
                    System.out.println(Student2.getAddress());
                    System.out.println(Student2.getPhonenumber());
                    
                    
                    
                    Student_class Student3; 
                    Student3 = new Student_class();
                    
                    Student3.setname("john kelvin");
                    Student3.setAge(25);
                    Student3.setAddress("930 cali street");
                    Student3.setPhonenumber("918-890-6875");
                    
                    
                    System.out.println(Student3.getname());
                    System.out.println(Student3.getage());
                    System.out.println(Student3.getAddress());
                    System.out.println(Student3.getPhonenumber());
                
              // TODO code application logic here
         
        
    }
    
}
