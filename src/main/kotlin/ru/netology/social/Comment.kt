package ru.netology.social

class Comment(
    val commentId:Long,
    val userId:Long,
    val text:String,
    val brunch:Comment?,
    val liked:Long
    ) {

}