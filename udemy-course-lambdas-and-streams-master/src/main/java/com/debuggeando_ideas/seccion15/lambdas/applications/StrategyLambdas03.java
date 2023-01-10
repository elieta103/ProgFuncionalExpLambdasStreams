package com.debuggeando_ideas.seccion15.lambdas.applications;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;

public class StrategyLambdas03 {
    public static void main(String[] args) {
        var product1 = Product.builder()
                .id(1L)
                .name("Bear")
                .price(150.00)
                .userType("BASIC")
                .build();
        var product2 = Product.builder()
                .id(1L)
                .name("Bear")
                .price(150.00)
                .userType("PLUS")
                .build();
        var product3 = Product.builder()
                .id(1L)
                .name("Bear")
                .price(150.00)
                .userType("PRIME")
                .build();


        var products = List.of(product1, product2, product3);
        products.forEach(product ->{
            switch (product.getUserType()){
                case "BASIC":
                    product.setDiscountStrategy(Strategies.basicDiscount);
                    break;
                case "PLUS":
                    product.setDiscountStrategy(Strategies.plusDiscount);
                    break;
                case "PRIME":
                    product.setDiscountStrategy(Strategies.primeDiscount);
                    break;
            }
        });

        products.forEach(product -> {
            System.out.println("Price : "+product.getPrice()+
                    ", User type: "+product.getUserType()+
                    ", Discount : "+product.getDiscountStrategy().get(product.getPrice()));
        });
    }
}

class Strategies{
    static ApplyDiscountStrategy basicDiscount = p -> p * 0.02;
    static ApplyDiscountStrategy plusDiscount = p -> p * 0.05;
    static ApplyDiscountStrategy primeDiscount = p -> p * 0.08;

}

@FunctionalInterface
interface ApplyDiscountStrategy{
    Double get(Double price);
}


@Data
@ToString
@Builder
class Product{
    private Long id;
    private String userType;
    private String name;
    private Double price;
    private ApplyDiscountStrategy discountStrategy;
}
