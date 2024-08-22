package com.cbfacademy;

public class Year {
    public static Boolean isLeap(Integer number) {
     if (number % 400 == 0) return true;
     if (number % 100 == 0 && number % 400 != 0) return false;
     if (number % 4 == 0 && number % 100 != 0) return true;
     if (number % 4 != 0) return false;
     return false;
    }
}



