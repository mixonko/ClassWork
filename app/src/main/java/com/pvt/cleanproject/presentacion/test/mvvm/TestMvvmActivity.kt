package com.pvt.cleanproject.presentacion.test.mvvm

import android.app.Activity
import android.os.Bundle
import com.pvt.cleanproject.R
import kotlinx.android.synthetic.main.activity_test_mvp_mvvm.*

class TestMvvmActivity: Activity() {
    private lateinit var viewModel: MvvmViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_mvp_mvvm)

        viewModel = TestMvvmViewModelDefault()

        viewModel.setHelloTextListener(object :  HelloTextListener {
            override fun onUpdate(value: String) {
                helloTextView.text = value

            }

        })

        helloTextView.setOnClickListener {

        }
    }

    override fun onResume() {
        super.onResume()
        viewModel.reloadData()
    }
}