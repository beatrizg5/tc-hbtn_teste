import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;

public class PersonTest {

    Person person;
    @BeforeEach
    public void setUp() {
        person = new Person();
    }

    @ParameterizedTest
    public void check_user_valid(){
        person.checkUser("PaulMcCartney2", "NeilArms2");
    }

    @ParameterizedTest
    public void check_user_not_valid(){
        person.checkUser("Paul#McCartney", "Neil@Arms");

    }
    @ParameterizedTest
    public void does_not_have_letters(){
        person.checkPassword("123456789", "#$%1234");

    }
    @ParameterizedTest
    public void does_not_have_numbers(){
        person.checkPassword(“Abcabcdefgh@”, “#hbtn@%tc”);

    }
    @ParameterizedTest
    public void does_not_have_eight_chars(){
        person.checkPassword(“Abc@123”, “12$@hbt”);
    }
    @ParameterizedTest
    public void check_password_valid(){
        person.checkPassword(“abC123456$”, “Hbtn@1234”, “Betty@1#2”, “Hbtn@123”);

    }

}
