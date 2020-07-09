package ru.netology.hiearchy

open class TextView(text:String) : View() {

    var text = text
    set(value) {
        if (value.isNotEmpty()) {
            field = value
        }
    }



}