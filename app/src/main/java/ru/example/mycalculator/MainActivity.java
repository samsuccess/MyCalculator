package ru.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private boolean sum;
    private boolean sub;
    private boolean div;
    private boolean mul;
    private boolean procent;
    private TextView display;
    Logic logic = new Logic();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

//
    }

    private void initViews() {
        display = findViewById(R.id.editText);

        Button button0 = findViewById(R.id.btn0);
        button0.setOnClickListener(this);

        Button button1 = findViewById(R.id.btn1);
        button1.setOnClickListener(this);

        Button button2 = findViewById(R.id.btn2);
        button2.setOnClickListener(this);

        Button button3 = findViewById(R.id.btn3);
        button3.setOnClickListener(this);

        Button button4 = findViewById(R.id.btn4);
        button4.setOnClickListener(this);

        Button button5 = findViewById(R.id.btn5);
        button5.setOnClickListener(this);

        Button button6 = findViewById(R.id.btn6);
        button6.setOnClickListener(this);

        Button button7 = findViewById(R.id.btn7);
        button7.setOnClickListener(this);

        Button button8 = findViewById(R.id.btn8);
        button8.setOnClickListener(this);

        Button button9 = findViewById(R.id.btn9);
        button9.setOnClickListener(this);

        Button buttonClear = findViewById(R.id.btnClear);
        buttonClear.setOnClickListener(this);

        Button buttonRes = findViewById(R.id.btnRes);
        buttonRes.setOnClickListener(this);

        Button buttonBack = findViewById(R.id.btnBack);
        buttonBack.setOnClickListener(this);

        Button buttonPoint = findViewById(R.id.btnPoint);
        buttonPoint.setOnClickListener(this);

        Button buttonProcent = findViewById(R.id.btnProcent);
        buttonProcent.setOnClickListener(this);

        Button buttonSign = findViewById(R.id.btnSign);
        buttonSign.setOnClickListener(this);

        Button buttonDiv = findViewById(R.id.btnDiv);
        buttonDiv.setOnClickListener(this);

        Button buttonMult = findViewById(R.id.btnMult);
        buttonMult.setOnClickListener(this);

        Button buttonSub = findViewById(R.id.btnSub);
        buttonSub.setOnClickListener(this);

        Button buttonSum = findViewById(R.id.btnSum);
        buttonSum.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn0: {
                display.append("0");
                break;
            }

            case R.id.btn1: {
                if (display.getText().toString().equals("0")) {
                    display.setText("");
                }
                display.append("1");
                break;
            }

            case R.id.btn2: {
                if (display.getText().toString().equals("0")) {
                    display.setText("");
                }
                display.append("2");
                break;
            }

            case R.id.btn3: {
                if (display.getText().toString().equals("0")) {
                    display.setText("");
                }
                display.append("3");
                break;
            }

            case R.id.btn4: {
                if (display.getText().toString().equals("0")) {
                    display.setText("");
                }
                display.append("4");
                break;
            }

            case R.id.btn5: {
                if (display.getText().toString().equals("0")) {
                    display.setText("");
                }
                display.append("5");
                break;
            }

            case R.id.btn6: {
                if (display.getText().toString().equals("0")) {
                    display.setText("");
                }
                display.append("6");
                break;
            }

            case R.id.btn7: {
                if (display.getText().toString().equals("0")) {
                    display.setText("");
                }
                display.append("7");
                break;
            }

            case R.id.btn8: {
                if (display.getText().toString().equals("0")) {
                    display.setText("");
                }
                display.append("8");
                break;
            }

            case R.id.btn9: {
                if (display.getText().toString().equals("0")) {
                    display.setText("");
                }
                display.append("9");
                break;
            }

            case R.id.btnClear: {
                display.setText("0");
                break;
            }

            case R.id.btnRes: {
                if (display.getText().toString().equals("0")) {
                    display.setText("0");
                }

                logic.setNum2(Double.parseDouble(display.getText() + ""));

                if (sum == true) {
                    display.setText(logic.sum() + "");
                    sum = false;
                }
                if (sub == true) {
                    display.setText(logic.sub() + "");
                    sub = false;
                }
                if (div == true) {
                    display.setText(logic.div() + "");
                    div = false;
                }
                if (mul == true) {
                    display.setText(logic.mul() + "");
                    mul = false;
                }

                if (procent == true) {
                    display.setText((logic.procent() + ""));
                    procent = false;
                }
                break;
            }

            case R.id.btnBack: {

                String t = display.getText().toString();

                if (t.isEmpty() || t.equals("0")) {
                    display.setText("0");
                } else {
                    display.setText(t.substring(0, t.length() - 1));
                }
                break;
            }

            case R.id.btnPoint: {
                if (display.getText().toString().equals("0")) {
                    display.setText("");
                }
                display.append(".");
                break;
            }

            case R.id.btnProcent: {
                if (display.getText().toString().equals("0")) {
                    display.setText("");
                }
                logic.setNum1(Double.parseDouble(display.getText() + ""));
                display.setText("0");
                procent = true;
                break;
            }

            case R.id.btnSign: {
                if (display.getText().toString().equals("0")) {
                    display.setText("");
                }
                display.append("-");
                break;
            }

            case R.id.btnDiv: {
                if (display.getText().toString().equals("0")) {
                    display.setText("");
                }
                logic.setNum1(Double.parseDouble(display.getText() + ""));
                display.setText("0");
                div = true;
                break;
            }

            case R.id.btnMult: {
                if (display.getText().toString().equals("0")) {
                    display.setText("");
                }
                logic.setNum1(Double.parseDouble(display.getText() + ""));
                display.setText("0");
                mul = true;
                break;
            }

            case R.id.btnSub: {
                if (display.getText().toString().equals("0")) {
                    display.setText("");
                }
                logic.setNum1(Double.parseDouble(display.getText() + ""));
                display.setText("0");
                sub = true;
                break;
            }

            case R.id.btnSum: {
                if (display.getText().toString().equals("0")) {
                    display.setText("");
                }
                logic.setNum1(Double.parseDouble(display.getText() + ""));
                sum = true;
                display.setText("0");
                break;
            }
        }

    }
}



