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
        String[] employeeName, committeeName, departmentName, position, role, dateJoined, dateCreated, feedback;
        int[] employeeContact, duration, committee;
        double [] allowance;
        employeeName = new String[1000];
        employeeContact = new int[1000];
        departmentName = new String[1000];
        committee = new int[1000];
        position = new String[1000];
        role = new String[1000];
        committeeName = new String[1000];
        duration = new int[1000];
        dateCreated = new String[1000];
        dateJoined = new String [1000];
        feedback = new String [1000];
        allowance = new double[1000];
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
                            System.out.println("Enter employee's first name:");
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
                        while (repeat == 1) {
                        System.out.println("Which employee would you like to allocate an allowance for?");
                        StaffID = scan.nextInt();
                        System.out.println("Enter the amount you would like to allocate!");
                        allowance[StaffID] = scan.nextDouble();
                        System.out.println("Would you like to allocate allowance for another employee?");
                        System.out.println("Enter 1 for yes and 2 for no");
                        repeat = scan.nextInt();                           
                        }
                        repeat = 1;
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
                            System.out.println("Employment Date: "+dateJoined[StaffID]);
                            System.out.println("Employee Allowance: "+allowance[StaffID]);
                            System.out.println("-----------------------------------------");
                            ++committee[StaffID];
                        }
                            System.out.println("Would you like to regenerate the report or exit?");
                            System.out.println("Enter 1 to regenerate and 2 to exit");
                            repeat = scan.nextInt();
                        }
                        repeat = 1;
                        break;
                    case 6:
                        while (repeat == 1) {
                        System.out.println("Would you like to write feedback or see feedback given?");
                        System.out.println("Enter 1 to write feedback and 2 to see feedback given");
                        manageChoice = scan.nextInt();
                        if (manageChoice == 1) {
                            while (repeat == 1) {
                                System.out.println("Which employee would you like to write feedback for?");
                                StaffID = scan.nextInt();
                                System.out.println("Enter your feedback! (Please use single word adjectives for feedback)");
                                feedback[StaffID] = scan.next();
                                System.out.println("Would you like to write for another employee?");
                                System.out.println("Enter 1 for yes and 2 for no");
                                repeat = scan.nextInt();                           
                            }
                        repeat = 1;
                        }
                        else if (manageChoice == 2) {
                            while (repeat == 1) {
                                System.out.println("Enter the Staff ID!");
                                StaffID = scan.nextInt();
                                committeeID = committee[StaffID];
                                System.out.println("Committee Name: "+committeeName[committeeID]);
                                System.out.println("Staff ID: "+StaffID);
                                System.out.println("Employee Name: "+employeeName[StaffID]);
                                System.out.println("Feedback: "+feedback[StaffID]);
                                System.out.println("Would you like to see feedback of another employee?");
                                System.out.println("Enter 1 for yes and 2 for no");
                                repeat = scan.nextInt();
                            }
                        repeat = 1;    
                        }
                        System.out.println("Would you like to stay in the feedback section?");
                        System.out.println("Enter 1 for yes and 2 for no");
                        repeat = scan.nextInt();
                        }
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
