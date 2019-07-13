package com.example.tonghees;

/*
 * Copyright (C) 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tonghees.map.MapsActivity;

/**
 * Activity for entering a word.
 */

public class NewTaskActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.android.wordlistsql.REPLY";
    public static final String EXTRA_LOCATION = "com.example.android.wordlistsql.REPLYY";

    private EditText mEditTaskView;
    private EditText mEditLocView;
    private Button mPageMaps;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);
        mEditTaskView = findViewById(R.id.edit_word);
        mEditLocView = findViewById(R.id.edit_loc);


        Button mPageMaps = findViewById(R.id.btnMap);
        mPageMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapsIntent = new Intent(NewTaskActivity.this, MapsActivity.class);
                startActivity(mapsIntent);
            }
        });

        final Button button = findViewById(R.id.button_save);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                if (TextUtils.isEmpty(mEditTaskView.getText() )) {
                    setResult(RESULT_CANCELED, replyIntent);
                } else {
                    String tugas = mEditTaskView.getText().toString();
                    String loc = mEditLocView.getText().toString();

                    replyIntent.putExtra(EXTRA_REPLY, tugas);
                    replyIntent.putExtra(EXTRA_LOCATION, loc);

                    setResult(RESULT_OK, replyIntent);

                }
                finish();
            }
        });
    }
    }

