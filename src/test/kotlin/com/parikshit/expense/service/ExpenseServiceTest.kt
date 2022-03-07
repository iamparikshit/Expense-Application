package com.parikshit.expense.service

import com.parikshit.expense.model.Expense
import com.parikshit.expense.repository.ExpenseRepository
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.util.Assert
import java.math.BigDecimal

class ExpenseServiceTest {

    val expenseRepository : ExpenseRepository = Mockito.mock(ExpenseRepository::class.java)
    private val expenseService: ExpenseService = ExpenseService(expenseRepository)



    @Test
    fun `should take amount as 0 when no amount is passed`() {
        val expectedAmount = BigDecimal.ZERO
        val actualExpense = expenseService.addExpense(Expense(
            id = null,
            category = "Medical",
            subCategory = null,
            consumer = "Parikshit",
            description = null,
            amount = null,
            transactionDate = null
        ))
        println("Actual amount : ${actualExpense.amount}")
        println("Expected amount : $expectedAmount")
        Assertions.assertEquals(expectedAmount, actualExpense.amount)
    }
}