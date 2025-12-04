package io.github.whiteblanc.investor_play;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "crypto_simple_price")
public class CryptoSimplePrice {

    @Id
    private Integer id;

    private Integer coinmarketcapId;

    @Column(length = 64)
    private String symbol;

    @Column
    private Double price;

    @Column(name = "last_updated")
    private Instant lastUpdated;

    public CryptoSimplePrice() {}

    public CryptoSimplePrice(Integer id, Integer coinmarketcapId, String symbol, Double price, Instant lastUpdated) {
        this.id = id;
        this.symbol = symbol;
        this.price = price;
        this.lastUpdated = lastUpdated;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getCoinmarketcapId() {
        return coinmarketcapId;
    }

    public void setCoinmarketcapId(Integer coinmarketcapId) {
        this.coinmarketcapId = coinmarketcapId;
    }

    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public Instant getLastUpdated() { return lastUpdated; }
    public void setLastUpdated(Instant lastUpdated) { this.lastUpdated = lastUpdated; }
}