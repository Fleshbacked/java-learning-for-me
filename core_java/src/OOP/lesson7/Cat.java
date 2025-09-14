package OOP.lesson7;

public class Cat {
    String color;
    double weight;
    String ownerName;
    public Cat (String colorCat, double weightCat, String owner) {
        this.color = colorCat;
        this.weight = weightCat;
        this.ownerName = owner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
