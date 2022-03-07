package com.parikshit.expense.service

import com.parikshit.expense.model.Expense
import com.parikshit.expense.repository.ExpenseRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.time.LocalDate

@Service
class ExpenseService(@Autowired val expenseRepository: ExpenseRepository) {
    fun addExpense(expense: Expense):Expense {
        validatedExpense(expense)
        println("expenseRepo : $expenseRepository")
        return expenseRepository.insert(expense)
    }

    fun getAllExpenses() : List<Expense>{
        return expenseRepository.findAll()
    }

    private fun validatedExpense(expense : Expense): Expense{
        expense.transactionDate = expense.transactionDate ?: LocalDate.now()
        expense.amount = expense.amount ?: BigDecimal.ZERO
        return expense
    }

}