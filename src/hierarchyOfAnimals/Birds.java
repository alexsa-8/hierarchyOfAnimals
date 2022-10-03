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

    public static class NotFlying extends Birds {
        private final String notFlying = "нелетающие";
        String typeOfMovement;
        String walking;
        String typeOfFood;
        String sleep;
        String moving;

        public NotFlying(String name, int age, String livingEnvironment, String hunting, String typeOfMovement,
                         String walking, String typeOfFood, String sleep, String moving) {
            super(name, age, livingEnvironment, hunting);
            this.typeOfMovement = Objects.requireNonNullElse(typeOfMovement, "default");
            this.walking = Objects.requireNonNullElse(walking, "default");
            this.typeOfFood = Objects.requireNonNullElse(typeOfFood, "default");
            this.sleep = Objects.requireNonNullElse(sleep, "default");
            this.moving = Objects.requireNonNullElse(moving, "default");
        }

        public void informationAnimal() {
            System.out.print("Имя: " + getName() + ", животное: " + getBirds() + "-" + notFlying + ", возраст: " + age +
                    " (год), среда проживания: " + livingEnvironment + ", \nтип передвижения: " + typeOfMovement);
        }
        @Override
        public void eatSleepMove() {
            System.out.print(", еда: " + typeOfFood + ", спит: " + sleep + ", перемещается: " + moving);
        }

        @Override
        public void hunting() {
            System.out.print(", \nохотится: "+hunting);

        }

        public void walk() {
            System.out.println(", гуляет: " + walking + ".");
        }

        public String getTypeOfMovement() {
            return typeOfMovement;
        }

        public void setTypeOfMovement(String typeOfMovement) {
            this.typeOfMovement = typeOfMovement;
        }

        public String getWalking() {
            return walking;
        }

        public void setWalking(String walking) {
            this.walking = walking;
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
    }

    public static class Flying extends Birds {
        private final String flying = "нелетающие";
        String typeOfMovement;
        String walking;
        String typeOfFood;
        String sleep;
        String moving;

        public Flying(String name, int age, String livingEnvironment, String hunting, String typeOfMovement,
                      String walking, String typeOfFood, String sleep, String moving) {
            super(name, age, livingEnvironment, hunting);
            this.typeOfMovement =Objects.requireNonNullElse(typeOfMovement, "default");
            this.walking = Objects.requireNonNullElse(walking, "default");
            this.typeOfFood = Objects.requireNonNullElse(typeOfFood, "default");
            this.sleep =Objects.requireNonNullElse(sleep, "default");
            this.moving = Objects.requireNonNullElse(moving, "default");
        }

        public void informationAnimal() {
            System.out.print("Имя: " + getName() + ", животное: " + getBirds() + "-" + flying + ", возраст: " + age +
                    " (год), среда проживания: " + livingEnvironment + ", \nтип передвижения: " + typeOfMovement);
        }
        @Override
        public void eatSleepMove() {
            System.out.print(", еда: " + typeOfFood + ", спит: " + sleep + ", перемещается: " + moving);
        }

        @Override
        public void hunting() {
            System.out.print(", \nохотится: "+hunting);

        }

        public void walk() {
            System.out.println(", летает: " + walking + ".");
        }


        public String getTypeOfMovement() {
            return typeOfMovement;
        }

        public void setTypeOfMovement(String typeOfMovement) {
            this.typeOfMovement = typeOfMovement;
        }

        public String getWalking() {
            return walking;
        }

        public void setWalking(String walking) {
            this.walking = walking;
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
    }
}
