import java.util.Random;

public class questseven {
    public static void main(String[] args) {
        System.out.print("все значения: ");
        int min=0;
        int max=min;
        int[] array =new int[12];
        Random random = new Random();
        for(int i =0;i<12;i++){
            array[i]=random.nextInt(15);
            if(array[i]>max) max = array[i];
            if(array[i]<min) min = array[i];
            System.out.print( array[i]+" ");
        }
        System.out.println("");
        System.out.print("максимальное значение: "+max);
    }
}
