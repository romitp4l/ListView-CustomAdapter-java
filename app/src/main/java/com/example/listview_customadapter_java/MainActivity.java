package com.example.listview_customadapter_java;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvteachers;

    ArrayList<Teacher> teachers = Teacher.get10RandomTeachers();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        lvteachers = findViewById(R.id.lvTeachers);

        TeacherAdapter teacherAdapter = new TeacherAdapter();
        lvteachers.setAdapter(teacherAdapter);


    }


    class TeacherAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return teachers.size();
        }

        @Override
        public Teacher getItem(int position) {
            return teachers.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
           @SuppressLint("ViewHolder") View itemView = getLayoutInflater().inflate(
                   R.layout.list_item_teacher,
                   parent,
                   false
           );
            TextView tvName = itemView.findViewById(R.id.tvName);
            TextView tvCourse = itemView.findViewById(R.id.tvCourse);

            tvName.setText(getItem(position).getName());
            tvCourse.setText(getItem(position).getCourse());

            return  itemView;
        }

    }
}