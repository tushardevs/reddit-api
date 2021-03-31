package com.devp.reddit.exceptions;

public class SubredditNotFoundException extends RuntimeException{

    public SubredditNotFoundException(String exMessage){
        super(exMessage);
    }
}
