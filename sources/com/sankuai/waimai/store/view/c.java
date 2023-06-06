package com.sankuai.waimai.store.view;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.style.ReplacementSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends ReplacementSpan {
    public static ChangeQuickRedirect a;
    public int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private LinearGradient k;

    public c(int i, LinearGradient linearGradient, int i2, int i3, int i4, int i5, int i6, int i7) {
        Object[] objArr = {Integer.valueOf(i), linearGradient, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), 0, Integer.valueOf(i7)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "104b1424bf1e8ccb58054c9cadbdf09a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "104b1424bf1e8ccb58054c9cadbdf09a");
            return;
        }
        this.k = linearGradient;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i7;
        this.h = 0;
        this.i = i;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Object[] objArr = {paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "846ce34fef06d946384455add609a9fb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "846ce34fef06d946384455add609a9fb")).intValue();
        }
        paint.setTextSize(this.e);
        this.j = ((int) paint.measureText(charSequence, i, i2)) + (this.f * 2);
        return this.j + this.h + this.g;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Object[] objArr = {canvas, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "010b7c3d59540ad12f009c9882ddb228", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "010b7c3d59540ad12f009c9882ddb228");
            return;
        }
        Shader shader = paint.getShader();
        if (this.k != null) {
            paint.setShader(this.k);
            paint.setStyle(Paint.Style.FILL);
        }
        paint.setTextSize(this.e);
        paint.setAntiAlias(true);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = ((i4 + (((fontMetrics.descent - fontMetrics.ascent) - this.i) / 2.0f)) + fontMetrics.ascent) - this.b;
        canvas.drawRoundRect(new RectF(f + this.h, f2, f + this.j, this.i + f2), this.c, this.c, paint);
        paint.setShader(shader);
        paint.setColor(this.d);
        paint.setTextSize(this.e);
        paint.setAntiAlias(true);
        canvas.drawText(charSequence, i, i2, f + this.f + this.h, i4 - this.b, paint);
    }
}
