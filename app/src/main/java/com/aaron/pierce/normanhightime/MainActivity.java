package com.aaron.pierce.normanhightime;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.content.Context;

import com.aaron.pierce.nhstime.R;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        // Do Here what ever you want do on back press;
    }
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = (WebView) findViewById(R.id.viewWeb);
        webView.loadUrl("saxten2011.github.io/NhsTime/public/freshman.html");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        findViewById(R.id.viewWeb).setVisibility(View.INVISIBLE);
        findViewById(R.id.flayout).setVisibility(View.INVISIBLE);






        if(readFromFile().equals("freshman")){
            LinearLayout layout = (LinearLayout) findViewById(R.id.splash);
            layout.setVisibility(View.INVISIBLE);

            WebView mWebview ;
            mWebview  = new WebView(this);

            mWebview.getSettings().setJavaScriptEnabled(true); // enable javascript

            final Activity activity = this;

            mWebview.setWebViewClient(new WebViewClient() {
                public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                    Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
                }
            });
            setContentView(mWebview );

            mWebview.loadUrl("https://saxten2011.github.io/NhsTime/public/freshman.html");
            Toast.makeText(getApplicationContext(), //Context
                    "Press Back To Change Grade", // Message to display
                    Toast.LENGTH_SHORT // Duration of the message, another possible value is Toast.LENGTH_LONG
            ).show(); //Finally Show the toast

            writeToFile("freshman");




        }else if(readFromFile().equals("sophomore")){
            LinearLayout layout = (LinearLayout) findViewById(R.id.splash);
            layout.setVisibility(View.INVISIBLE);
            WebView mWebview ;
            mWebview  = new WebView(this);

            mWebview.getSettings().setJavaScriptEnabled(true); // enable javascript

            final Activity activity = this;
            mWebview.loadUrl("https://saxten2011.github.io/NhsTime/public/sophomore.html");
            mWebview.setWebViewClient(new WebViewClient() {
                public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                    Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
                }
            });


            setContentView(mWebview );
            Toast.makeText(getApplicationContext(), //Context
                    "Press Back To Change Grade", // Message to display
                    Toast.LENGTH_SHORT // Duration of the message, another possible value is Toast.LENGTH_LONG
            ).show(); //Finally Show the toast
            writeToFile("sophomore");

        }else if(readFromFile().equals("junior")){
            LinearLayout layout = (LinearLayout) findViewById(R.id.splash);
            layout.setVisibility(View.INVISIBLE);
            WebView mWebview ;
            mWebview  = new WebView(this);

            mWebview.getSettings().setJavaScriptEnabled(true); // enable javascript

            final Activity activity = this;
            mWebview.loadUrl("https://saxten2011.github.io/NhsTime/public/junior.html");
            mWebview.setWebViewClient(new WebViewClient() {
                public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                    Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
                }
            });


            setContentView(mWebview );
            Toast.makeText(getApplicationContext(), //Context
                    "Press Back To Change Grade", // Message to display
                    Toast.LENGTH_SHORT // Duration of the message, another possible value is Toast.LENGTH_LONG
            ).show(); //Finally Show the toast
            writeToFile("junior");

        }else if(readFromFile().equals("senior")){
            LinearLayout layout = (LinearLayout) findViewById(R.id.splash);
            layout.setVisibility(View.INVISIBLE);
            WebView mWebview ;
            mWebview  = new WebView(this);

            mWebview.getSettings().setJavaScriptEnabled(true); // enable javascript

            final Activity activity = this;
            mWebview.loadUrl("https://saxten2011.github.io/NhsTime/public/senior.html");
            mWebview.setWebViewClient(new WebViewClient() {
                public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                    Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
                }
            });


            setContentView(mWebview );
            Toast.makeText(getApplicationContext(), //Context
                    "Press Back To Change Grade", // Message to display
                    Toast.LENGTH_SHORT // Duration of the message, another possible value is Toast.LENGTH_LONG
            ).show(); //Finally Show the toast
            writeToFile("senior");

        }
    }
//app update please



    public void freshman(View view){

        LinearLayout layout = (LinearLayout) findViewById(R.id.splash);
        layout.setVisibility(View.INVISIBLE);

        WebView mWebview ;
        mWebview  = new WebView(this);

        mWebview.getSettings().setJavaScriptEnabled(true); // enable javascript

        final Activity activity = this;

        mWebview.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
        });
        setContentView(mWebview);
        mWebview.loadUrl("https://saxten2011.github.io/NhsTime/public/freshman.html");
        Toast.makeText(getApplicationContext(), //Context
                "Press Back To Change Grade", // Message to display
                Toast.LENGTH_SHORT // Duration of the message, another possible value is Toast.LENGTH_LONG
        ).show(); //Finally Show the toast

        writeToFile("freshman");




    }

    public void sophomore(View view){
        LinearLayout layout = (LinearLayout) findViewById(R.id.splash);
        layout.setVisibility(View.INVISIBLE);
        WebView mWebview ;
        mWebview  = new WebView(this);

        mWebview.getSettings().setJavaScriptEnabled(true); // enable javascript
        mWebview.loadUrl("https://saxten2011.github.io/NhsTime/public/sophomore.html");
        setContentView(mWebview);
        final Activity activity = this;
        mWebview.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
        });

        Toast.makeText(getApplicationContext(), //Context
                "Press Back To Change Grade", // Message to display
                Toast.LENGTH_SHORT // Duration of the message, another possible value is Toast.LENGTH_LONG
        ).show(); //Finally Show the toast

        writeToFile("sophomore");
    }

    public void junior(View view){
        LinearLayout layout = (LinearLayout) findViewById(R.id.splash);
        layout.setVisibility(View.INVISIBLE);
        WebView mWebview ;
        mWebview  = new WebView(this);

        mWebview.getSettings().setJavaScriptEnabled(true); // enable javascript
        mWebview.loadUrl("https://saxten2011.github.io/NhsTime/public/junior.html");
        setContentView(mWebview );
        final Activity activity = this;

        mWebview.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
        });

        Toast.makeText(getApplicationContext(), //Context
                "Press Back To Change Grade", // Message to display
                Toast.LENGTH_SHORT // Duration of the message, another possible value is Toast.LENGTH_LONG
        ).show(); //Finally Show the toast

        writeToFile("junior");
    }

    public void senior(View view){

        LinearLayout layout = (LinearLayout) findViewById(R.id.splash);
        layout.setVisibility(View.INVISIBLE);
        WebView mWebview ;
        mWebview  = new WebView(this);

        mWebview.getSettings().setJavaScriptEnabled(true); // enable javascript

        final Activity activity = this;
        mWebview.loadUrl("https://saxten2011.github.io/NhsTime/public/senior.html");
        mWebview.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
        });

        mWebview.loadUrl("https://saxten2011.github.io/NhsTime/public/senior.html");
        setContentView(mWebview );
        Toast.makeText(getApplicationContext(), //Context
                "Press Back To Change Grade", // Message to display
                Toast.LENGTH_SHORT // Duration of the message, another possible value is Toast.LENGTH_LONG
        ).show(); //Finally Show the toast
        writeToFile("senior");


    }
    private void writeToFile(String data) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput("grade.txt", Context.MODE_PRIVATE));
            outputStreamWriter.write(data);
            outputStreamWriter.close();
        }
        catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }
    }

    private String readFromFile() {

        String ret = "";

        try {
            InputStream inputStream = openFileInput("grade.txt");

            if ( inputStream != null ) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String receiveString = "";
                StringBuilder stringBuilder = new StringBuilder();

                while ( (receiveString = bufferedReader.readLine()) != null ) {
                    stringBuilder.append(receiveString);
                }

                inputStream.close();
                ret = stringBuilder.toString();
            }
        }
        catch (FileNotFoundException e) {
            Log.e("login activity", "File not found: " + e.toString());
        } catch (IOException e) {
            Log.e("login activity", "Can not read file: " + e.toString());
        }

        return ret;
    }

    public void myappwontupdate(){
        //add a comment here if no changes are building
        //grrr
        //uhhhh
        //cmon
        //ahh
        //comne on
        //comne on
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

            writeToFile("");
            Intent i = getBaseContext().getPackageManager()
                    .getLaunchIntentForPackage( getBaseContext().getPackageName() );
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            return false;
        }

        return super.onKeyDown(keyCode, event);
    }

}

