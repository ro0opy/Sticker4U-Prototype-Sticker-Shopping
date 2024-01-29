package com.example.sticker4uv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        WebView webView = findViewById(R.id.webView);

        // Load HTML content with CSS styling and member images
        String htmlContent = "<html>" +
                "<head>" +
                "<style>" +
                "   body { font-family: 'Arial', sans-serif; background-color: #50d8d7;\n" +
                "background-image: linear-gradient(316deg, #50d8d7 0%, #923993 74%);\n color: white; }" +
                "   h1 { color: #007BFF; }" +
                "   .member-profile { margin-bottom: 20px; }" +
                "   .member-name { font-weight: bold; color: white; }" +
                "   .member-description { color: white; }" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<h1>About Us</h1>" +
                "<p>Welcome to Sticker4U, where innovation thrives, and creativity meets expertise through stickers. We are also student from Bachelor of Information Technology in UiTM Shah Alam." +
                " Founded by Rohaizad, our team leader, we are a team of diverse talents dedicated to delivering exceptional products and services which is Whatsapp's stickers." +
                " With Hafiz's back-end developer, Shazreen's front-end developer, and Uzair's UI Designer, we embody a commitment to excellence." +
                " At Sticker4U, we innovate, inspire, and impact—making excellence our way of life. Join us on this exciting journey!</p>" +
                "<br>" +
                "<div class='member-profile'>" +
                "   <img src='rohaizad' alt='Rohaizad' width='100' height='100'>" +
                "   <p class='member-name'>MOHD ROHAIZAD BIN ZAINAL ABIDIN</p>" +
                "   <p class='member-description'>2021124273</p>" +
                "</div>" +
                "<div class='member-profile'>" +
                "   <img src='shazreen' alt='Shazreen' width='100' height='100'>" +
                "   <p class='member-name'>MUHAMMAD SHAZREEN AFFANDI BIN SHAHIZAN AFFANDI</p>" +
                "   <p class='member-description'>2021888694</p>" +
                "</div>" +
                "<div class='member-profile'>" +
                "   <img src='hafiz' alt='Hafiz' width='100' height='100'>" +
                "   <p class='member-name'>ABD HAFIZ DARWISY BIN ABD BARI</p>" +
                "   <p class='member-description'>2021600614</p>" +
                "</div>" +
                "<div class='member-profile'>" +
                "   <img src='uzair' alt='Uzair' width='100' height='100'>" +
                "   <p class='member-name'>UZAIR BIN KASSIM</p>" +
                "   <p class='member-description'>2021340557</p>" +
                "</div>" +
                "</body>" +
                "</html>";

        webView.loadDataWithBaseURL("file:///android_res/drawable/", htmlContent, "text/html", "utf-8", null);
    }
}
