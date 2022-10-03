package hierarchyOfAnimals;

import java.util.Objects;

public class Amphibians extends Animals{
    private final String amphibians = "земноводные";
    String livingEnvironment;
    String typeOfFood;
    String sleep;
    String moving;
    String hunting;

    public Amphibians(String name, int age, String livingEnvironment, String typeOfFood, String sleep, String moving, String hunting) {
        super(name, age);
        this.livingEnvironment = Objects.requireNonNullElse(livingEnvironment, "default");
        this.typeOfFood = Objects.requireNonNullElse(typeOfFood, "default");
        this.sleep = Objects.requireNonNullElse(sleep, "default");
        this.moving = Objects.requireNonNullElse(moving, "default");
        this.hunting = Objects.requireNonNullElse(hunting, "default");
    }

    public void informationAnimal() {
        System.out.print("Имя: " + getName() + ", "+amphibians+", возраст: " + age +
                " (год), среда проживания: " + livingEnvironment);
    }

    @Override
    public void eatSleepMove() {
        System.out.print(", еда: " + typeOfFood + ", \nспит: " + sleep + ", перемещается: " + moving);
    }
    public void hunting(){
        System.out.println(", охотится: "+hunting+".");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public String getSleep() {
        return sleep;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }

    public String getMoving() {
        return moving;
    }

    public void setMoving(String moving) {
        this.moving = moving;
    }

    public String getHunting() {
        return hunting;
    }

    public void setHunting(String hunting) {
        this.hunting = hunting;
    }
}
