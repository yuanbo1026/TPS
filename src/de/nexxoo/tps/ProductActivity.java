package de.nexxoo.tps;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by b.yuan on 01.10.2015.
 */
public class ProductActivity extends Activity {
	@Bind(R.id.webview) WebView webview;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.product);
		ButterKnife.bind(this);

		webview.setWebViewClient(new WebViewClient());
		webview.getSettings().setJavaScriptEnabled(true);
		webview.loadUrl("http://www.google.com");

	}
}