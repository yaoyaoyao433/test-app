package com.meituan.msc.views.text;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends MetricAffectingSpan implements g {
    public static ChangeQuickRedirect a;
    private final AssetManager b;
    private final int c;
    private final int d;
    @Nullable
    private final String e;
    @Nullable
    private final String f;

    public c(int i, int i2, @Nullable String str, @Nullable String str2, @NonNull AssetManager assetManager) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, str2, assetManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bade694a0ef5766c8ddfb5b8496b557", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bade694a0ef5766c8ddfb5b8496b557");
            return;
        }
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.b = assetManager;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Object[] objArr = {textPaint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84480c560cb6b13c1fe40a0771afe70c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84480c560cb6b13c1fe40a0771afe70c");
        } else {
            a(textPaint, this.c, this.d, this.e, this.f, this.b);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(@NonNull TextPaint textPaint) {
        Object[] objArr = {textPaint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fc0797f3eb1360375449d1e29be8f28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fc0797f3eb1360375449d1e29be8f28");
        } else {
            a(textPaint, this.c, this.d, this.e, this.f, this.b);
        }
    }

    private static void a(Paint paint, int i, int i2, @Nullable String str, @Nullable String str2, AssetManager assetManager) {
        Object[] objArr = {paint, Integer.valueOf(i), Integer.valueOf(i2), str, str2, assetManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1ea0c4437ceb35e87e62e64d44b4324", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1ea0c4437ceb35e87e62e64d44b4324");
            return;
        }
        Typeface a2 = k.a(paint.getTypeface(), i, i2, str2, assetManager);
        if (Build.VERSION.SDK_INT >= 21) {
            paint.setFontFeatureSettings(str);
        }
        paint.setTypeface(a2);
        paint.setSubpixelText(true);
    }
}
