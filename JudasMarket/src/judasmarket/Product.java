
package judasmarket;


public class Product {
    private String productName;
    private String productColor;
    private String productCategory;
    private double stockCount;
    private double weight;
    private String description;
    private double price;
    
    public Product(String productName, String productColor, String productCategory, double stockCount, double weight, String description , double price) {
        this.price = price;
        this.productName = productName;
        this.productColor = productColor;
        this.productCategory = productCategory;
        this.stockCount = stockCount;
        this.weight = weight;
        this.description = description;
    }
     
    public boolean stockCheck( double orderCount){  // Stok kontrol eden method.
       return orderCount < this.stockCount;
   }
   
    public double getPrice(){
        return price;
    }
    
    public String getProductName() {
        return productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public double getStockCount() {
        return stockCount;
    }

    public double getWeight() {
        return weight;
    }

    public String getDescription() {
        return description;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public void setStockCount(double stockCount) {
        this.stockCount = stockCount;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDescription(String description) {
        this.description = description;
    }

 
}
