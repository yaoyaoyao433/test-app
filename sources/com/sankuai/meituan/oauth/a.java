package com.sankuai.meituan.oauth;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35476681c691dfeec0590b35cb89dd89", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35476681c691dfeec0590b35cb89dd89");
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                String valueOf = bundle != null ? String.valueOf(bundle.get("sina_weibo_key")) : null;
                return !TextUtils.isEmpty(valueOf) ? valueOf : "1550938859";
            }
            return "1550938859";
        } catch (Exception e) {
            e.printStackTrace();
            return "1550938859";
        }
    }

    public static String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a03a8d6670f5d37da8e9275d0a95426", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a03a8d6670f5d37da8e9275d0a95426");
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                String string = bundle != null ? bundle.getString("sina_weibo_redirecturi") : null;
                return !TextUtils.isEmpty(string) ? string : "http://i.meituan.com";
            }
            return "http://i.meituan.com";
        } catch (Exception e) {
            e.printStackTrace();
            return "http://i.meituan.com";
        }
    }

    public static String c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0bb6c3dc84b3fc1a93a091d5e2ccbf6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0bb6c3dc84b3fc1a93a091d5e2ccbf6");
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                String valueOf = bundle != null ? String.valueOf(bundle.get("weixin_key")) : null;
                return !TextUtils.isEmpty(valueOf) ? valueOf : "wxa552e31d6839de85";
            }
            return "wxa552e31d6839de85";
        } catch (Exception e) {
            e.printStackTrace();
            return "wxa552e31d6839de85";
        }
    }

    public static String d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a4b1c8764d37acaddfc8022a3b48843", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a4b1c8764d37acaddfc8022a3b48843");
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                String string = bundle != null ? bundle.getString("weixin_redirecturi") : null;
                return !TextUtils.isEmpty(string) ? string : "http://www.meituan.com";
            }
            return "http://www.meituan.com";
        } catch (Exception e) {
            e.printStackTrace();
            return "http://www.meituan.com";
        }
    }

    public static String e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70df0c358d376a1ebe83e7e2b0f7da38", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70df0c358d376a1ebe83e7e2b0f7da38");
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                String valueOf = bundle != null ? String.valueOf(bundle.get("tencent_qq_appid")) : null;
                return !TextUtils.isEmpty(valueOf) ? valueOf : "214506";
            }
            return "214506";
        } catch (Exception e) {
            e.printStackTrace();
            return "214506";
        }
    }
}
