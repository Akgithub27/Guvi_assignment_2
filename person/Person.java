package person;

public class Person {
    private String name;
    private int age=18;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display(){
        System.out.println("My Name is : "+this.name+" .I am "+this.age+" years old.");
    }

    public static void main(String[] args) {
        Person aakash = new Person("aakash",25);
        aakash.display();
    }
}
