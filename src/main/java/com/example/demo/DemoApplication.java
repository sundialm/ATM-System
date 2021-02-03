package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SpringApplication.run(DemoApplication.class, args);

        Card card1 = new Card(1234, 234, "Meruert", 100000);
        Card card2 = new Card(3456, 123, "Nurik", 100000000);
        Card card3 = new Card(4567, 345,"Merey", 200000);

        Card[] cards = {card1, card2, card3};

        ShowMenu showMenu = new ShowMenu();


        int choice = 0;
        while(choice != -1) {
            showMenu.printMenu();
            System.out.println("To finish action enter 4");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    showMenu.ptintCheckMenu();
                    int cardNumber = sc.nextInt();
                    int password = sc.nextInt();
                    if(cardNumber == card1.getCardNumber() && password == card1.getPin()){
                        System.out.println("Success! You can take money.");
                        System.out.println("Your current balance: " + card1.getCurrentBalance());
                        System.out.println("Enter what amount of money want you take:");
                        int take = sc.nextInt();
                        if(take < card1.getCurrentBalance()){
                            int amount = card1.getCurrentBalance();
                            amount = amount - take;
                            System.out.println("there left in the account: " + amount);

                        }
                    }else if(cardNumber == card2.getCardNumber() && password == card2.getPin()) {
                        System.out.println("Success! You can take money.");
                        System.out.println("Your current balance: " + card2.getCurrentBalance());
                        System.out.println("Enter what amount of money want you take:");
                        int take2 = sc.nextInt();
                        if(take2 < card2.getCurrentBalance()){
                            int amount2 = card2.getCurrentBalance();
                            amount2 = amount2 - take2;
                            System.out.println("There left in the account: " + amount2);

                        }
                    }else if(cardNumber == card3.getCardNumber() && password == card3.getPin()) {
                        System.out.println("Success! You can take money.");
                        System.out.println("Your current balance:" + card3.getCurrentBalance());
                        System.out.println("Enter what amount of money want you take:");
                        int take = sc.nextInt();
                        if(take < card3.getCurrentBalance()){
                            int amount = card3.getCurrentBalance();
                            amount = amount - take;
                            System.out.println("There left in the account: " + amount);
                        }
                    }
                        break;
                case 2:
                    showMenu.ptintCheckMenu();
                    int cardNumber2 = sc.nextInt();
                    int password2 = sc.nextInt();
                    if(cardNumber2 == card1.getCardNumber() && password2 == card1.getPin()){
                        System.out.println("Success! You can check your money.");
                        System.out.println("Your current balance: " + card1.getCurrentBalance());
                    }else if(cardNumber2 == card2.getCardNumber() && password2 == card2.getPin()) {
                        System.out.println("Success! You can check your money.");
                        System.out.println("Your current balance: " + card2.getCurrentBalance());
                    }else if(cardNumber2 == card3.getCardNumber() && password2 == card3.getPin()) {
                        System.out.println("Success! You can check your money.");
                        System.out.println("Your current balance: " + card3.getCurrentBalance());
                    }
                    break;
                case 3:
                    showMenu.ptintCheckMenu();
                    int cardNumber3 = sc.nextInt();
                    int password3 = sc.nextInt();
                    if(cardNumber3 == card1.getCardNumber() && password3 == card1.getPin()){
                        System.out.println("Success! You can add money.");
                        System.out.println("Your current balance: " + card1.getCurrentBalance());
                        System.out.println("Enter what amount of money want you add:");
                        int add = sc.nextInt();
                        int amount = card1.getCurrentBalance();
                        amount = amount + add;
                        System.out.println("there you have in the account: " + amount);
                    }else if(cardNumber3 == card2.getCardNumber() && password3 == card2.getPin()) {
                        System.out.println("Success! You can add money.");
                        System.out.println("Your current balance:" + card2.getCurrentBalance());
                        System.out.println("Enter what amount of money want you add:");
                        int add2 = sc.nextInt();
                        int amount2 = card1.getCurrentBalance();
                        amount2 = amount2 + add2;
                        System.out.println("there you have in the account: " + amount2);
                    }else if(cardNumber3 == card3.getCardNumber() && password3 == card3.getPin()) {
                        System.out.println("Success! You can add money.");
                        System.out.println("Your current balance: " + card3.getCurrentBalance());
                        System.out.println("Enter what amount of money want you add:");
                        int add = sc.nextInt();
                        int amount = card1.getCurrentBalance();
                        amount = amount + add;
                        System.out.println("There you have in the account: " + amount);
                    }
                    break;
                case 4:
                    choice = -1;
                    break;
            }
        }
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam
     (value = "myName", defaultValue = "User") String name) {
        return String.format("Hello %s!", name);
    }

    public static void printCards(Card[] cards){
        for (Card card: cards) {
            System.out.println(card);
        }
    }
}
