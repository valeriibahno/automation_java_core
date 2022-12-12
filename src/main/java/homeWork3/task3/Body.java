package homeWork3.task3;

public class Body {

    private String type;
    private String colour;
    private boolean isCrashed;

    public Body(String type, String colour, boolean isCrashed) {
        this.type = type;
        this.colour = colour;
        this.isCrashed = isCrashed;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public boolean isCrashed() {
        return isCrashed;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setIsCrashed(boolean isCrashed) {
        this.isCrashed = isCrashed;
    }

    @Override
    public String toString() {
        return "body: type - " + type + ", colour - " + colour + ", isCrashed - " + (isCrashed ? "yes" : "no");
    }

    public void changeColour(String newColour) {
        if(this.colour.equals(newColour)) {
            System.out.println("Current body color");
        }
        else {
            System.out.println("New body color: " + newColour);
        }
    }
}
