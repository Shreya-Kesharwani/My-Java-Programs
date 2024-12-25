package Questions;
public class random {
    void insertat(int[] arr,int pos,int value){
       int i;
     for( i=arr.length-2;i>=pos;i--){
        
       arr[i+1]=arr[i];
   }
   arr[i+1]=value;
    }
    public static void main(String[] args){
     int[] arr = new int[5];
     arr[0]=1;
     arr[1]=2;
     arr[2]=3;
     arr[3]=4;
     random r=new random();
     r.insertat(arr,2,5);
     for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+",");
     }
    }
}
