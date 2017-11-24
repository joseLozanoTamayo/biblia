package org.biblia;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.biblia.R;


/**
 * Created by haade on 13/09/2017.
 */

public class AntiguoTestamento extends Fragment {

    private Button boton;
    private EditText edit;
    private TextView text;

    //Constructor default
    public AntiguoTestamento(){};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View antiguoTestamento = inflater
                .inflate(R.layout.antiguo_testamento, container, false);

   /*   boton = (Button)antiguoTestamento.findViewById(R.id.main_button);
        edit  = (EditText)antiguoTestamento.findViewById(R.id.main_editText);
        text  = (TextView)antiguoTestamento.findViewById(R.id.main_textview);

        text.setText("TEXT NEW....");

        boton.setOnClickListener( new View.OnClickListener() {

            public void onClick(View view){

                String mensaje = edit.getText().toString();
                text.setText(String.valueOf(mensaje.length()));

            }

        });*/

        return antiguoTestamento;
    }
}
