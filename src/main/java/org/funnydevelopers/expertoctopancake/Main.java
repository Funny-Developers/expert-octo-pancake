package org.funnydevelopers.expertoctopancake;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------Hello, welcome to use our lib!----------");
        System.out.println("--------------------------------------------------");
        System.out.println("|How to use:                                     |");
        System.out.println("|You can run this file in command line and it    |");
        System.out.println("|will show this message.                         |");
        System.out.println("|You can run this file with Fabric loader and    |");
        System.out.println("|Fabric API in Minecraft 1.19.x.                 |");
        System.out.println("|You can use it as an external library to develop|");
        System.out.println("|your own Fabric mods.                           |");
        System.out.println("--------------------------------------------------");
        System.out.println("---------------Press Enter to exit.---------------");
        if (scanner.hasNextLine()) {
            System.exit(0);
        }
    }
}
