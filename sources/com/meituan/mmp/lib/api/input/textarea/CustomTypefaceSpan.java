package com.meituan.mmp.lib.api.input.textarea;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "983a00a6383fa4b36fb911503a6b2459", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "983a00a6383fa4b36fb911503a6b2459");
        } else {
            this.b = typeface;
        }
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        Object[] objArr = {textPaint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07d5245e446d4492529c4b6b7086f6b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07d5245e446d4492529c4b6b7086f6b2");
        } else {
            a(textPaint, this.b);
        }
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        Object[] objArr = {textPaint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d2d8dce4378713adaaefd92ea3648ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d2d8dce4378713adaaefd92ea3648ba");
        } else {
            a(textPaint, this.b);
        }
    }

    private static void a(Paint paint, Typeface typeface) {
        Object[] objArr = {paint, typeface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca407c97693d8ea01bb2822714210bf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca407c97693d8ea01bb2822714210bf6");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b764677b19f67bf3dab6c50da48d73b", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableString) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b764677b19f67bf3dab6c50da48d73b");
        }
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan(typeface);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(customTypefaceSpan, 0, spannableString.length(), 17);
        return spannableString;
    }
}
