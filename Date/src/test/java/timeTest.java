import com.sun.nio.sctp.SctpSocketOption;
import org.junit.Test;

import java.security.spec.RSAOtherPrimeInfo;

public class timeTest {

    @Test
    public void testTime() {
        Time t = Time.convertSeconds(3662);
        System.out.println(t.seconds);
    }
}
