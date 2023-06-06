package com.sankuai.waimai.bussiness.order.base.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.style.ReplacementSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends ReplacementSpan {
    public static ChangeQuickRedirect a;
    private final int b;
    private final int c;

    public b(int i, int i2) {
        Object[] objArr = {0, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f960ca44424ad53c480f2f392b600101", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f960ca44424ad53c480f2f392b600101");
            return;
        }
        this.b = 0;
        this.c = i2;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        Object[] objArr = {paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62dc3eef60f6b2ac08e02fca045af65a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62dc3eef60f6b2ac08e02fca045af65a")).intValue() : Math.round(paint.measureText(charSequence, i, i2)) + this.b + this.c;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(@NonNull Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        Object[] objArr = {canvas, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c82e14ac4b47a70a3bb94edc236deba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c82e14ac4b47a70a3bb94edc236deba");
        } else {
            canvas.drawText(charSequence, i, i2, f + this.b, i4, paint);
        }
    }
}
