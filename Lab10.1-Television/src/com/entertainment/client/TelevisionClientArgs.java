package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.InvalidBrandException;
import com.entertainment.Television;

import java.util.Arrays;

public class TelevisionClientArgs {
    public static void main(String[] args) {
        if (args.length < 3) {
            printUsage();
            return;
        }


        String brand = null;
        Integer vol = 0;
        DisplayType display = null;



        try {
            brand = args[0];
            vol = Integer.parseInt(args[1]);
            display = DisplayType.valueOf(args[2]);
        } catch (IllegalArgumentException e) { // WHAT TO DO IF THIS SPECIFIC ERROR <- IllegalArgumentException
            System.out.println("TVClientArgs Error: " + e);
            printUsage();
        }

        try {
            Television tv = new Television(brand, vol, display);
            System.out.println(tv);
        } catch (Exception ex) { // <- WHAT TO DO IF BROKE FOR EVERYTHING NOT JUST IllegalArgs
            System.out.println(ex);
            printUsage();
        }

    }

    private static void printUsage() {
        String usage = "Usage Banner here";
        String example = "Do something";
        String note = "Note: samsung 32 plasma";
        System.out.println(usage);
        System.out.println(example);
        System.out.println(note);
    }
}
