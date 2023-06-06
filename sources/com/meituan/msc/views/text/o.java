package com.meituan.msc.views.text;

import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class o extends ReplacementSpan implements g {
    public static ChangeQuickRedirect a;

    @Nullable
    public abstract Drawable a();

    public abstract int b();

    public static void a(Spannable spannable, TextView textView) {
        Object[] objArr = {spannable, textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c02d5e9c72ed73588efc993856cf0d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c02d5e9c72ed73588efc993856cf0d1");
        } else {
            spannable.getSpans(0, spannable.length(), o.class);
        }
    }
}
