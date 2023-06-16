package com.example.query.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "CONSUMPTION")
public class consumption implements Serializable {
    @Id
    private String id;
    @Column(nullable = false)
    private String contractId;
    private String meterCode;
    private Integer readUnit;
    @Enumerated(EnumType.STRING)
    private ConsumptionStatus status;
}
