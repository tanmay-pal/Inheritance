public class InheritanceExample {

    public static void main(String[] args) {
        Programmer prog = new Programmer(1, "Rohit", "Programmer - Coding");
        System.out.println(prog.toString());
        
        Manager mgr = new Manager(2, "Rahul", "Manager - Management");
        System.out.println(mgr.toString());
    }

}

