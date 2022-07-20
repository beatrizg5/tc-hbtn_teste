import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    Person person;
    @BeforeEach
    public void setUp() {
        person = new Person();
        person.setName("Paul");
        person.setSurname("McCartney");
        person.setBirthDate(new Date(2000));
        person.setAnotherCompanyOwner(true);
        person.setPensioner(true);
        person.setPublicServer(true);

    }

    @Test
    public void show_full_name(){
        assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    public void test_calculateYearlySalary(){
        person.setSalary(1200);
        assertEquals(14400, person.calculateYearlySalary());
    }

    @Test
    public void person_is_MEI(){
        person.setPublicServer(false);
        person.setPensioner(false);
        person.setAnotherCompanyOwner(false);
        person.setSalary(1000);
        assertTrue(person.isMEI());
    }

    @Test
    public void person_is_not_MEI(){
        assertFalse(person.isMEI());
    }

}
