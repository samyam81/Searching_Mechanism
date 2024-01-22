import java.util.Scanner;

public class searchb {
    public static void main(String[] args) {
    int search;
    int[] array={1,2,3,4,5,6,7,8,9,10};
      Scanner Sc = new Scanner(System.in);
       System.out.println("Enter the number to search?");
        search=Sc.nextInt();
        Sc.close();
        int result=sequentialsearch(array,search);
         if(result==-1){
             System.out.println(search+" Not present in the array.");
        } else{
             System.out.println(search+" is present at location "+result);
        }
    }
    private static int sequentialsearch(int[] array, int search) {
       int first=0, last=10-1;
       int middle=(first+last)/2;
       while (first<=last) {
        if( array[middle]==search){
            return (middle+1);
        }
        else if(array[middle]<search){
            first=middle+1;
        }
        else{
            last=middle-1;
        }
        middle=(first+last)/2;
       }
       return -1;
    }
}
