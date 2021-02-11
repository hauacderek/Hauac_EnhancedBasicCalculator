package mcm.edu.ph.hauac_enhancedbasiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonadd, buttonsub, buttondiv, buttonmul, buttonmod;
        buttonadd = findViewById(R.id.buttonadd);
        buttonsub = findViewById(R.id.buttonsub);
        buttondiv = findViewById(R.id.buttondiv);
        buttonmul = findViewById(R.id.buttonmul);
        buttonmod = findViewById(R.id.buttonmod);
        buttonadd.setOnClickListener(this);
        buttonsub.setOnClickListener(this);
        buttondiv.setOnClickListener(this);
        buttonmul.setOnClickListener(this);
        buttonmod.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        EditText editoperand1, editoperand2;
        TextView showresult;
        editoperand1 = findViewById(R.id.editoperand1);
        editoperand2 = findViewById(R.id.editoperand2);
        showresult = findViewById(R.id.showresult);
        Double operand1 = 0.0;
        Double operand2 = 0.0;
        Double result = 0.0;
        operand1 = Double.parseDouble(editoperand1.getText().toString());
        operand2 = Double.parseDouble(editoperand2.getText().toString());
        switch (v.getId()){
            case R.id.buttonadd:
                showresult.setText(Double.toString(doAddition(operand1, operand2)));
                break;
        }
        switch (v.getId()){
            case R.id.buttonsub:
                showresult.setText(Double.toString(doSubtraction(operand1, operand2)));
                break;
        }
        switch (v.getId()){
            case R.id.buttondiv:
                showresult.setText(Double.toString(doDivision(operand1, operand2)));
                break;
        }
        switch (v.getId()){
            case R.id.buttonmul:
                showresult.setText(Double.toString(doMultiplication(operand1, operand2)));
                break;
        }
        switch (v.getId()){
            case(R.id.buttonmod):
                showresult.setText(Double.toString(doModulo(operand1, operand2)));
                break;
        }
    }
    public static double doAddition(double operand1, double operand2){
        return operand1 + operand2;
    }
    public static double doSubtraction(double operand1, double operand2){
        return operand1 - operand2;
    }
    public static double doDivision(double operand1, double operand2){
        return operand1 / operand2;
    }
    public static double doMultiplication(double operand1, double operand2){
        return operand1 * operand2;
    }
    public static double doModulo(double operand1, double operand2){
        return operand1 % operand2;
    }
}