import java.util.Random;

public class questSix {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random random = new Random();
        for(int i=0; i<4;i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i]+" ");
        }
        if(array[0]<array[1] & array[1]<array[2] & array[2]<array[3]){
            System.out.println("строго возрастающий");
        }
        else{
            System.out.println("массив не возрастающий");
        }
    }
}
