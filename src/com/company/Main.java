package com.company;

import com.sun.tools.jconsole.JConsoleContext;

import java.io.Console;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(2);
        ll.add(5);
        ll.add(0,1);
        System.out.println(ll.size());
        System.out.println(ll.get(0));
        System.out.println(ll.get(2));
        System.out.println(ll.isEmpty());
        ll.clear();
        System.out.println("Before clear: "+ll.isEmpty());
        ll.add(2);
        ll.set(0,10);
        System.out.println(ll.get(0));
        ll.remove(0);
        System.out.println(ll.isEmpty());
        ll.add(2);
        System.out.println(ll.contains(2));
        System.out.println(ll.getLast());
    }
}
