package lab1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Employee {
    //change into private properties
    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date currentDate;

    public Employee() {
        currentDate = new Date();
    }
    //add a new private property for getDateFormat
    private String getCurrentDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        return sdf.format(currentDate);
    }
    // create a new method
    public void EmployeeOrientation(){
        this.meetWithHrForBenefitAndSalryInfo();
        this.meetDepartmentStaff();
        this.reviewDeptPolicies();
        this.moveIntoCubicle(cubeId);
        this.getStatus();
        System.out.println(getCurrentDate());
    }
    // Assume this must be performed first
    public void meetWithHrForBenefitAndSalryInfo() {
        //SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        //String fmtDate = sdf.format(currentDate);
        System.out.println("Met with Hr on " + getCurrentDate() );
        metWithHr = true;
    }

    // Assume this is must be performed second
    public void meetDepartmentStaff() {
        if(metWithHr) {
            //SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
            //String fmtDate = sdf.format(currentDate);
            System.out.println("Met with Dept. Staff on " + getCurrentDate());
            metDeptStaff = true;
        } else {
            System.out.println("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    public void reviewDeptPolicies() {
        if(metWithHr && metDeptStaff) {
           // SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
            //String fmtDate = sdf.format(currentDate);
            System.out.println("Reviewed Dept. Policies on " + getCurrentDate());
            reviewedDeptPolicies = true;
        } else {
            System.out.println("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    public void moveIntoCubicle(String cubeId) {
        if(metWithHr && metDeptStaff && reviewedDeptPolicies) {
            //SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
            //String fmtDate = sdf.format(currentDate);
            System.out.println("Moved into cube on " + getCurrentDate());
            this.cubeId = cubeId;
            this.movedIn = true;
        } else {
            System.out.println("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }

    }

    public String getStatus() {
        //SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        //String fmtDate = sdf.format(currentDate);

        if(metWithHr && metDeptStaff
           && reviewedDeptPolicies && movedIn) {
            return "Orientation is completed on: " + getCurrentDate();
        } else {
            return getCurrentDate() + ": Orientation in progress...";
        }
    }
}
