package io.github.whiteblanc.investor_play;

public record Status(
        String timestamp,
        int error_code,
        String error_message,
        int elapsed,
        int credit_count,
        String notice
) {
}