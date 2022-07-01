public class Duck extends Animal implements Flying{

    @Override
    public void say(){
        System.out.println("Я говорю 'Кря'");
    }

    @Override
    public void fly() {
        System.out.println("Я лечу!");
    }
}
