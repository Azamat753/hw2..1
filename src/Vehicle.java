public class Vehicle {

    private String name;
    private Color color;

    public Vehicle(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getInfo (){
        return (getName() + " " + getColor());
    }

    public void lights(){
        System.out.println("Светит фарами");
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }
}
