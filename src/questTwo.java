public class questTwo {
    public static void main(String[] args) {
        int a =0;

        for(int i =0;i<=99;i++){
            if(i%2!=0)a++;
        }
        System.out.println(a);
        int[] array = new int[a];
        for(int i=1,b=0;i<=99;i++){
            if(i%2!=0){
            array[b]=i;
                System.out.print(array[b]+" ");
                b++;
            }
        }
        System.out.println(" ");
        for(int j =array.length-1;j>=0;j--){
            System.out.print(array[j]+" ");
        }
    }
}
