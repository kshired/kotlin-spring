package com.example.kotlindemo.dto

import com.example.kotlindemo.util.ResponseStatus

open class ResponseWrapperDto(_status: ResponseStatus) {
    var status: String = ""
    init {
        when (_status) {
            ResponseStatus.SUCCESS -> this.status = "success"
            ResponseStatus.ERROR -> this.status = "error"
            ResponseStatus.FAIL -> this.status = "fail"
        }
    }
}