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
        holder.tvMoneyIn.text = transaction.moneyIn.toString()
        holder.tvMoneyOut.text = transaction.moneyOut.toString()
        holder.tvBalance.text = transaction.balance.toString()
        holder.tvTransaction.text = transaction.transaction
    }

    override fun getItemCount(): Int {
        return transactionList.size
    }
}

class TransactionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvMoneyIn: TextView = itemView.findViewById(R.id.tvMoneyIn)
    val tvMoneyOut: TextView = itemView.findViewById(R.id.tvMoneyOut)
    val tvBalance: TextView = itemView.findViewById(R.id.tvBalance)
    val tvTransaction: TextView = itemView.findViewById(R.id.tvTransactions)
}


