package ru.netology.prifile

class Profile(
    private val id: Int,
    private val login:String,
    private val name:String,
    private val lastName:String,
    private val status:Boolean,
    private val avatar:String
    ) {
    val fullName:String
        get() =  "$name $lastName";

}