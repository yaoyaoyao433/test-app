package com.sankuai.waimai.kit.share.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static String a(Context context, String str) {
        PackageInfo packageInfo;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "08351b164596026dc4f5c6aa169e5575", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "08351b164596026dc4f5c6aa169e5575");
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo == null ? "" : packageInfo.versionName;
    }

    public static int a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b885fce33e6c10847974d0b2ea73699", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b885fce33e6c10847974d0b2ea73699")).intValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -1;
        }
        String[] split = str.split(CommonConstant.Symbol.DOT);
        String[] split2 = str2.split(CommonConstant.Symbol.DOT);
        int min = Math.min(split.length, split2.length);
        for (int i = 0; i < min; i++) {
            int a2 = e.a(split[i], 0);
            int a3 = e.a(split2[i], 0);
            if (a2 > a3) {
                return 1;
            }
            if (a2 < a3) {
                return -1;
            }
        }
        return split.length - split2.length;
    }
}
