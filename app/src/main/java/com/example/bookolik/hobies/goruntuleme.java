package com.example.bookolik.hobies;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class goruntuleme extends AppCompatActivity {
Button ac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goruntuleme);
        ac=(Button) findViewById(R.id.button11);
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*WebView webview = (WebView) findViewById(R.id.site);
                webview.getSettings().setJavaScriptEnabled(true);
                webview.loadUrl("https://www.merlininkazani.com/");*/
                Intent intent =new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("www.google.com"));
                startActivity(intent);

            }
        });

    }
}
