# surveyAppilcation
Create mysql  database

CREATE DATABASE survey_db;
USE survey_db;
CREATE TABLE survey_results (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45),
    email VARCHAR(45),
    age INT,
    date_of_birth DATE,
    favorite_foods TEXT,
    eat_out_rating INT,
    watch_movies_rating INT,
    watch_tv_rating INT,
    listen_radio_rating INT
);


