package com.meituan.android.paycommon.lib.retrofit.channel;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paybase.utils.n;
import com.meituan.android.paycommon.lib.settings.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static List<String> b = new ArrayList();
    private static String[] c = {"/cashier/dispatcher", "/cashier/directpay", "/cashier/gohellopay", "/cashier/queryorder"};
    private static String d = null;

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8274a52cf4e7a60882aa25e6ee3e14e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8274a52cf4e7a60882aa25e6ee3e14e")).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && "a".equals(com.meituan.android.paybase.downgrading.a.a().a("cashier_request_delay"))) {
            if (str.startsWith("http")) {
                str = str.replaceFirst("^https?://[^/]+/", "/");
            }
            for (String str2 : c) {
                if (str.startsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(String str) {
        boolean z;
        List list;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1402f8cfebbcbf22318044e88a168a4d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1402f8cfebbcbf22318044e88a168a4d")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a635e95544d55f9e9f1714a42207555b", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a635e95544d55f9e9f1714a42207555b")).booleanValue();
        } else {
            z = d.c() && TextUtils.equals("b", com.meituan.android.paybase.downgrading.a.a().a("channel_switch"));
        }
        if (z) {
            String b2 = com.meituan.android.paybase.downgrading.a.a().b("shark_urls") != null ? com.meituan.android.paybase.downgrading.a.a().b("shark_urls") : null;
            if (!TextUtils.equals(b2, d)) {
                synchronized (a.class) {
                    if (!TextUtils.equals(b2, d)) {
                        d = b2;
                        Object[] objArr3 = {b2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "38a6598508d460078b7bd027af0fd7df", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "38a6598508d460078b7bd027af0fd7df");
                        } else {
                            try {
                                list = (List) n.a().fromJson(b2, new TypeToken<List<String>>() { // from class: com.meituan.android.paycommon.lib.retrofit.channel.a.1
                                }.getType());
                            } catch (Exception e) {
                                com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "ChannelUtils_updateConfig").a("message", e.getMessage()).b);
                                com.meituan.android.paybase.common.analyse.a.a("ChannelUtils", "updateConfig", "json error: " + e.getMessage(), "");
                                list = null;
                            }
                            b.clear();
                            if (!i.a((Collection) list)) {
                                b.addAll(list);
                            }
                        }
                    }
                }
            }
            if (TextUtils.isEmpty(d)) {
                return false;
            }
            String replaceFirst = str.startsWith("http") ? str.replaceFirst("^https?://[^/]+/", "/") : str;
            for (String str2 : b) {
                if (replaceFirst.startsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
