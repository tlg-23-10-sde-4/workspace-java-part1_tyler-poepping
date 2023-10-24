/*
 * This is our computer builder client
 *
 * The ctor's for the component classes are NOT chained
 * You must either pass ALL required arguments OR use the setters to pass individual component attributes, the program will run with null values
 *
 * All Computer Components MUST be instantiated AND passed to the computer otherwise this WILL NOT compile, the computer components will compile with null values so long as they are instantiated
 *
 * The client can be run at anytime to see your current computer build and its price
 *
 * The user will be given an option to purchase the computer in the terminal. If the user purchases, a receipt is printed, otherwise they can keep building
 */

package com.computerbuilder.client;

import com.computerbuilder.Computer;
import com.computerbuilder.components.*;

public class ComputerBuilderClient {
    public static void main(String[] args) {
        // We MUST instantiate all component classes
        Case computerCase = new Case("Lian Li", "pc-o11d-rog", CaseSize.LARGE, 113.99);
        Processor processor = new Processor("Intel", "I9 13900K", 24, 569.99);
        GraphicsCard graphicsCard = new GraphicsCard("Nvidia", "RTX 4080", 2, 3, 956.99);

        MotherBoard motherBoard = new MotherBoard();
        motherBoard.setMake("MSI");
        motherBoard.setModel("Z790 Gaming");
        motherBoard.setHasWifi(true);
        motherBoard.setHasEthernet(true);
        motherBoard.setPrice(463.99);

        PowerSupply powerSupply = new PowerSupply("ThermalTake", "ToughPower GF3 Premium Gold", 1650, 219.99);
        RAM ram = new RAM("Corsair", "Vengeance PRO", 64, 159.99, true,false);

        Storage storage = new Storage();
        storage.setMake("Corsair");
        storage.setModel("MP600");
        storage.setType("SSD");
        storage.setPrice(159.99);


        // Now we instantiate our com.computer.Computer class with our pre-instantiated components
        Computer computer1 = new Computer(computerCase, processor, graphicsCard, motherBoard, powerSupply, ram, storage);


        // Check our computer case
        System.out.println();
        System.out.println("Your Computer Case Details:");
        System.out.println(computer1.getComputerCase().toString());

        // Check our graphics card
        System.out.println();
        System.out.println("Your Graphics Card Details:");
        System.out.println(computer1.getGraphicsCard().toString());

        // Check our Motherboard
        System.out.println();
        System.out.println("Your Motherboard Details:");
        System.out.println(computer1.getMotherBoard().toString());

        // Check our Power Supply
        System.out.println();
        System.out.println("Your Power Supply Details:");
        System.out.println(computer1.getPowerSupply().toString());

        // Check our Processor
        System.out.println();
        System.out.println("Your Processor Details:");
        System.out.println(computer1.getProcessor().toString());

        // Check our Storage
        System.out.println();
        System.out.println("Your Storage Details:");
        System.out.println(computer1.getStorage().toString());

        // Check our Ram
        System.out.println();
        System.out.println("Your RAM Details:");
        System.out.println(computer1.getRam().toString());

        // We can run the program at anytime to check our data as the user builds a computer
        System.out.println();
        System.out.println("Your Computer Build Statistics:");
        computer1.printCommonComputerData(computer1);
        System.out.println();
        computer1.checkTotalPrice();
        System.out.println();
        Computer.buyComputer(computer1);
    }
}