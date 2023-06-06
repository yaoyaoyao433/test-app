package com.dianping.richtext;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CustomTypefaceSpan extends TypefaceSpan {
    public static ChangeQuickRedirect a;
    private final Typeface b;

    public CustomTypefaceSpan(String str, Typeface typeface) {
        super(str);
        Object[] objArr = {str, typeface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e458228d18901cb531f75ee086f99ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e458228d18901cb531f75ee086f99ef");
        } else {
            this.b = typeface;
        }
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        Object[] objArr = {textPaint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac04e31a829f81290d95794c0dc1aa09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac04e31a829f81290d95794c0dc1aa09");
        } else {
            a(textPaint, this.b);
        }
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        Object[] objArr = {textPaint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d03271a81cde1d0e9dcf712060ea1b9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d03271a81cde1d0e9dcf712060ea1b9f");
        } else {
            a(textPaint, this.b);
        }
    }

    private static void a(Paint paint, Typeface typeface) {
        Object[] objArr = {paint, typeface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c1a611b177aa1183a5226d2d244e9e2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c1a611b177aa1183a5226d2d244e9e2a");
            return;
        }
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
