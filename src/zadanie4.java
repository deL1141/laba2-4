/**
 * Created by deL on 21.03.2016.
 */
import java.util.Scanner;
public class zadanie4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            double a,b;
                System.out.println("Введите два числа");
                    a = sc.nextLine();
                    b = sc.nextLine();
        if(a>b){
            System.out.println("Первое число больше второго");
        }
        else if(a=b){
            System.out.println("Числа равны");
        }
        else {
            System.out.println("Второе число больше первого");
        }
    }

}
