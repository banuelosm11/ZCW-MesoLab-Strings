import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
public ArrayList<String> listOfDriversLicenses = new ArrayList<String>();
public ArrayList<DriversLicense> arrayListOfDriversLicenses = new ArrayList<DriversLicense>();

public static String commaSeparatedHeader;

public DriversLicense(){}
public DriversLicense(String firstName, String lastName, String streetAddress, String city, String state, String dateOfBirth, String issueDate, String expDate){
    this.firstName=firstName;
    this.lastName=lastName;
    this.streetAddress=streetAddress;
    this.city=city;
    this.state=state;
    this.dateOfBirth=dateOfBirth;
    this.issueDate=issueDate;
    this.expDate=expDate;
}


public String serializeToCSV(){
    commaSeparatedValues = String.format("%s,%s,%s,%s,%s,%s,%s,%s", firstName, lastName,
            streetAddress, city, state, dateOfBirth, issueDate, expDate);
    listOfDriversLicenses.add(commaSeparatedValues);
    return commaSeparatedValues;
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

public ArrayList<DriversLicense> deserializeFromCSV(String input){

    String[] byLine = input.split("\n");
    for(int i =0; i< byLine.length; i++){
        String[] fieldsForDL = byLine[i].split(",");
        arrayListOfDriversLicenses.add(new DriversLicense(fieldsForDL[0], fieldsForDL[1], fieldsForDL[2], fieldsForDL[3],
                fieldsForDL[4], fieldsForDL[5], fieldsForDL[6], fieldsForDL[7]));
    }
    return arrayListOfDriversLicenses;
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
