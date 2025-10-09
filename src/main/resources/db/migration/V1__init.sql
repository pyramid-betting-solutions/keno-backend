-- Initial schema for betting platform
CREATE TABLE IF NOT EXISTS users (
  id BIGSERIAL PRIMARY KEY,
  username VARCHAR(100) NOT NULL,
  password VARCHAR(255) NOT NULL,
  role VARCHAR(50) NOT NULL,
  created_at TIMESTAMP DEFAULT now()
);
CREATE TABLE IF NOT EXISTS draws (
  id BIGSERIAL PRIMARY KEY,
  draw_number VARCHAR(50) NOT NULL,
  start_time TIMESTAMP NOT NULL,
  status VARCHAR(50) NOT NULL,
  bonus_amount BIGINT DEFAULT 0,
  created_at TIMESTAMP DEFAULT now()
);
CREATE TABLE IF NOT EXISTS bets (
  id BIGSERIAL PRIMARY KEY,
  draw_id BIGINT REFERENCES draws(id),
  cashier_id BIGINT,
  amount BIGINT,
  status VARCHAR(50),
  created_at TIMESTAMP DEFAULT now()
);
CREATE TABLE IF NOT EXISTS bonuses (
  id BIGSERIAL PRIMARY KEY,
  draw_id BIGINT REFERENCES draws(id),
  amount BIGINT,
  updated_at TIMESTAMP DEFAULT now()
);
