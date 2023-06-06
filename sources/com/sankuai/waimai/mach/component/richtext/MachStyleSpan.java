package com.sankuai.waimai.mach.component.richtext;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.StyleSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MachStyleSpan extends StyleSpan {
    public static ChangeQuickRedirect a;

    public MachStyleSpan(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20501763909dbd4f347529479905df7d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20501763909dbd4f347529479905df7d");
        }
    }

    @Override // android.text.style.StyleSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        Object[] objArr = {textPaint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc174484a3bd6456575d087282367850", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc174484a3bd6456575d087282367850");
        } else {
            a(textPaint, getStyle());
        }
    }

    @Override // android.text.style.StyleSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        Object[] objArr = {textPaint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e35fcf77605389a554be1c411b39e7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e35fcf77605389a554be1c411b39e7e");
        } else {
            a(textPaint, getStyle());
        }
    }

    private static void a(Paint paint, int i) {
        Typeface create;
        Object[] objArr = {paint, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b4234ddfb2d01879871eb995788aceb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b4234ddfb2d01879871eb995788aceb");
            return;
        }
        Typeface typeface = paint.getTypeface();
        if (typeface == null) {
            create = Typeface.defaultFromStyle(i);
        } else {
            create = Typeface.create(typeface, i);
        }
        int i2 = i & (~create.getStyle());
        if ((i2 & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((i2 & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(create);
    }
}
