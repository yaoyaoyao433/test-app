package com.sankuai.waimai.business.restaurant.base.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b extends ReplacementSpan {
    public static ChangeQuickRedirect a;
    protected int b;

    public b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2709c85c2266bf2096d4dd093bbd233", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2709c85c2266bf2096d4dd093bbd233");
        } else {
            this.b = i;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Object[] objArr = {paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c833f4b12661f1e1568c4de575808944", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c833f4b12661f1e1568c4de575808944")).intValue() : (int) a(paint).measureText(charSequence.subSequence(i, i2).toString());
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Object[] objArr = {canvas, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "119918dde9d3f94df53b9c9fe13f8fa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "119918dde9d3f94df53b9c9fe13f8fa4");
            return;
        }
        CharSequence subSequence = charSequence.subSequence(i, i2);
        TextPaint a2 = a(paint);
        Paint.FontMetricsInt fontMetricsInt = a2.getFontMetricsInt();
        canvas.drawText(subSequence.toString(), f, i4 - (((((i4 + fontMetricsInt.descent) + i4) + fontMetricsInt.ascent) / 2) - ((i5 + i3) / 2)), a2);
    }

    public TextPaint a(Paint paint) {
        Object[] objArr = {paint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb324681fcb23637330a0c3d59206128", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextPaint) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb324681fcb23637330a0c3d59206128");
        }
        TextPaint textPaint = new TextPaint(paint);
        textPaint.setTextSize(this.b);
        return textPaint;
    }
}
