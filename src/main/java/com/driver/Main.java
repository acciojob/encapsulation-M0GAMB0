package com.driver;

public class Main {
   public static void main(String args[]) {
        RWOnly obj= new RWOnly();
        //obj.name="Saikumar";
        //Main.java:4: error: name has private access in RWOnly
        obj.setName("Saikumar");
        System.out.println(obj.getName());
    }
}
