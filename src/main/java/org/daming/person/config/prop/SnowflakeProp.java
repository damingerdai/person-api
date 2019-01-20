package org.daming.person.config.prop;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "snowflake")
public class SnowflakeProp {

    private int workerId;

    private int datacenterId;

    public int getWorkerId() {
        return workerId;
    }

    public SnowflakeProp setWorkerId(int workerId) {
        this.workerId = workerId;
        return this;
    }

    public int getDatacenterId() {
        return datacenterId;
    }

    public SnowflakeProp setDatacenterId(int datacenterId) {
        this.datacenterId = datacenterId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("workerId", workerId)
                .append("datacenterId", datacenterId)
                .toString();
    }
}
