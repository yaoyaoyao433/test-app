package com.handmark.pulltorefresh.library.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class LoadingView extends FrameLayout {
    public abstract void a();

    public abstract void a(float f);

    public abstract void b();

    public abstract void setFrameImageBackground(Drawable drawable);

    public abstract void setFrameImageVisibility(int i);

    public void setHeaderTextVisibility(int i) {
    }

    public void setLoadingDrawable(Drawable drawable) {
    }

    public void setLoadingVisibility(int i) {
    }

    public void setPullImageDrawable(Drawable drawable) {
    }

    public void setPullImageVisibility(int i) {
    }

    public void setPullLabel(String str) {
    }

    public void setRefreshingLabel(String str) {
    }

    public void setReleaseLabel(String str) {
    }

    public void setSubHeaderText(CharSequence charSequence) {
    }

    public void setSubTextColor(int i) {
    }

    public void setSubTextColor(ColorStateList colorStateList) {
    }

    public void setTextColor(int i) {
    }

    public void setTextColor(ColorStateList colorStateList) {
    }

    public LoadingView(Context context) {
        super(context);
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
