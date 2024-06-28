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
        newPerson1.setFavdrink("Latte");
        newPerson1.setFavcolor("Purple");
        newPerson1.setBirthmonth("February");
        newPerson1.setAnypets(true);
        students.add(newPerson1);

        Person newPerson2 = new Person("Tim", "Linkous");
        newPerson2.setFavdrink("Water");
        newPerson2.setFavcolor("Green");
        newPerson2.setBirthmonth("September");
        newPerson2.setAnypets(false);
        students.add(newPerson2);

        Person newPerson3 = new Person("Qian", "Wang");
        newPerson3.setFavdrink("Water");
        newPerson3.setFavcolor("Blue");
        newPerson3.setBirthmonth("October");
        newPerson3.setAnypets(false);
        students.add(newPerson3);

        Person newPerson4 = new Person("Diptika", "Devi");
        newPerson4.setFavdrink("Tea");
        newPerson4.setFavcolor("Orange");
        newPerson4.setBirthmonth("June");
        newPerson4.setAnypets(false);
        students.add(newPerson4);

        Person newPerson5 = new Person("Ian", "Gordon");
        newPerson5.setFavdrink("Water");
        newPerson5.setFavcolor("Green");
        newPerson5.setBirthmonth("April");
        newPerson5.setAnypets(true);
        students.add(newPerson5);

        Person newPerson6 = new Person("Tim", "Nguyen");
        newPerson6.setFavdrink("Bubble Tea");
        newPerson6.setFavcolor("White");
        newPerson6.setBirthmonth("November");
        newPerson6.setAnypets(true);
        students.add(newPerson6);

        Person newPerson7 = new Person("Bryan", "Smith");
        newPerson7.setFavdrink("Water");
        newPerson7.setFavcolor("Brown");
        newPerson7.setBirthmonth("May");
        newPerson7.setAnypets(false);
        students.add(newPerson7);

        Person newPerson8 = new Person("Jonathan", "Diehl");
        newPerson8.setFavdrink("Coffee");
        newPerson8.setFavcolor("Green");
        newPerson8.setBirthmonth("February");
        newPerson8.setAnypets(true);
        students.add(newPerson8);

        Person newPerson9 = new Person("Jared", "Thacker");
        newPerson9.setFavdrink("Water");
        newPerson9.setFavcolor("Green");
        newPerson9.setBirthmonth("December");
        newPerson9.setAnypets(false);
        students.add(newPerson9);

        Person newPerson10 = new Person("Robbie", "Niemeyer");
        newPerson10.setFavdrink("Water");
        newPerson10.setFavcolor("Blue");
        newPerson10.setBirthmonth("January");
        newPerson10.setAnypets(false);
        students.add(newPerson10);

        Person newPerson11 = new Person("Mohammed", "N.");
        newPerson11.setFavdrink("Snapple");
        newPerson11.setFavcolor("Green");
        newPerson11.setBirthmonth("August");
        newPerson11.setAnypets(false);
        students.add(newPerson11);

        Person newPerson12 = new Person("Josue", "Castro");
        newPerson12.setFavdrink("Coffee");
        newPerson12.setFavcolor("Blue");
        newPerson12.setBirthmonth("June");
        newPerson12.setAnypets(true);
        students.add(newPerson12);

        Person newPerson13 = new Person("Coreye", "Ross");
        newPerson13.setFavdrink("Water");
        newPerson13.setFavcolor("Black");
        newPerson13.setBirthmonth("October");
        newPerson13.setAnypets(false);
        students.add(newPerson13);

        Person newPerson14 = new Person("Will", "Chapman");
        newPerson14.setFavdrink("Water");
        newPerson14.setFavcolor("Purple");
        newPerson14.setBirthmonth("December");
        newPerson14.setAnypets(false);
        students.add(newPerson14);

        // and so on for EACH person in the cohort.

        return students;

    }



}

// ALL DONE!!