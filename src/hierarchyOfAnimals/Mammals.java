package hierarchyOfAnimals;

public abstract class Mammals extends Animals {
    private final String mammals = "млекопитающие";
    String livingEnvironment;
    int movementSpeed;

    public Mammals(String name, int age, String livingEnvironment, int movementSpeed) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
        this.movementSpeed = movementSpeed;
    }

    public abstract void walk();

    public String getMammals() {
        return mammals;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }
}
