package com.devp.reddit.exceptions;

public class PostNotFoundException extends RuntimeException{

    public PostNotFoundException(String exMessage){
        super(exMessage);
    }
}
