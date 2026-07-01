package oops;

public class animal {
    String name;
    String species;
    public animal(String n,String s)
    {
        this.name=n;
        this.species=s;
    }
    public void makesound()
    {
        System.out.println("The "+species+" named "+name+" makes a sound!");
    }
    public static void main(String[] args) {
        animal a = new animal("tiger","cat");
        a.makesound();
    }
}