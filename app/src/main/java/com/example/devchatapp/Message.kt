package com.example.devchatapp

class Message {
    var message: String? = null
    var senderId: String? = null

    constructor(){}

    constructor(message: String, senderId: String?){
        this.message = message.toString()
        this.senderId = senderId
    }
}