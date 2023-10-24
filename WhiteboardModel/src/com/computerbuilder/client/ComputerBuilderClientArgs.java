/*
 * The Computer class takes many child classes as its data types, for this I will only build a computer with a case to mitigate inputting a silly amount of arguments into intelliJ
 */

package com.computerbuilder.client;

import com.computerbuilder.Computer;
import com.computerbuilder.components.*;

import java.util.Arrays;

public class ComputerBuilderClientArgs {
    public static void main(String[] args) {
        if(args.length < 5) {
            String usage = "We are only building the Case for this computer, the case takes 4 arguments \n";
            String note = "NOTE: The case must take: \n make \n model \n size \n price \n";
            String note2 = "NOTE: size is constrained to: " + Arrays.asList(Case.VALID_SIZES);
            String example = "Example: ThermalTake ATX-MidTower LARGE  185.99 \n";
            System.out.println(usage + "\n" + example + "\n" + note + "\n" + note2);
            return;
        }

        // We must still MUST create instances of the other components even if they are null
        GraphicsCard graphicsCard = new GraphicsCard();
        MotherBoard  motherBoard = new MotherBoard();
        PowerSupply powerSupply = new PowerSupply();
        Processor processor = new Processor();
        RAM ram = new RAM();
        Storage storage = new Storage();

        // Build our computer case with the given "args"
        Case computerCase = new Case(args[0], args[1], CaseSize.valueOf(args[2].toUpperCase()), Double.valueOf(args[3]));

        // Build the computer
        Computer computer = new Computer();
        computer.setComputerCase(computerCase);
        computer.setRam(ram);
        computer.setGraphicsCard(graphicsCard);
        computer.setProcessor(processor);
        computer.setMotherBoard(motherBoard);
        computer.setPowerSupply(powerSupply);
        computer.setStorage(storage);

        // Print our data
        System.out.println(computerCase.toString());
        System.out.println();
        computer.printCommonComputerData(computer);
    }
}