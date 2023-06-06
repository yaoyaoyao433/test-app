package com.meituan.msi.api.component.textaera;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CustomTypefaceSpan extends TypefaceSpan {
    public static ChangeQuickRedirect a;
    private final Typeface b;

    private CustomTypefaceSpan(Typeface typeface) {
        super("");
        Object[] objArr = {typeface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "491d5878b1dac8914b4fc234025d4072", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "491d5878b1dac8914b4fc234025d4072");
        } else {
            this.b = typeface;
        }
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        Object[] objArr = {textPaint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6952c79f70d2d822e5f60e9963b14014", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6952c79f70d2d822e5f60e9963b14014");
        } else {
            a(textPaint, this.b);
        }
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        Object[] objArr = {textPaint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22267d94349b2daac864d99972046ae5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22267d94349b2daac864d99972046ae5");
        } else {
            a(textPaint, this.b);
        }
    }

    private static void a(Paint paint, Typeface typeface) {
        Object[] objArr = {paint, typeface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df2e9f8c61e522ff623738c4caf56f30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df2e9f8c61e522ff623738c4caf56f30");
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

    public static SpannableString a(Typeface typeface, String str) {
        Object[] objArr = {typeface, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d84f3cbb6f2e52e7c03f63cfcd13005b", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableString) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d84f3cbb6f2e52e7c03f63cfcd13005b");
        }
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan(typeface);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(customTypefaceSpan, 0, spannableString.length(), 17);
        return spannableString;
    }
}
