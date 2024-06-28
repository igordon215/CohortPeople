package zipcode.rocks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        String student_source = "TenFiveZero.csv";

        // Load data file into an ArrayList<Person> of Person objects.
        Main programObject = new Main();

        List listOfStudents = programObject.handWrittenLoadOfData();;

        int numberOfPersons = listOfStudents.size();
        for (int i = 0; i< numberOfPersons; i++){
            System.out.println(listOfStudents.get(i).toString());
        }
    }

    private List loadCSVFile(String student_source) {
        ArrayList<Person> records = new ArrayList<>();

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(student_source);

        try (Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNextLine()) {
                records.add(this.getRecordFromLine(scanner.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("File NOT FOUND.");
            e.printStackTrace();
        }
        return records;
    }

    private Person getRecordFromLine(String line) {
        // take the String of lastname,firstname and create a new Person object with it.

        String[] values = line.split(COMMA_DELIMITER);
       /* Person newPerson = new Person (values[0], values[1],values[2], values[3], values[4], values[5]);*/
        return null; /*return new Person()*/ //FOR CSV FILE
    }

    private List handWrittenLoadOfData() {
        ArrayList<Person> students = new ArrayList<>();

        Person newPerson = new Person("Teddy", "Archibald");
        newPerson.setFavdrink("Half&Half");
        newPerson.setFavcolor("Red");
        newPerson.setBirthmonth("March");
        newPerson.setAnypets(false);
        students.add(newPerson);

        Person newPerson1 = new Person("Peter", "VanBeever");
        newPerson.setFavdrink("Latte");
        newPerson.setFavcolor("Purple");
        newPerson.setBirthmonth("February");
        newPerson.setAnypets(true);
        students.add(newPerson1);

        Person newPerson2 = new Person("Tim", "Linkous");
        newPerson.setFavdrink("Water");
        newPerson.setFavcolor("Green");
        newPerson.setBirthmonth("September");
        newPerson.setAnypets(false);
        students.add(newPerson2);

        Person newPerson3 = new Person("Qian", "Wang");
        newPerson.setFavdrink("Water");
        newPerson.setFavcolor("Blue");
        newPerson.setBirthmonth("October");
        newPerson.setAnypets(false);
        students.add(newPerson3);

        Person newPerson4 = new Person("Diptika", "Devi");
        newPerson.setFavdrink("Tea");
        newPerson.setFavcolor("Orange");
        newPerson.setBirthmonth("June");
        newPerson.setAnypets(false);
        students.add(newPerson4);

        Person newPerson5 = new Person("Ian", "Gordon");
        newPerson.setFavdrink("Water");
        newPerson.setFavcolor("Green");
        newPerson.setBirthmonth("April");
        newPerson.setAnypets(true);
        students.add(newPerson5);

        Person newPerson6 = new Person("Tim", "Nguyen");
        newPerson.setFavdrink("Bubble Tea");
        newPerson.setFavcolor("White");
        newPerson.setBirthmonth("November");
        newPerson.setAnypets(true);
        students.add(newPerson6);

        Person newPerson7 = new Person("Bryan", "Smith");
        newPerson.setFavdrink("Water");
        newPerson.setFavcolor("Brown");
        newPerson.setBirthmonth("May");
        newPerson.setAnypets(false);
        students.add(newPerson7);

        Person newPerson8 = new Person("Jonathan", "Diehl");
        newPerson.setFavdrink("Coffee");
        newPerson.setFavcolor("Green");
        newPerson.setBirthmonth("February");
        newPerson.setAnypets(true);
        students.add(newPerson8);

        Person newPerson9 = new Person("Jared", "Thacker");
        newPerson.setFavdrink("Water");
        newPerson.setFavcolor("Green");
        newPerson.setBirthmonth("December");
        newPerson.setAnypets(false);
        students.add(newPerson9);

        Person newPerson10 = new Person("Robbie", "Niemeyer");
        newPerson.setFavdrink("Water");
        newPerson.setFavcolor("Blue");
        newPerson.setBirthmonth("January");
        newPerson.setAnypets(false);
        students.add(newPerson10);

        Person newPerson11 = new Person("Mohammed", "N.");
        newPerson.setFavdrink("Snapple");
        newPerson.setFavcolor("Green");
        newPerson.setBirthmonth("August");
        newPerson.setAnypets(false);
        students.add(newPerson11);

        Person newPerson12 = new Person("Josue", "Castro");
        newPerson.setFavdrink("Coffee");
        newPerson.setFavcolor("Blue");
        newPerson.setBirthmonth("June");
        newPerson.setAnypets(true);
        students.add(newPerson12);

        Person newPerson13 = new Person("Coreye", "Ross");
        newPerson.setFavdrink("Water");
        newPerson.setFavcolor("Black");
        newPerson.setBirthmonth("October");
        newPerson.setAnypets(false);
        students.add(newPerson13);

        Person newPerson14 = new Person("Will", "Chapman");
        newPerson.setFavdrink("Water");
        newPerson.setFavcolor("Purple");
        newPerson.setBirthmonth("December");
        newPerson.setAnypets(false);
        students.add(newPerson14);

        // and so on for EACH person in the cohort.

        return students;
    }



}