public  class Car extends Vehicle {
    private int wheels;
    private double volume;

    public Car(String name, Color color, int wheels, double volume) {
        super(name, color);
        this.wheels = wheels;
        this.volume = volume;
    }

    @Override
    public String getInfo() {
        return (super.getInfo() + " "+ getWheels() + " " + getVolume() );
    }

    @Override
    public void lights() {
        System.out.println("Мигает фарами");
    }

    public final void transmission (String transmission, int number){
        for (int i = 0; i <number ; i++) {
            System.out.println("Переключает коробку передач");
        }
    }

    public int getWheels() {
        return wheels;
    }

    public double getVolume() {
        return volume;
    }

}





