package homeWork10.task1;

public class User implements Comparable<User> {

    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User: [name = '" + this.name + "', age = '" + this.age + "']";
    }

    @Override
    public int compareTo(User o) {
        return this.name.compareTo(o.getName());
    }
}
