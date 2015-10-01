// Generated code from Butter Knife. Do not modify!
package de.nexxoo.tps;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ProductActivity$$ViewBinder<T extends de.nexxoo.tps.ProductActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131099649, "field 'webview'");
    target.webview = finder.castView(view, 2131099649, "field 'webview'");
  }

  @Override public void unbind(T target) {
    target.webview = null;
  }
}
