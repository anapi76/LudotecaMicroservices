package com.ccsw.tutorial_game.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class InitialData implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        jdbcTemplate.execute("INSERT INTO game(title, age, category_id, author_id) VALUES ('On Mars', '14', 1, 2)");
        jdbcTemplate.execute("INSERT INTO game(title, age, category_id, author_id) VALUES ('Aventureros al tren', '8', 3, 1)");
        jdbcTemplate.execute("INSERT INTO game(title, age, category_id, author_id) VALUES ('1920: Wall Street', '12', 1, 4)");
        jdbcTemplate.execute("INSERT INTO game(title, age, category_id, author_id) VALUES ('Barrage', '14', 1, 3)");
        jdbcTemplate.execute("INSERT INTO game(title, age, category_id, author_id) VALUES ('Los viajes de Marco Polo', '12', 1, 3)");
        jdbcTemplate.execute("INSERT INTO game(title, age, category_id, author_id) VALUES ('Azul', '8', 3, 5)");

        System.out.println("Datos iniciales de Game insertados correctamente.");
    }
}
