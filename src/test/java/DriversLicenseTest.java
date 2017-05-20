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
        driversLicense.firstName = "Aurora";
        driversLicense.lastName = "Banuelos";
        driversLicense.streetAddress = "123 Spring Street";
        driversLicense.city = "Amarillo";
        driversLicense.state = "TX";
        driversLicense.dateOfBirth = "07/12/1989";
        driversLicense.issueDate = "01/01/2015";
        driversLicense.expDate = "06/01/2020";
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

}
