package com.pvt.cleanproject.presentacion.test.mvvm

import android.app.Activity
import android.os.Bundle
import com.pvt.cleanproject.R
import kotlinx.android.synthetic.main.activity_test_mvp_mvvm.*

class TestMvvmActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_mvp_mvvm)

        helloTextView.setOnClickListener {

        }
    }
}