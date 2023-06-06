package com.sankuai.waimai.business.restaurant.base.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends ReplacementSpan {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    public c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), 0, Integer.valueOf(i8)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b19ae8829d57ecb765121b9edd4f3896", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b19ae8829d57ecb765121b9edd4f3896");
            return;
        }
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i8;
        this.h = 0;
        this.i = i;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Object[] objArr = {paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bd0699e1876009add28005a0bda580f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bd0699e1876009add28005a0bda580f")).intValue();
        }
        paint.setTextSize(this.e);
        this.j = ((int) paint.measureText(charSequence, i, i2)) + (this.f * 2);
        return this.j + this.h + this.g;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Object[] objArr = {canvas, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ad3a524d73b013e58ac1d17a5cde111", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ad3a524d73b013e58ac1d17a5cde111");
            return;
        }
        paint.setColor(this.b);
        paint.setTextSize(this.e);
        paint.setAntiAlias(true);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = fontMetrics.descent - fontMetrics.ascent;
        float f3 = i4;
        float f4 = ((f2 - this.i) / 2.0f) + f3 + fontMetrics.ascent;
        canvas.drawRoundRect(new RectF(this.h + f, f4, this.j + f, this.i + f4), this.c, this.c, paint);
        com.sankuai.waimai.foundation.utils.log.a.b("RoundBackgroundColorSpan", "txt max height=" + (i5 - i3) + " txtHeight=" + f2 + ",x=" + f + ", y=" + i4 + ",top=" + i3 + " ,bottom=" + i5, new Object[0]);
        paint.setColor(this.d);
        paint.setTextSize((float) this.e);
        paint.setAntiAlias(true);
        canvas.drawText(charSequence, i, i2, ((float) this.f) + f + ((float) this.h), f3, paint);
    }
}
