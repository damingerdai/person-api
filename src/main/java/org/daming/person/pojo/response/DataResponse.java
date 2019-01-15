package org.daming.person.pojo.response;

public class DataResponse<T> extends CommonResponse {
    private static final long serialVersionUID = -2882334539043487184L;

    private T data;

    public T getData() {
        return data;
    }

    public DataResponse<T> setData(T data) {
        this.data = data;
        return this;
    }

    public DataResponse(T data) {
        super();
        this.data = data;
    }
}
