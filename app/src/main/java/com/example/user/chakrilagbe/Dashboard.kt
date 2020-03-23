package com.example.user.chakrilagbe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class Dashboard : AppCompatActivity() {

        lateinit var sp_catagory : Spinner
        lateinit var sp_location : Spinner
        lateinit var sp_experience : Spinner


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_dashboard)

            sp_catagory = findViewById(R.id.sp_catagory) as Spinner
            sp_location = findViewById(R.id.sp_location) as Spinner
            sp_experience = findViewById(R.id.sp_experience) as Spinner

            var cat_opt= arrayOf("Any","Accounting/Finance","IT/Telecommunication","Agro(Plant/Animal,Fisheries)","Bank/Non-Bank Fin. Ins.","Beauty Care/Health & Fitness","Call Centre","Data ENtry","Engineer/Architect")
            var loc_opt= arrayOf("Any","Dhaka Division","Chittagong Division","Barisal Division","Rajshahi Division","Khulna Division","Sylhet Division","Rangpur Division","Overseas Jobs")
            var exp_opt= arrayOf("Any","Less then 1 year","1-3 years","3-5 years","5-10 years","Over 10 years")

            sp_catagory.adapter= ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,cat_opt)
            sp_location.adapter= ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,loc_opt)
            sp_experience.adapter= ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,exp_opt)

            val btnSearch: Button=findViewById(R.id.btnSearch)
            btnSearch.setOnClickListener()
            {
                val intent= Intent(this,SingleJobDetails::class.java)
                startActivity(intent)
            }




        }
}
