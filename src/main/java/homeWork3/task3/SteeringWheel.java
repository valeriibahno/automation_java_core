package homeWork3.task3;

public class SteeringWheel {

    private String colour;
    private int diameter;
    private boolean isLeather;

    public SteeringWheel(String colour, int diameter, boolean isLeather) {
        this.colour = colour;
        this.diameter = diameter;
        this.isLeather = isLeather;
    }

    public String getColour() {
        return colour;
    }

    public int getDiameter() {
        return diameter;
    }

    public boolean isLeather() {
        return isLeather;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setIsLeather(boolean isLeather) {
        this.isLeather = isLeather;
    }

    @Override
    public String toString() {
        return "steering Wheel: colour - " + colour + ", diameter - " + diameter + ", leather cover - " + (isLeather ? "yes" : "no");
    }

    public void spinsSteeringWheel(int number) {
        System.out.println("The number of revolutions of the steering wheel: " + this.diameter * number);
    }
}
