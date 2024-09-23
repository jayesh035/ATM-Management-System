package OOP.OOP.src;

interface mdisplay{
    void screen();
    void initial();
}
class display extends details implements mdisplay{
    public void screen(){
        System.out.println();
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Welcome to SBI ATM, " + details.name);
        System.out.println();
        System.out.println("1. BANKING                               2. TRANSFER");
        System.out.println("3. BALANCE INQUIRY                       4. MINI STATEMENT");
        System.out.println("5. EXIT");
        System.out.println();
        System.out.print("Enter Your Choice : ");
    }
    public void initial(){
        System.out.println("********** WELCOME TO SBI ATM **************");
        System.out.println();
        System.out.println("NEW USER REGISTRATION :- ");
    }
}
