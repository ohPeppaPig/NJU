package first_online;

import java.util.Scanner;

public class oj06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int num = sc.nextInt();
            int sum = 0;
            for(int i = 0;i<num;i++){
                int a = sc.nextInt();
                sum = sum+a;
            }
            System.out.println(sum);
        }


    }
}
