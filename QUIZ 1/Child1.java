
public class Child1 extends Parent {
    String Name, Birthday;
    int Age;
    
    void childAttributes (){
    parentAttributes();
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Birthday: " + Birthday);
        System.out.println("");
    }
}
