package com.example.snavadogru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Options extends AppCompatActivity implements View.OnClickListener {
Button bSSS,bRehberlik,bTakip,bSorular,bPuan,bKendiniDene;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        bSSS = findViewById(R.id.button1);
        bRehberlik = findViewById(R.id.button3);
        bTakip = findViewById(R.id.button5);
        bSorular = findViewById(R.id.button2);
        bPuan = findViewById(R.id.button4);
        bKendiniDene = findViewById(R.id.button6);
        bKendiniDene.setOnClickListener(this);
        bPuan.setOnClickListener(this);
        bSorular.setOnClickListener(this);
        bTakip.setOnClickListener(this);
        bRehberlik.setOnClickListener(this);
        bSSS.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case(R.id.button1):
                Intent ISSS= new Intent(Options.this,SSS.class);
                startActivity(ISSS);
                break;
            case (R.id.button2) :
                Intent ISorular = new Intent(Options.this,SORULAR.class);
                startActivity(ISorular);
                break;
            case (R.id.button3) :
                Intent IRehberlik = new Intent(Options.this,REHBERLİK.class);
                startActivity(IRehberlik);
                break;
            case (R.id.button4) :
                Intent IPuan = new Intent(Options.this,PUAN.class);
                startActivity(IPuan);
                break;
            case (R.id.button5) :
                Intent ITakip = new Intent(Options.this,TAKİP.class);
                startActivity(ITakip);
                break;
            case (R.id.button6) :
                Intent IKendiniDene = new Intent(Options.this,KENDİNİDENE.class);
                startActivity(IKendiniDene);
                break;





        }
    }
}
