package OOP.OOP.src;

class banking extends details
{
    void with() {

        System.out.println();
        System.out.print("Enter Amount : ");
        long amt = s.nextLong();
        if(amt<1){
            System.out.println("Error!");
            while(amt<1){
                System.out.println("Enter again : ");
                amt = s.nextLong();
            }
        }
        else if(amt == 1 && bal>0){
            System.out.println("One rupee withdrawn.");
            st[l] = amt + " rupee withdrawn.";
            l++;
            bal -= 1;
        }
        else if(bal>=amt){
            System.out.println(amt+" rupees are withdrawn.");
            st[l]=amt+" rupees are withdrawn.";
            l++;
            bal=bal-amt;
        }
        else{
            System.out.println("Insufficient Funds for this amount!");
        }
        System.out.println();
        System.out.println("press 1 to check your balance");
        int p;
        System.out.print("press : ");
        p=s.nextInt();
        if(p==1) {
            System.out.println("YOUR BALANCE IS : " + bal);
        }
    }

    void fast()
    {
        System.out.println("Given keys for amount :- ");
        System.out.println("1. 500 "+"                  2. 1000");
        System.out.println("3. 5000"+"                  4. 2000");
        System.out.print("Enter : ");
        int x;
        x=s.nextInt();

        System.out.println();
        System.out.println();
        switch(x)
        {
            case 1: {
                if(bal>=500){
                    System.out.println("500 rupees is withdrawn successfully:");
                    st[l]="500 rupees is withdrawn";
                    l++;
                    bal -= 500;
                    break;
                }
                else{
                    System.out.println("Insufficient funds!");
                }
                break;
            }
            case 2: {
                if(bal>=1000){
                    System.out.println("1000 rupees is withdrawn successfully:");
                    st[l]="1000 rupees is withdrawn";
                    l++;
                    bal -= 1000;
                    break;
                }
                else{
                    System.out.println("Insufficient funds!");
                }
                break;
            }
            case 3: {
                if(bal>=5000){
                    System.out.println("5000 rupees is withdrawn successfully:");
                    st[l]="5000 rupees is withdrawn";
                    l++;
                    bal -= 5000;
                    break;
                }
                else{
                    System.out.println("Insufficient funds!");
                }
                break;
            }
            case 4: {
                if(bal>=2000){
                    System.out.println("2000 rupees is withdrawn successfully:");
                    st[l]="2000 rupees is withdrawn";
                    l++;
                    bal -= 2000;
                    break;
                }
                else{
                    System.out.println("Insufficient funds!");
                }
                break;
            }
            default:{
                System.out.println("Error!");
            }
        }
        System.out.println("press 1 for check your balance : ");
        int cl = s.nextInt();
        if(cl==1) {
            System.out.println("YOUR BALANCE : "+bal);
        }
    }

    void change() {
        System.out.println();
        System.out.println();
        System.out.println("Enter your current PIN : ");
        int bx = s.nextInt();
        while(bx!=pin){
            System.out.println("INCORRECT PIN!");
            System.out.println("TRY AGAIN");
        }

        int p;
        System.out.print("Enter your new PIN : ");
        p=s.nextInt();
        if(p > 9999 || p < 1000){
            while(p>9999 || p < 1000){
                System.out.println("Please enter valid PIN : ");
                p = s.nextInt();
            }
        }
        System.out.print("Conform your PIN : ");
        pin=s.nextInt();

        if(pin!=p) {
            while(pin!=p){
                System.out.print("please correctly re-enter your NEW pin : ");
                pin=s.nextInt();
            }
        }
        System.out.println("YOUR NEW PIN IS ADDED SUCCESSFULLY.");
    }
    void deposite() {
        System.out.println("YOUR CURRENT BALANCE IS "+bal+" RUPEES");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Enter the amount you want to deposite : ");
        long d = s.nextLong();
        if(d<1){
            System.out.println("Error!");
            while(d<1){
                System.out.println("Enter again : ");
                d = s.nextLong();
            }
        }


        bal=bal+d;
        System.out.println("YOUR AMOUNT IS ADDED SUCCESSFULLY");
        st[l]=d+" rupee(s) added";
        l++;

        System.out.println();
        System.out.println();
        System.out.println("press 1 for check yor balance: ");
        int ch;
        ch=s.nextInt();
        if(ch==1) {
            System.out.println();
            System.out.println("YOUR BALANCE IS "+bal);
        }
    }
}
