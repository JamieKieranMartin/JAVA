package allSameAnswers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import allSameQuestion.*;

public class AllSameTest {
    private AllSame s;

    @BeforeEach
    public void newSame() {
        s = new AllSameC();
    }

    @Test
    public void testDuplicate() throws Exception {
        assertEquals(s.same(new int[] {4, 5, 6, 6}), false);
    }

    @Test
    public void testNatural() throws Exception {
        assertEquals(s.same(new int[] {4, 4, 4, 4}), true);
    }

    @Test
    public void testFirst() throws Exception {
        assertEquals(s.same(new int[] {2, 4, 4, 4, 4}), false);
    }

    @Test
    public void testLast() throws Exception {
        assertEquals(s.same(new int[] {4, 4, 4, 4, 2}), false);
    }

    @Test
    public void testNoInput() throws Exception {
        assertThrows(Exception.class, () -> {
            s.same(new int[] {});
        });
    }

    @Test
    public void testNonNat() throws Exception {
        assertThrows(Exception.class, () -> {
            s.same(new int[] {-1, 1, 1});
        });
    }

    @Test
    public void myersCheck() throws Exception {
        assertEquals(s.same(new int[] {4, 2, 6, 1, 7}), false);
    }
}
