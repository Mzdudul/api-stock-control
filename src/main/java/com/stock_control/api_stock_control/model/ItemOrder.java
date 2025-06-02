package com.stock_control.api_stock_control.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "itemOrder")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemOrder {
    private Product productId;
    private Integer quantidade;
    private Double precoUnitario;
}
