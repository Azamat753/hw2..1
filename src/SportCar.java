import com.sun.source.tree.NewArrayTree;

public final class SportCar extends Car {
    private int speed;

    public SportCar(String name, Color color, int wheels, double volume, int speed) {
        super(name, color, wheels, volume);
        this.speed = speed;
    }

    @Override
    public String getInfo() {
        return (super.getInfo()+ " " + getSpeed());
    }

    @Override
    public void lights() {
        System.out.println("Переключает скорость");
    }

    public int getSpeed() {
        return speed;
    }
}


