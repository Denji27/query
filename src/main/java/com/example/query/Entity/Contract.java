package com.example.query.Entity;

import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "CONTRACT")
public class Contract implements Serializable {
    @Id
    private String id;
    private String name;
    private String provinceId;
}
