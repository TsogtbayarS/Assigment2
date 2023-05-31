package prob2;

import java.time.LocalDate;

public class HeartRates {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public HeartRates(String fname, String lname, LocalDate dob){
        this.firstName = fname;
        this.lastName = lname;
        this.dateOfBirth = dob;
    }
}
