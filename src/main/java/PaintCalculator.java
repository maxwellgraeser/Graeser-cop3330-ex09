/*
 *  UCF COP3330 Fall 2021 Exercise 9 Solution
 *  Copyright 2021 Maxwell Graeser
 */

import java.util.Scanner;
public class PaintCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the length? ");
        int length = scan.nextInt();
        System.out.print("What is the width? ");
        int width = scan.nextInt();

        int area = length * width;
        int paint = (area / 350);
        if (area % 350 != 0)
            paint++;

        System.out.println(String.format("You will need to purchase %d gallons of paint to cover %d square feet.", paint, area));
    }
}
