package homeWork19.singleton;

public enum Services {

    GET_ID_PASSPORT("Getting id passport", 800),
    GET_FOREIGN_PASSPORT("Getting foreign passport", 1200),
    CHANGE_PASSPORT("Replacing old passport with new one", 400),
    REGISTRATION_FOP("Registration of a physical person - admission", 0),
    SOCIAL_ASSISTANCE_CHILD("Social assistance at the birth of a child", 0);

    private String name;
    private Integer price;

    Services(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }
}
