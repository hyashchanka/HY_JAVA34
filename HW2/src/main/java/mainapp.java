import java.util.Scanner;

public class mainapp {
    public static void main(String[] args){

        //task1
        int number = 1200;
        int zero = 0;
        while(number%10 == 0){
            zero++;
            number /= 10;
        }
        System.out.println("Number of zeroes in number is " + zero);

        //task2
        int n = 5;
        int factorial = 1;
        for(int i= 1 ; i<=n ; i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);

        //task3
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number ");
        int value1 = scanner.nextInt();
        System.out.println("enter second number ");
        int value2 = scanner.nextInt();
        System.out.println((value1+value2)/2);

    }


}
