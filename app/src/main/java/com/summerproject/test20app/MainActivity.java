package com.summerproject.test20app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.summerproject.test20app.ui.libraries.library_menu;
import com.summerproject.test20app.ui.home.history_menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //

        // set the fragment to be HomeFragment by default when the app starts
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.your_placeholder, new history_menu());
        ft.commit();

        Button library_button = findViewById(R.id.library_menu_button);
        library_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.your_placeholder, new library_menu());
                ft.addToBackStack(null);
                System.out.println("library menu pressed");
                ft.commit();
            }
        });

    }

}