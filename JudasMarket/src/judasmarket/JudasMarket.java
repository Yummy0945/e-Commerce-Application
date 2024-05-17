
package judasmarket;


public class JudasMarket {

    
    public static void main(String[] args) {
       
       System.out.println("*A king with no crown , king with no crown*");
       
       User u1 = new User("Yummy" , "Yagmur" , "Tokdemir" , "berin tas no:53 d:4" ,"09092003" , "0945" , "yagmur.tokdemir@gmail.com");
       CreditCard c1 = new CreditCard("123453243532" , u1 , "737" , "10.25" , 140);
       Product hali = new Product("judas" , "siyah" , "halı" , 10 , 5 , "Hayatinda aldigin en iyi hali" , 15.90);
    
       u1.addCreditCard(c1);
       u1.favProduct(hali);
       u1.writeAllAtts();

       Order o1 = new Order(u1 , c1 ,hali , 4);
     
    }
    
}
