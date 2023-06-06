package com.sankuai.waimai.sa.ui.assistant.view.multiperson;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends ReplacementSpan {
    public static ChangeQuickRedirect a;
    private int b;

    public c(int i) {
        Object[] objArr = {8};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df3ce36311ac1ff22619a7ef7527f4a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df3ce36311ac1ff22619a7ef7527f4a0");
        } else {
            this.b = 8;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Object[] objArr = {paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a542526c19e819882fbeb0c5afebaf1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a542526c19e819882fbeb0c5afebaf1")).intValue() : (int) a(paint).measureText(charSequence.subSequence(i, i2).toString());
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Object[] objArr = {canvas, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5b4b17574d21463502b1654b8cb412e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5b4b17574d21463502b1654b8cb412e");
            return;
        }
        CharSequence subSequence = charSequence.subSequence(i, i2);
        TextPaint a2 = a(paint);
        Paint.FontMetricsInt fontMetricsInt = a2.getFontMetricsInt();
        canvas.drawText(subSequence.toString(), f, i4 - (((((i4 + fontMetricsInt.descent) + i4) + fontMetricsInt.ascent) / 2) - ((i5 + i3) / 2)), a2);
    }

    private TextPaint a(Paint paint) {
        Object[] objArr = {paint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6224820386491ac7a9c3d2ccc8aca6ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextPaint) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6224820386491ac7a9c3d2ccc8aca6ad");
        }
        TextPaint textPaint = new TextPaint(paint);
        textPaint.setColor(1308622847);
        textPaint.setTextSize(g.a(com.meituan.android.singleton.b.a, this.b));
        return textPaint;
    }
}
