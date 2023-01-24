package com.polling;

public class UserInvalidInputException extends RuntimeException{
    public UserInvalidInputException(String message){
        super(message);
    }
}
