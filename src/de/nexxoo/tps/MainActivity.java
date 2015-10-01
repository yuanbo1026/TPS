package de.nexxoo.tps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {
	@Bind(R.id.product_button) Button product_button;
	@OnClick(R.id.product_button) void onClick(){
		Intent i = new Intent(MainActivity.this, ProductActivity.class);
		startActivity(i);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ButterKnife.bind(this);

	}
}
