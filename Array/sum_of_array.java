package Array;

public class sum_of_array {
    public static void main (String[] args){
        int arr[] = new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=4;
        arr[3]=5;
        arr[4]=8;
        int sum=0;
        for(int i=0;i<5;i++){
sum+=arr[i];
        }
        System.out.println(sum);

    }
}