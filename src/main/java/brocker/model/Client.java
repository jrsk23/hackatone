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
    private String contragentId;
    private String contragentName;
    private int operationType; // кол-во заявок
    private String currency;
    private int amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getcontragentId() {
        return contragentId;
    }

    public void setcontragentId(String contragentId) {
        contragentId = contragentId;
    }

    public String getСontragentName() {
        return contragentName;
    }

    public void setСontragentName(String contragentName) {
        this.contragentName = contragentName;
    }

    public int getOperationType() {
        return operationType;
    }

    public void setOperationType(int operationType) {
        this.operationType = operationType;
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
                ", contragentId='" + contragentId + '\'' +
                ", contragentName='" + contragentName + '\'' +
                ", operationType=" + operationType +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
