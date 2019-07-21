import com.scooter.objects.Scooter;
import com.scooter.objects.User;
import com.scooter.utils.RentScooter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class RentScooterTest {

    RentScooter rentScooter = new RentScooter();
    RentScooter rentScooter2 = new RentScooter();
    RentScooter rentScooter3 = new RentScooter();

    @BeforeEach
    void prepareData(){
        LocalDateTime t1 = LocalDateTime.parse("2019-07-21T12:00");
        LocalDateTime t2 = LocalDateTime.parse("2019-07-21T15:20");
        LocalDateTime t3 = LocalDateTime.parse("2019-07-19T08:00");
        LocalDateTime t4 = LocalDateTime.parse("2019-07-19T08:15");
        LocalDateTime t5 = LocalDateTime.parse("2019-07-19T12:00");
        LocalDateTime t6 = LocalDateTime.parse("2019-07-19T12:17");

        User user = new User();
        user.setNick("Bolo");

        Scooter scooter1 = new Scooter(1);
        rentScooter.setStartDateTime(t1);
        rentScooter.setStopDateTime(t2);
        rentScooter2.setStartDateTime(t3);
        rentScooter2.setStopDateTime(t4);
        rentScooter3.setStartDateTime(t5);
        rentScooter3.setStopDateTime(t6);
    }

    @Test
    void checkCost(){
        assertEquals(60, rentScooter.getCost());
        assertEquals(30, rentScooter2.getCost());
        assertEquals(17, rentScooter3.getCost());
    }

    @Test
    void checkDuration(){
        assertEquals(120, rentScooter.getDuration());
        assertEquals(15, rentScooter2.getDuration());
        assertEquals(17, rentScooter3.getDuration());
    }


}
