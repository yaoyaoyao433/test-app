package com.dianping.richtext;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k extends MetricAffectingSpan {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;

    public k(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b71fb1ff30f589fd0cca038568553eb4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b71fb1ff30f589fd0cca038568553eb4");
            return;
        }
        this.b = 0;
        this.c = 0;
        this.b = i;
        this.c = i2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Object[] objArr = {textPaint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bef7fc3abae6ab31219c26181279e04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bef7fc3abae6ab31219c26181279e04");
            return;
        }
        float f = 0.0f;
        if (this.c == 1) {
            f = (this.b + textPaint.getFontMetrics().ascent) / 2.0f;
        } else if (this.c == 2) {
            f = textPaint.getFontMetrics().ascent + this.b;
        }
        textPaint.baselineShift = (int) (textPaint.baselineShift - f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        Object[] objArr = {textPaint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f107547448ef58f3b16cbffcce8e1688", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f107547448ef58f3b16cbffcce8e1688");
            return;
        }
        float f = 0.0f;
        if (this.c == 1) {
            f = (this.b + textPaint.getFontMetrics().ascent) / 2.0f;
        } else if (this.c == 2) {
            f = textPaint.getFontMetrics().ascent + this.b;
        }
        textPaint.baselineShift = (int) (textPaint.baselineShift - f);
    }
}
