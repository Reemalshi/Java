// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

// Object-Oriented Programming:

public class Main {
    public static void main(String[] args) {
        Information x = new Information();
        x.fivnumber=4;
        x.age=26;
        x.ht=1.590;
        x.name= "reem";
        x.lastname= "alshihi";
        x.printall();
        Information y = new Information();
        Information n = new Information();
        x.printall();
        Information K = new Information(26,"reem");



    }
}
class Information {
    Information(){
        System.out.println("welcome:");
    }
    Information(int a, String b){
        age=a;
        name=b;
        System.out.println(a + " " +b);
    }
    int fivnumber;
    String name;
    int age;
    double ht;
    String lastname;

void printall() {
        System.out.println("my fivriat number is "+fivnumber);
        System.out.println("my name is "+name);
        System.out.println("my age is "+age);
        System.out.println("my hight is "+ht);
        System.out.println("my last name is "+lastname);
    }
}