package com.unnecessarycompany;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;
        Party party = new Party();

        while (shouldContinue){
            System.out.println("Wybierz opcję");
            System.out.println("1. Wyświetl gości");
            System.out.println("2. Dodaj gościa");
            System.out.println("3. Wyświetl potrawy");
            System.out.println("4. Znajdz po numerze telefonu");
            System.out.println("5. Wyjście");

            int menuValue = 0;
            menuValue = scanner.nextInt();
            String firstName = "";

            switch (menuValue) {
                case 1 -> party.displayGuests();
                case 2 -> party.addGuest();
                case 3 -> party.displayMeals();
                case 4 -> party.findGuestByPhone();
                case 5 -> shouldContinue = false;
            }

        }

//        Map<String, String> namesToMeals = new HashMap<>();
//        namesToMeals.put("Mariusz", "Pizza");
//        namesToMeals.put("Igor", "Pie");
//        namesToMeals.put("Igora", "Pizza");
//
//        System.out.println(namesToMeals.get("Igor"));
//
//        Set<String> keys = namesToMeals.keySet();
//        Collection<String> values = namesToMeals.values();
//
//        for (String key:values) {
//            System.out.println(key);
//        }
//        Set<String> food = new HashSet<>();
//        food.add("Pizza");
//        food.add("Strips");
//        food.add("Pizza");
//        food.add("Salat");
//
//        for (String meal: food) {
//            System.out.println(meal);
//        }

//        List<String> names = new ArrayList<>();
//        names.add("Mario");
//        names.add("Luigi");
//        System.out.println(names.contains("Luigi"));
//
//        Collections.sort(names);
////        names.remove("Luigi");
//
//        for (String name: names) {
//            System.out.println(name);
//        }

//        Random random = new Random();
//        int sto = random.nextInt(100) +1;
//        boolean isNumberGuessed = false;
//        int input= 0;
//        int min = 0;
//        int max = 100;
//
//        while(!isNumberGuessed) {
//
//            System.out.println("Input value "+min+" - "+max+"");
//            Scanner scanner = new Scanner(System.in);
//            input = scanner.nextInt();
//
//            if (input < sto) {
//                System.out.println("Wartość musi być większa");
//                if(input > min ) {
//                    min = input;
//                }
//            } else if (input > sto) {
//                System.out.println("Wartość musi być mniejsza");
//                if(input < max ) {
//                    max = input;
//                }
//            } else {
//                System.out.println("Trafiona");
//                isNumberGuessed = true;
//            }
//        }
    }
}
