package lab1;

import java.util.ArrayList;

public class orderInfo {
    int orderId;
    String orderStatus;
    ArrayList <Product> product = new ArrayList<>();
    public orderInfo(int orderId , String orderStatus, ArrayList<Product> product) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.product = product;
    }   
}
