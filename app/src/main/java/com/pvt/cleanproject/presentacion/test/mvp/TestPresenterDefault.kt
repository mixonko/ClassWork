package com.pvt.cleanproject.presentacion.test.mvp

class TestPresenterDefault(private val view: TestView) : TestPresenter {
    private val helloText: String

    init {
        helloText = "Hello"
    }


    override fun onReloadData() {
        view.showHelloText(helloText)
    }

    override fun onHelloClock() {

    }


}





