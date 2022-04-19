package com.example.UTS_GilangBudiman_191011401335;

        import androidx.appcompat.app.AppCompatActivity;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;
        import android.os.Bundle;
public class MainActivity extends AppCompatActivity {
    private WebView gilang_ElerningUnpamku;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gilang_ElerningUnpamku= new WebView(this);
        gilang_ElerningUnpamku.getSettings().setJavaScriptEnabled(true); //enable javascript
        final AppCompatActivity activity = this;
        gilang_ElerningUnpamku.setWebViewClient(new WebViewClient());
        gilang_ElerningUnpamku.loadUrl("https://e-learning.unpam.ac.id/");
        setContentView(gilang_ElerningUnpamku );
    }
}