package com.sankuai.waimai.store.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends ReplacementSpan {
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
    private int k;

    public b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), 0, Integer.valueOf(i8)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c29864daa7b4c3985e6db29422d5e3bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c29864daa7b4c3985e6db29422d5e3bc");
            return;
        }
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i8;
        this.i = 0;
        this.j = i;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Object[] objArr = {paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73b7633763e831a1ca594ace7e247c2e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73b7633763e831a1ca594ace7e247c2e")).intValue();
        }
        paint.setTextSize(this.f);
        this.k = ((int) paint.measureText(charSequence, i, i2)) + (this.g * 2);
        return this.k + this.i + this.h;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Object[] objArr = {canvas, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8277f28a1fad7dcd25357649fcfdb7e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8277f28a1fad7dcd25357649fcfdb7e9");
            return;
        }
        paint.setColor(this.c);
        paint.setTextSize(this.f);
        paint.setAntiAlias(true);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = fontMetrics.descent - fontMetrics.ascent;
        float f3 = ((i4 + ((f2 - this.j) / 2.0f)) + fontMetrics.ascent) - this.b;
        canvas.drawRoundRect(new RectF(this.i + f, f3, this.k + f, this.j + f3), this.d, this.d, paint);
        com.sankuai.waimai.foundation.utils.log.a.b("RoundBackgroundColorSpan", "txt max height=" + (i5 - i3) + " txtHeight=" + f2 + ",x=" + f + ", y=" + i4 + ",top=" + i3 + " ,bottom=" + i5, new Object[0]);
        paint.setColor(this.e);
        paint.setTextSize((float) this.f);
        paint.setAntiAlias(true);
        canvas.drawText(charSequence, i, i2, ((float) this.g) + f + ((float) this.i), (float) (i4 - this.b), paint);
    }
}
