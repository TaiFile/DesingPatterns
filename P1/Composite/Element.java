public abstract class Element{
    protected String description;
    protected  int price;

    public Element(String description, int price) {
        this.description = description;
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public int getPrice() {
        return price;
    }
    public abstract int CalculatePrice();
    public abstract void showContent();
    public void add(Element element){
        throw new UnsupportedOperationException("This operation is not supported for this element.");
    }
    public  void remove(Element element){
        throw new UnsupportedOperationException("This operation is not supported for this element.");
    }
}