import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by aurorabanuelos on 5/20/17.
 */
public class DriversLicenseTest {

    DriversLicense driversLicense;
    @Before
    public void setUp(){
        driversLicense = new DriversLicense();

        driversLicense.setFirstName("Aurora");
        driversLicense.setLastName("Banuelos");
        driversLicense.setStreetAddress("123 Spring Street");
        driversLicense.setCity("Amarillo");
        driversLicense.setState("TX");
        driversLicense.setDateOfBirth("07/12/1989");
        driversLicense.setIssueDate("01/01/2015");
        driversLicense.setExpDate("06/01/2020");
    }

    @Test
    public void serializeToCSVTest(){
        //Given
        String expected = "Aurora,Banuelos,123 Spring Street,Amarillo,TX,07/12/1989,"
                          +"01/01/2015,06/01/2020";

        //When
        String actual = driversLicense.serializeToCSV();

        //Then
        Assert.assertEquals("Strings should be equal", expected, actual);
    }

    @Test
    public void getCSVHeaderTest(){
        //Given
        String expected = "FIRSTNAME,LASTNAME,STREETADDRESS,CITY,STATE,DATEOFBIRTH,"
                +"ISSUEDATE,EXPDATE";

        //When
        String actual = driversLicense.getCSVHeader();

        //Then
        Assert.assertEquals("Strings should be equal", expected, actual);
    }

}
