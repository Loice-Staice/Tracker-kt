package com.example.mytrackerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mytrackerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerView.layoutManager=LinearLayoutManager(this)

        displayTransactions()


    }

    fun displayTransactions() {
        val transaction1 = Transaction("","Rent","46000","")
        val transaction2 = Transaction("","Divident","50000","23rd May 2024")
        val transaction3 = Transaction("", "Electricity", "55000", "20th June 2023")
        val transaction4 = Transaction("","Internet","4500","")
        val transaction5 = Transaction("","Shopping","30000","23rd May 2024")
        val transaction6 = Transaction("", "Salon", "25000", "20th June 2023")
        val transaction7= Transaction("","Bus Fare","20000","30th JUne 2024")
        val transaction8 = Transaction("","Divident","80000","23rd May 2024")
        val transaction9 = Transaction("", "Electricity", "30000", "20th June 2023")
        val transaction10 = Transaction("","Shopping","30000","23rd May 2024")
        val transaction11 = Transaction("", "Salon", "25000", "20th June 2023")
        val transaction12= Transaction("","Bus Fare","20000","30th JUne 2024")
        val transaction13 = Transaction("","Divident","80000","23rd May 2024")
        val transaction14 = Transaction("", "Electricity", "30000", "20th June 2023")




        val transactionList = listOf(transaction1, transaction2, transaction3,transaction4, transaction5, transaction6,transaction7, transaction8, transaction9,transaction10, transaction11,transaction12, transaction13, transaction14)
        val transactionsAdapter = TransactionsAdapter(transactionList)
        binding.recyclerView.adapter = transactionsAdapter
    }
}