package com.company;

/*

1201 Whales and cows
Override the getName method in the Whale class so that the program returns:
I am not a cow, I am a whale.

Requirements:
1. The program should display the text on the screen.
2. The Whale class must inherit from the Cow class.
3. The Whale class must override the getName () method.
4. The main () method should call the getName () method on the cow object.
5. Override the getName method in the Whale class so that the program displays: "I'm not a cow, I'm a whale."
6. The main () method should display the result of calling the getName () method.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args)
    {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow
    {
        public String getName()
        {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow
    {
        public String getName() { return "Я не корова, Я - кит."; }
    }
}



