package com.pvt.cleanproject.presentacion.test.mvp

class TestPresenterSpec(private val view: TestView) : TestPresenter {
    private val helloText: String

    init {
        helloText = "asdasdadasd"
    }


    override fun onReloadData() {
        view.showHelloText(helloText)
    }

    override fun onHelloClock() {

    }


}





