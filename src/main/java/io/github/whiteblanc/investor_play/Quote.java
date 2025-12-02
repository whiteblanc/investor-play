package io.github.whiteblanc.investor_play;

public record Quote(
        Double price,
        Double volume_24h,
        Double volume_change_24h,
        Double percent_change_1h,
        Double percent_change_24h,
        Double percent_change_7d,
        Double percent_change_30d,
        Double percent_change_60d,
        Double percent_change_90d,
        Double market_cap,
        Double market_cap_dominance,
        Double fully_diluted_market_cap,
        Double tvl,
        String last_updated
) {
}
