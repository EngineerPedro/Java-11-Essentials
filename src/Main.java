import model.ClothingItem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

    var item = new ClothingItem();
    item.setType("Shirt");
    item.setSize("M");
    item.setPrice(19.99);
    item.setQuantity(3);

    var totalPrice = item.getPrice() * item.getQuantity();
    var formatter = NumberFormat.getCurrencyInstance();
    var output = String.format("Your %s order will cost %s",
            item.getType(),
            formatter.format(totalPrice));
    System.out.println(output);

    }
}