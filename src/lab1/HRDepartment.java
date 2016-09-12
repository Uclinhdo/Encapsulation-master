/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author ldo
 */
public class HRDepartment {
    Employee employee;
    
    public HRDepartment() {
        this.employee = new Employee();
    }
     public void meetNewEmployee(String firstname, String lastname, String ssn){
         //Employee em = new Employee();
         employee.setFirstName(firstname);
         employee.setLastName(lastname);
         employee.setSsn(ssn);
     }
     public String getStatus(){
         return employee.getStatus();
     }
}
