package homeWork9.task1;

public class Account {

    private Integer id;

    public Account(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account: [id = '" + id + "']";
    }
}
