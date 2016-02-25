package com.lantopia.grocery;

import android.app.Activity;
import android.os.Bundle;
import org.androidannotations.annotations.EActivity;

/**
 * @author Mark McKenna &lt;mark.mckenna@redspace.com&gt;
 */
@EActivity(R.layout.grocery_list)
public class GroceryActivity extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override protected void onResume() {
        super.onResume();
    }
}
