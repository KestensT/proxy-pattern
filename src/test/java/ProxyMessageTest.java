import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProxyMessageTest {

    private String subject;
    private String employeeName;
    private ProxyMessage proxyMessage;
    private RealMessage realMessage;


    @Before
    public void setUp() throws Exception {
        subject = "Mario kart is boring.";
        employeeName = "a random employee";
    }

    @Test
    public void subjectThatContainsTheWordBoring_shouldReturnAnExtraMessage() throws Exception {

    }
}
