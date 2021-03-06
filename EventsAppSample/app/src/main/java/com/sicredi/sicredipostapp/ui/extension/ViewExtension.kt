package com.sicredi.sicredipostapp.ui.extension

import android.view.View

fun View.visible() {
    this.visibility = View.VISIBLE
}

fun View.gone() {
    this.visibility = View.GONE
}

fun View.visibleOrGone(isVisible: Boolean) {
    this.visibility = if(isVisible) View.VISIBLE else View.GONE
}