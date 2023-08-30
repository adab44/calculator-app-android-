package com.ada.hesapmak;

import static java.lang.Math.sqrt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText say1;  // burada tanımladık, butun methodlarda kullanabilmek icin
    EditText say2;
    TextView sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        say1 = findViewById(R.id.say1); //layout kısmında tamınlananları kodun içine tanımladık
        say2 = findViewById(R.id.say2);
        sonuc = findViewById(R.id.sonuc);


    }
    public void top(View view){
        if(say1.getText().toString().matches("")||say2.getText().toString().matches("")){//.matches icindeki krakterlerle eşleşiyor mu diye bakmak için
        sonuc.setText("sayı gir lütfen");
        }else {
            double sayi1 = Integer.parseInt(say1.getText().toString()); //stringi integera cevirip sayıyı karsıdan alıyor bunu yaparken de karşıdan
            double sayi2 = Integer.parseInt(say2.getText().toString()); // alınan say1 ve say2 yi sayı1 ve sayı2 ye atıyor
            double result = sayi1 + sayi2;
            sonuc.setText("Sonuc:  " + result);
        }
    }
    public void cık(View view){
        if(say1.getText().toString().matches("")||say2.getText().toString().matches("")){//.matches icindeki krakterlerle eşleşiyor mu diye bakmak için
            sonuc.setText("sayı gir lütfen");
        }else {
            double sayi1 = Integer.parseInt(say1.getText().toString()); //stringi integera cevirip sayıyı karsıdan alıyor bunu yaparken de karşıdan
            double sayi2 = Integer.parseInt(say2.getText().toString()); // alınan say1 ve say2 yi sayı1 ve sayı2 ye atıyor
            double result = sayi1 - sayi2;
            sonuc.setText("Sonuc:  " + result);
        }
    }

    public void carp(View view){
        if(say1.getText().toString().matches("")||say2.getText().toString().matches("")){//.matches icindeki krakterlerle eşleşiyor mu diye bakmak için
            sonuc.setText("sayı gir lütfen");
        }else {
            double sayi1 = Integer.parseInt(say1.getText().toString()); //stringi integera cevirip sayıyı karsıdan alıyor bunu yaparken de karşıdan
            double sayi2 = Integer.parseInt(say2.getText().toString()); // alınan say1 ve say2 yi sayı1 ve sayı2 ye atıyor
            double result = sayi1 * sayi2;
            sonuc.setText("Sonuc:  " + result);
        }
    }
    public void bol(View view){
        if(say1.getText().toString().matches("")||say2.getText().toString().matches("")){//.matches icindeki krakterlerle eşleşiyor mu diye bakmak için
            sonuc.setText("sayı gir lütfen");
        }else {
            double sayi1 = Integer.parseInt(say1.getText().toString()); //stringi integera cevirip sayıyı karsıdan alıyor bunu yaparken de karşıdan
            double sayi2 = Integer.parseInt(say2.getText().toString()); // alınan say1 ve say2 yi sayı1 ve sayı2 ye atıyor
            double result = sayi1 / sayi2;
            sonuc.setText("Sonuc:  " + result);
        }
    }
    public void kok(View view){
        if(say1.getText().toString().matches("")||say2.getText().toString().matches("")){//.matches icindeki krakterlerle eşleşiyor mu diye bakmak için
            sonuc.setText("sayı gir lütfen");
        }else {
            double sayi1 = Integer.parseInt(say1.getText().toString()); //stringi integera cevirip sayıyı karsıdan alıyor bunu yaparken de karşıdan
            double sayi2 = Integer.parseInt(say2.getText().toString());
            double result = sqrt(sayi1);
            double result2=sqrt(sayi2);
            sonuc.setText(" Sayı1 için Sonuc:  " + result +"  "+" Sayı2 icin Sonuc:  " + result2);
        }
    }
    public void kare(View view){
        if(say1.getText().toString().matches("")||say2.getText().toString().matches("")){//.matches icindeki krakterlerle eşleşiyor mu diye bakmak için
            sonuc.setText("sayı gir lütfen");
        }else {
            double sayi1 = Integer.parseInt(say1.getText().toString());//stringi integera cevirip sayıyı karsıdan alıyor bunu yaparken de karşıdan
            double sayi2 = Integer.parseInt(say2.getText().toString());
            double result = sayi1 * sayi1;
            double result2 = sayi2 * sayi2;
            sonuc.setText(" Sayı1 icin Sonuc:  " + result +"  "+ " Sayı2 icin Sonuc:  " + result2);
        }
    }

}