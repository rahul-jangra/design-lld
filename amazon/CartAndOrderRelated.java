/**
User can add items in cart and then checkout the cart. User can make Orders and payments
*/


public class Item {
  private String productID;
  private int quantity;
  private double price;

  public boolean updateQuantity(int quantity);
}

public class Cart {
  private List<Items> items;

  public void addItem(Item item);
  public void updateItemQuantity(Item item, int quantity);

  public Order checkoutCart() {
  	// create order
  	// do payment
  	// place order with retailer
  }
}

public class Order {
	private UUID id;
	private OrderStatus orderStatus;
	private Payment payment;

	private boolean makePayment();
}

public class Payment {

	private BigDecimal paymentAmount;
	private PaymentType paymentType;
	private PaymentStatus paymentStatus;
}




