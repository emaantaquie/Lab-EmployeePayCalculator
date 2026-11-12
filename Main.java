//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class Employee{
    double calculateSalary(){
        return  0.0;
    }
}

class FullTimeEmployee extends Employee{
    double basePay;
    double bonus;
    @Override
    double calculateSalary(){
        return basePay + bonus;
    }

}

class PartTimeEmployee extends Employee{
    double hourlyRate;
    double hourlyWorked;
    @Override
    double calculateSalary(){
        return hourlyRate * hourlyWorked;
    }

}




public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee type (full-time/part-time)");
        String employee = input.nextLine();

        if (employee.equalsIgnoreCase("full-time") ){
            FullTimeEmployee f = new FullTimeEmployee();
            System.out.println("Enter base pay: ");
            f.basePay = input.nextDouble();
            System.out.println("Enter bonus: ");
            f.bonus = input.nextDouble();
            System.out.println("Monthly Salary: $" + f.calculateSalary());

        }
        else if(employee.equalsIgnoreCase("part-time")) {
            PartTimeEmployee p = new PartTimeEmployee();
            System.out.print("Enter hourly rate: ");
            p.hourlyRate = input.nextDouble();
            System.out.println("Enter hours worked: ");
            p.hourlyWorked = input.nextDouble();
            System.out.println("Monthly Salary: " + p.calculateSalary());


        }
         else {
            System.out.print("Input is invalid.");


        }


    }
}