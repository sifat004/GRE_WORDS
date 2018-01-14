// Generated code from Butter Knife. Do not modify!
package com.sifatsdroid.U_GRE;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MyActivity$$ViewInjector {
  public static void inject(Finder finder, final com.sifatsdroid.U_GRE.MyActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230757, "field 'flingContainer'");
    target.flingContainer = (com.sifatsdroid.flingswipe.SwipeFlingAdapterView) view;
    view = finder.findRequiredView(source, 2131230758, "method 'right'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.right();
        }
      });
  }

  public static void reset(com.sifatsdroid.U_GRE.MyActivity target) {
    target.flingContainer = null;
  }
}
