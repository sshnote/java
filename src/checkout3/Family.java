package checkout3;

public class Family implements MemberType {
    @Override
    public int discount(int totalPrice) {
        return (int) (totalPrice * 0.1);
    }
}
