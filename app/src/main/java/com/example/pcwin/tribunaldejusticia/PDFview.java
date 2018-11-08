package com.example.pcwin.tribunaldejusticia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class PDFview extends AppCompatActivity {
    String url_pdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {

           url_pdf = bundle.getString("url_pdf");




        }

        setContentView(R.layout.activity_pdfview);
        WebView webview = (WebView) findViewById(R.id.webView);
        webview.getSettings().setJavaScriptEnabled(true);
        String pdf = "http://www.adobe.com/devnet/acrobat/pdfs/pdf_open_parameters.pdf";
        webview.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=" + url_pdf);
    }
}
