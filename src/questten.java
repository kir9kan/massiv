import java.util.Random;
import java.util.Scanner;

public class questten {
    public static void main(String[] args) {
        int n=0,k=0;
        Random random = new Random();
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("введите число большее 3");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
            }
            else System.out.println("ошибка вы ввели число не коректно");
        }
            while (n<4);
            int[] array=new int[n];
            for(int i = 0; i<n;i++){
                array[i]=random.nextInt(n);
                System.out.print(array[i]+" ");
                if(array[i]%2==0& array[i]!=0)k++;
        }
        System.out.println(" ");
            if(k>0){
                int[] arrayk =new int[k];
                for(int i=0,b=0;i<n;i++){
                    if(array[i]%2==0 & array[i]!=0){
                        arrayk[b]=array[i];
                        System.out.print(arrayk[b]+" ");
                    }
                }
            }
    }
}
