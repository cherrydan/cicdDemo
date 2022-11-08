public class Animal {
    boolean hungry = true;

    int age;

    String name;

    public void eat() { hungry = false; }
    public void stateOlder() { age++; }

    public String getName() { return this.name; }
}
