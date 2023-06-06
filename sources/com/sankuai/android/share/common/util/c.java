package com.sankuai.android.share.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a43d095bb649b071fc099e7f460f3c32", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a43d095bb649b071fc099e7f460f3c32");
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                String valueOf = bundle != null ? String.valueOf(bundle.get("weixin_key")) : null;
                return !TextUtils.isEmpty(valueOf) ? valueOf : "wxa552e31d6839de85";
            }
            return "wxa552e31d6839de85";
        } catch (Exception unused) {
            return "wxa552e31d6839de85";
        }
    }

    public static String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a31b6bae5208cdd170ed470cb3a9fad1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a31b6bae5208cdd170ed470cb3a9fad1");
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                String valueOf = bundle != null ? String.valueOf(bundle.get("tencent_qq_appid")) : null;
                return !TextUtils.isEmpty(valueOf) ? valueOf : "214506";
            }
            return "214506";
        } catch (Exception unused) {
            return "214506";
        }
    }

    public static boolean c(Context context) {
        Bundle bundle;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a792b1422651421e8da6a17cae0047e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a792b1422651421e8da6a17cae0047e")).booleanValue();
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("weixin_key")) {
                if (a(bundle.get("weixin_key"))) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean d(Context context) {
        Bundle bundle;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e29f5744f7033caf6d20cc7e55a50fb9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e29f5744f7033caf6d20cc7e55a50fb9")).booleanValue();
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("tencent_qq_appid")) {
                if (a(bundle.get("tencent_qq_appid"))) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
        }
        return false;
    }

    private static boolean a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "886a54f6daa4a09c910c2af45eed0f89", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "886a54f6daa4a09c910c2af45eed0f89")).booleanValue() : obj instanceof String ? !TextUtils.isEmpty((String) obj) : obj != null;
    }
}
