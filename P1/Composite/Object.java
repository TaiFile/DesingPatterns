public class Object extends Element {
    public Object(String description, int price) {
        super(description, price);
    }
    @Override
    public int CalculatePrice() {
        return getPrice();
    }

    @Override
    public void showContent() {
        System.out.println("Object: " + getDescription() + ", Price: " + getPrice());
    }
}
