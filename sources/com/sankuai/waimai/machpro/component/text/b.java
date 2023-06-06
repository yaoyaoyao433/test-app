package com.sankuai.waimai.machpro.component.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.text.style.ImageSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends ImageSpan {
    public static ChangeQuickRedirect a;
    private WeakReference<Drawable> b;

    public b(@NonNull Drawable drawable) {
        super(drawable, 1);
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e54f88dce5795ed8dd6ba37ee21376a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e54f88dce5795ed8dd6ba37ee21376a");
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Object[] objArr = {paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e14b3d860319b0af62d93c862428c4d8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e14b3d860319b0af62d93c862428c4d8")).intValue();
        }
        if (this.mVerticalAlignment == 1 || this.mVerticalAlignment == 0) {
            return super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        }
        Rect bounds = a().getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int height = bounds.height();
            if (this.mVerticalAlignment == 2) {
                fontMetricsInt.top = -height;
                fontMetricsInt.ascent = fontMetricsInt.top;
                fontMetricsInt.descent = i3 - height;
                fontMetricsInt.bottom = fontMetricsInt.descent;
            } else {
                int i4 = height / 2;
                int i5 = i3 / 2;
                int i6 = i4 - i5;
                int i7 = -(i4 + i5);
                fontMetricsInt.top = i7;
                fontMetricsInt.ascent = i7;
                fontMetricsInt.descent = i6;
                fontMetricsInt.bottom = i6;
            }
        }
        return bounds.right;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int height;
        Object[] objArr = {canvas, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "082b3d6698f9bb76aa2dad05b7787640", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "082b3d6698f9bb76aa2dad05b7787640");
        } else if (this.mVerticalAlignment == 1 || this.mVerticalAlignment == 0) {
            super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        } else {
            Drawable a2 = a();
            canvas.save();
            if (this.mVerticalAlignment == 2) {
                height = i3;
            } else {
                height = this.mVerticalAlignment == 3 ? (((i5 - i3) - a2.getBounds().height()) / 2) + i3 : 0;
            }
            canvas.translate(f, height);
            a2.draw(canvas);
            canvas.restore();
        }
    }

    private Drawable a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9544afaf657cfe2a7b32df379cf47a0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9544afaf657cfe2a7b32df379cf47a0f");
        }
        WeakReference<Drawable> weakReference = this.b;
        Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable == null) {
            Drawable drawable2 = getDrawable();
            this.b = new WeakReference<>(drawable2);
            return drawable2;
        }
        return drawable;
    }
}
