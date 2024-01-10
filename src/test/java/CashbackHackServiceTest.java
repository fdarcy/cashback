import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {
    @Test
    public void shouldInputCorrectBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1500);
        int expected = 500;
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void shouldInputZeroBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void shouldInputEquallyBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);

    }

}
