package com.meituan.mmp.lib.widget;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements LineHeightSpan {
    public static ChangeQuickRedirect a;
    public int b;
    private final int c;

    public d(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ea82bf58e15d18184bd39521adb5f56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ea82bf58e15d18184bd39521adb5f56");
            return;
        }
        this.c = 16;
        this.b = Math.round(f);
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        Object[] objArr = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontMetricsInt};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "185247f95cfb65abe210342a35675cfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "185247f95cfb65abe210342a35675cfe");
        } else if ((-fontMetricsInt.ascent) > this.b) {
            int i5 = -this.b;
            fontMetricsInt.ascent = i5;
            fontMetricsInt.top = i5;
            fontMetricsInt.descent = 0;
            fontMetricsInt.bottom = 0;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.descent > this.b) {
            fontMetricsInt.descent = fontMetricsInt.bottom;
            int i6 = fontMetricsInt.descent - this.b;
            fontMetricsInt.ascent = i6;
            fontMetricsInt.top = i6;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.bottom > this.b) {
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = fontMetricsInt.ascent + this.b;
        } else if ((-fontMetricsInt.top) + fontMetricsInt.bottom > this.b) {
            fontMetricsInt.top = fontMetricsInt.bottom - this.b;
        } else {
            int round = Math.round((this.b - ((-fontMetricsInt.ascent) + fontMetricsInt.descent)) / 2.0f);
            fontMetricsInt.top -= round;
            fontMetricsInt.ascent -= round;
            fontMetricsInt.bottom += round;
            fontMetricsInt.descent = round + fontMetricsInt.descent;
        }
    }
}
