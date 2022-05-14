package demo1;

public class Child extends Parent{
    public Child() {
    }

    public Child(String name, int age) {
        super(name, age);
    }

    public void drawShape(){
        for (int i = 0; i < 5; i++) {
            System.out.println("**********");
        }
    }

}
