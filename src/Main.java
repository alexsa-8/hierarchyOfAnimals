import hierarchyOfAnimals.Amphibians;
import hierarchyOfAnimals.Birds;
import hierarchyOfAnimals.Mammals;

public class Main {
    public static void main(String[] args) {
        Mammals.Herbivores gazelle=new Mammals.Herbivores("Газель", 3, "суша",
                40, "трава, растения", "ночью", "скачками",
                "стадо", "степь");
        Mammals.Herbivores giraffe=new Mammals.Herbivores("Жираф", 5, "суша",
                15, "трава, растения", "ночью", "бег",
                "не большое стадо", "саванна");
        Mammals.Herbivores horse=new Mammals.Herbivores("Лошадь", 6, "суша",
                35, "трава, растения", "ночью", "бег",
                "стадо", "поле");
        Mammals.Predators hyena=new Mammals.Predators("Гиена", 3, "суша",
                15, "мясо, падаль", "днём", "бег",
                "стая", "степь");
        Mammals.Predators tiger=new Mammals.Predators("Тигр", 7, "суша",
                50, "мясо", "днём", "бег",
                "семья", "степь");
        Mammals.Predators bear=new Mammals.Predators("Медведь", 5, "суша",
                10, "растения, мёд, рыбу", "ночью", "бег",
                "один", "лес");
        Amphibians frog=new Amphibians("Лягушка", 1, "река, озеро",
                "мухи, комары",  "ночью", "прыжками и вплавь",
                "выжидающая позиция");
        Amphibians already=new Amphibians("Уж пресноводный", 2, "река, озеро",
                "лягушки, тритоны",  "ночью", "ползёт и вплавь",
                "нападающая позиция");
        Birds.NotFlying peacock=new Birds.NotFlying("Павлин", 3, "суша",
                "на насекомых", "пешком", "саванна", "травяные растения",
                "ночью", "небольшими стаями");
        Birds.NotFlying penguin=new Birds.NotFlying("Пингвин", 2, "суша и вода",
                "на рыбу", "пешком и вплавь", "северный и южный полюс", "рыба",
                "ночью", "стаями");
        Birds.NotFlying dodoBird=new Birds.NotFlying("Птица додо", 3, "суша",
                "на насекомых", "пешком", "саванна", "травяные растения",
                "ночью", "небольшими стаями");
        Birds.Flying seagull=new Birds.Flying("Чайка", 3, "прибрежные районы",
                "на рыбу", "летает и пешком", "море, берег", "рыба",
                "ночью", "стаями");
        Birds.Flying albatross=new Birds.Flying("Альбатрос", 7, "прибрежные районы",
                "на рыбу", "летает и пешком", "море, берег", "рыба",
                "ночью", "один");
        Birds.Flying falcon=new Birds.Flying("Сокол", 5, "поля, луга",
                "на грызунов", "летает и пешком", "равнины", "грызуны",
                "ночью", "один");


        gazelle.informationAnimal();
        gazelle.eatSleepMove();
        gazelle.walk();
        gazelle.graze();
        giraffe.informationAnimal();
        giraffe.eatSleepMove();
        giraffe.walk();
        giraffe.graze();
        horse.informationAnimal();
        horse.eatSleepMove();
        horse.walk();
        horse.graze();
        hyena.informationAnimal();
        hyena.eatSleepMove();
        hyena.walk();
        hyena.graze();
        tiger.informationAnimal();
        tiger.eatSleepMove();
        tiger.walk();
        tiger.graze();
        bear.informationAnimal();
        bear.eatSleepMove();
        bear.walk();
        bear.graze();
        frog.informationAnimal();
        frog.eatSleepMove();
        frog.hunting();
        already.informationAnimal();
        already.eatSleepMove();
        already.hunting();
        peacock.informationAnimal();
        peacock.eatSleepMove();
        peacock.hunting();
        peacock.walk();
        penguin.informationAnimal();
        penguin.eatSleepMove();
        penguin.hunting();
        penguin.walk();
        dodoBird.informationAnimal();
        dodoBird.eatSleepMove();
        dodoBird.hunting();
        dodoBird.walk();
        seagull.informationAnimal();
        seagull.eatSleepMove();
        seagull.hunting();
        seagull.walk();
        albatross.informationAnimal();
        albatross.eatSleepMove();
        albatross.hunting();
        albatross.walk();
        falcon.informationAnimal();
        falcon.eatSleepMove();
        falcon.hunting();
        falcon.walk();
    }
}