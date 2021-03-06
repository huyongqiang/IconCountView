package com.sunbinqiang.praiseviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.sunbinqiang.iconcountview.IconCountView;

public class MainActivity extends AppCompatActivity {

    private IconCountView praiseView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        praiseView = (IconCountView) findViewById(R.id.praise_view1);
        //
        final EditText editText = (EditText) findViewById(R.id.edit_text);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                praiseView.setCount(Long.valueOf(editText.getText().toString()));
            }
        });
    }

}
