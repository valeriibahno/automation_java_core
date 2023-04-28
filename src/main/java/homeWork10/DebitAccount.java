package homeWork10;

public class DebitAccount extends Account<String> {

    public DebitAccount(String id, double sum) {
        super(id, sum);
    }

    @Override
    public String toString() {
        return "DebitAccount: [id = '" + getId() + "', sum = '" + getSum() + "']";
    }
}
