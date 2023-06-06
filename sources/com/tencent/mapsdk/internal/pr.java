package com.tencent.mapsdk.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class pr extends Drawable {
    private static final int c = -2829100;
    private static final int d = -10066330;
    private static final int e = 16777215;
    boolean b;
    boolean a = false;
    private Paint f = new Paint();

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public pr() {
        this.f.setAntiAlias(true);
        this.f.setStrokeJoin(Paint.Join.BEVEL);
    }

    public final void a(float f) {
        this.f.setStrokeWidth(f);
    }

    private void a(boolean z) {
        this.a = z;
    }

    private void b(boolean z) {
        this.b = z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        if (this.a) {
            this.f.setColor(this.b ? d : c);
        } else {
            this.f.setColor(16777215);
        }
        canvas.drawLines(new float[]{0.0f, getBounds().height(), getBounds().width() / 2.0f, 0.0f, getBounds().width() / 2.0f, 0.0f, getBounds().width(), getBounds().height()}, this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return getBounds().height();
    }
}
