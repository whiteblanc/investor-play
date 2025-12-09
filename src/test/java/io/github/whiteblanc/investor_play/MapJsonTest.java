package io.github.whiteblanc.investor_play;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
@Disabled
public class MapJsonTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void testIt() throws JsonProcessingException {
        String json = "{\n" +
                "    \"status\": {\n" +
                "        \"timestamp\": \"2025-11-23T11:08:32.216Z\",\n" +
                "        \"error_code\": 0,\n" +
                "        \"error_message\": null,\n" +
                "        \"elapsed\": 20,\n" +
                "        \"credit_count\": 1,\n" +
                "        \"notice\": null\n" +
                "    },\n" +
                "    \"data\": {\n" +
                "        \"1\": {\n" +
                "            \"id\": 1,\n" +
                "            \"name\": \"Bitcoin\",\n" +
                "            \"symbol\": \"BTC\",\n" +
                "            \"slug\": \"bitcoin\",\n" +
                "            \"num_market_pairs\": 12485,\n" +
                "            \"date_added\": \"2010-07-13T00:00:00.000Z\",\n" +
                "            \"tags\": [\n" +
                "                {\n" +
                "                    \"slug\": \"mineable\",\n" +
                "                    \"name\": \"Mineable\",\n" +
                "                    \"category\": \"OTHERS\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"pow\",\n" +
                "                    \"name\": \"PoW\",\n" +
                "                    \"category\": \"ALGORITHM\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"sha-256\",\n" +
                "                    \"name\": \"SHA-256\",\n" +
                "                    \"category\": \"ALGORITHM\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"store-of-value\",\n" +
                "                    \"name\": \"Store Of Value\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"state-channel\",\n" +
                "                    \"name\": \"State Channel\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"coinbase-ventures-portfolio\",\n" +
                "                    \"name\": \"Coinbase Ventures Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"three-arrows-capital-portfolio\",\n" +
                "                    \"name\": \"Three Arrows Capital Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"polychain-capital-portfolio\",\n" +
                "                    \"name\": \"Polychain Capital Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"binance-labs-portfolio\",\n" +
                "                    \"name\": \"YZi Labs Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"blockchain-capital-portfolio\",\n" +
                "                    \"name\": \"Blockchain Capital Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"boostvc-portfolio\",\n" +
                "                    \"name\": \"BoostVC Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"cms-holdings-portfolio\",\n" +
                "                    \"name\": \"CMS Holdings Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"dcg-portfolio\",\n" +
                "                    \"name\": \"DCG Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"dragonfly-capital-portfolio\",\n" +
                "                    \"name\": \"DragonFly Capital Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"electric-capital-portfolio\",\n" +
                "                    \"name\": \"Electric Capital Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"fabric-ventures-portfolio\",\n" +
                "                    \"name\": \"Fabric Ventures Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"framework-ventures-portfolio\",\n" +
                "                    \"name\": \"Framework Ventures Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"galaxy-digital-portfolio\",\n" +
                "                    \"name\": \"Galaxy Digital Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"huobi-capital-portfolio\",\n" +
                "                    \"name\": \"Huobi Capital Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"alameda-research-portfolio\",\n" +
                "                    \"name\": \"Alameda Research Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"a16z-portfolio\",\n" +
                "                    \"name\": \"a16z Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"1confirmation-portfolio\",\n" +
                "                    \"name\": \"1Confirmation Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"winklevoss-capital-portfolio\",\n" +
                "                    \"name\": \"Winklevoss Capital Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"usv-portfolio\",\n" +
                "                    \"name\": \"USV Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"placeholder-ventures-portfolio\",\n" +
                "                    \"name\": \"Placeholder Ventures Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"pantera-capital-portfolio\",\n" +
                "                    \"name\": \"Pantera Capital Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"multicoin-capital-portfolio\",\n" +
                "                    \"name\": \"Multicoin Capital Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"paradigm-portfolio\",\n" +
                "                    \"name\": \"Paradigm Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"bitcoin-ecosystem\",\n" +
                "                    \"name\": \"Bitcoin Ecosystem\",\n" +
                "                    \"category\": \"PLATFORM\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"layer-1\",\n" +
                "                    \"name\": \"Layer 1\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"ftx-bankruptcy-estate\",\n" +
                "                    \"name\": \"FTX Bankruptcy Estate \",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"2017-2018-alt-season\",\n" +
                "                    \"name\": \"2017/18 Alt season\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"us-strategic-crypto-reserve\",\n" +
                "                    \"name\": \"US Strategic Crypto Reserve\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"binance-ecosystem\",\n" +
                "                    \"name\": \"Binance Ecosystem\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"binance-listing\",\n" +
                "                    \"name\": \"Binance Listing\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"max_supply\": 21000000,\n" +
                "            \"circulating_supply\": 19952609,\n" +
                "            \"total_supply\": 19952609,\n" +
                "            \"is_active\": 1,\n" +
                "            \"infinite_supply\": false,\n" +
                "            \"minted_market_cap\": 1713770212996.29,\n" +
                "            \"platform\": null,\n" +
                "            \"cmc_rank\": 1,\n" +
                "            \"is_fiat\": 0,\n" +
                "            \"self_reported_circulating_supply\": null,\n" +
                "            \"self_reported_market_cap\": null,\n" +
                "            \"tvl_ratio\": null,\n" +
                "            \"last_updated\": \"2025-11-23T11:06:00.000Z\",\n" +
                "            \"quote\": {\n" +
                "                \"USD\": {\n" +
                "                    \"price\": 85892.0361240124,\n" +
                "                    \"volume_24h\": 42321292106.67906,\n" +
                "                    \"volume_change_24h\": -53.3218,\n" +
                "                    \"percent_change_1h\": -0.4520416,\n" +
                "                    \"percent_change_24h\": 2.76929595,\n" +
                "                    \"percent_change_7d\": -10.76605478,\n" +
                "                    \"percent_change_30d\": -22.73005885,\n" +
                "                    \"percent_change_60d\": -24.02130119,\n" +
                "                    \"percent_change_90d\": -22.61018735,\n" +
                "                    \"market_cap\": 1713770212996.295,\n" +
                "                    \"market_cap_dominance\": 58.3386,\n" +
                "                    \"fully_diluted_market_cap\": 1803732758604.26,\n" +
                "                    \"tvl\": null,\n" +
                "                    \"last_updated\": \"2025-11-23T11:06:00.000Z\"\n" +
                "                }\n" +
                "            }\n" +
                "        },\n" +
                "        \"1027\": {\n" +
                "            \"id\": 1027,\n" +
                "            \"name\": \"Ethereum\",\n" +
                "            \"symbol\": \"ETH\",\n" +
                "            \"slug\": \"ethereum\",\n" +
                "            \"num_market_pairs\": 11199,\n" +
                "            \"date_added\": \"2015-08-07T00:00:00.000Z\",\n" +
                "            \"tags\": [\n" +
                "                {\n" +
                "                    \"slug\": \"pos\",\n" +
                "                    \"name\": \"PoS\",\n" +
                "                    \"category\": \"ALGORITHM\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"smart-contracts\",\n" +
                "                    \"name\": \"Smart Contracts\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"ethereum-ecosystem\",\n" +
                "                    \"name\": \"Ethereum Ecosystem\",\n" +
                "                    \"category\": \"PLATFORM\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"coinbase-ventures-portfolio\",\n" +
                "                    \"name\": \"Coinbase Ventures Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"three-arrows-capital-portfolio\",\n" +
                "                    \"name\": \"Three Arrows Capital Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"polychain-capital-portfolio\",\n" +
                "                    \"name\": \"Polychain Capital Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"binance-labs-portfolio\",\n" +
                "                    \"name\": \"YZi Labs Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"blockchain-capital-portfolio\",\n" +
                "                    \"name\": \"Blockchain Capital Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"boostvc-portfolio\",\n" +
                "                    \"name\": \"BoostVC Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"cms-holdings-portfolio\",\n" +
                "                    \"name\": \"CMS Holdings Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"dcg-portfolio\",\n" +
                "                    \"name\": \"DCG Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"dragonfly-capital-portfolio\",\n" +
                "                    \"name\": \"DragonFly Capital Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"electric-capital-portfolio\",\n" +
                "                    \"name\": \"Electric Capital Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"fabric-ventures-portfolio\",\n" +
                "                    \"name\": \"Fabric Ventures Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"framework-ventures-portfolio\",\n" +
                "                    \"name\": \"Framework Ventures Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"hashkey-capital-portfolio\",\n" +
                "                    \"name\": \"Hashkey Capital Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"kenetic-capital-portfolio\",\n" +
                "                    \"name\": \"Kenetic Capital Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"huobi-capital-portfolio\",\n" +
                "                    \"name\": \"Huobi Capital Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"alameda-research-portfolio\",\n" +
                "                    \"name\": \"Alameda Research Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"a16z-portfolio\",\n" +
                "                    \"name\": \"a16z Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"1confirmation-portfolio\",\n" +
                "                    \"name\": \"1Confirmation Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"winklevoss-capital-portfolio\",\n" +
                "                    \"name\": \"Winklevoss Capital Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"usv-portfolio\",\n" +
                "                    \"name\": \"USV Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"placeholder-ventures-portfolio\",\n" +
                "                    \"name\": \"Placeholder Ventures Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"pantera-capital-portfolio\",\n" +
                "                    \"name\": \"Pantera Capital Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"multicoin-capital-portfolio\",\n" +
                "                    \"name\": \"Multicoin Capital Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"paradigm-portfolio\",\n" +
                "                    \"name\": \"Paradigm Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"ethereum-pow-ecosystem\",\n" +
                "                    \"name\": \"Ethereum PoW Ecosystem\",\n" +
                "                    \"category\": \"PLATFORM\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"layer-1\",\n" +
                "                    \"name\": \"Layer 1\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"ftx-bankruptcy-estate\",\n" +
                "                    \"name\": \"FTX Bankruptcy Estate \",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"sora-ecosystem\",\n" +
                "                    \"name\": \"Sora Ecosystem\",\n" +
                "                    \"category\": \"PLATFORM\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"rsk-rbtc-ecosystem\",\n" +
                "                    \"name\": \"RSK RBTC Ecosystem\",\n" +
                "                    \"category\": \"PLATFORM\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"world-liberty-financial-portfolio\",\n" +
                "                    \"name\": \"World Liberty Financial Portfolio\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"us-strategic-crypto-reserve\",\n" +
                "                    \"name\": \"US Strategic Crypto Reserve\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"binance-ecosystem\",\n" +
                "                    \"name\": \"Binance Ecosystem\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"binance-listing\",\n" +
                "                    \"name\": \"Binance Listing\",\n" +
                "                    \"category\": \"CATEGORY\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"slug\": \"sophon-ecosystem\",\n" +
                "                    \"name\": \"Sophon Ecosystem\",\n" +
                "                    \"category\": \"PLATFORM\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"max_supply\": null,\n" +
                "            \"circulating_supply\": 120695653.78473306,\n" +
                "            \"total_supply\": 120695653.78473306,\n" +
                "            \"is_active\": 1,\n" +
                "            \"infinite_supply\": true,\n" +
                "            \"minted_market_cap\": 338700023479.37,\n" +
                "            \"platform\": null,\n" +
                "            \"cmc_rank\": 2,\n" +
                "            \"is_fiat\": 0,\n" +
                "            \"self_reported_circulating_supply\": null,\n" +
                "            \"self_reported_market_cap\": null,\n" +
                "            \"tvl_ratio\": null,\n" +
                "            \"last_updated\": \"2025-11-23T11:06:00.000Z\",\n" +
                "            \"quote\": {\n" +
                "                \"USD\": {\n" +
                "                    \"price\": 2806.2321455539686,\n" +
                "                    \"volume_24h\": 17340546938.40037,\n" +
                "                    \"volume_change_24h\": -49.5751,\n" +
                "                    \"percent_change_1h\": -0.16706139,\n" +
                "                    \"percent_change_24h\": 3.6993305,\n" +
                "                    \"percent_change_7d\": -13.05896447,\n" +
                "                    \"percent_change_30d\": -29.09580137,\n" +
                "                    \"percent_change_60d\": -32.86810109,\n" +
                "                    \"percent_change_90d\": -38.35004878,\n" +
                "                    \"market_cap\": 338700023479.3704,\n" +
                "                    \"market_cap_dominance\": 11.526,\n" +
                "                    \"fully_diluted_market_cap\": 338700023479.37,\n" +
                "                    \"tvl\": null,\n" +
                "                    \"last_updated\": \"2025-11-23T11:06:00.000Z\"\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}";
        CoinMarketCapResponse response =objectMapper.readValue(json, CoinMarketCapResponse.class);

        System.out.println("it ran");

        System.out.println("post ran");
        CryptoSimplePricesMapper mapper = new CryptoSimplePricesMapper();

        CryptoSimplePricesResponse cryptoSimplePricesResponse = mapper.map(response);

        System.out.println("post ran2");
    }


}
