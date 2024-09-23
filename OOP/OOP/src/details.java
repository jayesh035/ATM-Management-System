package OOP.OOP.src;
import java.util.*;

public class details
{
    Scanner s=new Scanner(System.in);
    static String name;
    long ac_no = (long)(Math.random()*(90000)+10000);
    int pin;

    long bal;

    String[] st =new String[100];
    int l=0;

    void register() throws InputMismatchException
    {

        System.out.println();
        System.out.print("Enter Name : ");
        name=s.nextLine();
        char[] chr = name.toCharArray();
//        for(int i = 0; i<name.length(); i++){
//            if(((int)chr[i] > 90 && chr[i] <65) || ((int)chr[i] > 122 && chr[i] <97)){
//                while(((int)chr[i] > 90 && chr[i] <65) || ((int)chr[i] > 122 && chr[i] <97)){
//                    System.out.println("Exception invalid name");
//                    System.out.println("Enter name again");
//                    name = s.nextLine();
//                }
//            }
//        }

//        int i;
//        do{
//            System.out.println("Error invalid name!!");
//            System.out.println("Enter Name : ");
//            name = s.nextLine();
//            chr = name.toCharArray();
//            for(i = 0; i<name.length();i++){
//                chr[i] = name.charAt(i);
//            }
//        }while(((int)chr[i] != 32) || ((int)chr[i] > 90 && chr[i] <65) || ((int)chr[i] > 122 && chr[i] <97));

        for(int j = 0; j < name.length(); j++){
            if(chr[j]==32 || (chr[j] <= 90 && chr[j] >=65) || (chr[j] <= 122 && chr[j] >=97)){
                continue;
            }
            else{
                System.out.println("Error invalid name!");
                break;
            }
        }

        System.out.println("Enter your account types :- ");
        System.out.println("1. CURRENT");
        System.out.println("2. SAVING");
        System.out.println("3. KCC");
        System.out.print("Enter your choice : ");
        int x = s.nextInt();
        if(x<1){
            System.out.println("Error!");
            while(x<1){
                System.out.println("Enter again : ");
            }
        }

        System.out.print("Enter your PIN (4 DIGITS) : ");
        pin=s.nextInt();
        if(pin > 9999 || pin < 1000){
            while(pin>9999 || pin < 1000){
                System.out.println("Please enter valid PIN : ");
                pin = s.nextInt();
            }
        }

            System.out.print("Conform your PIN : ");
            int p;
            p=s.nextInt();


            if(p!=pin)
            {
                while(p!=pin)
                {
                    System.out.print("please re-confirm your PIN : ");
                    p=s.nextInt();
                }
            }

            System.out.print("Enter the amount (Min. amount is 500) : ");
            bal=s.nextLong();
            if(bal<500){
                System.out.println("Error Minimum Initial amount is 500!");
                while(bal<500){
                    System.out.println("Enter again : ");
                }
            }
            System.out.println();
            System.out.println("Your Account No. is  SBI" + ac_no);
            System.out.println("REGISTRATION IS COMPLETED!");




//        System.out.print("Enter Account No : ");
//        ac_no=s.nextLong();


    }

    void enter() throws InputMismatchException
    {
        System.out.println();
        System.out.print("Please enter your a/c no. : SBI");
        long ac_noc = s.nextLong();
        if(ac_noc!=ac_no){
            System.out.println("Error entered a/c is inaccessible.");
        }
        int num;
        do{
            System.out.println();
            System.out.print("Captcha -> Enter number between 10 t0 99 : ");
            num=s.nextInt();
            if(num<10 || num>99)
            {
                System.out.println();
                System.out.println("PLEASE ENTER CORRECT NUMBER");
            }
        }while(num<10 || num>99);
        int pi;
        do {
            System.out.println();
            System.out.println();
            System.out.print("ENTER YOUR PIN : ");

            pi=s.nextInt();
            if(pi!=pin) {
                System.out.println("ERROR ENTER CORRECT PIN");
            }
        }while(pin!=pi);
    }
}