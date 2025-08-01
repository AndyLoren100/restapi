package al.george.restapi.repository;

import al.george.restapi.entity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


/**
 * JPA repository for Expense resource
 * @author George
 * */
public interface ExpenseRepository extends JpaRepository<ExpenseEntity, Long> {


    /**
     * It will fetch the single expense from database
     * @param expenseId
     * @return Optional
     * */
    Optional<ExpenseEntity> findByExpenseId(String expenseId);
}
