
package judasmarket;


public class CreditCard {
    private String creditCardNumber;
    private User owner;
    private String securityCode;
    private String expirationDate;
    private double balance;
    
    public CreditCard(String creditCardNumber, User owner, String securityCode, String expirationDate , double balance) {
        this.balance = balance;
        this.creditCardNumber = creditCardNumber;
        this.owner = owner;
        this.securityCode = securityCode;
        this.expirationDate = expirationDate;
        writeAllAtts();
    }

    public boolean balanceCheck(Product product){ // İçindeki para ürünün parasından fazla mı değil mi kontrol eden method.
        return product.getPrice() < this.balance;
    }
    
    public void writeAllAtts(){
        System.out.println("***********");
        System.out.println("Credit Card's owner: " + this.owner.getName());
        System.out.println("Credit Card Number: " + this.creditCardNumber);
        System.out.println("Credit Card Security Code: " + this.securityCode);
        System.out.println("Credit Card Balance: " + this.balance);
        System.out.println("***********");
    }
    
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public User getOwner() {
        return owner;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

   
    



}
