package com.example.android.attendance_management_system.logins;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.attendance_management_system.R;
import com.example.android.attendance_management_system.activities.FacultyPage;

public class LoginAdmin extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__admin);

        button=findViewById(R.id.loginbutton_admin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dipslayfacultyhomepage();
            }
        });

    }
    public void dipslayfacultyhomepage(){
        Intent intent=new Intent(this, FacultyPage.class);
        startActivity(intent);
    }
}
