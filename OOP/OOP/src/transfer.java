package OOP.OOP.src;
import java.util.*;
class transfer extends details
{
    long bal;
    long amt=0;
    Scanner s=new Scanner(System.in);
    void trans(long t)
    {
        System.out.println();
        System.out.println();
        System.out.println("***** TRANSFER *****");
        System.out.println();
        System.out.println();
        System.out.println("Enter the account number you want to transfer :- ");
        System.out.print("Enter : ");
        String tac=s.nextLine();
        System.out.println("Conform the account number");
        System.out.print("ENTER: ");
        String tacc =s.nextLine();
        if(!Objects.equals(tacc, tac)){
            while(!Objects.equals(tacc, tac)) {
                System.out.println();
                System.out.println();
                System.out.println("OOPS!");
                System.out.println("Enter correct account number");
                System.out.println("Enter a/c no : ");
                tacc = s.nextLine();
            }
        }
        long bal=t;
        System.out.println();
        System.out.println("Enter the amount : ");
        amt=s.nextInt();
        if(bal>=amt){
            bal = bal - amt;
            System.out.println("transfer successful.");
            st[l] = amt + " rupees are transferred";
            l++;
        }
        else{
            System.out.println("Error invalid Amount!");
        }

        System.out.println();
        System.out.println("PRESS 1 to check your balance");
        System.out.print("ENTER: ");
        int ch;
        ch=s.nextInt();
        if(ch==1) {
            System.out.println();
            System.out.println();
            System.out.println("YOUR BALANCE IS "+bal);
        }
    }
}
