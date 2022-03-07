package com.parikshit.expense.repository

import com.parikshit.expense.model.Expense
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ExpenseRepository : MongoRepository<Expense, Int> {
}