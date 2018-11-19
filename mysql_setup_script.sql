CREATE USER IF NOT exists 'dbuser'@'localhost' IDENTIFIED BY 'dbpassword';
GRANT ALL PRIVILEGES ON * . * TO 'dbuser'@'localhost';