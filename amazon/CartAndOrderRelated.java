/**
User can add items in cart and then checkout the cart. User can make Orders and payments
Omitting getters and setters and constructors.
*/


public class Item {
  private String productID;
  private int quantity;
  private double price;

  public boolean updateQuantity(int quantity);
}


/******
Using template pattern for fixing cart checkout steps;
*******/
public abstract Cart {
	public final Order checkoutCart(PaymentMethod paymentMethod){
		// create order
		Order order = createOrder();
		// do payment
		boolean isSuccess = order.doPayment(paymentMethod);
		// place order to retailer
		placeOrderWithRetailer();

		return order;
	}

	abstract Order createOrder();

	abstract void placeOrderWithRetailer();


}

public class ShoppingCart extends Cart{
  private List<Items> items;

  public void addItem(Item item);
  public void updateItemQuantity(Item item, int quantity);
}


public class Order {
	private UUID id;
	private OrderStatus orderStatus;
	private BigDecimal orderAmount;
	private PaymentLog paymentLog;

	public boolean doPayment(PaymentStrategy paymentMethod){
		paymentMethod.makePayment(orderAmount);
	}
}


/******
using strategy pattern for payment types
*******/

public interface PaymentStrategy() {
	public boolean makePayment(BigDecimal amount);

}

public class CreditCardPayment implements PaymentStrategy {

	private BigDecimal paymentAmount;
	private int cardNumber;
	private int cvv;
	private String validThru;

	public PaymentLog makePayment(BigDecimal amount) {
		// make payment via credit card;
	}
}

public class OnlinePayment implements PaymentStrategy {

	private BigDecimal paymentAmount;
	private String mailId;
	private BankingTransaction bankingTransactionObject;

	public PaymentLog makePayment(BigDecimal amount) {
		// make payment via net banking;
	}
}

public class PaymentLog {
	private int PaymentStatus paymentStatus;
	private BigDecimal paymentAmount;
	private PaymentType paymentType;
}




