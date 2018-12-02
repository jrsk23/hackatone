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
    private String contragentId; //не уверен что стринг
    private String contragentName;
    private int dealIdB2;
    private int amount;
    private String currency;
    private int operation; //признак операции true - покупка, false - продажа TODO передалать в Enum

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContragentId() {
        return contragentId;
    }

    public void setContragentId(String contragentId) {
        contragentId = contragentId;
    }

    public String getContragentName() {
        return contragentName;
    }

    public void setContragentName(String contragentName) {
        this.contragentName = contragentName;
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

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "id=" + id +
                ", T24Id='" + contragentId + '\'' +
                ", name='" + contragentName + '\'' +
                ", dealIdB2=" + dealIdB2 +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", operation=" + operation +
                '}';
    }
}
