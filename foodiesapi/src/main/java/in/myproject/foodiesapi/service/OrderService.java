package in.myproject.foodiesapi.service;

import com.razorpay.RazorpayException;
import in.myproject.foodiesapi.io.OrderRequest;
import in.myproject.foodiesapi.io.OrderResponse;

import java.util.List;
import java.util.Map;

public interface OrderService {

   OrderResponse createOrderWithPayment(OrderRequest request) throws RazorpayException;

  void verifyPayment(Map<String,String> paymentData, String status);
  List<OrderResponse> getUSerOrders();

 void removeOrder(String orderId);
 List<OrderResponse> getOrdersOfAllUsers();

 void updateOrderStatus(String orderId , String status);
}
