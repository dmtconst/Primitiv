package metods;

import inheritance.AnimalColor;
import inheritance.Animals;

public class Pig extends Animals implements AnimalColor {
    private String name = "Naf-Naf";

    public Pig(String name) {
        super(name);
    }

    public void say(){
        System.out.println("Xru-xru");
    }

    public String getName() {
        return name;
    }

    public void getColor(){
        System.out.println("Pink");
    }


    @Override
    public void getHobbie(){
        System.out.println("Eating");
    }


}
