package ru.netology.prifile

fun main() {
    val profile = Profile(
        1, "test@test.ru", "Jack", "Jackson", true, "/img/jack.jpeg"
    )
    println(profile.fullName)
}