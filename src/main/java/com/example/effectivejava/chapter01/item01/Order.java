package com.example.effectivejava.chapter01.item01;

public class Order {
    private boolean prime;
    private boolean urgent;
    private Product product;

    // 정적 팩토리 메소드를 사용하여 메소드 이름으로 어떠한 객체를 생성하는지 잘 설명해 줄 수 있다.
    public static Order primeOrder(Product product){
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product){
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }
}
