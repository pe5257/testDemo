// Generated code from Butter Knife. Do not modify!
package com.example.tonjies.abase.module.example;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.tonjies.abase.R;
import com.example.tonjies.abase.view.ProgressView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ExampleActivity_ViewBinding implements Unbinder {
  private ExampleActivity target;

  @UiThread
  public ExampleActivity_ViewBinding(ExampleActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ExampleActivity_ViewBinding(ExampleActivity target, View source) {
    this.target = target;

    target.progressView = Utils.findRequiredViewAsType(source, R.id.progressView, "field 'progressView'", ProgressView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ExampleActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.progressView = null;
  }
}
