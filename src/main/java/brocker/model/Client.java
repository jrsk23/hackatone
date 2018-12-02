package brocker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Table(name = "client")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String T24Id;
    private String name;
    private int amountBid; // кол-во заявок
    private String currency;
    private int amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public int getAmountBid() {
        return amountBid;
    }

    public void setAmountBid(int amountBid) {
        this.amountBid = amountBid;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", T24Id='" + T24Id + '\'' +
                ", name='" + name + '\'' +
                ", amountBid=" + amountBid +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
