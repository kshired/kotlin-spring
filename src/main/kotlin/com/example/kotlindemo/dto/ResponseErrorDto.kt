package com.example.kotlindemo.dto

import com.example.kotlindemo.util.ResponseStatus

class ResponseErrorDto( status: ResponseStatus,message:String) : ResponseWrapperDto(status){
    val message: String = message
}