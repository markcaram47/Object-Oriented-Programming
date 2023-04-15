
public class Main {
    public static void main(String[] args) {
        
        Parent p = new Parent();
        Child1 c1 = new Child1 ();
        Child2 c2 = new Child2 ();
        
        //PARENT DETAILS
        p.Attitude = "Jolly";
        p.HairColor = "Gray";
        p.BloodType = "A+";
        p.Property = "BMW";
        
        //CHILD1 DETAILS
        c1.Attitude = "Moody";
        c1.HairColor = "Black";
        c1.BloodType = "AB+";
        c1.Property = "BMW";
        c1.Name = "Andrew";
        c1.Age = 42;
        c1.Birthday = "July 12, 1980";
        
        //CHILD2 DETAILS
        c2.Attitude = "Jolly";
        c2.HairColor = "Gray";
        c2.BloodType = "O+";
        c2.Property = "Toyota Trueno";
        c2.Name = "Liza";
        c2.Age = 23;
        c2.Birthday = "August 19, 2000";
        
        System.out.println("PARENT: ");
        p.parentAttributes();
        
        System.out.println("CHILD 1: ");
        c1.childAttributes();
        
        System.out.println("CHILD 2: ");
        c2.childAttributes();
  
    }
}
