package com.khatabook.khatabook.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "billproduct")
@Getter
@Setter
public class BillProduct extends BaseModel {

    String name;
    double salePrice;
    double purchasePrice;

    int stockQuantity;
    int lowStock;
    @ManyToOne(cascade = CascadeType.MERGE)
    Business business;
    @Enumerated(EnumType.ORDINAL)
    UnitType unitType;
    @OneToMany(cascade = CascadeType.ALL)
            @JsonIgnore
    List<ProductTransaction> productTransactions;
}
