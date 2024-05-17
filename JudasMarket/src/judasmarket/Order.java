
package judasmarket;


public class Order {
    private User customer;
    private CreditCard UsersCreditCard;
    private Product product;
   
    
    public Order(User customer, CreditCard UsersCreditCard, Product product , double orderCount) {
        this.customer = customer;
        this.UsersCreditCard = UsersCreditCard;
        this.product = product;
        customer.makeOrder(customer , UsersCreditCard , product , orderCount); // nesneyi oluşturmak bir sipariş vermek ile aynı
        writeAllAtts();
    }

    public void writeAllAtts(){
        System.out.println("Name who ordered: " + this.customer.getName());
        System.out.println("Credit Card No: " + this.UsersCreditCard.getCreditCardNumber());
        System.out.println("Ordered Product Name: " + this.product.getProductName());
        System.out.println("Ordered Count: " + this.customer.getOrderedCount());
    }

    public User getCustomer() {
        return customer;
    }

    public CreditCard getUsersCreditCard() {
        return UsersCreditCard;
    }

    public Product getProduct() {
        return product;
    } 

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public void setUsersCreditCard(CreditCard UsersCreditCard) {
        this.UsersCreditCard = UsersCreditCard;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
