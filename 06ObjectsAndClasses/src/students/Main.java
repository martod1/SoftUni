package students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                String [] data = sc.nextLine().split("\\s+");
                List <Students> studentsList = new ArrayList<>();
                while (!data[0].equals("end")){
                        String firstName = data[0];
                        String lastName = data[1];
                        int age = Integer.parseInt(data[2]);
                        String homeTown = data[3];

                        Students student = new Students();

                        student.setFirstName(firstName);
                        student.setLastName(lastName);
                        student.setAge(age);
                        student.setHomeTown(homeTown);

                        studentsList.add(student);

                        data = sc.nextLine().split("\\s+");
                }

                String filterCity = sc.nextLine();

                for (Students student : studentsList) {
                        if (student.getHomeTown().equals(filterCity)){
                                System.out.println(String.format("%s %s is %d years old", student.getFirstName(), student.getLastName(), student.getAge()));
                        }
                }
        }
}

