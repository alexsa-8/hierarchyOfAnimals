package hierarchyOfAnimals;

import java.util.Objects;

public abstract class Birds extends Animals{
    private final String birds = "птицы";
    String livingEnvironment;
    String hunting;

    public Birds(String name, int age, String livingEnvironment, String hunting) {
        super(name, age);
        this.livingEnvironment = Objects.requireNonNullElse(livingEnvironment, "default");
        this.hunting=Objects.requireNonNullElse(hunting, "default");
    }

    public String getBirds() {
        return birds;
    }

    public abstract void hunting();
}
