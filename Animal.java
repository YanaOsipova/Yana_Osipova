import java.text.ChoiceFormat;
import java.util.Arrays;
import java.util.Objects;

public abstract class Animal {
    protected String name;
    protected int age;
    protected int weight;
    protected String color;


    protected void say(){
        System.out.println("Я говорю");
    }

    protected void go(){
        System.out.println("Я иду");
    }

    protected void eat(){
        System.out.println("Я ем");
    }

    protected void drink(){
        System.out.println("Я пью");
    }


    @Override
    public String toString(){
        int ageLastNumber = this.age % 10;
        boolean isExclusion = (this.age % 100 >= 11) && (this.age % 100 <= 14);
        String old = "";
        if (ageLastNumber == 1)
            old = "год";
        else if(ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9)
            old = "лет";
        else if(ageLastNumber >= 2 && ageLastNumber <= 4)
            old = "года";
        if (isExclusion)
            old = "лет";
        return "Привет! Меня зовут "+ name+", мне "+ age+ " "+old+", я вешу - "+ weight+" кг, мой цвет - "+color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && weight == animal.weight && Objects.equals(name, animal.name) && Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight, color);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
