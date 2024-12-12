package com.ccsw.tutorial_loan.loan.model;

import com.ccsw.tutorial_loan.pagination.PageableRequest;

/**
 * @author Ana Piqueras
 *
 */
public class LoanSearchDto {

    private PageableRequest pageable;

    private Long idGame;

    private Long idCustomer;

    private String date;

    public PageableRequest getPageable() {
        return pageable;
    }

    public void setPageable(PageableRequest pageable) {
        this.pageable = pageable;
    }

    public Long getIdGame() {
        return idGame;
    }

    public void setIdGame(Long idGame) {
        this.idGame = idGame;
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
