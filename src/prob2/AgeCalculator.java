package prob2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AgeCalculator {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");

    public Period calculateAge(LocalDate birthday) {
        LocalDate today = LocalDate.now();
        return Period.between(birthday, today); // Return periods as Year, Month and Days
    }

    public LocalDate getBirthday() {
        Scanner scanner = new Scanner(System.in);
        LocalDate birthday;
        while (true) {
            System.out.println("Please enter your birthday "
                    + "in yyyy-MM-dd format (e.g. 1980-9-28): ");
            String input = scanner.nextLine();
            try {
                birthday = LocalDate.parse(input, formatter);

                return birthday;

            } catch (DateTimeParseException e) {
                System.out.println("Error! Please try again");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your first name:");
        String fname = scanner.nextLine();
        System.out.println("Please, enter your last name:");
        String lname = scanner.nextLine();


        AgeCalculator ageCalculator = new AgeCalculator();
        LocalDate birthday = ageCalculator.getBirthday();
        HeartRates hr = new HeartRates(fname, lname, birthday);
        Period age = ageCalculator.calculateAge(birthday);
//        System.out.printf("Today you are %d years, %d months"
//                        + " and %d days old%n",
//                age.getYears(), age.getMonths(), age.getDays());
        int yearsOld = age.getYears();
        int rhr = 70;
        int maximumHeartRate = 220 - yearsOld;
        int averageHeartRate = maximumHeartRate - rhr;

        double LB = 0.5;
        double UB = 0.85;

        double LBTHR = (averageHeartRate * LB) + rhr;
        double UBTHR = (averageHeartRate * UB) + rhr;


        System.out.println("The Target Heart Rate Range is between "+LBTHR+" and "+UBTHR);
        System.out.println("First Name: "+hr.getFirstName());
        System.out.println("Last Name: "+hr.getLastName());
        System.out.println("Age: "+yearsOld);
        System.out.println("Date of Birth: "+birthday);
        System.out.println("Maximum Heart Rate: "+maximumHeartRate);
    }
}
