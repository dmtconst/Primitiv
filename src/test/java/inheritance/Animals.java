package inheritance;

public class Animals {

    private String name;

    public Animals(String name){
        this.name=name;
    }

    public void eat(){
        System.out.println("Eating");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
