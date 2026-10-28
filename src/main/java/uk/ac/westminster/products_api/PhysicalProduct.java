package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it specialized from parent class.
// ShoppingCart (or Order) would NOT pass this test because it represents a 'HAS-A' relationship.
public class PhysicalProduct extends Product implements Discountable{

    private double weightKG;
    private String dimensions;
    private double discountedPrice;

    public PhysicalProduct() {

    }

    public PhysicalProduct(Long id, String name, double price, double weightKG, String dimensions) {
        super(id, name, price);
        this.weightKG = weightKG;
        this.dimensions = dimensions;

    }

    public double getWeightKG() {
        return weightKG;
    }

    public String getDimensions() {
        return dimensions;
    }

    @Override
    public String getSummary() {
        return "Physical: " + getName() + " | Weight: " + weightKG + "kg";
    }

    @Override
    public void applyDiscount(double rate) {
        // Physical products cap discount rates at 20% max using Math.min
        double cappedRate = Math.min(rate, 0.20);
        this.discountedPrice = getPrice() * (1 - cappedRate);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}

