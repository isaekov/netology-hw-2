package ru.netology.hiearchy

class ViewGroup : View() {

    var view:View? = null

    fun addView(view: View) {
        this.view = view
    }
}