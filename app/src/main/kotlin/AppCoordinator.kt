package com.lantopia.grocery

import android.content.Context
import android.content.Intent
import android.net.Uri

class AppCoordinator(context: Context) {
    private val context = context.applicationContext
    private val prefix = "https://${context.resources.getString(R.id.app_domain)}/"

    fun showList(name: String) = open("lists/$name")

    // open the given URL suffix app-locally
    private fun open(suffix: String) =
        context.startActivity(
            Intent()
                .setAction(Intent.ACTION_VIEW)
                .setData(Uri.parse("$prefix/$suffix"))
        )
}