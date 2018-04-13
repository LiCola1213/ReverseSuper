package com.model.licola.reversesuper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    AccountManager impl = new AccountManagerImpl();

    Log.d("MainActivity", impl.reverseMethod("调用方法"));
  }
}
