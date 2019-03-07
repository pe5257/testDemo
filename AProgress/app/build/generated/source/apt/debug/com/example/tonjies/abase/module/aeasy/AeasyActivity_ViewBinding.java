// Generated code from Butter Knife. Do not modify!
package com.example.tonjies.abase.module.aeasy;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.tonjies.abase.R;
import com.example.tonjies.abase.view.AEasyProgress;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AeasyActivity_ViewBinding implements Unbinder {
  private AeasyActivity target;

  @UiThread
  public AeasyActivity_ViewBinding(AeasyActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AeasyActivity_ViewBinding(AeasyActivity target, View source) {
    this.target = target;

    target.easyProgress = Utils.findRequiredViewAsType(source, R.id.easyProgress, "field 'easyProgress'", AEasyProgress.class);
    target.tvCurrentProgress = Utils.findRequiredViewAsType(source, R.id.tvCurrentProgress, "field 'tvCurrentProgress'", TextView.class);
    target.faButton = Utils.findRequiredViewAsType(source, R.id.faButton, "field 'faButton'", FloatingActionButton.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AeasyActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.easyProgress = null;
    target.tvCurrentProgress = null;
    target.faButton = null;
  }
}
