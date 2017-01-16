package org.glenlivet;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by appledev122 on 1/16/17.
 */
@ControllerAdvice
public class ErrorControllerAdvice {

    @ExceptionHandler(MyException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String tokenMissingForSWA(MyException e, HttpServletRequest request, HttpSession session) {
        return "error/my-custom-error-page";
    }
}
