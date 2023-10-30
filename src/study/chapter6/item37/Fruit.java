package study.chapter6.item37;

public class Fruit {
    enum Color {RED, GREEN, YELLOW};

    final String name;
    final Color color;

    public Fruit(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return name;
    }
}
