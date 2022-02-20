import java.util.Random;

public class questThree {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();
        for(int i=0;i<15;i++){
            array[i]=random.nextInt(99);
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
        for(int j=0;j<15;j++){
            if(array[j]%2==0){
            System.out.print(array[j]+" ");}
        }
    }
}
