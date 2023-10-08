package com.vgapp

data class DataTransactionSearch(
    val tranType: String,
    val amount: String,
    val ir: String?,
    val remarks: String?,
    val date: String
)
