package io.github.whiteblanc.investor_play;

import java.time.Instant;

public record CryptoSimplePriceDto(
        int id,
        String name,
        String symbol,
        Instant last_updated,
        Double price

) {
}
