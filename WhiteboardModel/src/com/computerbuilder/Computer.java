package com.computerbuilder;
/*
 * We are creating a computer parts builder.
 * This is the super class of all the "models" or "child" classes that create this. I did not incorporate inheritance yet. Inheritance would give the child classes direct access to this one
 * Each attribute is separate class with its own details
 * User should be able to give the details of each component, view the details of each component, check the price and purchase the computer
 */

import com.computerbuilder.components.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Computer {
    private static final LocalDateTime PURCHASE_DATE = LocalDateTime.now().withNano(0).withSecond(0);
    private Case computerCase;
    private Processor processor;
    private GraphicsCard graphicsCard;
    private MotherBoard motherBoard;
    private PowerSupply powerSupply;
    private RAM ram;
    private Storage storage;


    // Constructors
    public Computer() {
    } // Empty ctor, this is need in case we want to create a new computer with nothing in it yet. Still will not compile without all the

    public Computer(Case computerCase, Processor processor, GraphicsCard graphicsCard, MotherBoard motherBoard, PowerSupply powerSupply, RAM ram, Storage storage) {
        this.computerCase = computerCase;
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.motherBoard = motherBoard;
        this.powerSupply = powerSupply;
        this.ram = ram;
        this.storage = storage;
    }


    // METHODS
    public void checkTotalPrice() {
        // There is a much simpler way of doing this with an interface,
        // however you have not taught that yet and I don't want to step ahead to far as I'm already doing a little extra with the components classes
        double totalPrice = 0.0;

        // I know, I know, we haven't done arrays yet, but I needed to challenge myself
        Double[] componentPrices = {getComputerCase().getPrice(), getProcessor().getPrice(), getGraphicsCard().getPrice(), getMotherBoard().getPrice(), getPowerSupply().getPrice(), getRam().getPrice(), getStorage().getPrice()};

        // Loop through the prices, we don't add them if they are null, however we still want the total value of what we currently have, It may be to expensive
        for (Double price : componentPrices) {
            if (price != null) {
                totalPrice += price;
            }
        }

        System.out.println("The price of this computer is: $" + totalPrice);
    }

    // This was a challenge however, I got it!
    public void printCommonComputerData(Computer computer) {
        String[] tableHeader = {"Component", "Make", "Model", "Price"};
        String[][] tableData = new String[7][4]; // 7 is the number of components I have, 4 is the number of rows I need, This can also be thought of as an "array of arrays", yes Jay I know how this works :)

        // This can be thought of as 7 down, 4 across when looking at the tableData above
        tableData[0] = new String[]{"Computer Case", computer.getComputerCase().getMake(), computer.getComputerCase().getModel(), String.valueOf(computer.getComputerCase().getPrice())}; // these are all nested arrays, ARRAYCEPTION
        tableData[1] = new String[]{"Graphics Card", computer.getGraphicsCard().getMake(), computer.getGraphicsCard().getModel(), String.valueOf(computer.getGraphicsCard().getPrice())};
        tableData[2] = new String[]{"Motherboard", computer.getMotherBoard().getMake(), computer.getMotherBoard().getModel(), String.valueOf(computer.getMotherBoard().getPrice())};
        tableData[3] = new String[]{"Power Supply", computer.getPowerSupply().getMake(), computer.getPowerSupply().getModel(), String.valueOf(computer.getPowerSupply().getPrice())};
        tableData[4] = new String[]{"Processor", computer.getProcessor().getMake(), computer.getProcessor().getModel(), String.valueOf(computer.getProcessor().getPrice())};
        tableData[5] = new String[]{"RAM", computer.getRam().getMake(), computer.getRam().getModel(), String.valueOf(computer.getRam().getPrice())};
        tableData[6] = new String[]{"Storage", computer.getStorage().getMake(), computer.getStorage().getModel(), String.valueOf(computer.getStorage().getPrice())};

        // Print the tableHeader using a for loop
        for (String header : tableHeader) {
            System.out.printf("%-35s", header); // This means each row has 35 characters of space
        }
        System.out.println();

        // Print the tableData using a for loop
        // This is terrible for big "O" timing however we will do it anyway's because I don't know how else to do this yet
        for (String[] rowData : tableData) { // First loop will get the indicated position in the "tableData" array, because table data is an "Array of Arrays"
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            for (String data : rowData) {    // Second loop will print all the data in the nested array
                System.out.printf("%-35s", data); // This means each row has 35 characters of space
            }
            System.out.println();
        }
    }

    public static void buyComputer(Computer computer) {
        String[] items = {
                computer.getGraphicsCard().getModel(),
                computer.getComputerCase().getModel(),
                computer.getProcessor().getModel(),
                computer.getMotherBoard().getModel(),
                computer.getPowerSupply().getModel(),
                computer.getStorage().getModel(),
                computer.getRam().getModel()
        };

        Double[] prices = {
                computer.getGraphicsCard().getPrice(),
                computer.getComputerCase().getPrice(),
                computer.getProcessor().getPrice(),
                computer.getMotherBoard().getPrice(),
                computer.getPowerSupply().getPrice(),
                computer.getStorage().getPrice(),
                computer.getRam().getPrice()
        };

        Scanner scanner = new Scanner(System.in); // This opens the prompt up for a user to input test in the terminal

        // This while loop will keep the scanner open until the user says Yes or No
        while (true) {
            System.out.println();
            System.out.print("Do you want to buy this computer (yes/no)? ");
            String userInput = scanner.nextLine().toLowerCase(); // This actually opens the scanner and forces the input to lowercase

            if (userInput.equals("yes")) {
                System.out.println("Congratulations on your purchase!");
                System.out.println();
                System.out.println("Thank you for building with us!");
                System.out.println(generateReceipt(items, prices));
                break; // Exit the loop after a successful purchase
            } else if (userInput.equals("no")) {
                System.out.println("Please run our program again if you'd like to purchase this computer!");
                break; // Exit the loop if the user chooses not to buy
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }

        // Close the scanner when done
        scanner.close();
    }

    // Generate a Reciept for the users purchase
    private static String generateReceipt(String[] items, Double[] prices) {
        if (items == null || prices == null || items.length != prices.length) {
            return "Invalid input. Items and prices must be provided and have the same length.";
        }

        StringBuilder receipt = new StringBuilder(); // Construct a "String", by doing this we can create a nicely formatted string down our terminal

        receipt.append("Receipt:\n");
        receipt.append("-------------------------------\n");
        double totalCost = 0;

        for (int i = 0; i < items.length; i++) {
            if (items[i] == null || prices[i] == null) {
                receipt.append("Skipping item due to null price or item.\n");
                continue;
            }

            double itemPrice = prices[i];
            totalCost += itemPrice;

            receipt.append(String.format("%-10s x%-4d $%.2f%n", items[i], 1, itemPrice));
        }

        receipt.append("-------------------------------\n");
        receipt.append(String.format("Total: $%.2f%n", totalCost));
        receipt.append("\n");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy @ HH:mm a");
        String formattedPurchaseDate = PURCHASE_DATE.format(formatter);
        receipt.append(formattedPurchaseDate);

        return receipt.toString();
    }

    // Getters and Setters
    public Case getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(Case computerCase) {
        this.computerCase = computerCase;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }


    // To String
    public void toString(Computer computer) {
        this.printCommonComputerData(computer);
    }
}
