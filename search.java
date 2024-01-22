import java.util.Scanner;

public class search {
    // Sequential Searching
 /*    public static void main(String[] args) {
      Scanner Sc = new Scanner(System.in);
        int[] array={1,2,3,4,5,6,7,8,9,10};
        int search,c;
        System.out.println("Enter the number to search?");
        search=Sc.nextInt();
        Sc.close();
        for(c=0;c<10;c++){
            if(array[c]==search){
                System.out.println(search+" is present at location "+(c+1));
                break;
            }
        }
        if(c==10){
            System.out.println(search+" Not present in the array.");
        }
    }
}
*/
public static void main(String[] args) {
    int search;
    int[] array={1,2,3,4,5,6,7,8,9,10};
      Scanner Sc = new Scanner(System.in);
       System.out.println("Enter the number to search?");
        search=Sc.nextInt();
        Sc.close();
        int result= sequentialsearch(array,search);
        if(result==-1){
             System.out.println(search+" Not present in the array.");
        } else{
             System.out.println(search+" is present at location "+result);
        }
    }

                    public static int sequentialsearch(int []array, int search){
                    for (int c=0;c<10;c++){
                        if(array[c]==search){
                            c++;
                            return c;
                        }
                    }
                        return -1;
                    }
}