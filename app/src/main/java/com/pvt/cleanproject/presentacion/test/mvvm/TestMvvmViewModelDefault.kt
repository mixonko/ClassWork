package com.pvt.cleanproject.presentacion.test.mvvm

class TestMvvmViewModelDefault: MvvmViewModel {

    private var helloText: String = ""
    private var listener: HelloTextListener? = null

    override fun setHelloTextListener(listener: HelloTextListener) {
        this.listener = listener
    }

    override fun reloadData() {
        helloText = "Hello from Mvvm"
        listener?.onUpdate(helloText)
    }

    override fun HelloClock() {

    }
}