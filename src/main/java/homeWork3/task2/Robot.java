package homeWork3.task2;

public class Robot {

    public String name;
    public String action;

    public Robot(String name, String action) {
        this.name = name;
        this.action = action;
    }

    public Robot() {
        this.name = "Robot";
        this.action = "просто працюю";
    }

    public void work () {
        System.out.println("Я " + this.name + " - я " + this.action);
    }
}
