package JavaOOPs.Inheritance;

public class childClass extends parentClass{

    public void display(){
        System.out.println("Child Class");
    }

    public void main(String[] args) {
        childClass ch = new childClass();
        ch.display();
        // Super is used inside non-static methods only
        super.display();
    }
}
