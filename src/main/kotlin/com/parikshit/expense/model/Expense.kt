package com.parikshit.expense.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.math.BigDecimal
import java.time.LocalDate

@Document("expenses")
data class Expense(
    @Id
    val id: String?,
    @Field
    val category: String,
    @Field
    val subCategory: String?,
    @Field
    val consumer : String,
    @Field
    val description : String?,
    @Field
    var amount : BigDecimal?,
    @Field("date")
    var transactionDate : LocalDate?
)