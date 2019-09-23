package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_a,tv_b,tv_kq;
    EditText ed_a,ed_b;
    Button btnTong, btnHieu,btnTich,btnThuong,btnThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_a = (TextView)findViewById(R.id.textViewa);
        tv_b=(TextView)findViewById(R.id.textViewb);
        tv_kq=(TextView)findViewById(R.id.textView_kq);
        ed_a=(EditText)findViewById(R.id.editTexta);
        ed_b=(EditText)findViewById(R.id.editTextb);
        btnTong=(Button)findViewById(R.id.button_tong);
        btnHieu=(Button)findViewById(R.id.button_hieu);
        btnTich=(Button)findViewById(R.id.button_tich);
        btnThuong=(Button)findViewById(R.id.button_thuong);
        btnThoat=(Button)findViewById(R.id.button_thoat);
        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a= Float.parseFloat(ed_a.getText().toString());
                float b= Float.parseFloat(ed_b.getText().toString());
                TinhToan t= new TinhToan(a, b);
                tv_kq.setText(""+t.Tong(a,b));

            }
        });
        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a= Float.parseFloat(ed_a.getText().toString());
                float b= Float.parseFloat(ed_b.getText().toString());
                TinhToan t= new TinhToan(a, b);
                tv_kq.setText(""+t.Hieu(a,b));

            }
        });
        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a= Float.parseFloat(ed_a.getText().toString());
                float b= Float.parseFloat(ed_b.getText().toString());
                TinhToan t= new TinhToan(a, b);
                tv_kq.setText(""+t.Tich(a,b));

            }
        });
        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a= Float.parseFloat(ed_a.getText().toString());
                float b= Float.parseFloat(ed_b.getText().toString());
                TinhToan t= new TinhToan(a, b);
                tv_kq.setText(""+t.Thuong(a,b));

            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
