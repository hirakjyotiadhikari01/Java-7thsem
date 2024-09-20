import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birthdate (DD-MM-YYYY):");
        String birthdate = scanner.nextLine();
        System.out.println("Enter current date (DD-MM-YYYY):");
        String currentDate = scanner.nextLine();

        int birthDay = Integer.parseInt(birthdate.substring(0, 2));
        int birthMonth = Integer.parseInt(birthdate.substring(3, 5));
        int birthYear = Integer.parseInt(birthdate.substring(6, 10));
        int currentDay = Integer.parseInt(currentDate.substring(0, 2));
        int currentMonth = Integer.parseInt(currentDate.substring(3, 5));
        int currentYear = Integer.parseInt(currentDate.substring(6, 10));

        int ageYears = currentYear - birthYear;
        int ageMonths = currentMonth - birthMonth;
        int ageDays = currentDay - birthDay;

        if (ageMonths < 0) {
            ageYears--;
            ageMonths = 12 + ageMonths;
        }

        if (ageDays < 0) {
            ageMonths--;
            ageDays = 30 + ageDays; 
        }

        System.out.println("Your age is: " + ageYears + " years, " + ageMonths + " months, " + ageDays + " days");
    }
}