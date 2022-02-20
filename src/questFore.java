import java.util.Random;

public class questFore {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt(99);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for (int j = 0; j < 20; j++) {
            if (array[j] % 2 == 1) {
                array[j]=0;
            }
            System.out.print(array[j]+" ");
        }
    }
}

