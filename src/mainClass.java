import java.util.Scanner;

public class mainClass {

    public static void main(String[] args) {
        float balance=0, wd, dep, cash=500;
        boolean atmOn = true;
        int operation=0;
        Scanner scanner = new Scanner(System.in);


        while (atmOn == true) {
            System.out.println("ATM (Cash: " + cash + ") / (Balance: " + balance + ")");
            System.out.println("1 - Withdraw\n2 - Deposit\n3 - Exit");

            while(operation<1 || operation>3) {
                System.out.print("What do you want to do?: ");
                operation = scanner.nextInt();
            }

            switch (operation) {
                case 1:
                        System.out.print("How much money do you want to withdraw?: ");
                        wd = scanner.nextFloat();
                        while (wd <= 0 && balance >= wd) {
                            System.out.print("How much money do you want to withdraw?: ");
                            wd = scanner.nextFloat();
                        }
                        if (wd <= balance) {
                            balance -= wd;
                            cash += wd;
                            System.out.println("\n\n\n\nWithdraw completed successfully. Your new balance is: " + balance);
                        }
                        else {
                            System.out.println("\n\n\n\nYou don't have enough balance to do that...");
                        }

                    wd = 0;
                    break;

                case 2:
                    System.out.print("How much money do you want to deposit?: ");
                    dep = scanner.nextFloat();
                    while (dep <= 0 && cash >= dep) {
                        System.out.print("How much money do you want to deposit?: ");
                        dep = scanner.nextFloat();
                    }

                    if(dep <= cash) {
                        cash -= dep;
                        balance += dep;
                        System.out.println("\n\n\n\nDeposit completed successfully. Your new balance is: " + balance);
                    }
                    else {
                        System.out.println("\n\n\n\nYou don't have enough cash to do that...");
                    }
                    break;

                case 3:
                    atmOn = false;
                    break;
            }
            operation=0;
        }
    }
}
