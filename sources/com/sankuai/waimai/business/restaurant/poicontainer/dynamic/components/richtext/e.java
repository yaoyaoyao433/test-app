package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.richtext;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.style.ReplacementSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends ReplacementSpan {
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

    public e(int i, int i2, int i3, int i4, int i5, int i6) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48309020c177a801d53125b80ed82011", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48309020c177a801d53125b80ed82011");
            return;
        }
        this.b = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.b = i;
        this.d = i2;
        this.e = i3;
        this.f = i;
        this.g = i;
        this.h = i4;
        this.i = i5;
        this.j = i6;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        Object[] objArr = {paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6606934da4446f059cf18d202d13a5b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6606934da4446f059cf18d202d13a5b")).intValue();
        }
        this.c = (int) (paint.measureText(charSequence, i, i2) + this.h + this.f + this.g + this.i);
        return this.c;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(@NonNull Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        Object[] objArr = {canvas, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11b1ff04cc38a70622c5952f7c4c6a20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11b1ff04cc38a70622c5952f7c4c6a20");
            return;
        }
        paint.setColor(this.d);
        paint.setAntiAlias(true);
        float f2 = i4;
        canvas.drawRoundRect(new RectF(f + this.h, (paint.ascent() + f2) - this.j, (f + this.c) - this.i, paint.descent() + f2 + this.j), this.b, this.b, paint);
        paint.setColor(this.e);
        canvas.drawText(charSequence, i, i2, f + this.h + this.f, f2, paint);
    }
}
