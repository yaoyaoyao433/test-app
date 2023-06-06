package com.dianping.picassomodule.utils;

import android.graphics.Color;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8bd08642289ff3f03681829aade66ec6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8bd08642289ff3f03681829aade66ec6")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return Integer.MAX_VALUE;
        }
        if (!str.startsWith("#")) {
            str = "#" + str;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return Integer.MAX_VALUE;
        }
    }
}
