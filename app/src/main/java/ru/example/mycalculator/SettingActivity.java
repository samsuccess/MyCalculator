package ru.example.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import com.google.android.material.radiobutton.MaterialRadioButton;

public class SettingActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initThemeChooser();
        setContentView(R.layout.activity_setting);

        initButtonBack();
    }

    private void initThemeChooser() {
        initRadioButton(findViewById(R.id.radioButtonOrange), orangeCodeTheme);
        initRadioButton(findViewById(R.id.radioButtonDark), darkCodeTheme);
        initRadioButton(findViewById(R.id.radioButtonBlue), blueCodeTheme);
    }

    private void initRadioButton(View button, final int codeStyle) {
        button.setOnClickListener(v -> {
            setTheme(codeStyle);
            recreate();
        });
    }

    private void initButtonBack() {
        Button butBack = findViewById(R.id.but_back);
        butBack.setOnClickListener(v -> {
            finish();
        });
    }
}