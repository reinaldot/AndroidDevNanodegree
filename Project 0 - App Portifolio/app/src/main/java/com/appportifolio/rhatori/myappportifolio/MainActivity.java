package com.appportifolio.rhatori.myappportifolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button popularMovies = (Button) findViewById(R.id.btnPopularMovies);
        Button stockHawk = (Button) findViewById(R.id.btnStockHawk);
        Button buildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        Button makeYourAppMaterial = (Button) findViewById(R.id.btnMakeYourAppMaterial);
        Button goUbiquitous = (Button) findViewById(R.id.btnGoUbiquitous);
        Button capstone = (Button) findViewById(R.id.btnCapstone);

        View.OnClickListener onClickAction = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(v);
            }
        };

        popularMovies.setOnClickListener(onClickAction);
        stockHawk.setOnClickListener(onClickAction);
        buildItBigger.setOnClickListener(onClickAction);
        makeYourAppMaterial.setOnClickListener(onClickAction);
        goUbiquitous.setOnClickListener(onClickAction);
        capstone.setOnClickListener(onClickAction);
    }

    protected void showToast(View v) {
        String message;

        switch (v.getId()) {
            case R.id.btnPopularMovies:
                message = this.buildToastMessage(getString(R.string.Toast_LaunchText), getString(R.string.btnPopularMovies_ToastText));
                break;
            case R.id.btnStockHawk:
                message = this.buildToastMessage(getString(R.string.Toast_LaunchText), getString(R.string.btnStockHawk_ToastText));
                break;
            case R.id.btnBuildItBigger:
                message = this.buildToastMessage(getString(R.string.Toast_LaunchText), getString(R.string.btnBuildItBigger_ToastText));
                break;
            case R.id.btnMakeYourAppMaterial:
                message = this.buildToastMessage(getString(R.string.Toast_LaunchText), getString(R.string.btnMakeYourAppMaterial_ToastText));
                break;
            case R.id.btnGoUbiquitous:
                message = this.buildToastMessage(getString(R.string.Toast_LaunchText), getString(R.string.btnGoUbiquitous_ToastText));
                break;
            case R.id.btnCapstone:
                message = this.buildToastMessage(getString(R.string.Toast_LaunchText), getString(R.string.btnCapstone_ToastText));
                break;
            default:
                message = getString(R.string.Toast_LaunchDefaultText);
        }

        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    private String buildToastMessage(String baseMessage, String arg)
    {
        return String.format(baseMessage, arg);
    }
}
