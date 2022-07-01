public class Age {
    int age = 5;
    int ageLastNumber = age % 10;
    String old;
    public static void appendAge(int age, int ageLastNumber, String old){
        boolean exclusion = (age % 100 >= 11) && (age % 100 <= 14);
        if (ageLastNumber == 1)
            old = "год";
        else if(ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9)
            old = "лет";
        else if(ageLastNumber >= 2 && ageLastNumber <= 4)
            old = "года";
    }
    String myAge = age + old;
}
