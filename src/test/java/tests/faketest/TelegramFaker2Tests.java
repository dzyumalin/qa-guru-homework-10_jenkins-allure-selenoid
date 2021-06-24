package tests.faketest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("fake")
public class TelegramFaker2Tests {

    @Test
    @Disabled
    void someTest() {
        assertTrue(false);
    }

    @Test
    @Disabled
    void some1Test() {
        assertTrue(false);
    }

    @Test
    @Disabled
    void some2Test() {
        assertTrue(false);
    }

    @Test
    @Disabled
    void some3Test() {
        assertTrue(false);
    }

    @Test
    @Disabled
    void some4Test() {
        assertFalse(false);
    }

}
