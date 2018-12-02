package brocker.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

//Заявка
@Entity
@Table(name = "bid")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Bid {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String T24Id; //не уверен что стринг
    private String name;
    private int dealIdB2;
    private int amount;
    private String currency;
    private boolean operation; //признак операции true - покупка, false - продажа TODO передалать в Enum

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getT24Id() {
        return T24Id;
    }

    public void setT24Id(String t24Id) {
        T24Id = t24Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDealIdB2() {
        return dealIdB2;
    }

    public void setDealIdB2(int dealIdB2) {
        this.dealIdB2 = dealIdB2;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean isOperation() {
        return operation;
    }

    public void setOperation(boolean operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "id=" + id +
                ", T24Id='" + T24Id + '\'' +
                ", name='" + name + '\'' +
                ", dealIdB2=" + dealIdB2 +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", operation=" + operation +
                '}';
    }
}
