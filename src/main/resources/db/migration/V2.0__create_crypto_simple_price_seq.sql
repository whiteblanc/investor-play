-- ============================================
-- Migration: Add sequence for crypto_simple_price.id (fixed)
-- Handles empty table and existing data
-- ============================================

-- 1. Create the sequence if it doesn't exist
CREATE SEQUENCE IF NOT EXISTS crypto_simple_price_seq
    START 1
    INCREMENT 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

-- 2. Link sequence to the id column
ALTER SEQUENCE crypto_simple_price_seq OWNED BY crypto_simple_price.id;

-- 3. Set the column default to use the sequence
ALTER TABLE crypto_simple_price
    ALTER COLUMN id SET DEFAULT nextval('crypto_simple_price_seq');

-- 4. Initialize the sequence correctly for empty or existing table
SELECT setval(
    'crypto_simple_price_seq',
    COALESCE((SELECT MAX(id) FROM crypto_simple_price), 0) + 1,
    false
);
