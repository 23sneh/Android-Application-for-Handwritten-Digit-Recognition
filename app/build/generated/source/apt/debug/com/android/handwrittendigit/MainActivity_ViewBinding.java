// Generated code from Butter Knife. Do not modify!
package com.android.handwrittendigit;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.detectButton = Utils.findRequiredView(source, R.id.button_detect, "field 'detectButton'");
    target.clearButton = Utils.findRequiredView(source, R.id.button_clear, "field 'clearButton'");
    target.mResultText = Utils.findRequiredViewAsType(source, R.id.text_result, "field 'mResultText'", TextView.class);
    target.paintView = Utils.findRequiredViewAsType(source, R.id.paintView, "field 'paintView'", PaintView.class);
    target.previewImage = Utils.findRequiredViewAsType(source, R.id.preview_image, "field 'previewImage'", ImageView.class);
    target.inferencePreview = Utils.findRequiredViewAsType(source, R.id.inference_preview, "field 'inferencePreview'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.detectButton = null;
    target.clearButton = null;
    target.mResultText = null;
    target.paintView = null;
    target.previewImage = null;
    target.inferencePreview = null;
  }
}
