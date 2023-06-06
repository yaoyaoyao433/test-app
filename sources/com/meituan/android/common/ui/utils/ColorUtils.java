package com.meituan.android.common.ui.utils;

import android.graphics.Color;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ColorUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int parseColor(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fd6db901a53aadb9d7d00d9b5409ef5e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fd6db901a53aadb9d7d00d9b5409ef5e")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return i;
        }
    }
}
