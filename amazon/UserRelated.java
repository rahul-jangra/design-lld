/**
Guest can only browse the products. Member has an account, he can place orders
*/

public class Account {
  private String userName;
  private String name;
  private Address shippingAddress;
  private String email;
 
  private List<CreditCard> creditCards;
 
  public boolean resetPassword();
}
 
public abstract class Customer {
  private Cart cart;
  
  public bool addItemToCart(Item item);
  public bool removeItemFromCart(Item item);
}
 
public class Guest extends Customer {
  public bool registerAccount();
}
 
public class Member extends Customer {
  private Account account;
  private List<Order> orderHistory;
  
  public Order checkoutCart(PaymentMethod paymentMethod);
}
