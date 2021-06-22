package com.asusoftware.FindTheRightHouse.exception;

public class UserNotFoundException extends FindRightHouseException{
    public UserNotFoundException() {
        super("User not found!");
    }
}
