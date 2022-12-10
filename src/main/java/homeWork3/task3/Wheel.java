package homeWork3.task3;

public class Wheel {

    private int radius;
    private String reason;
    private boolean isSpiked;

    public Wheel(int radius, String reason, boolean isSpiked) {
        this.radius = radius;
        this.reason = reason;
        this.isSpiked = isSpiked;
    }

    public int getRadius() {
        return radius;
    }

    public String getReason() {
        return reason;
    }

    public boolean isSpiked() {
        return isSpiked;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setIsSpiked(boolean isSpiked) {
        this.isSpiked = isSpiked;
    }

    @Override
    public String toString() {
        return "колеса: ромір - " + radius + ", сезон - " + reason + ", шипована - " + (isSpiked ? "так" : "ні");
    }

    public void kindOfWheelYouNeed(String reason) {

        switch (reason) {
            case "Winter":
                System.out.println("Вам потрібна зимова гума, бажано шипована");
                break;
            case "Spring":
                System.out.println("Вам потрібна всесезона або літня гума");
                break;
            case "Summer":
                System.out.println("Вам потрібна літня гума");
                break;
            case "Autumn":
                System.out.println("Вам потрібна всесезона гума");
                break;
            default:
                System.out.println("Ви вказали неіснуючу пори року, спробуйте ще раз");
        }
    }

    public void chooseWheel(boolean isSpiked) {
        if(isSpiked) {
            System.out.println("Шипована гума");
        }
        else {
            System.out.println("Нешипована гума");
        }
    }
}
