package com.nishajain.onevstwowaybinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val oneWayData = MutableLiveData("I am Android Developer")
    val twoWayData = MutableLiveData<String>()

}