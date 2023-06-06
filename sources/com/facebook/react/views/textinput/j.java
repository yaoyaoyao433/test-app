package com.facebook.react.views.textinput;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.widget.EditText;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j {
    final SpannableStringBuilder a;
    final float b;
    final int c;
    final int d;
    final int e;
    final int f;
    final CharSequence g;

    public j(EditText editText) {
        this.a = new SpannableStringBuilder(editText.getText());
        this.b = editText.getTextSize();
        this.e = editText.getInputType();
        this.g = editText.getHint();
        this.c = editText.getMinLines();
        this.d = editText.getMaxLines();
        if (Build.VERSION.SDK_INT >= 23) {
            this.f = editText.getBreakStrategy();
        } else {
            this.f = 0;
        }
    }
}
