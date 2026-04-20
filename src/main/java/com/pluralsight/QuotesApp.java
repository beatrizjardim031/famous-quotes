package com.pluralsight;

import java.util.Scanner;

public class QuotesApp {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] quotes = {
                "It's dangerous to go alone! Take this.", // The Legend of Zelda
                "Believe in yourself and create your own destiny.", // Final Fantasy
                "I'd rather take my chances out there than die in here!", // Life is Strange
                "No matter how dark the night, morning always comes.", // Final Fantasy
                "The secret to getting ahead is getting started.", // Animal Crossing
                "You have proved your courage. You are a true hero.", // The Legend of Zelda
                "Every moment gives us a chance to become more than what we are.", // Final Fantasy
                "A hero need not speak. When he is gone, the world will speak for him.", // Halo
                "Despite everything, it's still you.", // Undertale
                "Sometimes you just gotta say what the hell and make your move." // The Last of Us

        };

        System.out.print("Choose a number between 1 and 10: ");
        int quoteNumber = input.nextInt();
        int quoteIndex = quoteNumber - 1;

        try {
            System.out.println(quotes[quoteIndex]);
        } catch (Exception e) {
            System.out.println("SMH you chose an invalid number!!!!!");
        }


    }


}
