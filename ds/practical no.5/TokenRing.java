import java.util.*;

public class TokenRing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total number of nodes: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.print(i + " ");
        }
        System.out.println("0");

        int ch = 0;

        do{
            System.out.println("Sender:");
            int sender = sc.nextInt();

            System.out.println("Receiver:");
            int receiver = sc.nextInt();

            System.out.println("Data to send :");
            int data = sc.nextInt();

            System.out.println("Token Passing :");

            int token = 0;

            for(int i=token ; i<sender; i++){
                System.out.print(" "+ i + "=>");
            }

            System.out.println("Sender:" + sender);
            System.out.println("Sender:" + sender + "Sending Data:" + data);

            for(int i=sender; i != receiver; i = (i+1)%n){
                System.out.println("Data:" + data + "Forwarded By:" + i);
            }
            System.out.println("Receiver:"+ receiver + "Received Data" + data);

            token = sender;

            System.out.println("Do you want to send data again? If yes then put 1 If No then put 0");
            ch = sc.nextInt();
        }while(ch == 1);
    }
}