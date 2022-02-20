import java.util.Random;

public class questEight {
    public static void main(String[] args) {
        System.out.print("первый массив: ");
        Random random = new Random();
        double N=10;
        int[] array = new int[10];
        int[] arrayone = new int[10];
        int[] arraydo = new int[10];
        for(int i = 0;i<10;i++){
            array[i]=random.nextInt(9);
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        System.out.print("второй массив: ");
        for(int j = 0;j<10;j++){
            arrayone[j]=random.nextInt(9);
            System.out.print(arrayone[j]+" ");
        }
        System.out.println("");
//        System.out.print("третий массив: ");
//        for(int k = 0;k<10;k++){                  как его перевести в дробный тип, и тут так же есть прикол с
//                                                делением на ноль
//            arraydo[k]=array[k]/arrayone[k];
//            System.out.print(arraydo[k]+" ");
//        }
    }
}
