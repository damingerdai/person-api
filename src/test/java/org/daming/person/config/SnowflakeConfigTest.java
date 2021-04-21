package org.daming.person.config;

import org.daming.person.Application;
import org.daming.person.utils.SnowflakeIdWorker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(classes = Application.class)
public class SnowflakeConfigTest {

    @Autowired
    private SnowflakeIdWorker snowflakeIdWorker;

    @Test
    public void snowflakeIdWorker() {
        assertNotNull(snowflakeIdWorker);
    }
}