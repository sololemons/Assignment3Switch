import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the code to Continue");
        String openingCode = scanner.nextLine();

        if (Objects.equals(openingCode, "*131#")) {
            System.out.println("0:sh20 (30mins,3hrs)");
            System.out.println("1:Sh 50 (40mins+50SMS,24hrs");
            System.out.println("2:Okoa Easy Sh 500(500Mins,7days)");
            System.out.println("3:Okoa 500");
            System.out.println("4:Okoa 250");
            System.out.println("5:Okoa 100");
            System.out.println("6:Okoa 50");
            System.out.println("7:Okoa 20");
            System.out.println("8:Okoa 10");


        } else {
            System.out.println("Incorrect Code Entered");
            System.exit(0);
        }
        System.out.println("Enter The Option You want To Continue with");
        int steps = scanner.nextInt();
        switch (steps) {
            case 0: {
                System.out.println("Exsisting Unpaid Okoa:0");
                System.out.println("New Okoa request:20");
                System.out.println("TOTAL DEBT will be:20");
                System.out.println("1:Accept");
                System.out.println("2:Decline");
                System.out.println("0:BACK 0:HOME");
                int nextStep= scanner.nextInt();
                if (nextStep == 0){
                    System.out.println("0:sh20 (30mins,3hrs)");
                    System.out.println("1:Sh 50 (40mins+50SMS,24hrs");
                    System.out.println("2:Okoa Easy Sh 500(500Mins,7days)");
                    System.out.println("3:Okoa 500");
                    System.out.println("4:Okoa 250");
                    System.out.println("5:Okoa 100");
                    System.out.println("6:Okoa 50");
                    System.out.println("7:Okoa 20");
                    System.out.println("8:Okoa 10");


                }


                break;
            }
            case 1: {
                System.out.println("Exsisting Unpaid Okoa:0");
                System.out.println("New Okoa request:50");
                System.out.println("TOTAL DEBT will be:50");
                System.out.println("1:Accept");
                System.out.println("2:Decline");
                System.out.println("0:BACK 00:HOME");
                break;
            }
            case 2: {

                System.out.println("Welcome to Okoa Easy Sh500(500Mins,7days)");
                System.out.println("Exsisting Unpaid Okoa:0");
                System.out.println("New Okoa request:500");
                System.out.println("TOTAL DEBT will be:500");
                System.out.println("1:Accept");
                System.out.println("2:Decline");
                System.out.println("0:BACK 00:HOME");
                break;
            }
            case 3: {

                System.out.println("Exsisting Unpaid Okoa:0");
                System.out.println("New Okoa request:500");
                System.out.println("TOTAL DEBT will be:500");
                System.out.println("1:Accept");
                System.out.println("2:Decline");
                System.out.println("0:BACK 00:HOME");
                break;
            }
            case 4: {

                System.out.println("Exsisting Unpaid Okoa:0");
                System.out.println("New Okoa request:250");
                System.out.println("TOTAL DEBT will be:250");
                System.out.println("1:Accept");
                System.out.println("2:Decline");
                System.out.println("0:BACK 00:HOME");
                break;
            }
            case 5:{

                System.out.println("Exsisting Unpaid Okoa:0");
                System.out.println("New Okoa request:100");
                System.out.println("TOTAL DEBT will be:100");
                System.out.println("1:Accept");
                System.out.println("2:Decline");
                System.out.println("0:BACK 00:HOME");
                break;
            }
            case 6: {

                System.out.println("Exsisting Unpaid Okoa:0");
                System.out.println("New Okoa request:50");
                System.out.println("TOTAL DEBT will be:50");
                System.out.println("1:Accept");
                System.out.println("2:Decline");
                System.out.println("0:BACK 00:HOME");
                break;
            }
            case 7: {

                System.out.println("Exsisting Unpaid Okoa:0");
                System.out.println("New Okoa request:20");
                System.out.println("TOTAL DEBT will be:20");
                System.out.println("1:Accept");
                System.out.println("2:Decline");
                System.out.println("0:BACK 00:HOME");
                break;
            }
            case 8:{

                System.out.println("Exsisting Unpaid Okoa:0");
                System.out.println("New Okoa request:10");
                System.out.println("TOTAL DEBT will be:10");
                System.out.println("1:Accept");
                System.out.println("2:Decline");
                System.out.println("0:BACK 00:HOME");
                break;
            }
            default:{
                System.out.println("Invalid choice Try Again");
            }

        }
    }
}