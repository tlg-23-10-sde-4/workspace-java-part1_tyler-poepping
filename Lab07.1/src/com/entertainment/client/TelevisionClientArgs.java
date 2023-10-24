package com.entertainment.client;

import com.entertainment.DisplayType;

import java.util.Arrays;

public class TelevisionClientArgs {
    public static void main(String[] args) {
        if(args.length < 3) {
            String usage = "Usage Banner here";
            String example= "Do something";
            String note = "Note: samsung 32 plasma";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);

            return;
        }
        System.out.println("You provided " + args.length + " arguments");
        System.out.println(Arrays.asList(args));
        DisplayType displayType = DisplayType.valueOf(args[2]);
    }
}
