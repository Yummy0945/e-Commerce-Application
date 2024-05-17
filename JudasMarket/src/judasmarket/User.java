
package judasmarket;

import java.util.ArrayList;


public class User {
    private String userName;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String password;
    private String email;
    private String address;
    private ArrayList<CreditCard /*array list tipi*/> creditCards;
    private String favoriteProduct;
    private double orderedCount;
    private ArrayList<Product> favorite;
    private ArrayList<Product> orderedProduct;
    
    public User(String userName, String name, String surname,String address ,  String dateOfBirth, String password, String email) { // Constructor.
        this.userName = userName;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.address= address;
        this.password = password;
        this.email = email;
        this.favorite = new ArrayList<Product> ();
        this.creditCards = new ArrayList<CreditCard> ();
        
    }
    
    public void favProduct ( Product product){  // Ürünü favlama methodu.
        this.favorite.add(product);
        this.favoriteProduct = product.getProductName();
        System.out.println("Successfully added to liked products!");
        System.out.println("Favorite product name: " + this.favoriteProduct);
    }
  
    public void addCreditCard( CreditCard c){  // Kullanıcının kredi kartına bir bağlantı noktası.
       this.creditCards.add(c);
    }
   
    public CreditCard getCreditCardByIndex( int index){
      return this.creditCards.get(index);
    } 

    public Product getFavoriteByIndex( int index){
      return this.favorite.get(index);
   }

    public String hidePassword(String password) {   // şifreyi ekrana yazrırırken başı ve sonu sadece gözüksün ortası * lı olsun methodu.
    String prefix = password.substring(0, 1);
    String suffix = password.substring(password.length() - 1);
    String hidden = prefix;
    for (int i = 1; i < password.length() - 1; i++) {
        hidden += "*";
    }
    hidden += suffix;
    return hidden;
    }
    
    
    public void writeAllAtts(){
        System.out.println("**********");
        System.out.println("Username: " + this.userName);
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Email: " + this.email);
        System.out.println("Address: " + this.address);
        System.out.println("Credit Card Count: " + this.creditCards.size());
        System.out.println("Password: " + hidePassword(this.password));
        System.out.println("Favorite Count: " + this.favorite.size());
        System.out.println("**********");
    }
    
    
    public boolean makeOrder(User user , CreditCard creditCard , Product product , double orderCount){  // sipariş verme methodu.
        System.out.println("************");
        if(product.getStockCount() == 0){  // ürün stokta yoksa.
        System.out.println("Sorry, the product is out of stock.");
        System.out.println("************");
        return false;
      }
    
      else if(product.getStockCount() < orderCount){  // müşteri stoktan fazla sipariş verirse.
          System.out.println("Sorry, the number of stocks is less than the number of products you ordered.");
          System.out.println("************");
          return false;
      }
      else if(creditCard.balanceCheck(product)){ // Kredi kartında para varsa ve stokta varsa.
         product.setStockCount(--orderCount);
         for(int i = 0; i <= orderCount ; i++){
             orderedCount++;
         }
         System.out.println("Order is complete!");
         System.out.println("************");
         return true;
      }
      else{  // yeterine para yoksa.
          System.out.println("Sorry you don't have enough balance.");
          System.out.println("***********");
          return false;
      }
    }
    
     public void addOrderedProduct(Product p) { 
     this.orderedProduct.add(p);   
     }
   
    public Product getOrderedProductByIndex( int index){
       return this.orderedProduct.get(index);
    }

    public String getuserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<CreditCard> getCreditCards() {
        return creditCards;
    }

    public String getFavoriteProduct() {
        return favoriteProduct;
    }

    public double getOrderedCount() {
        return orderedCount;
    }

    public ArrayList<Product> getFavorite() {
        return favorite;
    }

    public void setUserName(String UserName) {
        this.userName = UserName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreditCards(ArrayList<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    public void setFavoriteProduct(String favoriteProduct) {
        this.favoriteProduct = favoriteProduct;
    }

    public void setOrderedCount(double orderedCount) {
        this.orderedCount = orderedCount;
    }

    public void setFavorite(ArrayList<Product> favorite) {
        this.favorite = favorite;
    }

    public void setOrderedProduct(ArrayList<Product> orderedProduct) {
        this.orderedProduct = orderedProduct;
    }
 
    
    
}
