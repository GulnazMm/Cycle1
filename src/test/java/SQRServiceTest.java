import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @Test
    public void shouldCalcNumberIfOverLimit() {
        SQRService service = new SQRService();
        int actual = service.squareRoot(200, 500);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcNumberINoLimitSet() {
        SQRService service = new SQRService();
        int actual = service.squareRoot(200, 0);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

}
