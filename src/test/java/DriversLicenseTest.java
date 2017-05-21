import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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

    @Test
    public void deserializeFromCSVTest(){
        //Given
        String input = "Aaron,Long,456 Street Dr,Newark,NJ,06/17/1993,06/17/2014,06/30/2018\n"+
        "Chris,Kim,820 District Dr,Wilmington,DE,12/11/1980,08/12/2013,12/11/2018\n"+
        "Jarryd,Stamatelos,123 Main St ,Newark,NJ,3/17/1988,3/17/2016,3/20/2020\n"+
        "Nick,Cage,362 Fancy St,San Francisco,CA,02/02/1970,02/02/2000,02/02/2006\n"+
        "Keanu,Reeves,876 Zion Dr,New York,NY,6/6/1955,6/9/2005,6/9/2010\n"+
        "Neo,Anderson,2959 57th St,New York,NY,8/6/1980,7/7/1999,7/7/2009\n"+
        "Jack,Traven,25 Speed Ln,San Diego,CA,2/20/1994,2/20/217,2/20/2027\n"+
        "Kevin,Lomax,9234 High St,Ann Arbor,MI,9/3/1940,8/8/2008,8/8/2018\n"+
        "John,Wick,2190 Badass Alley,New York,NY,6/6/1977,3/3/2000,1/1/2010\n"+
        "Alex,Wyler,234 Lake House St,New York,NY,7/8/2000,4/8/2017,4/8/2027\n"+
        "Johnny,Utah,932 PointBreak Rd,Los Angeles,CA,2/5/1988,4/4/2000,4/4/2010\n"+
        "Patrick,Starr,101 UnderTheSea Ct,Honolulu,HI,10/07/1987,02-30-2010,02/30/2010\n"+
        "Leon,Zach,1234 BadAtSmash Ln,Wilmington,DE,1/2/3456,3/3/2000,5/19/2107\n";
        int expected = 13;

        //When
        driversLicense.deserializeFromCSV(input);
        int actual = driversLicense.arrayListOfDriversLicenses.size();

        //Then
        Assert.assertEquals("Should be 13", expected, actual);


    }

}
