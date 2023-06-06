package com.meituan.msc.views.text;

import android.annotation.TargetApi;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@TargetApi(21)
/* loaded from: classes3.dex */
public final class a extends MetricAffectingSpan implements g {
    public static ChangeQuickRedirect a;
    private final float b;

    public a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9853dde619af9ef212521098a40bc059", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9853dde619af9ef212521098a40bc059");
        } else {
            this.b = f;
        }
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Object[] objArr = {textPaint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19f02e7738e8926ca1227e37395f9663", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19f02e7738e8926ca1227e37395f9663");
        } else {
            a(textPaint);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        Object[] objArr = {textPaint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a50b189df6c4de4eec6560b892752594", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a50b189df6c4de4eec6560b892752594");
        } else {
            a(textPaint);
        }
    }

    private void a(TextPaint textPaint) {
        Object[] objArr = {textPaint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bb19b7db723637eb8d38ba326df46ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bb19b7db723637eb8d38ba326df46ba");
        } else if (Float.isNaN(this.b)) {
        } else {
            textPaint.setLetterSpacing(this.b);
        }
    }
}
