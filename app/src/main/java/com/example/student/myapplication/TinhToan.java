package com.example.student.myapplication;


public class TinhToan {
    float a, b;

    public TinhToan(float a, float b) {
        this.a = a;
        this.b = b;
    }

        public float Tong(float a, float b) {
             return a + b;
         }
        public float Hieu( float a, float b)
        {
            return a - b;
        }

        public float Tich( float a, float b)
        {
            return a * b;
        }

        public float Thuong( float a, float b)
        {
            return a / b;
        }


}

