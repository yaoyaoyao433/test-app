package com.sankuai.shangou.stone.util;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class ImageQualityUtil {
    public static ChangeQuickRedirect a = null;
    private static int b = 60;
    private static int c = 80;
    private static int d = 100;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public @interface Type {
    }

    public static String a(Context context, String str, @Type int i, int i2) {
        int i3;
        String str2;
        Object[] objArr = {context, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed3d5bdbddb673d39cd38e6afe489de2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed3d5bdbddb673d39cd38e6afe489de2");
        }
        Object[] objArr2 = {context, str, Integer.valueOf(i), Integer.valueOf(i2), 0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "58f9cd3d4b547b73b6d98135b4d10c98", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "58f9cd3d4b547b73b6d98135b4d10c98");
        }
        switch (i) {
            case 1:
                i3 = c;
                break;
            case 2:
                i3 = d;
                break;
            default:
                i3 = b;
                break;
        }
        Object[] objArr3 = {str, Integer.valueOf(i2), 0, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "88a549e6a93c8448e28cf0bee8ec74a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "88a549e6a93c8448e28cf0bee8ec74a4");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String host = Uri.parse(str).getHost();
        if (TextUtils.isEmpty(host) || !host.matches("(p[0-9])\\.(meituan)\\.(net)")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(host);
        Object[] objArr4 = {Integer.valueOf(i2), 0, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "0903e3682e68c704d2fd78d2a1e531dd", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "0903e3682e68c704d2fd78d2a1e531dd");
        } else {
            if (i3 <= 0 || i3 > 100) {
                i3 = b;
            }
            str2 = "/" + (i2 <= 720 ? i2 : 720) + CommonConstant.Symbol.DOT + 0 + CommonConstant.Symbol.DOT + i3;
        }
        sb.append(str2);
        return str.replace(host, sb.toString());
    }

    public static int a() {
        return d;
    }

    public static int b() {
        return c;
    }

    public static int c() {
        return b;
    }
}
