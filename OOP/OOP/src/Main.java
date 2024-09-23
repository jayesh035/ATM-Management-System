package OOP.OOP.src;
import java.util.*;
import java.io.*;



class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        banking b = new banking();
        transfer t = new transfer();
        display dis = new display();
        File myfile = new File("ms.txt");

        dis.initial();
        try{
            b.register();
            b.enter();
            System.out.println();
            System.out.println();
            long cj=0;
            while(cj!=1) {
                dis.screen();
                int ch=sc.nextInt();
                switch(ch) {
                    case 1:
                    {
                        System.out.println();
                        System.out.println("***** BANKING *****");
                        System.out.println();
                        System.out.println();
                        System.out.println("1. WITHDRAWAL");
                        System.out.println("2. FAST CASH");
                        System.out.println("3. DEPOSITE");
                        System.out.println("4. CHANGE PIN");
                        System.out.println();

                        System.out.print("Enter your choice : ");
                        int c = sc.nextInt();
                        switch(c)
                        {
                            case 1: {
                                b.with();
                                break;
                            }
                            case 2: {
                                b.fast();
                                break;
                            }
                            case 3: {
                                b.deposite();
                                break;
                            }
                            case 4: {
                                b.change();
                                break;
                            }
                            default:{
                                return;
                            }
                        }break;
                    }
                    case 2: {
                        t.trans(b.bal);
                        break;
                    }
                    case 3: {
                        System.out.println();
                        System.out.println("YOUR CURRENT BALANCE IS : "+ (b.bal-t.amt));
                        break;
                    }
                    case 4: {
                        PrintWriter pw = new PrintWriter(myfile);
                        try{
                            if(myfile.exists()){
                                myfile.delete();
                            }
                            myfile.createNewFile();
                            System.out.println();
                            System.out.println("YOUR BALANCE HISTORY :- ");
                            System.out.println();
                            for(int i=0;i<b.l;i++) {
                                System.out.println(b.st[i]);
                                pw.println(b.st[i]);
                            }
                            for(int i=0;i<t.l;i++) {
                                System.out.println(t.st[i]);
                                pw.println(t.st[i]);
                            }
                        }
                        catch(IOException e){
                            System.out.println("Error occurred.");
                        }
                        finally{
                            pw.close();
                        }
                        break;

                    }
                    case 5:{
                        System.out.println("Thank you for using our services. Please visit again!");
                        return;
                    }
                    default:{
                        return;
                    }
                }
                System.out.print("press 1 for exit or else press any other number to go back to main menu : ");
                cj=sc.nextInt();
            }
            System.out.println("Thank you for using our services. Please visit again.");
        }
        catch (InputMismatchException e) {
            System.out.println("Error invalid input!!!");
        }
        catch(IOException e){
            System.out.println("Error IO exception occurred!");
        }
        catch(Exception e){
            System.out.println("Error process unfinished!");
        }
    }
}