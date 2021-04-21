package org.daming.person.filter;

import org.daming.person.Application;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;


// @RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class AuthenticationFilterTest {

    String pattern = ".*(swagger|webjars|configuration|token|images|api-docs).*";

    @Test
    public void isFilter() {
        assertTrue(Pattern.matches(pattern, "http://127.0.0.1:8080/swagger/html"));
        assertTrue(Pattern.matches(pattern, "http://127.0.0.1:8080/api-docs/html"));
        assertTrue(Pattern.matches(pattern, "http://127.0.0.1:8080/webjars"));
        assertFalse(Pattern.matches(pattern, "http://127.0.0.1:8080/api/v1/person"));
    }

    @Test
    public void doFilter() {
    }
}