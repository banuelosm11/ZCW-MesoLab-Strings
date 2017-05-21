import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by aurorabanuelos on 5/20/17.
 */
public class DriversLicense {

//    Create a DriversLicense class with fields found on a typical driver's license.
//    Write a serializeToCSV method that returns a string of comma separated values
//    for the fields in
//    the Driver's License, and a static getCSVHeader
//    method that produces the comma separated header for the CSV fields.

private String firstName;
private String lastName;
private String streetAddress;
private String city;
private String state;
private String dateOfBirth;
private String issueDate;
private String expDate;

public String commaSeparatedValues;
public static String commaSeparatedHeader;

public String serializeToCSV(){
    return commaSeparatedValues = String.format("%s,%s,%s,%s,%s,%s,%s,%s", firstName, lastName,
            streetAddress, city, state, dateOfBirth, issueDate, expDate);
}

public static String getCSVHeader(){
    DriversLicense driversLicense = new DriversLicense();
    StringBuilder sb = new StringBuilder();

    Field[] fields =driversLicense.getClass().getDeclaredFields();
    for (Field f: fields) {
        if (Modifier.isPrivate(f.getModifiers())) {
            sb.append(f.getName() + ",");
        }
    }
    sb.deleteCharAt(sb.length()-1);
    return sb.toString().toUpperCase();
}

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

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

}
