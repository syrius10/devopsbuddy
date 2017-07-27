package com.devopsbuddy.exceptions;

/**
 * Created by Syrius on 7/15/2017.
 */
public class StripeException extends RuntimeException {

    public StripeException(Throwable e) {
        super(e);
    }

}