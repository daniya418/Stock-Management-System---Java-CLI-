
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<String> Sinhala = new ArrayList<String>();
    public static ArrayList<String> Hindi = new ArrayList<String>();
    public static ArrayList<String> English = new ArrayList<String>();
    public static ArrayList<String> Tamil = new ArrayList<String>();


    static Scanner scanner = new Scanner(System.in);

    public static void login(){
        String userName = "user";
        String password = "password";
        System.out.println("Enter user name : ");
        String inputUserName;
        inputUserName = scanner.nextLine();


        while (!userName.equals(inputUserName)){
            System.out.println("Username incorrect");
            System.out.println("Enter user name : ");
            inputUserName = scanner.nextLine();
        }

        System.out.println("Enter Password : ");
        String inputPassword = scanner.nextLine();
        if (inputPassword.equals(password)){
            System.out.print("Login Successful.");
        }else{
            while(!inputPassword.equals(password)){
                System.out.println("Password Incorrect.");
                System.out.println("Enter Password : ");
                inputPassword = scanner.nextLine();}

            System.out.println("Login Successful.");

        }

    }


    public static void showOption0(){
        System.out.println("---MAIN MENU---");
        System.out.println("Enter 1 for add items ");
        System.out.println("Enter 2 for remove items ");
        System.out.println("Enter 3 for show items ");
        System.out.println("Enter x for quit program ");
    }
    public static void showOption2(){
        System.out.println("---ADD LANGUAGE SELECTION MENY---");
        System.out.println("Enter 1 to add a Sinhala ");
        System.out.println("Enter 2 to add a Hindi ");
        System.out.println("Enter 3 to add an english movie");
        System.out.println("Enter 4 to add a tamil movie ");
        System.out.println("Enter x to go HOME ");
    }

    public static void showOption3(){
        System.out.println("---REMOVE LANGUAGE SELECTION MENU---");
        System.out.println("Enter 1 to remove a Sinhala movie ");
        System.out.println("Enter 2 to remove a Hindi movie ");
        System.out.println("Enter 3 to remove an english movie");
        System.out.println("Enter 4 to remove a tamil movie ");
        System.out.println("Enter x to go BaCk ");
    }

    public static void main(String[] args) {

        //login();
        String option0 = "";
        while(!option0.equals("x")){
            showOption0();
            option0 = scanner.nextLine();
            while (!option0.equals("x")) {
                switch (option0) {
                    case "1" -> {
                        showOption2();
                        String option2 = scanner.nextLine().toLowerCase();
                        while (!option2.equals("x")) {
                            switch (option2) {

                                case "1" -> {

                                    Movie sinhala = new Movie();
                                    Sinhala.add(sinhala.addMovie("sinhala"));

                                }
                                case "2" -> {

                                    Movie hindi = new Movie();
                                    Hindi.add(hindi.addMovie("hindi"));

                                }
                                case "3" -> {

                                    Movie tamil = new Movie();
                                    Tamil.add( tamil.addMovie("tamil"));

                                }
                                case "4" -> {

                                    Movie english = new Movie();
                                    English.add( english.addMovie("english"));

                                }
                            }
                            showOption2();
                            option2 = scanner.next().toLowerCase();
                            System.out.println(option2);
                        }
                    }
                    case "3" -> {
                        System.out.println(Sinhala);
                        System.out.println(Hindi);
                        System.out.println(English);
                        System.out.println(Tamil);
                    }
                    case "2" -> {
                        String option3 = "";
                        while (!option3.equals("x")) {
                            showOption3();
                            option3 = scanner.nextLine();
                            switch (option3) {
                                case "1" -> {
                                    Movie sinhala = new Movie();
                                    System.out.println(Sinhala);
                                    Sinhala.remove(sinhala.removeMovie("sinhala"));

                                }
                                case "2" -> {
                                    Movie hindi = new Movie();
                                    System.out.println(Hindi);
                                    Hindi.remove(hindi.removeMovie("hindi"));
                                }
                                case "3" -> {
                                    Movie tamil = new Movie();
                                    System.out.println(Tamil);
                                    Tamil.remove(tamil.removeMovie("tamil"));
                                }
                                case "4" -> {
                                    Movie english = new Movie();
                                    System.out.println(English);
                                    English.remove(english.removeMovie("english"));
                                }
                            }
                        }
                        showOption3();
                        option3 = scanner.next().toLowerCase();
                        System.out.println(option3);
                    }
                }
                showOption0();
                option0 = scanner.nextLine().toLowerCase();
                System.out.println(option0);
            }

        }
        System.out.println("Thankyou.");


    }
}