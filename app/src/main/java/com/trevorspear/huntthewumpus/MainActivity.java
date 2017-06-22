package com.trevorspear.huntthewumpus;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mStart_btn = (Button) findViewById(R.id.btn_Start);
        mStart_btn.setOnClickListener(
            new Button.OnClickListener() {
                public void onClick(View v) {

                    //New intent

                }
            }
        );

        Button mLeaderBoards_btn = (Button) findViewById(R.id.btn_LeaderBoards);
        mLeaderBoards_btn.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        //New intent

                    }
                }
        );

        Button mOptions_btn = (Button) findViewById(R.id.btn_Options);
        mOptions_btn.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        //New intent

                    }
                }
        );

    }
}
