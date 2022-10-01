package hierarchyOfAnimals;

import java.util.Objects;

public abstract class Mammals extends Animals {
    String mammals = "млекопитающие";
    String livingEnvironment;
    int movementSpeed;

    public Mammals(String name, int age, String livingEnvironment, int movementSpeed) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
        this.movementSpeed = movementSpeed;
    }

    public abstract void walk();

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

    public static class Herbivores extends Mammals {
        String herbivores = "травоядное";
        String typeOfFood;
        String sleep;
        String moving;
        String walking;
        String grazing;

        public Herbivores(String name, int age, String livingEnvironment, int movementSpeed, String typeOfFood,
                          String sleep, String moving, String walking, String grazing) {
            super(name, age, livingEnvironment, movementSpeed);
            this.typeOfFood = Objects.requireNonNullElse(typeOfFood, "default");
            this.sleep = Objects.requireNonNullElse(sleep, "default");
            this.moving = Objects.requireNonNullElse(moving, "default");
            this.walking = Objects.requireNonNullElse(walking, "default");
            this.grazing = Objects.requireNonNullElse(grazing, "default");
        }

        public void informationAnimal() {
            System.out.print("Имя: " + name + ", животное: " + mammals + "-" + herbivores + ", возраст: " + age +
                    " (год), среда проживания: " + livingEnvironment + ", \nскорость перемещения: " + movementSpeed +
                    " км/ч, тип пищи: " + typeOfFood);
        }

        public String getTypeOfFood() {
            return typeOfFood;
        }

        public void setTypeOfFood(String typeOfFood) {
            this.typeOfFood = typeOfFood;
        }

        @Override
        public void eatSleepMove() {
            System.out.print(", еда: " + typeOfFood + ", спит: " + sleep + ", \nперемещается: " + moving);

        }

        @Override
        public void walk() {
            System.out.print(", гуляет: " + walking);

        }

        public void graze() {
            System.out.println(", пасётся: " + grazing + ".");

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

        public String getWalking() {
            return walking;
        }

        public void setWalking(String walking) {
            this.walking = walking;
        }

        public String getGrazing() {
            return grazing;
        }

        public void setGrazing(String grazing) {
            this.grazing = grazing;
        }
    }
    public static class Predators extends Mammals {
        String predators = "хищники";
        String typeOfFood;
        String sleep;
        String moving;
        String walking;
        String grazing;

        public Predators(String name, int age, String livingEnvironment, int movementSpeed, String typeOfFood,
                         String sleep, String moving, String walking, String grazing) {
            super(name, age, livingEnvironment, movementSpeed);
            this.typeOfFood = Objects.requireNonNullElse(typeOfFood, "default");
            this.sleep = Objects.requireNonNullElse(sleep, "default");
            this.moving = Objects.requireNonNullElse(moving, "default");
            this.walking =Objects.requireNonNullElse(walking, "default");
            this.grazing = Objects.requireNonNullElse(grazing, "default");
        }

        public void informationAnimal() {
            System.out.print("Имя: " + name + ", животное: " + mammals + "-" + predators + ", возраст: " + age +
                    " (год), среда проживания: " + livingEnvironment + ", \nскорость перемещения: " + movementSpeed +
                    " км/ч, тип пищи: " + typeOfFood);
        }

        public String getTypeOfFood() {
            return typeOfFood;
        }

        public void setTypeOfFood(String typeOfFood) {
            this.typeOfFood = typeOfFood;
        }

        @Override
        public void eatSleepMove() {
            System.out.print(", еда: " + typeOfFood + ", спит: " + sleep + ", \nперемещается: " + moving);

        }

        @Override
        public void walk() {
            System.out.print(", гуляет: " + walking);

        }

        public void graze() {
            System.out.println(", пасётся: " + grazing + ".");
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

        public String getWalking() {
            return walking;
        }

        public void setWalking(String walking) {
            this.walking = walking;
        }

        public String getGrazing() {
            return grazing;
        }

        public void setGrazing(String grazing) {
            this.grazing = grazing;
        }
    }
}
