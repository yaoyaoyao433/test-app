package com.sankuai.waimai.machpro.component.text;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements LineHeightSpan {
    public static ChangeQuickRedirect a;
    private final int b;

    public c(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de62eea03def1f3df332753dbeed382d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de62eea03def1f3df332753dbeed382d");
        } else {
            this.b = (int) Math.ceil(f);
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        Object[] objArr = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontMetricsInt};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "309ce7fd5e4fd75da632dd266a8600b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "309ce7fd5e4fd75da632dd266a8600b4");
        } else if (fontMetricsInt.descent > this.b) {
            int min = Math.min(this.b, fontMetricsInt.descent);
            fontMetricsInt.descent = min;
            fontMetricsInt.bottom = min;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.top = 0;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.descent > this.b) {
            fontMetricsInt.bottom = fontMetricsInt.descent;
            int i5 = (-this.b) + fontMetricsInt.descent;
            fontMetricsInt.ascent = i5;
            fontMetricsInt.top = i5;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.bottom > this.b) {
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = fontMetricsInt.ascent + this.b;
        } else if ((-fontMetricsInt.top) + fontMetricsInt.bottom > this.b) {
            fontMetricsInt.top = fontMetricsInt.bottom - this.b;
        } else {
            double d = (this.b - ((-fontMetricsInt.top) + fontMetricsInt.bottom)) / 2.0f;
            fontMetricsInt.top = (int) (fontMetricsInt.top - Math.ceil(d));
            fontMetricsInt.bottom = (int) (fontMetricsInt.bottom + Math.floor(d));
            fontMetricsInt.ascent = fontMetricsInt.top;
            fontMetricsInt.descent = fontMetricsInt.bottom;
        }
    }
}
