import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//         USING PRINT WITH NUMBER:
        System.out.println("reem");
        System.out.println(12);
        System.out.println(10.2);
        System.out.println(true);

        System.out.println(2+2);
        System.out.println(2-1);
        System.out.println(8/2);
        System.out.println(3*3);

        System.out.println(5/2);
        System.out.println(0.5/2);
        System.out.println(5/0.2);
        System.out.println(0.5/0.2);

        System.out.println(5>2);
        System.out.println(5<2);
        System.out.println(5==5);
        System.out.println(5!=6);

//      USING PRINT WITH LATTER:
        System.out.println(" j a v a ");
        System.out.println(" jj aa vv aa ");
        System.out.println(" jjj aaa vvv aaa ");
        System.out.println(" jjjj aaaa vvvv aaaa ");

        System.out.println("  _   _   _ ");
        System.out.println(" |_| |_| |_| ");
        System.out.println(" |_| |_| |_| ");
        System.out.println(" |_| |_| |_| ");


        System.out.println("  __   __   __ ");
        System.out.println(" |  | |  | |  | ");
        System.out.println("  __   __   __ ");
        System.out.println(" |  | |  | |  | ");
        System.out.println("  __   __   __ ");
        System.out.println(" |  | |  | |  | ");
        System.out.println("  __   __   __ ");

//        USING PRINT  :
//        System.out.println(4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)));
//
//        System.out.println(" o o o m m m m m m m ");
//        System.out.println(" o o o m m m m m m m ");
//        System.out.println(" o o o a a a a a a a ");
//        System.out.println(" o o o a a a a a a a ");
//        System.out.println(" o o o n n n n n n n ");
//        System.out.println(" o o o n n n n n n n ");
//
//        third quation :
//        int x = 500;
//        double y = 3.60;
//        boolean re = true;
//        String tr = "reem";
//
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(re);
//        System.out.println(tr);
//        four quation :
//        Scanner reed = new Scanner(System.in);
//        System.out.println("please enter your name: ");
//        String name = reed.next();
//        System.out.println(" welcome " + name);

//        five quation :
//        Scanner reed = new Scanner(System.in);
//        System.out.println("welcome to our system  ");
//        System.out.println("please enter first number: ");
//        double num1 = reed.nextDouble();
//        System.out.println("please enter second number: ");
//        double num2 = reed.nextDouble();
//        System.out.println( "ADDITION " + (num1 + num2));
//        System.out.println( "MULTIPLICATION " + (num1 * num2));
//        System.out.println( "SUBSTRACT " + (num1 - num2));
//        System.out.println("DIVISION " + (num1 / num2));
//
//        Scanner reed = new Scanner(System.in);
//        System.out.println("welcome to our system  ");
//        System.out.println("please enter RADIUS: ");
//        double ip = 3.14;
//        double rad = reed.nextDouble();
//        double area = ip * (rad * rad) ;
//        double par = (2 * ip * rad);
//        System.out.println(" Area =  " + area);
//        System.out.println(" parimeter =  " + par);
//

//        Scanner reed = new Scanner(System.in);
//        System.out.println("welcome to our system  ");
//        System.out.println("please enter first number: ");
//        double fir = reed.nextDouble();
//        System.out.println("please enter second number: ");
//        double sec = reed.nextDouble();
//        System.out.println("please enter third number: ");
//        double thir = reed.nextDouble();
//        System.out.println( " The average number is : " + (fir + sec + thir)/ 3 );


//        Scanner reed = new Scanner(System.in);
//        System.out.println("welcome to our system  ");
//        System.out.println("please enter length: ");
//        double len = reed.nextDouble();
//        System.out.println("please enter Width: ");
//        double wit = reed.nextDouble();
//        double area = len * wit ;
//        double par = (2*wit + 2*len);
//        System.out.println(" Area =  " + area);
//        System.out.println(" parimeter =  " + par);

//      QUATION 4
        Scanner reed = new Scanner(System.in);
        System.out.println("welcome to our system  ");
        System.out.println("please enter first number : ");
        int fir = reed.nextInt();
        System.out.println("please enter second number : ");
        int sec = reed.nextInt();
        int x = fir;
        System.out.println(" FIRST NUMBER =  " + sec);
        System.out.println(" SECOND NUMBER =  " + x);

//        using OR, AND , NOT
        System.out.println(true && true || true || true && false);
        System.out.println(!(true && true) || false && true || !true);
        System.out.println(!(!(true && false) || false) || true && false || true);



//      If statement
        int x = 5;
        int y = 6;

        if (x>y) {
            System.out.println("x is grater than y ");
        }
        else {
            System.out.println(" y is grater than x");
        }
        int x = 5;
        int y = 6;

        if (x > y) {
            System.out.println("x is grater than y ");
        } else if (x == y) {
            System.out.println(" y is equal x");
        } else {
            System.out.println(" error");


        }



//      If statement with scanner
        Scanner reed = new Scanner(System.in);
        System.out.println("please enter first number: ");
        int num1 = reed.nextInt();
        System.out.println("please enter second number: ");
        int num2 = reed.nextInt();
        System.out.println("please enter third number: ");
        int num3 = reed.nextInt();
         if (num1 > num2 && num1> num3) {
             System.out.println("first  is grater number  ");
         } else if (num2 > num3 && num2> num1) {
             System.out.println("second is grater number  ");
         } else if ( num3 > num1 && num3 > num2) {
             System.out.println("third is grater number  ");
         } else {
             System.out.println("error ");
         }
        Scanner reed = new Scanner(System.in);
        System.out.println("please enter first number: ");
        int num1 = reed.nextInt();
        System.out.println("please enter second number: ");
        int num2 = reed.nextInt();
        System.out.println("please enter opration: ");
        int result;
        String opration = reed.next();
        if ( opration.equals("+")) {
            result = num1 +num2;
            System.out.println( "result of = " +result);
        } else if ( opration.equals("-")){
            result = num1 - num2;
            System.out.println( "result of = " +result);

        }
        else if ( opration.equals("/")){
            result = num1 / num2;
            System.out.println( "result of = " +result);

        } else if ( opration.equals("*")){
            result = num1 * num2;
            System.out.println( "result of = " +result);

        } else {
            System.out.println( "error");
        }


//      If statement with scanner
        Scanner reed = new Scanner(System.in);
        System.out.println("please enter first subjact: ");
        int sub1 = reed.nextInt();
        System.out.println("please enter second subjact: ");
        int sub2 = reed.nextInt();
        System.out.println("please enter third subjact: ");
        int sub3 = reed.nextInt();
        System.out.println("please enter fourth subjact: ");
        int sub4 = reed.nextInt();
        System.out.println("please enter fifth subjact: ");
        int sub5 = reed.nextInt();
        int grad;
        grad = ((sub1 + sub2 + sub3 + sub4 + sub5) / 5);
             if (grad >= 90 && grad <= 100) {
                 System.out.println("the grad = " + grad + " A ");
             } else if (grad >= 80 && grad <= 100) {
                 System.out.println("the grad = " + grad + " B ");
             } else if (grad >= 70  && grad <= 100) {
                 System.out.println("the grad = " + grad + " C ");
             } else if (grad >= 50 && grad <= 100) {
                 System.out.println("the grad = " + grad + " D ");
             } else {
                 System.out.println("error ");
             }

//        Scanner reed = new Scanner(System.in);
//        System.out.println("please enter first number: ");
//        int num1 = reed.nextInt();
//        System.out.println("please enter second number: ");
//        int num2 = reed.nextInt();
//        System.out.println("please enter third number: ");
//        int num3 = reed.nextInt();
//        System.out.println("please enter opration1: ");
//        String opration1 = reed.next();
//        System.out.println("please enter opration2: ");
//        String opration2 = reed.next();
//        int result;
//        int re1;
//        int re2;
//        if (opration1.equals("+") && opration2.equals("+")) {
//            result = num1 + num2 + num3;
//            System.out.println("result of = " + result);
//        } else if (opration1.equals("-") && opration2.equals("-")) {
//            result = num1 - num2 - num3;
//            System.out.println("result of = " + result);
//
//        } else if (opration1.equals("/") && opration2.equals("/")) {
//            result = num1 / num2 / num3;
//            System.out.println("result of = " + result);
//
//        }else if ( opration1.equals("*") && opration2.equals("*")) {
//            result = num1 * num2 * num3;
//            System.out.println("result of = " + result);
//        } else if ( opration1.equals("+") || opration1.equals("-")  && opration2.equals("*") || opration2.equals("/")) {
//            re1 = num2 * num3 + num1;
//            re2 = num2 / num3 - num1;
//            System.out.println("result of = " + re1);
//            System.out.println("result of = " + re2);
        }



        }
    }



