import com.scooter.objects.Scooter;
import com.scooter.objects.User;
import com.scooter.utils.RentScooter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class RentScooterTest {

    RentScooter rentScooter = new RentScooter();

    @BeforeEach
    void prepareData(){
        LocalDateTime t1 = LocalDateTime.parse("2019-07-21T12:00");
        LocalDateTime t2 = LocalDateTime.parse("2019-07-21T15:20");
        LocalDateTime t3 = LocalDateTime.now();

        User user = new User();
        user.setNick("Bolo");

        Scooter scooter1 = new Scooter(1);
        rentScooter.setStartDateTime(t1);
        rentScooter.setStopDateTime(t2);
    }

    @Test
    void checkCost(){

               assertEquals(60, rentScooter.getCost());
    }


}
