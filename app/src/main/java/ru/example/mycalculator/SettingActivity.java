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
//        ((MaterialRadioButton) rg.getChildAt(getCodeStyle(defaultCodeTheme))).setChecked(true);
    }

    private void initRadioButton(View button, final int codestyle) {
        button.setOnClickListener(v -> {
            setSaveTheme(getChoosTheme());
            setAppTheme(codestyle);
            recreate();

        });
    }

    private void initButtonBack() {
        Button butBack = findViewById(R.id.but_back);
        butBack.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}