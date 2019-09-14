package first_online;

import java.util.Scanner;

public class oj04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int sum = 0;
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            for(int i = 0;i<num;i++){
                int a = sc.nextInt();
                sum = sum+a;
            }
            System.out.println(sum);
        }


    }

}
