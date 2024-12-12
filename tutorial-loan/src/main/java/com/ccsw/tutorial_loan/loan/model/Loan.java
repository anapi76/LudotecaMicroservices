package com.ccsw.tutorial_loan.loan.model;

import jakarta.persistence.*;

import java.time.LocalDate;

/**
 * @author Ana Piqueras
 *
 */
@Entity
@Table(name = "loan")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "game_id", nullable = false)
    private Long idGame;

    @Column(name = "customer_id", nullable = false)
    private Long idCustomer;

    @Column(name = "loan_date", nullable = false)
    private LocalDate loanDate;

    @Column(name = "return_date", nullable = false)
    private LocalDate returnDate;

    public Loan() {
    }

    public Loan(Long id, Long idGame, Long idCustomer, LocalDate loanDate, LocalDate returnDate) {
        this.id = id;
        this.idGame = idGame;
        this.idCustomer = idCustomer;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id new value of {@link #getId}.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return idGame
     */
    public Long getIdGame() {
        return idGame;
    }

    /**
     * @param idGame new value of {@link #getIdGame}.
     */
    public void setIdGame(Long idGame) {
        this.idGame = idGame;
    }

    /**
     * @return idCustomer
     */
    public Long getIdCustomer() {
        return idCustomer;
    }

    /**
     * @param idCustomer new value of {@link #getIdCustomer}.
     */
    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    /**
     * @return loanDate
     */
    public LocalDate getLoanDate() {
        return loanDate;
    }

    /**
     * @param loanDate new value of {@link #getLoanDate}.
     */
    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    /**
     * @return returnDate
     */
    public LocalDate getReturnDate() {
        return returnDate;
    }

    /**
     * @param returnDate new value of {@link #getReturnDate}.
     */
    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
