package com.sankuai.mesh.util;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;

    private static Map<String, Object> b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9c519c09066ad5892be5fc7c3917c76", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9c519c09066ad5892be5fc7c3917c76");
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("app", com.sankuai.mesh.core.d.a().getAppName());
        map.put("os", "android");
        map.put("osVersion", String.valueOf(Build.VERSION.SDK_INT));
        map.put("sdkVersion", "0.0.6");
        map.put("appVersion", com.sankuai.mesh.core.d.a().getAppVersion());
        return map;
    }

    public static void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fa968598ca868b7f9e14387cb545813", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fa968598ca868b7f9e14387cb545813");
        } else {
            a(map, null);
        }
    }

    private static void a(Map<String, Object> map, Long l) {
        Object[] objArr = {map, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "152769ac2b816b4b61c446a003a0b616", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "152769ac2b816b4b61c446a003a0b616");
        } else {
            a(System.currentTimeMillis(), map, null);
        }
    }

    private static void a(long j, Map<String, Object> map, Long l) {
        Object[] objArr = {new Long(j), map, l};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32c02aba1d592ef678a0f6fc6c3674e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32c02aba1d592ef678a0f6fc6c3674e2");
            return;
        }
        try {
            Log.Builder optional = new Log.Builder("").ts(j).tag(a()).token("5c6e42301c9d441acbddeee0").optional(b(map));
            if (l != null) {
                optional.value(l.longValue());
            }
            Babel.logRT(optional.build());
        } catch (Throwable unused) {
            com.sankuai.mesh.core.e.a();
        }
    }

    private static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82e20935ff7834a3fc81c1ed31d8b6c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82e20935ff7834a3fc81c1ed31d8b6c0");
        }
        com.sankuai.mesh.core.e.a();
        return "mesh";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public HashMap<String, Object> b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89b0ab4d0126edab054832fbbf67d0b6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89b0ab4d0126edab054832fbbf67d0b6");
            } else {
                this.b = new HashMap<>();
            }
        }

        public final a a(String str, Object obj) {
            Object[] objArr = {str, obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29c4382f7fc37447b7aef2493b5edb54", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29c4382f7fc37447b7aef2493b5edb54");
            }
            if (!TextUtils.isEmpty(str) && obj != null) {
                this.b.put(str, obj);
            }
            return this;
        }
    }
}
