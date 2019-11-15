package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn=findViewById<View>(R.id.buttonCal)

        btn.setOnClickListener(){
                val carprice=carPriceValue.text.toString()
                val carpriceamount:Double=carprice.toDouble()

                val downpayment=downPaymentValue.text.toString()
                val downpaymentamount:Double=downpayment.toDouble()

                val interestrate=interestRateValue.text.toString()
                val interestratepercent:Double=interestrate.toDouble()

                val loanperiod=loanPeriodValue.text.toString()
                val loanperiodamount:Double=loanperiod.toDouble()

                val carloan=carpriceamount-downpaymentamount
                val interestvalue=carloan*(interestratepercent/100)*loanperiodamount
                val monthlyrepayment=(carloan+interestvalue)/loanperiodamount/12
                carLoanValue.text="RM %.2f".format(carloan)

                interestValue.text="RM %.2f".format(interestvalue)
                monthlyRepaymentValue.text="RM %.2f".format(monthlyrepayment)
        }
    }
}
