package Array;

public class find_index {
    public static void main (String []args)
{
    int count=0;
    int arr[] = new int[5];
    arr[0] = 4;
    arr[1] = 5;
    arr[2] = 9;
    arr[3] = 10;
    arr[4] = 12;
    //find index of 5
    for(int i=0;i<5;i++){
        if(arr[i]==5){
        System.out.println("Element found at index "+i);
        count=1;
        }
    }
    //if element is not found
    if (count==0)
    System.out.println("Element not found");
}    
}
