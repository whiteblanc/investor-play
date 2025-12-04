CREATE TABLE IF NOT EXISTS crypto_simple_price (
  id integer PRIMARY KEY,
  symbol varchar(64),
  price numeric(30,10),
  last_updated timestamptz
);
