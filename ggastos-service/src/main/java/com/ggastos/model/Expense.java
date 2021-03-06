package com.ggastos.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "expense")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Float value;

    private boolean fixed;
    
    //https://pt.stackoverflow.com/questions/361099/jpa-object-references-an-unsaved-transient-instance-save-the-transient-instanc
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "expense_type_id")
    private ExpenseType type;

}
