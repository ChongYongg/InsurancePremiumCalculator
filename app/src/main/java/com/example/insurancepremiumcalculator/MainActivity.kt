package com.example.insurancepremiumcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import com.example.insurancepremiumcalculator.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // binding.spinnerAge.setOnItemClickListener(this)
        binding.buttonCalculate.setOnClickListener{
            val age=binding.spinnerAge.selectedItemPosition
            val gender=binding.radioGroupGender.checkedRadioButtonId
            val smoker=binding.checkBoxSmoker.isChecked
            //var totalPremium=0
            var premium=0
            val myLocale= Locale.getDefault()
            val myCurrency=Currency.getInstance(myLocale)

            if(age==0){
                //Less than 17
                //totalPremium=60
                //binding.textViewPremium.text=totalPremium.toString()
                binding.textViewPremium.setText(Integer.toString(60))


            }else if(age==1){

                binding.textViewPremium.setText(Integer.toString(60))
                if(gender==R.id.radioButtonMale){
                    premium+=50



                }
            }

            when(age){
                1->{

                }
                2->{


                }
                in 3..5->{

                }

            }


            if(smoker==true){


            }

            binding.textViewPremium.text=
        }

        binding.buttonReset.setOnClickListener{


        }
    }

    /*override fun onItemClick(p0: AdapterView<*>?, p1: View?, position:Int, p3: Long) {
        TODO("Not yet implemented")
    }*/
}