package io.github.whiteblanc.investor_play;

import java.time.Instant;

public record Status(
        Instant timestamp,
        int error_code,
        String error_message,
        int elapsed,
        int credit_count,
        String notice
) {
}