// Generated code from Butter Knife. Do not modify!
package com.example.tonjies.abase.module.refrence;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.tonjies.abase.R;
import com.example.tonjies.abase.view.ProgressView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ReferenceActivity_ViewBinding implements Unbinder {
  private ReferenceActivity target;

  @UiThread
  public ReferenceActivity_ViewBinding(ReferenceActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ReferenceActivity_ViewBinding(ReferenceActivity target, View source) {
    this.target = target;

    target.progressView = Utils.findRequiredViewAsType(source, R.id.progressView, "field 'progressView'", ProgressView.class);
    target.tv = Utils.findRequiredViewAsType(source, R.id.tv, "field 'tv'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ReferenceActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.progressView = null;
    target.tv = null;
  }
}
