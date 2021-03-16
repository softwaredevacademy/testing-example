package se.sdaproject;

import se.sdaproject.model.Car;
import se.sdaproject.model.Validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// Is this something written by us?
// Is it trivial?
// Does it rely on external input?

/*
if welcome message prints - Is a bit too trivial, optional
that exception is thrown when we create car with wrong color - yes, but may need to be refactored into its own method
if red blue or green - same as above
scanner input - no, because scanner is not our own class
if the car is added - not if it's only the add method
if scanner works - no, it's not our class
test on different colours - same as above
 */

public class Menu {

    public List<Car> cars = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void runMainMenu() {
        System.out.println(Messages.welcome());
        System.out.println("Add a car by choosing a color");
        String answer = scanner.nextLine();

        Validation.valdiateColor(answer);
        cars.add(new Car(10, "123ABC", answer, "Volvo"));



    }
}
