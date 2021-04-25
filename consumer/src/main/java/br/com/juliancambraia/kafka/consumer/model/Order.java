package br.com.juliancambraia.kafka.consumer.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {
    private String identifier;
    private String customer;
    private BigDecimal value;
}
