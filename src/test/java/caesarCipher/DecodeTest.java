package caesarCipher;

import org.junit.Test;
import static org.junit.Assert.*;




public class DecodeTest {

    @Test
    public void newEncode_getsPlain_2() {
        Decode testEncode = new Decode("hello", 4);
        assertEquals(true, testEncode instanceof Decode);
    }

}