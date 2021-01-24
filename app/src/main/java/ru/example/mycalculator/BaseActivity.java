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
    static final int defaultCodeTheme = 4;

    protected int saveTheme;
    protected int choosTheme;

    public void setChoosTheme(int choosTheme) {
        this.choosTheme = choosTheme;
    }

    public int getChoosTheme() {
        return choosTheme;
    }

    public void setSaveTheme(int saveTheme) {
        this.saveTheme = saveTheme;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSaveTheme(getAppTheme(defaultCodeTheme));
        setChoosTheme(getAppTheme(defaultCodeTheme));
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

    public void setAppTheme(int codeStyle) {
        SharedPreferences sharedPref = getSharedPreferences(nameSharedPreference, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(theme, codeStyle);
        editor.apply();
    }

}
