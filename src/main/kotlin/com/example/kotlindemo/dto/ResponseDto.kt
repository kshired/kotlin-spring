package com.example.kotlindemo.dto

import com.example.kotlindemo.util.ResponseStatus

class ResponseDto<T>(_status: ResponseStatus, val data: T) : ResponseWrapperDto(_status) {
}