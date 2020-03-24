package com.example.revalform;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;

public class ScrollingActivity extends AppCompatActivity implements TextWatcher{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        EditText e = (EditText) findViewById(R.id.editText3);
        e.addTextChangedListener(this);

        long date = System.currentTimeMillis();
        TextView tvDisplayDate=(TextView)findViewById(R.id.textView14);
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM, yyyy h:mm a");
        String dateString = sdf.format(date);
        tvDisplayDate.setText(dateString);
    }

        public void addRows(){
            //RelativeLayout rl=findViewById(R.id.rl);
                TableLayout ll = findViewById(R.id.courses);
                EditText t1= findViewById(R.id.editText3);
                int n=Integer.parseInt(t1.getText().toString());
                //ll.removeAllViews();

                int i;
                for (i = 1; i <=n; i++) {

                    TableRow row= new TableRow(this);
                    TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT);
                    row.setLayoutParams(lp);

                    TextView t=new TextView(this);
                    t.setText(Integer.toString(i));


                    EditText sem = new EditText(this);
                    EditText cc = new EditText(this);
                    EditText ct = new EditText(this);
                    EditText grade = new EditText(this);
                    EditText fee = new EditText(this);

                    sem.setId(R.id.textView6+i);
                    cc.setId(R.id.textView7+i);
                    ct.setId(R.id.textView8+i);
                    grade.setId(R.id.textView9+i);
                    fee.setId(R.id.textView10+i);

                    row.addView(t);
                    row.addView(sem);
                    row.addView(cc);
                    row.addView(ct);
                    row.addView(grade);
                    row.addView(fee);
                    ll.addView(row,i);

                }
            TextView t=(TextView)findViewById(R.id.textView12);
            t.setText(Integer.toString(1000 * n));
            }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    //String s=e.getText().toString();

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                TableLayout ll = findViewById(R.id.courses);
                if (ll.getRootView() != null) {
                    int i = 1;
                    while (ll.getChildCount() != 1) {
                        ll.removeViewAt(i);
                    }
                }
                if(!TextUtils.isEmpty(s)){
                    addRows();
            }


    }

    @Override
    public void afterTextChanged(Editable s) {

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

        /*public void addRows(){
        TableLayout ll = findViewById(R.id.courses);
        EditText t1= findViewById(R.id.editText3);
        int n=Integer.parseInt(t1.getText().toString());

        int i;
        for (i = 1; i <=3; i++) {

            TableRow row= new TableRow(this);
            TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT);
            row.setLayoutParams(lp);

            TextView t=new TextView(this);
            t.setText(Integer.toString(i));

            EditText sem = new EditText(this);
            EditText cc = new EditText(this);
            EditText ct = new EditText(this);
            EditText grade = new EditText(this);
            EditText fee = new EditText(this);

            row.addView(t);
            row.addView(sem);
            row.addView(cc);
            row.addView(ct);
            row.addView(grade);
            row.addView(fee);
            ll.addView(row,i);
        }
    }*/
}
