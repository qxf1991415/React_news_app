package com.qxf.newsapp.base;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.qxf.newsapp.R;

public class SettingActivity extends BaseActivity implements View.OnClickListener {

    private Button mReact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentLayout(R.layout.activity_setting);
        initSettingView();
    }

    protected void initSettingView() {
        mReact = findViewById(R.id.react);
        mReact.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.react:
                Intent intent = new Intent(this, MyReactActivity.class);
                startActivity(intent);
                break;
        }
    }
}
