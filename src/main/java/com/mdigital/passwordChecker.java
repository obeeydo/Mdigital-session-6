package com.mdigital;

public class passwordChecker {

    boolean checkPassword(String password){
        if (password.length() >= 8){
            if (password.chars().anyMatch(Character::isDigit)){
                return true;
            }

        }
        return false;
    }
}
