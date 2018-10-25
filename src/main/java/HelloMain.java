package main.java;

import main.java.model.Hello;

/**
 * Created by IntelliJ IDEA.
 * User: Cyl3erPunKz
 * Date: 25 October 2018
 * Time: 3:10 PM
 **/
public class HelloMain {

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.setTextWelcome("Hi, I'm Java RockStar.");
        System.out.println(hello.getTextWelcome());
    }

}
