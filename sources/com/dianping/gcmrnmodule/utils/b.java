package com.dianping.gcmrnmodule.utils;

import android.graphics.Color;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static String a(@Nullable Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f081a50fd5dea094347fc4b445d99a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f081a50fd5dea094347fc4b445d99a7");
        }
        if (num == null) {
            return null;
        }
        return a(a(num.intValue()));
    }

    public static int[] a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66bee082bb2a6c219331d343dc9e37c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66bee082bb2a6c219331d343dc9e37c6");
        }
        int[] iArr = {0, 0, 0, 0};
        int alpha = Color.alpha(i);
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        iArr[0] = alpha;
        iArr[1] = red;
        iArr[2] = green;
        iArr[3] = blue;
        return iArr;
    }

    public static String a(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b1e73f509bc2e11e713387ba00bb490", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b1e73f509bc2e11e713387ba00bb490");
        }
        String str = "#";
        for (int i : iArr) {
            if (i < 0) {
                i = 0;
            } else if (i > 255) {
                i = 255;
            }
            String[] strArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", ErrorCode.ERROR_TYPE_B, "C", "D", "E", "F"};
            str = str + strArr[i / 16] + strArr[i % 16];
        }
        return str;
    }
}
