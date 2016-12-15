package com.lantopia

import android.view.View
import android.widget.TextView
import com.lantopia.grocery.R
import kotterknife.ViewWrapper

/** Wraps the views associated with a grocery list entry for ease of processing. */
class GroceryEntry(view: View) : ViewWrapper(view) {
    val productClass: TextView by bindView(R.id.productClass)
    val quantity: TextView by bindView(R.id.quantity)
    val notes: TextView by bindView(R.id.notes)
}

