package com.sankuai.xm.monitor;

import android.text.TextUtils;
import com.facebook.react.modules.appstate.AppStateModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.e;
import com.sankuai.xm.base.trace.j;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends d {
    public static ChangeQuickRedirect a;

    public static void a(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "202c304f8fa93d4b5750e233090d0c5f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "202c304f8fa93d4b5750e233090d0c5f");
        } else {
            d.b(str, str2, a(map));
        }
    }

    public static void a(String str, String str2, Object obj) {
        Object[] objArr = {str, str2, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ddf777a3a7a6053945b587c80a61b34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ddf777a3a7a6053945b587c80a61b34");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str2, obj);
        a(str, hashMap);
    }

    public static void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4402cebb46cf6deebebb92a5a42325a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4402cebb46cf6deebebb92a5a42325a");
        } else {
            d.b(str, a(map));
        }
    }

    private static Map<String, Object> a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "172135e02cbf3da03438a6bce39d8bc7", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "172135e02cbf3da03438a6bce39d8bc7");
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("serviceid", "4");
        long b = j.b();
        if (b != 0) {
            hashMap.put("traceid", Long.valueOf(b));
        }
        return hashMap;
    }

    public static void a(String str) {
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35764f02cf501f534f59713a8ba03b97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35764f02cf501f534f59713a8ba03b97");
            return;
        }
        String string = e.a().getString(str, "");
        try {
            str2 = new SimpleDateFormat("yyyyMMdd", Locale.CHINA).format(Long.valueOf(System.currentTimeMillis()));
        } catch (Exception e) {
            e = e;
            str2 = "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(CommonConstant.Symbol.UNDERLINE);
            b.c();
            sb.append(b.d().d);
            str2 = sb.toString();
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str2) || string.equals(str2)) {
            return;
        }
        HashMap hashMap = new HashMap();
        if ("init".equals(str)) {
            hashMap.put("init", 0);
        } else {
            hashMap.put("connect", 0);
        }
        hashMap.put("serviceid", "4");
        Object[] objArr2 = {AppStateModule.APP_STATE_ACTIVE, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0870a750168141a6457eda9f1ca8cd26", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0870a750168141a6457eda9f1ca8cd26");
        } else {
            Map<String, Object> a2 = a(hashMap);
            Object[] objArr3 = {AppStateModule.APP_STATE_ACTIVE, a2};
            ChangeQuickRedirect changeQuickRedirect3 = d.b;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "0147a4b45fb5596ccdbc2540adfa1324", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "0147a4b45fb5596ccdbc2540adfa1324");
            } else {
                try {
                    b c = b.c();
                    Object[] objArr4 = {AppStateModule.APP_STATE_ACTIVE, a2};
                    ChangeQuickRedirect changeQuickRedirect4 = b.a;
                    if (PatchProxy.isSupport(objArr4, c, changeQuickRedirect4, false, "6ff5f419ed91444247e0dc2dd47a65a7", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr4, c, changeQuickRedirect4, false, "6ff5f419ed91444247e0dc2dd47a65a7");
                    } else {
                        c.a(AppStateModule.APP_STATE_ACTIVE, a2, 8);
                    }
                } catch (Exception e3) {
                    com.sankuai.xm.log.c.c(d.class, e3.toString(), new Object[0]);
                }
            }
        }
        e.a().edit().putString(str, str2).apply();
    }
}
