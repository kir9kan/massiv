import java.util.Random;
import java.util.Scanner;

public class questNine {
    public static void main(String[] args){
        int n;
        int left=0;
        int right=0;
        Random randome = new Random();
        Scanner scaner= new Scanner(System.in);
        if(scaner.hasNextInt()){
            do {
                n = scaner.nextInt();
                if (n % 2 != 0 || n < 1)
                    System.out.println("ты ошибся дядя введи четное число - это то которое делится на 2");
            }
            while (n%2!=0||n<1);
            int[] array = new int[n];
                for(int i = 0;i<n;i++){
                    array[i]=randome.nextInt(15);
                    System.out.print(array[i]+" ");
                if(i<=array.length/2-1){
                    left = left+array[i];
                }
                else{
                    right=right+array[i];
                }
                if(i==array.length-1){
                    System.out.println(" ");
                    if(left<right){
                        System.out.println("сумма модулей правой половины больше и равна: "+right);
                    }
                    if(left>right){
                        System.out.println("сумма модулей левой половины больше и равна: "+left);
                    }
                    if (left==right){
                        System.out.println("сумма модулей равны и выгледят так: " + left+"="+right);
                    }
                }
                }
        }
    }
}
