package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

	public static final String EXTRA_MSG = "com.example,myfirstapp.MESSAGE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch (item.getItemId()) {
		case R.id.action_search:
			//TODO: openSearch();
			return true;
		case R.id.action_settings:
			//TODO: openSettings();
			return true;

		default:
			return super.onOptionsItemSelected(item);
		}

	}

	public void sendMsg(View view) {
		Intent intent = new Intent(this, DisplayMessageActivity.class);
		EditText txt = (EditText) this.findViewById(R.id.edit_message);
		String msg = txt.getText().toString();
		intent.putExtra(EXTRA_MSG, msg);
		this.startActivity(intent);
	}
}
