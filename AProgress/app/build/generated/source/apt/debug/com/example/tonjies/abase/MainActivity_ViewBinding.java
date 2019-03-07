// Generated code from Butter Knife. Do not modify!
package com.example.tonjies.abase;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131230756;

  private View view2131230757;

  private View view2131230758;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_01, "field 'btn01' and method 'onViewClicked'");
    target.btn01 = Utils.castView(view, R.id.btn_01, "field 'btn01'", Button.class);
    view2131230756 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_02, "field 'btn02' and method 'onViewClicked'");
    target.btn02 = Utils.castView(view, R.id.btn_02, "field 'btn02'", Button.class);
    view2131230757 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_03, "field 'btn03' and method 'onViewClicked'");
    target.btn03 = Utils.castView(view, R.id.btn_03, "field 'btn03'", Button.class);
    view2131230758 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btn01 = null;
    target.btn02 = null;
    target.btn03 = null;

    view2131230756.setOnClickListener(null);
    view2131230756 = null;
    view2131230757.setOnClickListener(null);
    view2131230757 = null;
    view2131230758.setOnClickListener(null);
    view2131230758 = null;
  }
}
