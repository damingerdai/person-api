package org.daming.person.pojo.response;

import java.io.Serializable;

public class CommonResponse implements Serializable {

    private static final long serialVersionUID = -1598392868783622094L;

    private static final int DEFAULT_STATUS_CODE = 200;

    private int statusCode = DEFAULT_STATUS_CODE;

    public int getStatusCode() {
        return statusCode;
    }

    public CommonResponse setStatusCode(int statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public CommonResponse() {
        super();
    }
}
