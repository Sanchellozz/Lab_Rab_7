package com.edu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collection;


public class Main {
    public static void main(String[] args) {
        AbstractNode first =
                new MultNode(Arrays.asList(new SubNode(new SimpleNode(5), new SimpleNode(5)),
                new SubNode(new SimpleNode(3), new SimpleNode(1)),new SimpleNode(3), new SimpleNode(1)));
        AbstractNode second =
                new MultNode(Arrays.asList(new SubNode(new SimpleNode(5), new SimpleNode(5)),
                        new SubNode(new SimpleNode(3), new SimpleNode(1)),new SimpleNode(3), new SimpleNode(1)));
        System.out.println("Первое выражение: \n" + first.toString()
                + " = " + first.calculate());
        System.out.println("Второе выражение: \n" + second.toString()
                + " = " + second.calculate());
    }
}