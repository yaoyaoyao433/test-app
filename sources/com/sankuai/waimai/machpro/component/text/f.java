package com.sankuai.waimai.machpro.component.text;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends MetricAffectingSpan {
    public static ChangeQuickRedirect a;
    private final Typeface b;

    public f(Typeface typeface) {
        Object[] objArr = {typeface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb8c8e5842e1dfac0c42f6fed4185283", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb8c8e5842e1dfac0c42f6fed4185283");
        } else {
            this.b = typeface;
        }
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Object[] objArr = {textPaint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5bb950df83460523964af1ac06f78b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5bb950df83460523964af1ac06f78b4");
        } else {
            a(textPaint, this.b);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        Object[] objArr = {textPaint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6e95cdd6059a0746df69daf3ebb3b44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6e95cdd6059a0746df69daf3ebb3b44");
        } else {
            a(textPaint, this.b);
        }
    }

    private static void a(Paint paint, Typeface typeface) {
        Object[] objArr = {paint, typeface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b16e37b3f895e2924c292026e4274199", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b16e37b3f895e2924c292026e4274199");
        } else if (typeface == null) {
        } else {
            Typeface typeface2 = paint.getTypeface();
            int style = (~typeface.getStyle()) & (typeface2 != null ? typeface2.getStyle() : 0);
            if ((style & 1) != 0) {
                paint.setFakeBoldText(true);
            }
            if ((2 & style) != 0) {
                paint.setTextSkewX(-0.25f);
            }
            paint.setTypeface(typeface);
        }
    }
}
