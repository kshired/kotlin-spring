package com.example.kotlindemo.dto

import com.example.kotlindemo.util.ResponseStatus

class ResponseErrorDto(_status: ResponseStatus,val message:String) : ResponseWrapperDto(_status){

}