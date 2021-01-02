/**
	Requirements:

	Users can buy/sell their products
	Guest and members can View/Search products
	Registered users can Create cart, add address, do payments, Create/Delete order, Track order status

	APIs:
	User:
	POST /user/register, /user/login, /user/logout

	User-product:
	GET, POST, PUT, DELETE /user/product/{id}
	GET /user/product

	Search-product:
	POST: /search/product/{id}

	Cart:
	GET, PUT, DELETE: /user/{id}/cart/

	Order: 
	GET, POST, PUT, DELETE /user/{id}/order/{id}
	GET /user/{id}/order/{id}/status
*/
