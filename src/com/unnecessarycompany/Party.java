package com.unnecessarycompany;

import java.util.*;

public class Party {
    public List<Guest> guests = new ArrayList<>();
    private Set<String> meals= new HashSet<>();
    private Map<Integer, Guest> phoneToGuest = new HashMap<>();

    Scanner scanner = new Scanner(System.in);

    public void addGuest() {
        System.out.println("podaj imię");
        String name = scanner.nextLine();

        System.out.println("podaj preferony posiłek");
        String meal = scanner.nextLine();

        System.out.println("podaj numer telefonu");
        int phoneNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("jest vege (Y/N)");
        String isVeganString = scanner.nextLine();

        Boolean isVegan;
        if (isVeganString.equals("Y")) {
            isVegan = true;
        } else {
            isVegan = false;
        }

        Guest guest = new Guest(name, meal, phoneNumber, isVegan);
        meals.add(meal);
        phoneToGuest.put(phoneNumber,guest);

        guests.add(guest);
    }

    public void displayMeals() {
        for (String meal: meals) {
            System.out.println(meal);
        }
    }

    public void findGuestByPhone() {
        System.out.println("podaj numer do wyszukania");
        int findPhoneNumber = Integer.valueOf(scanner.nextLine());
        Guest guest = phoneToGuest.get(findPhoneNumber);
        guest.diplayGuestInformation();
    }

    public void displayGuests() {

        for (Guest gest: guests) {
           gest.diplayGuestInformation();
        }
    }
}
