package com.meituan.msc.views.text;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l extends CharacterStyle implements g {
    public static ChangeQuickRedirect a;
    private final float b;
    private final float c;
    private final float d;
    private final int e;

    public l(float f, float f2, float f3, int i) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25e07f13220e0bb9e04c19d1a5840d21", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25e07f13220e0bb9e04c19d1a5840d21");
            return;
        }
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = i;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Object[] objArr = {textPaint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9eb822d26e2368681689859abf5fd963", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9eb822d26e2368681689859abf5fd963");
        } else {
            textPaint.setShadowLayer(this.d, this.b, this.c, this.e);
        }
    }
}
