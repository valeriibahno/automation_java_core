package homeWork3.task3;

public class Wheel {

    private int radius;
    private String season;
    private boolean isSpiked;

    public Wheel(int radius, String season, boolean isSpiked) {
        this.radius = radius;
        this.season = season;
        this.isSpiked = isSpiked;
    }

    public int getRadius() {
        return radius;
    }

    public String getSeason() {
        return season;
    }

    public boolean isSpiked() {
        return isSpiked;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setIsSpiked(boolean isSpiked) {
        this.isSpiked = isSpiked;
    }

    @Override
    public String toString() {
        return "wheel: radius - " + radius + ", season - " + season + ", spiked - " + (isSpiked ? "yes" : "no");
    }

    public void kindOfWheelYouNeed(String season) {

        switch (season) {
            case "Winter":
                System.out.println("You need winter tires, preferably spiked");
                break;
            case "Spring":
                System.out.println("You need an all-season or summer tire");
                break;
            case "Summer":
                System.out.println("You need a summer tire");
                break;
            case "Autumn":
                System.out.println("You need an all-season tire");
                break;
            default:
                System.out.println("You specified a non-existent season, please try again");
        }
    }

    public void chooseWheel(boolean isSpiked) {
        if(isSpiked) {
            System.out.println("Spiked tire");
        }
        else {
            System.out.println("Non-spiked tire");
        }
    }
}
