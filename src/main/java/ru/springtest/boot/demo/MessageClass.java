package ru.springtest.boot.demo;

import org.springframework.stereotype.Component;

import java.util.ResourceBundle;

@Component
public class MessageClass {
    ResourceBundle resource = ResourceBundle.getBundle("text");

    public void greeting() {
        System.out.println(resource.getString("greeting"));
    }

    public void makeAGuess() {
        System.out.println(resource.getString("makeAGuess"));
    }

    public void myNumberIsBigger() {
        System.out.println(resource.getString("myNumberIsBigger"));
    }

    public void myNumberIsLess() {
        System.out.println(resource.getString("myNumberIsLess"));
    }

    public void gratz() {
        System.out.print(resource.getString("gratz"));
    }
}
