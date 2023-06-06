package com.meituan.msc.views.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55b1323ce6e83f1ed6cdb3b8a36e38f1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55b1323ce6e83f1ed6cdb3b8a36e38f1")).intValue() : a(context, 16842905).getDefaultColor();
    }

    private static ColorStateList a(Context context, int i) {
        TypedArray obtainStyledAttributes;
        Object[] objArr = {context, 16842905};
        ChangeQuickRedirect changeQuickRedirect = a;
        TypedArray typedArray = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f11febce62549398586a9ea3bdcdb448", RobustBitConfig.DEFAULT_VALUE)) {
            return (ColorStateList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f11febce62549398586a9ea3bdcdb448");
        }
        try {
            obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842905});
        } catch (Throwable th) {
            th = th;
        }
        try {
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
            if (obtainStyledAttributes != null) {
                obtainStyledAttributes.recycle();
            }
            return colorStateList;
        } catch (Throwable th2) {
            th = th2;
            typedArray = obtainStyledAttributes;
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }
}
