package com.meituan.android.legwork.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.legwork.common.share.H5ShareReceiver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class l {
    public static ChangeQuickRedirect a;
    private static H5ShareReceiver b;

    public static void a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d028cfe2beddefa8fe42c0f8296f636", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d028cfe2beddefa8fe42c0f8296f636");
            return;
        }
        Object[] objArr2 = {activity, str, null};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "be3f7a78911ca585acced63fce59f8b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "be3f7a78911ca585acced63fce59f8b8");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (str.startsWith("http:") || str.startsWith("https:")) {
                com.meituan.android.legwork.common.util.i.a(activity, a(str, (Map<String, String>) null));
                return;
            }
            try {
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).setPackage(activity.getPackageName()));
            } catch (Exception e) {
                x.d("SchemeRouter.startActivity", "start activity error", e);
            }
        }
    }

    public static void a(Activity activity, String str, Map<String, String> map) {
        Object[] objArr = {activity, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4f0a39839f502d729a6b847deaaf81a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4f0a39839f502d729a6b847deaaf81a");
        } else {
            com.meituan.android.legwork.common.util.i.a(activity, a(str, map));
        }
    }

    public static void a(Activity activity, String str, Map<String, String> map, int i) {
        Object[] objArr = {activity, str, map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1e043f24bc0db61b040699c01b9e326", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1e043f24bc0db61b040699c01b9e326");
        } else {
            com.meituan.android.legwork.common.util.i.a(activity, a(str, map), i);
        }
    }

    private static String a(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "08613c714c36d3183ba44d1b7bbe57ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "08613c714c36d3183ba44d1b7bbe57ac");
        }
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        for (Map.Entry<String, String> entry : com.meituan.android.legwork.net.util.a.b(parse).entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                buildUpon.appendQueryParameter(key, entry.getValue());
            }
        }
        if (map != null) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                String key2 = entry2.getKey();
                if (!TextUtils.isEmpty(key2)) {
                    buildUpon.appendQueryParameter(key2, entry2.getValue());
                }
            }
        }
        buildUpon.appendQueryParameter("source", "native");
        return buildUpon.toString();
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee51590094ce8fe52f67a524ba437b62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee51590094ce8fe52f67a524ba437b62");
        } else if (b == null) {
            H5ShareReceiver h5ShareReceiver = new H5ShareReceiver();
            b = h5ShareReceiver;
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = H5ShareReceiver.a;
            if (PatchProxy.isSupport(objArr2, h5ShareReceiver, changeQuickRedirect2, false, "674b0a589d2b0eea876f27638366a646", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, h5ShareReceiver, changeQuickRedirect2, false, "674b0a589d2b0eea876f27638366a646");
            } else if (context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("paotui_c:paotui_share");
                x.b("H5ShareReceiver.register()", String.format("注册%s广播", "paotui_c:paotui_share"));
                try {
                    context.registerReceiver(h5ShareReceiver, intentFilter);
                } catch (Exception e) {
                    x.e("H5ShareReceiver.register()", "注册广播失败，exception msg:", e);
                }
            }
        }
    }

    public static void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f4d03af59f26033f1abd5b7109f7679", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f4d03af59f26033f1abd5b7109f7679");
        } else if (b != null) {
            H5ShareReceiver h5ShareReceiver = b;
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = H5ShareReceiver.a;
            if (PatchProxy.isSupport(objArr2, h5ShareReceiver, changeQuickRedirect2, false, "4749094f6f52523846e0753a8d5ab6d3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, h5ShareReceiver, changeQuickRedirect2, false, "4749094f6f52523846e0753a8d5ab6d3");
            } else if (context != null) {
                x.b("H5ShareReceiver.unregister()", String.format("反注册%s广播", "paotui_c:paotui_share"));
                try {
                    context.unregisterReceiver(h5ShareReceiver);
                } catch (Exception e) {
                    x.e("H5ShareReceiver.register()", "反注册广播失败，exception msg:", e);
                }
            }
            b = null;
        }
    }
}
