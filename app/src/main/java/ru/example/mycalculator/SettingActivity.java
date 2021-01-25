package ru.example.mycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.radiobutton.MaterialRadioButton;

public class SettingActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(getAppTheme(getChoosTheme()));
        setContentView(R.layout.activity_setting);
        initThemeChooser();
        initButtonBack();
    }

    private void initThemeChooser() {
        initRadioButton(findViewById(R.id.radioButtonOrange), orangeCodeTheme);
        initRadioButton(findViewById(R.id.radioButtonDark), darkCodeTheme);
        initRadioButton(findViewById(R.id.radioButtonBlue), blueCodeTheme);
        initRadioButton(findViewById(R.id.radioButtonDefault), defaultCodeTheme);
        RadioGroup rg = findViewById(R.id.radioButtons);
//        ((MaterialRadioButton) rg.getChildAt(getChooseTheme(defaultCodeTheme))).setChecked(true);
    }

    private void initRadioButton(View button, final int code) {
        button.setOnClickListener(v -> {
            setSaveTheme(getChoosTheme());
            setAppTheme(code);
            recreate();

        });
    }

    private void initButtonBack() {
        Button butBack = findViewById(R.id.but_back);
        butBack.setOnClickListener(v -> {
            setResult(RESULT_OK);
            finish();
        });
    }
}