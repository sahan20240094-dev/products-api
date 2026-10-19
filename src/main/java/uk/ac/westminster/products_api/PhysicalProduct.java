package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it specialized from parent class.
// ShoppingCart (or Order) would NOT pass this test because it represents a 'HAS-A' relationship.
public class PhysicalProduct extends Product{

    private double weightKG;
    private String dimensions;

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
}

