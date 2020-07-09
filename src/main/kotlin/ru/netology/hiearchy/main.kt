package ru.netology.hiearchy

fun main() {

    // TextView
    val text = TextView("Some Text")
    text.click()
    println(text.text)
    text.text = "Something bad happened"
    println(text.text)


    // button
    val button = Button("Click me")
    button.click()
    println(button.text)
    button.text = "Don't click me"
    println(button.text)

    //ViewGroup
    val main = ViewGroup()
    val title = TextView("Main Screen")
    main.addView(title);

    val content = ViewGroup()
    val readMore = Button("Read more")
    content.addView(readMore)
}