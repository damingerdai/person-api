package org.daming.person.config.prop;

import org.daming.person.Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = Application.class)
public class SnowflakePropTest {

    @Autowired
    private SnowflakeProp snowflakeProp;

    @Test
    public void test() {
        assertNotNull(snowflakeProp);
        assertEquals(1, snowflakeProp.getWorkerId());
        assertEquals(2, snowflakeProp.getDatacenterId());
    }

}