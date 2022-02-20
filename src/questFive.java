import java.util.Random;

public class questFive {
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
        int[] arrayTwo = new int[5];
        for(int j=0;j<5;j++){
            arrayTwo[j]=random.nextInt(15);
            System.out.print(arrayTwo[j]+" ");
            summTwo=summTwo+arrayTwo[j];
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

