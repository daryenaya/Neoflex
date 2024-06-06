package ru.neoflex.calculator.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ResultOfCalculation")
public class ResultOfCalculation {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "expression")
    private String expression;

    @Column(name = "result")
    private Integer result;

}