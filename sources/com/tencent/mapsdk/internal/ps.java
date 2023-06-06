package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ps extends View {
    pr a;

    public ps(Context context) {
        super(context);
        this.a = new pr();
        if (Build.VERSION.SDK_INT < 16) {
            setBackgroundDrawable(this.a);
        } else {
            setBackground(this.a);
        }
        this.a.a(getResources().getDisplayMetrics().density * 1.0f);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.setBounds(0, 0, i3 - i, i4 - i2);
    }

    public final void setActivate(boolean z) {
        if (this.a == null) {
            return;
        }
        this.a.a = z;
        postInvalidate();
    }

    public final void setArrowStrokeWidth(float f) {
        if (this.a == null) {
            return;
        }
        this.a.a(f);
        postInvalidate();
    }

    public final void setDarkStyle(boolean z) {
        this.a.b = z;
        invalidate();
    }
}
