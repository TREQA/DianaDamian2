public class Fourth {

    //constanta

    //pt a declara o constanta, folosesti termenul "final" sau "public static final"
    public static final double j= 3.14;

    int x;


    public static void main (String [] args){

        Fourth y= new Fourth();

        y.x= 11;

        System.out.println(y.x);

        //https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
        // pentru printf format models

        System.out.printf("x is %d", y.x);



    }

}
