package com.sankuai.common.utils;

import android.graphics.Color;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ColorUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int parseColor(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a7e63a05a0da1bf0a373c8901c7882e5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a7e63a05a0da1bf0a373c8901c7882e5")).intValue();
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
