package com.summerproject.test20app.ui.libraries;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.summerproject.test20app.R;
import com.summerproject.test20app.ui.side_effects.indredients;

public class library_menu_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button library_cancer_button = findViewById(R.id.cancer_button);
        library_cancer_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.your_placeholder, new indredients());
                ft.addToBackStack(null);
                System.out.println("cancer pressed");
                ft.commit();
            }
        });

    }
}
