import java.util.ArrayList;
import java.util.List;

public class Box extends Element{
    private List<Element> elements = new ArrayList<>();


    public Box(String description, int price) {
        super(description, price);
    }
    public List<Element> getElements() {
        return elements;
    }
    @Override
    public int CalculatePrice() {
        int totalPrice = getPrice();
        for (Element element : elements) {
            totalPrice += element.CalculatePrice();
        }
        return totalPrice;
    }

    @Override
    public void showContent() {
        for(Element elements : elements) {
            System.out.println("Box: " + getDescription() + ", Base Price: " + getPrice());
            System.out.println("Contents of the box:");
        }
        System.out.println("Total Price: " + CalculatePrice());
    }

    @Override
    public void add(Element element) {
        if(this.equals(element)) {
            throw new UnsupportedOperationException("Cannot add a box to itself.");
        }
        if (elements.contains(element)) {
            throw new UnsupportedOperationException("Element already exists in the box.");
        }
        elements.add(element);
    }

    @Override
    public void remove(Element element) {
        elements.remove(element);
    }
}
