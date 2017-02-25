package com.apress.gerber.reminders1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class RemindersActivity extends ActionBarActivity {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminders);
        mListView = (ListView) findViewById(R.id.reminders_list_view);
        // The arrayAdatper is the controller in our
        // moder-view-contorller relationship. (controller)
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                //context
                this,
                //layout(view)
                R.layout.reminders_row,
                //row (view)
                R.id.row_text,
                //data (model) with bogus data to text our listview
                new String[]{"first record", "second record", "third record"});
        mListView.setAdapter(arrayAdapter);
    }
    //Remainder of the class listing omitted for brevity
}
