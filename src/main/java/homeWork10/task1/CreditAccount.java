package homeWork10.task1;

public class CreditAccount extends Account<Integer> {

    public CreditAccount(Integer id, double sum) {
        super(id, sum);
    }

    @Override
    public String toString() {
        return "CreditAccount: [id = '" + getId() + "', sum = '" + getSum() + "']";
    }
}
