// Generated code from Butter Knife. Do not modify!
package com.example.tonjies.abase.module.easy;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.tonjies.abase.R;
import com.example.tonjies.abase.view.EasyProgress;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EasyActivity_ViewBinding implements Unbinder {
  private EasyActivity target;

  @UiThread
  public EasyActivity_ViewBinding(EasyActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public EasyActivity_ViewBinding(EasyActivity target, View source) {
    this.target = target;

    target.easyProgress = Utils.findRequiredViewAsType(source, R.id.easyProgress, "field 'easyProgress'", EasyProgress.class);
    target.tvCurrentProgress = Utils.findRequiredViewAsType(source, R.id.tvCurrentProgress, "field 'tvCurrentProgress'", TextView.class);
    target.faButton = Utils.findRequiredViewAsType(source, R.id.faButton, "field 'faButton'", FloatingActionButton.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    EasyActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.easyProgress = null;
    target.tvCurrentProgress = null;
    target.faButton = null;
  }
}
