package ru.example.mycalculator;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

abstract class BaseActivity extends AppCompatActivity {

    static final String nameSharedPreference = "THEMES";

    static final String theme = "THEME";
    static final int orangeCodeTheme = 1;
    static final int darkCodeTheme = 2;
    static final int blueCodeTheme = 3;

    protected int saveTheme;

    public void setSaveTheme(int saveTheme) {
        this.saveTheme = saveTheme;
    }

    public int getSaveTheme() {
        return saveTheme;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSaveTheme(getCodeStyle(orangeCodeTheme));
    }

    protected int getAppTheme(int codeStyle) {
        return codeStyleToStyleId(getCodeStyle(codeStyle));
    }

    private int codeStyleToStyleId(int codeStyle) {
        switch (codeStyle) {
            case orangeCodeTheme:
                return R.style.Orange_Theme;
            case darkCodeTheme:
                return R.style.Dark_Theme;
            case blueCodeTheme:
                return R.style.Blue_Theme;
        }
        return R.style.Theme_MyCalculator;
    }

    protected int getCodeStyle(int codeStyle) {
        SharedPreferences sharedPref = getSharedPreferences(nameSharedPreference, MODE_PRIVATE);
        return sharedPref.getInt(theme, codeStyle);
    }

    public void setTheme(int codeStyle) {
        SharedPreferences sharedPref = getSharedPreferences(nameSharedPreference, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(theme, codeStyle);
        editor.apply();
    }

}
