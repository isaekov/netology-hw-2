package ru.netology.social

import java.sql.Timestamp

class Post(
    val postId:Long,
    val authorId:Long,
    val createdTime:Timestamp,
    val title: String,
    val content:String,
    val image:String,
    val liked:Long,
    val comments:Comment,
    val reposts:Repost,
    val views:Long
) {

}