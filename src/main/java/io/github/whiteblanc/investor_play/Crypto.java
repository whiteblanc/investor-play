package io.github.whiteblanc.investor_play;

import java.util.List;
import java.util.Map;

public record Crypto(
        int id,
        String name,
        String symbol,
        String slug,
        int num_market_pairs,
        String date_added,
        List<Tag> tags,
        Double max_supply,
        Double circulating_supply,
        Double total_supply,
        int is_active,
        boolean infinite_supply,
        Double minted_market_cap,
        Object platform,
        int cmc_rank,
        int is_fiat,
        Double self_reported_circulating_supply,
        Double self_reported_market_cap,
        Double tvl_ratio,
        String last_updated,
        Map<String, Quote> quote
) {
}
