package Inheritance;

public class Cat extends Animals implements AnimalColor{
    public Cat(String name) {
        super(name);
    }


    public void say(){
        System.out.println("Myau");
    }

    @Override
    public void getColor() {
        System.out.println("Black");
    }

    @Override
    public void getHobbie() {
        System.out.println("Sleeping");
    }

}
