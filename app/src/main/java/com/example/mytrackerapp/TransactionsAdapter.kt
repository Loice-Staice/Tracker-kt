package com.example.mytrackerapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TransactionsAdapter(private val transactionList: List<Transaction>) :
    RecyclerView.Adapter<TransactionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.transaction_wallet, parent, false)
        return TransactionViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        val transaction = transactionList[position]
        holder.tvSalary.text = transaction.text
        holder.tvSalaryTransaction.text= transaction.salary
        holder.tvDate.text = transaction.date

    }

    override fun getItemCount(): Int {
        return transactionList.size
    }
}

class TransactionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvSalary = itemView.findViewById<TextView>(R.id.tvSalary)
    val tvSalaryTransaction= itemView.findViewById<TextView>(R.id.tvSalaryTransaction)
    val tvDate = itemView.findViewById<TextView>(R.id.tvDate)
}


