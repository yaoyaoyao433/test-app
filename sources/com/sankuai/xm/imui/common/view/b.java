package com.sankuai.xm.imui.common.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.util.d;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends ImageSpan {
    public static ChangeQuickRedirect a;

    public b(Drawable drawable, int i) {
        super(drawable, 2);
        Object[] objArr = {drawable, 2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28f3d9208087a7725bfb7634aa62b679", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28f3d9208087a7725bfb7634aa62b679");
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6 = 0;
        Object[] objArr = {canvas, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a3f860d5e5591395627a9e18b2cf1da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a3f860d5e5591395627a9e18b2cf1da");
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        if (getVerticalAlignment() == 2) {
            i6 = ((i4 + fontMetricsInt.descent) - ((fontMetricsInt.descent - fontMetricsInt.ascent) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2);
        } else {
            int i7 = (i4 + fontMetricsInt.descent) - drawable.getBounds().bottom;
            if (i7 >= 0) {
                i6 = i7;
            }
        }
        canvas.translate(f, i6);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Object[] objArr = {paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "758692b43a60d993d10cc51db5c522e3", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "758692b43a60d993d10cc51db5c522e3")).intValue();
        }
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return 0;
        }
        Rect bounds = drawable.getBounds();
        Paint.FontMetricsInt fontMetricsInt2 = new Paint.FontMetricsInt();
        paint.getFontMetricsInt(fontMetricsInt2);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        int i3 = bounds.right;
        if (i3 <= 0) {
            int abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent);
            d.a("SmileyImageSpan.getSize size=%d", Integer.valueOf(abs));
            drawable.setBounds(0, 0, abs, abs);
            return abs;
        }
        return i3;
    }
}
