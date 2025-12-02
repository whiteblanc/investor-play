package io.github.whiteblanc.investor_play;

public record CryptoSimplePrice(
    int id,
    String name,
    String symbol,
    Double price
) {
}
