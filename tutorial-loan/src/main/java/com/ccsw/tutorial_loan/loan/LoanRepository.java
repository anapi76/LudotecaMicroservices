package com.ccsw.tutorial_loan.loan;

import com.ccsw.tutorial_loan.loan.model.Loan;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Ana Piqueras
 *
 */
public interface LoanRepository extends CrudRepository<Loan, Long>, JpaSpecificationExecutor<Loan> {

}
