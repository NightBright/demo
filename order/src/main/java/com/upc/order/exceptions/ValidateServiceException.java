package com.upc.order.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
//Badrequest:es cuando se crea una peticion mal formada// por lo que la funcion va a ser utilizada cuando se haga un basrequest
public class ValidateServiceException extends RuntimeException {

    public ValidateServiceException() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ValidateServiceException(String message, Throwable cause, boolean enableSuppression,
                                    boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        // TODO Auto-generated constructor stub
    }

    public ValidateServiceException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    public ValidateServiceException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    public ValidateServiceException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }

}