import javax.swing.*;
import java.util.Random;

public class questfiive {
    public static void main(String[] args){
        int sumOne=0;
        int summTwo=0;
        int[] array = new int[5];
        Random random = new Random();
        for(int i=0;i<5;i++){
            array[i]= random.nextInt(15);
            System.out.print(array[i]+ " ");
            sumOne=sumOne+array[i];
        }
        System.out.println(" ");
        System.out.println(sumOne);
        System.out.println(" ");
        int[] arraytwo = new int[5];
        for(int j=0;j<5;j++){
            arraytwo[j]=random.nextInt(15);
            System.out.print(arraytwo[j]+" ");
            summTwo=summTwo+arraytwo[j];
        }
        System.out.println(" ");
        System.out.println(summTwo);
        if(summTwo>sumOne){
            System.out.println("2 число больше 1 ");
        }
        if(summTwo<sumOne){
            System.out.println("1число больше 2");
        }
        if (summTwo==sumOne) {
            System.out.println("числа равны");
        }

    }
}

