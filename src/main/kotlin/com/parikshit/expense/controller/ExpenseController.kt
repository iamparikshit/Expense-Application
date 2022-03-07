package com.parikshit.expense.controller

import com.parikshit.expense.model.Expense
import com.parikshit.expense.service.ExpenseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/expense")
class ExpenseController(@Autowired val expenseService: ExpenseService) {
    @PostMapping
    fun addExpense(@RequestBody expense: Expense) : ResponseEntity<String>{
        expenseService.addExpense(expense)
        return ResponseEntity.status(HttpStatus.CREATED).build()
    }

    @GetMapping
    fun getAllExpenses() : ResponseEntity<List<Expense>>{
        return ResponseEntity.ok(expenseService.getAllExpenses())
    }

}