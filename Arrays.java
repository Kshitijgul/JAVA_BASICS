package Bootcamp;
import java.util.*;


public class Arrays {
    public static void main(String[] args) {
        //Arrays is derived datatype
//        Datatype array_name[] = new Datatype[length]
        System.out.println("Enter the Length Of Array : ");
        int n ;

        Scanner sn =new Scanner(System.in);
        n = sn.nextInt();
        int arr[] = new int[n];
//        arr[0]=1;
//        arr[1]=2;
//        arr[2]=3;
//        arr[3]=4;
//        This is the Wrong

//         Intialization
        for (int i=0;i<=arr.length-1;i++){
            arr[i]=i+1;
        }
        //Enhance For Loop
        for (int element:arr){      //Traversal OF Arrays
            System.out.println(element);

        }

    }
}
