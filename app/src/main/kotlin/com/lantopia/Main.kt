package com.lantopia

import android.app.Activity
import android.os.Bundle
import android.widget.ListView
import com.lantopia.grocery.R
import kotterknife.bindView


class Main : Activity() {
    val groceryList: ListView by bindView(R.id.groceryList)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.grocery_list)
    }

    override fun onResume() {
        super.onResume()

        for (i in 1..10) {
            val entry = newGroceryEntry()
            entry.productClass.text = i.toString()
            entry.quantity.text = 1.toString()
            entry.notes.text = "test"
            groceryList.addView(entry.view)
        }
    }


    private fun newGroceryEntry() = GroceryEntry(inflate(R.layout.list_entry, groceryList))
}
