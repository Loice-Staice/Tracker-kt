package com.example.mytrackerapp

data class Transaction(
    val moneyIn: Double,
    val moneyOut: Double,
    val balance: Double,
    val transaction: String
)
