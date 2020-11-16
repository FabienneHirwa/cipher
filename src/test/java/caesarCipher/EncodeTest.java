package caesarCipher;

import org.junit.Test;
import static org.junit.Assert.*;

public class EncodeTest {
    @Test
    public void newRectangle_instantiatesCorrectly() {
        Encode testEncode = new Encode("hello", 4);
        assertEquals(true, testEncode instanceof Encode);
    }
    @Test
    public void newEncode_getsPlain_2() {
        Encode testEncode = new Encode("hello2", 4);
        assertEquals("hello2", testEncode.getPlain());
    }
    @Test
    public void getEncode_getsmyKey() {
        Encode testEncrypt = new Encode("hirwa", 2);
        assertEquals(2, testEncrypt.getMyKey());
    }

}