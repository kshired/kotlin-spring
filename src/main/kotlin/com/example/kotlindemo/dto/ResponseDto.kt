package com.example.kotlindemo.dto

import com.example.kotlindemo.util.ResponseStatus

class ResponseDto<T>(status: ResponseStatus, data: T) : ResponseWrapperDto(status) {
    val data: T = data
}