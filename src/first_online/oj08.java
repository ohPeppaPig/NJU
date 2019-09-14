package first_online;

import java.util.Scanner;

public class oj08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 0;i<row;i++){
            int num = sc.nextInt();
            int sum = 0;
            for(int j = 0;j<num;j++){
                sum = sum+sc.nextInt();
            }
            System.out.println(sum);
            System.out.println();
        }
    }

}
