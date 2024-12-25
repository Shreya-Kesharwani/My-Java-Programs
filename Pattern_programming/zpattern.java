package Pattern_programming;

public class zpattern{
    public static void main(String args[]){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j+i==n-1||i==0||i==(n-1))
                System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}