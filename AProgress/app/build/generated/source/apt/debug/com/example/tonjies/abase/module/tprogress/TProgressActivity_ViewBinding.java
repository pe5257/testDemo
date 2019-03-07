// Generated code from Butter Knife. Do not modify!
package com.example.tonjies.abase.module.tprogress;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.tonjies.abase.R;
import com.example.tonjies.abase.module.refrence.TProgress;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TProgressActivity_ViewBinding implements Unbinder {
  private TProgressActivity target;

  @UiThread
  public TProgressActivity_ViewBinding(TProgressActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TProgressActivity_ViewBinding(TProgressActivity target, View source) {
    this.target = target;

    target.tvCurrentProgress = Utils.findRequiredViewAsType(source, R.id.tvCurrentProgress, "field 'tvCurrentProgress'", TextView.class);
    target.faButton = Utils.findRequiredViewAsType(source, R.id.faButton, "field 'faButton'", FloatingActionButton.class);
    target.easyProgress = Utils.findRequiredViewAsType(source, R.id.easyProgress, "field 'easyProgress'", TProgress.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TProgressActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvCurrentProgress = null;
    target.faButton = null;
    target.easyProgress = null;
  }
}
