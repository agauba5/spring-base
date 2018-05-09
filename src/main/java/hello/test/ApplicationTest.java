package hello.test;

import hello.Application;
import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {

    @Test
    public void verifyGetHello() {
        Assert.assertEquals("Hello Docker World", Application.home());
    }
}
