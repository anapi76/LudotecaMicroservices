package com.ccsw.tutorial_loan.loan;

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
        jdbcTemplate.execute("INSERT INTO loan(game_id,customer_id,loan_date,return_date) VALUES (2,3,'2024-12-01','2024-12-15')");
        jdbcTemplate.execute("INSERT INTO loan(game_id,customer_id,loan_date,return_date) VALUES (2,1,'2024-12-03','2024-12-17')");
        jdbcTemplate.execute("INSERT INTO loan(game_id,customer_id,loan_date,return_date) VALUES (3,3,'2024-11-28','2024-12-12')");
        jdbcTemplate.execute("INSERT INTO loan(game_id,customer_id,loan_date,return_date) VALUES (4,4,'2024-12-02','2024-12-16')");
        jdbcTemplate.execute("INSERT INTO loan(game_id,customer_id,loan_date,return_date) VALUES (5,5,'2024-11-30','2024-12-14')");
        jdbcTemplate.execute("INSERT INTO loan(game_id,customer_id,loan_date,return_date) VALUES (6,1,'2024-11-30','2024-12-14')");

        System.out.println("Datos iniciales de Loan insertados correctamente.");
    }
}
