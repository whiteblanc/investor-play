package io.github.whiteblanc.investor_play;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CryptoSimplePriceRepository extends JpaRepository<CryptoSimplePriceDto, Integer> {
}
