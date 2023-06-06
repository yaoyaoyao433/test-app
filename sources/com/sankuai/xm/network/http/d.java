package com.sankuai.xm.network.http;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static c b;

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17d71b4b69c206ecb5e3295966953c72", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17d71b4b69c206ecb5e3295966953c72");
        } else if (TextUtils.equals(b(), str)) {
        } else {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6e316b3f23d705eaa6f7282d7c13b6a9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6e316b3f23d705eaa6f7282d7c13b6a9");
            } else {
                com.sankuai.xm.base.e.a(com.sankuai.xm.base.e.a().edit().putString("http_engine_config", str));
            }
            synchronized (d.class) {
                b = a(com.sankuai.xm.base.f.m().g(), str);
            }
        }
    }

    public static b b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03e1c8120af0134601835ee49c20374a", 6917529027641081856L) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03e1c8120af0134601835ee49c20374a") : a().a(str);
    }

    private static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48843fc655d7b7d0ffc5b83b908cb88a", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48843fc655d7b7d0ffc5b83b908cb88a");
        }
        if (b == null) {
            synchronized (d.class) {
                if (b == null) {
                    b = a(com.sankuai.xm.base.f.m().g(), b());
                }
            }
        }
        return b;
    }

    private static c a(Context context, String str) {
        c cVar;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "477443395a964ed4aef66cd3358b7f20", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "477443395a964ed4aef66cd3358b7f20");
        }
        try {
            if (TextUtils.equals(str, "system")) {
                cVar = new com.sankuai.xm.network.systemhttp.b();
            } else {
                cVar = (c) b(context, "xm_sdk_integration_http_engine");
                if (cVar == null) {
                    cVar = new com.sankuai.xm.network.systemhttp.b();
                }
            }
            return cVar;
        } catch (Exception e) {
            e.printStackTrace();
            return new com.sankuai.xm.network.systemhttp.b();
        }
    }

    private static Object b(Context context, String str) {
        ApplicationInfo applicationInfo;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d3ed113e29c40a42624987e17ab1244", 6917529027641081856L)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d3ed113e29c40a42624987e17ab1244");
        }
        if (TextUtils.isEmpty(str) || context == null) {
            return null;
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (applicationInfo.metaData == null) {
            return null;
        }
        for (String str2 : applicationInfo.metaData.keySet()) {
            if (TextUtils.equals(str, str2)) {
                Class<?> cls = Class.forName((String) applicationInfo.metaData.get(str2));
                if (cls == null) {
                    return null;
                }
                return cls.newInstance();
            }
        }
        return null;
    }

    private static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e251701495128946376d6c4514744c36", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e251701495128946376d6c4514744c36") : com.sankuai.xm.base.e.a().getString("http_engine_config", "");
    }
}
