package hierarchyOfAnimals;

import java.util.Objects;

public abstract class Animals {
    private final String name;
    int age;

    public Animals(String name, int age) {
        this.name = Objects.requireNonNullElse(name, "default");
        this.age = Objects.requireNonNullElse(age, 0);
    }
    public abstract void eatSleepMove();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
