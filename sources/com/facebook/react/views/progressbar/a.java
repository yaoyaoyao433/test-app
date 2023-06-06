package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends FrameLayout {
    boolean a;
    boolean b;
    double c;
    @Nullable
    ProgressBar d;
    @Nullable
    private Integer e;

    public a(Context context) {
        super(context);
        this.a = true;
        this.b = true;
    }

    public final void setStyle(@Nullable String str) {
        this.d = ReactProgressBarViewManager.createProgressBar(getContext(), ReactProgressBarViewManager.getStyleFromString(str));
        this.d.setMax(1000);
        removeAllViews();
        addView(this.d, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void setColor(@Nullable Integer num) {
        this.e = num;
    }

    public final void setIndeterminate(boolean z) {
        this.a = z;
    }

    public final void setProgress(double d) {
        this.c = d;
    }

    public final void setAnimating(boolean z) {
        this.b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setColor(ProgressBar progressBar) {
        Drawable progressDrawable;
        if (progressBar.isIndeterminate()) {
            progressDrawable = progressBar.getIndeterminateDrawable();
        } else {
            progressDrawable = progressBar.getProgressDrawable();
        }
        if (progressDrawable == null) {
            return;
        }
        if (this.e != null) {
            progressDrawable.setColorFilter(this.e.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            progressDrawable.clearColorFilter();
        }
    }
}
