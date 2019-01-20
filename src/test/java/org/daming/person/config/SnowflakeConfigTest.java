package org.daming.person.config;

import org.daming.person.Application;
import org.daming.person.utils.SnowflakeIdWorker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class SnowflakeConfigTest {

    @Autowired
    private SnowflakeIdWorker snowflakeIdWorker;

    @Test
    public void snowflakeIdWorker() {
        assertNotNull(snowflakeIdWorker);
    }
}