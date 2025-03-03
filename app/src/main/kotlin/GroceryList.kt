package com.lantopia.grocery

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle


class GroceryList : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.grocery_list)

        startActivity(
            Intent()
                .setAction(Intent.ACTION_VIEW)
                .setData(Uri.parse("https://groceries.lantopia.org/lists/todo"))
        )

    }
}
