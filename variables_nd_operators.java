package JAVA_BASICS;

public class variables_nd_operators {
    public static void main(String[] args) {
//        **VARIABLES**
        int x = 500;
        System.out.println(x);
        x = 300;
        System.out.println(x);
        System.out.println(x+10);
        x=x+50;
        System.out.println(x);
        //        We can write the code with also this
        System.out.println("sum "+ x);

//        *******OPERATORS*****
        System.out.println("************** ARITHIMETIC OPERATORS   **************");
        int a , b;
        a = 50;
        b = 10;
        System.out.print("Sum :");
        System.out.println(a+b);
        System.out.print("Subtract :");
        System.out.println(a-b);
        System.out.print("Multiply :");
        System.out.println(a*b);
        System.out.print("Reminder :");
        System.out.println(a/b);
        System.out.println("*******************************************");
//        Below two Lines Will give Deffernt Output
        System.out.println("This is Sum : " + a+b );
        System.out.println( a+b + "This is Sum  ");
        System.out.println("*******************************************");
//        Increment and Decrement Operators
        System.out.println("====Increment and Decrement Operators==== ");
        int i = 10;
        int j= 15 ;
        i++; // It is Equal To x+1
        j--; // It is equal to y-1
        System.out.println(i++);// print the current the value of x then Update
        System.out.println("This is Increasse by One :" +i);//11
        System.out.println("This is Decrease by One : " +j);//19


        --i;// 18
        System.out.println(++x);//First Update then Print
        System.out.println("This is Increasse by One :" +i);
        System.out.println("This is Decrease by One : " +j);
        int k=20;
        System.out.println(k++);
        System.out.println("K value will be "+k);



    }
}
