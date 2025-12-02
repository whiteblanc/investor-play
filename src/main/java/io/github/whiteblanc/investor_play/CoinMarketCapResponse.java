package io.github.whiteblanc.investor_play;

import java.util.Map;

public record CoinMarketCapResponse(Status status, Map<String, Crypto> data) {
}
