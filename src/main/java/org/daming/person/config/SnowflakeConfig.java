package org.daming.person.config;

import org.daming.person.config.prop.SnowflakeProp;
import org.daming.person.utils.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SnowflakeConfig {

    private SnowflakeProp snowflakeProp;

    @Bean
    public SnowflakeIdWorker snowflakeIdWorker() {
        return new SnowflakeIdWorker(snowflakeProp.getWorkerId(), snowflakeProp.getDatacenterId());
    }

    @Autowired
    public void setSnowflakeProp(SnowflakeProp snowflakeProp) {
        this.snowflakeProp = snowflakeProp;
    }
}
