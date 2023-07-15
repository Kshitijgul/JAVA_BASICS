package JAVA_ASSIGNMENTS;

public class program_01_Basics {
    public static void main(String[] args) {
        System.out.print("Hello Iam A Kshitij  ");
//        Println Means it will be printed on new line
        System.out.println("Gul");
        System.out.println("Welcome to my Profile ");
        int x =10;
        int y = 20;
        System.out.println(x+y);
        System.out.println("The value of X + Y :" + x+y); //This will give wrong Output
        //In machine Things are working left to right
        System.out.println(x+y+"This is the sum !") ;
        System.out.println("----------------------------------------------------------------------");

        //INCREMENT AND DECREMENT OPERATORS
        x++; // It is Equal To x+1
        y--; // It is equal to y-1
        System.out.println(x++);// print the current the value of x then Update
        System.out.println("This is Increasse by One :" +x);//11
        System.out.println("This is Decrease by One : " +y);//19


        --y;// 18
        System.out.println(++x);//First Update then Print
        System.out.println("This is Increasse by One :" +x);
        System.out.println("This is Decrease by One : " +y);
    }
}
