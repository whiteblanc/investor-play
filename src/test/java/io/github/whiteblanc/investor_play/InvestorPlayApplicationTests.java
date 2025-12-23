package io.github.whiteblanc.investor_play;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasSize;
@Testcontainers
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class InvestorPlayApplicationTests {

    @LocalServerPort
    private Integer port;

    static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>(
            "postgres:16-alpine")
            .withDatabaseName("test")
            .withUsername("test")
            .withPassword("test");

    @Autowired
    private  Flyway flyway;

    @BeforeAll
    static void beforeAll() {
        postgres.start();
    }

    @AfterAll
    static void afterAll() {
        postgres.stop();
    }

    @BeforeEach
    void beforeEachTest() {
        //flyway.clean();
        flyway.migrate();
    }

    @Autowired
    CryptoSimplePriceRepository cryptoSimplePriceRepository;

    @BeforeEach
    void setUp() {
        RestAssured.baseURI = "http://localhost:" + port;
        cryptoSimplePriceRepository.deleteAll();
    }

    @Test
    void shouldGetAllCryptoSimplePrices() {
        List<CryptoSimplePrice> cryptoSimplePriceList = cryptoSimplePriceRepository.findAll();
        assertThat(cryptoSimplePriceList).isEmpty();
        CryptoSimplePricesResponse response = given()
                .contentType(ContentType.JSON)
                .header("x-api-key", "55951487101f4ad7b021eee6305ae8b5")
                .when()
                .get("/result?id=1,1027")
                .then()
                .statusCode(200)
                .extract()
                .as(CryptoSimplePricesResponse.class);

        assertThat(response.data().keySet()).hasSize(2);

        cryptoSimplePriceList = cryptoSimplePriceRepository.findAll();
        assertThat(cryptoSimplePriceList).hasSize(2);

        response = given()
                .contentType(ContentType.JSON)
                .header("x-api-key", "55951487101f4ad7b021eee6305ae8b5")
                .when()
                .get("/result?id=1,1027")
                .then()
                .statusCode(200)
                .extract()
                .as(CryptoSimplePricesResponse.class);

        assertThat(response.data().keySet()).hasSize(2);

        cryptoSimplePriceList = cryptoSimplePriceRepository.findAll();
        assertThat(cryptoSimplePriceList).hasSize(4);
    }

    @DynamicPropertySource
    static void registerPgProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", postgres::getJdbcUrl);
        registry.add("spring.datasource.username", postgres::getUsername);
        registry.add("spring.datasource.password", postgres::getPassword);
        registry.add("spring.datasource.driver-class-name", postgres::getDriverClassName);
    }

    @Test
    public void testIt() {

    }

    @Test
    void contextLoads() {
    }

}


