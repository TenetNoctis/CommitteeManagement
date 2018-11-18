/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package committeemanagement;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CommitteeManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int quantity, StaffID = 1, committeeID = 1, choice, exit, repeat, manageChoice, numberOfCommittee = 1;
        String[] employeeName, committeeName, departmentName, position, role, dateJoined, dateCreated, numberOfCommitteeStr;
        int[] employeeContact, duration, committee;
        employeeName = new String[20];
        employeeContact = new int[20];
        departmentName = new String[20];
        committee = new int[20];
        position = new String[20];
        role = new String[20];
        committeeName = new String[20];
        duration = new int[20];
        dateCreated = new String[20];
        dateJoined = new String [20];
        exit = 2;
        repeat = 1;
        while (exit == 2) {
            System.out.println("Select a choice:");
            System.out.println("1) Employee Registration 2) Create Comittee 3) Committee Management");
            System.out.println("4) Allocate Allowance    5) Generate Report 6) Feedback");
            System.out.println("7) Exit");
            choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        while (repeat == 1) {
                            System.out.println("Enter employee name:");
                            employeeName[StaffID] = scan.next();
                            System.out.println("Enter employee contact number:");
                            employeeContact[StaffID] = scan.nextInt();
                            System.out.println("Enter department name:");
                            departmentName[StaffID] = scan.next();
                            System.out.println("Enter your position:");
                            position[StaffID] = scan.next();
                            System.out.println("Enter today's date in DD/MM/YYYY format:");
                            dateJoined[StaffID] = scan.next();
                            System.out.println("Congratulations. You are now registered. Your Staff ID is "+StaffID);
                            ++StaffID;
                            System.out.println("Would you like to register another employee?");
                            System.out.println("Enter 1 for yes and 2 for no");
                            repeat = scan.nextInt();
                    }           
                        repeat = 1;
                        break;
                    case 2:
                        while (repeat == 1) {
                            System.out.println("Enter committee name:");
                            committeeName[committeeID] = scan.next();
                            System.out.println("Enter the duration of days the committee will be active for:");
                            duration[committeeID] = scan.nextInt();
                            System.out.println("Enter today's date in DD/MM/YYYY format:");
                            dateCreated[committeeID] = scan.next();
                            System.out.println("Enter the role of this committee:");
                            role[committeeID] = scan.next();
                            System.out.println("The committee has now been registered. the committee ID is "+committeeID);
                            ++committeeID;
                            ++numberOfCommittee;
                            System.out.println("Would you like to create another committee?");
                            System.out.println("Enter 1 for yes and 2 for no");
                            repeat = scan.nextInt();                           
                    }       
                        repeat = 1;
                        break;
                    case 3:
                        while (repeat == 1) {
                        System.out.println("Would you like to add or remove members?");
                        System.out.println("Enter 1 to add members and 2 to remove members");
                        manageChoice = scan.nextInt();
                        if (manageChoice == 1) {
                            System.out.println("Enter staff ID:");
                            StaffID = scan.nextInt();
                            System.out.println("Enter committee ID:");
                            committee[StaffID] = scan.nextInt();
                            System.out.println("Employee successfully added to committee");
                        }
                        else {
                            System.out.println("Enter staff ID:");
                            StaffID = scan.nextInt();
                            System.out.println("Enter committee ID:");
                            committee[StaffID] = scan.nextInt();
                            committee[StaffID] = 0;
                            System.out.println("Employee successfully removed from committee");
                    }    
                            System.out.println("Would you like to add/remove another staff member?");
                            System.out.println("Enter 1 to continue adding/removing and 2 to exit to main menu");
                            repeat = scan.nextInt();
                    }
                        repeat = 1;
                        break;
                    case 4:
                        //Will do after case 5 is fixed
                        break;
                    case 5:
                        while (repeat == 1) {
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("The employee list is shown according to the Committee ID:");
                        System.out.println("------------------------------------------------------------------");
                        committee[StaffID] = 1;
                        while (committee[StaffID] < numberOfCommittee) {
                            committeeID = committee[StaffID];
                            System.out.println("Committee Name: "+committeeName[committeeID]);
                            System.out.println("Staff ID: "+StaffID);
                            System.out.println("Employee Name: "+employeeName[StaffID]);
                            System.out.println("Employee Contact Number: "+employeeContact[StaffID]);
                            System.out.println("Employee Department: "+departmentName[StaffID]);
                            System.out.println("-----------------------------------------");
                            ++committee[StaffID];
                        }
                            System.out.println("Would you like to regenerate the report or exit?");
                            System.out.println("Enter 1 to regenerate and 2 to exit");
                        }
                        repeat = 1;
                        break;
                    case 7:
                        exit = 0;
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
            }
        }
    }
    
}
