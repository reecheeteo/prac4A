package com.example.prac4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn  = findViewById<View>(R.id.Submit)

        btn.setOnClickListener()
        {

            val carPrice  = CarPriceInput.text.toString()
            val loanPeriod = LoanPeriodInput.text.toString()
            val downPayment = DownPaymentInput.text.toString()
            val interestRate = InterestRateInput.text.toString()

            val carLoan = carPrice.toDouble()- downPayment.toDouble()
            val interest = carLoan * interestRate.toDouble()*loanPeriod.toDouble()
            val monthlyRepayment = (carLoan + interest)/loanPeriod.toDouble()/12.0

            CarLoanA.text = "Rm %.2f".format(carLoan)

            InterestA.text = "Rm %.2f".format(interest)

            MPA.text = "Rm %.2f".format(monthlyRepayment)


        }
    }
}
