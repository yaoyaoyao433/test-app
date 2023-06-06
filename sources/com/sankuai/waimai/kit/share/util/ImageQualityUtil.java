package com.sankuai.waimai.kit.share.util;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ImageQualityUtil {
    public static ChangeQuickRedirect a = null;
    private static int b = 60;
    private static int c = 80;
    private static int d = 100;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface Type {
    }

    public static String a(Context context, String str, int i, int i2) {
        int i3;
        String str2;
        Object[] objArr = {context, str, 2, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b6c5d302d364959d0f00d96d35f63cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b6c5d302d364959d0f00d96d35f63cf");
        }
        Object[] objArr2 = {context, str, 2, Integer.valueOf(i2), 0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8b0ec6a3aa748cd08fb31456dbb72b8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8b0ec6a3aa748cd08fb31456dbb72b8f");
        }
        switch (2) {
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
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "34c8dba559d76b5c2d45fc4a88555eae", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "34c8dba559d76b5c2d45fc4a88555eae");
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
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "33b7806783a7d22e814faa69d52fe36b", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "33b7806783a7d22e814faa69d52fe36b");
        } else {
            if (i3 <= 0 || i3 > 100) {
                i3 = b;
            }
            str2 = "/" + (i2 <= 720 ? i2 : 720) + CommonConstant.Symbol.DOT + 0 + CommonConstant.Symbol.DOT + i3;
        }
        sb.append(str2);
        return str.replace(host, sb.toString());
    }
}
