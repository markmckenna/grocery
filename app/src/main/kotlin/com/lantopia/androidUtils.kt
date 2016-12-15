package com.lantopia

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/** Extension method to make it easy to inflate views from within an Activity. */
@Suppress("UNCHECKED_CAST")
fun <T : View> Activity.inflate(resource: Int, parent: ViewGroup) =
        LayoutInflater.from(this).inflate(resource, parent, false) as T

