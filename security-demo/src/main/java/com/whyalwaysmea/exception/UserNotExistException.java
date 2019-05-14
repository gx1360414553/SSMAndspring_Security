package com.whyalwaysmea.exception;

/**
 * @Author: HanLong
 * @Date: Create in 2018/3/16 20:48
 * @Description:
 */
public class UserNotExistException extends RuntimeException {

    private static final long serialVersionUID = -6112780192479692859L;

    private String id;

    public UserNotExistException(String id) {
        super("user not exist");
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
