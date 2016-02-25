package com.lantopia.grocery;

import android.app.Activity;
import android.widget.ListView;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * @author Mark McKenna &lt;mark.mckenna@redspace.com&gt;
 */
@EActivity(R.layout.grocery_list)
public class GroceryActivity extends Activity {
    @ViewById(R.id.grocery_list_list) ListView groceryList;
}
