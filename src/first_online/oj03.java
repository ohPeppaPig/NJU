package first_online;

import java.util.Scanner;

public class oj03 {

    public static void main(String[] args) {
        int flag = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(a==0&&b==0){
                break;
            }
            System.out.println(a+b);
        }
    }
}
