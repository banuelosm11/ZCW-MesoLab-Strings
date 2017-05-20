/**
 * Created by aurorabanuelos on 5/20/17.
 */
public class DriversLicense {

//    Create a DriversLicense class with fields found on a typical driver's license.
//    Write a serializeToCSV method that returns a string of comma separated values
//    for the fields in
//    the Driver's License, and a static getCSVHeader
//    method that produces the comma separated header for the CSV fields.

String firstName;
String lastName;
String streetAddress;
String city;
String state;
String dateOfBirth;
String issueDate;
String expDate;
String commaSeparatedValues;

public String serializeToCSV(){
    return commaSeparatedValues = String.format("%s,%s,%s,%s,%s,%s,%s,%s", firstName, lastName,
            streetAddress, city, state, dateOfBirth, issueDate, expDate);
}

}
