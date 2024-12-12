package com.ccsw.tutorial_loan.loan;

import com.ccsw.tutorial_loan.customer.CustomerClient;
import com.ccsw.tutorial_loan.customer.model.CustomerDto;
import com.ccsw.tutorial_loan.game.GameClient;
import com.ccsw.tutorial_loan.game.model.GameDto;
import com.ccsw.tutorial_loan.loan.model.Loan;
import com.ccsw.tutorial_loan.loan.model.LoanDto;
import com.ccsw.tutorial_loan.loan.model.LoanSearchDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ana Piqueras
 *
 */
@Tag(name = "Loan", description = "API of Loan")
@RequestMapping(value = "/loan")
@RestController
@CrossOrigin(origins = "*")
public class LoanController {

    @Autowired
    LoanService loanService;

    @Autowired
    GameClient gameClient;

    @Autowired
    CustomerClient customerClient;

    /**
     * Método para recuperar un listado paginado y filtrado de {@link Loan}
     *
     * @param dto dto de búsqueda
     * @return {@link Page} de {@link LoanDto}
     */
    @Operation(summary = "Find Page", description = "Method that return a page of Loans")
    @PostMapping
    public Page<LoanDto> findPage(@RequestBody LoanSearchDto dto) {

        List<GameDto> games = gameClient.findAll();
        List<CustomerDto> customers = customerClient.findAll();

        Page<Loan> page = this.loanService.findPage(dto);
        return new PageImpl<>(page.getContent().stream().map(loan -> {
            LoanDto loanDto = new LoanDto();
            loanDto.setId(loan.getId());
            loanDto.setGame(games.stream().filter(game -> game.getId().equals(loan.getIdGame())).findFirst().orElse(null));
            loanDto.setCustomer(customers.stream().filter(customer -> customer.getId().equals(loan.getIdCustomer())).findFirst().orElse(null));
            loanDto.setLoanDate(loan.getLoanDate());
            loanDto.setReturnDate(loan.getReturnDate());
            return loanDto;
        }).collect(Collectors.toList()), page.getPageable(), page.getTotalElements());

    }

    /**
     * Método para crear un préstamo
     *
     * @param dto datos de la entidad
     */
    @Operation(summary = "Save", description = "Method that saves a Loan")
    @PutMapping
    public void save(@RequestBody @Valid LoanDto dto) {
        this.loanService.save(dto);
    }

    /**
     * Método para borrar un préstamo
     *
     * @param id PK de la entidad
     */
    @Operation(summary = "Delete", description = "Method that deletes a Loan")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {

        this.loanService.delete(id);

    }
}
