package sg.edu.rp.c346.id21007466.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDisplay=findViewById(R.id.textViewDisplay);
        btnDisplay=findViewById(R.id.buttonDisplay);
        etInput=findViewById(R.id.editTextInput);
        tbtn=findViewById(R.id.toggleButtonEnabled);
        rgGender=findViewById(R.id.radioButtonGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);

            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action

                if(tbtn.isChecked()){
                    etInput.setEnabled(true);

                }else{
                    etInput.setEnabled(false);
                }





            }
        });
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if (checkedRadioId == R.id.radioButtonGenderMale) {
                    // Code when male is selected
                    stringResponse = "He says \"" + stringResponse + "\"";
                } else {
                    // Code when female is selected
                    stringResponse = "She says \"" + stringResponse + "\"";
                }
                tvDisplay.setText(stringResponse);
            }
        });


    }
}