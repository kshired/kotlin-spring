package com.example.kotlindemo.dto

import com.example.kotlindemo.util.ResponseStatus

open class ResponseWrapperDto(status: ResponseStatus) {
    var status: String = ""
    init {
        when (status) {
            ResponseStatus.SUCCESS -> this.status = "success"
            ResponseStatus.ERROR -> this.status = "Error"
            ResponseStatus.FAIL -> this.status = "Fail"
        }
    }
}