package totaliserAnswer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import totaliserQuestion.Totaliser;

public class TotaliserTest {
    private Totaliser tot;

    @BeforeEach
    public void init() {
        tot = new Totaliser();
    }

    @Test
    public void testReset() {
        tot.reset();
        assertEquals(0, tot.getSum());
    }

    @Test
    public void testEnterValue() {
        tot.enterValue(5);
        assertEquals(5, tot.getSum());
    }

    @Test
    public void testTwoEnterValue() {
        tot.enterValue(8);
        assertEquals(8, tot.getSum());
        tot.enterValue(5);
        assertEquals(13, tot.getSum());
    }

    @Test
    public void testTwoTotaliser() {
        Totaliser tot1 = new Totaliser();
        Totaliser tot2 = new Totaliser();

        tot1.enterValue(8);
        assertEquals(8, tot1.getSum());

        tot2.enterValue(5);
        assertEquals(5, tot2.getSum());

    }
}
