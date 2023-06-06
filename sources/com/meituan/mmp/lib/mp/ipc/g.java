package com.meituan.mmp.lib.mp.ipc;

import android.text.TextUtils;
import com.meituan.mmp.lib.api.report.MetricsModule;
import com.meituan.mmp.lib.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static a b = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        int b;
        int c;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef9990112f9b9af60ee410e790da3fce", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef9990112f9b9af60ee410e790da3fce");
                return;
            }
            this.b = 0;
            this.c = 0;
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5538a9a03e898bca74f06de8ef573d5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5538a9a03e898bca74f06de8ef573d5b");
            return;
        }
        b.b++;
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9219123de3d3259c573b59eb6816da83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9219123de3d3259c573b59eb6816da83");
            return;
        }
        b.c++;
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d114964f1da52cb8f7b838e0ff0a9eec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d114964f1da52cb8f7b838e0ff0a9eec");
            return;
        }
        a aVar = b;
        b = new a();
        com.meituan.mmp.lib.mp.a e = com.meituan.mmp.lib.mp.a.e();
        MetricsModule.a("mmp.ipc.invoke.count", v.a("process", e == null ? "" : e.b(), "appId", str, "invokeCount", Integer.valueOf(aVar.b), "returnCount", Integer.valueOf(aVar.c), "countDiff", Integer.valueOf(aVar.b - aVar.c)));
    }

    public static void a(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2372c8f18f2b280939d79f69da2bd87d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2372c8f18f2b280939d79f69da2bd87d");
        } else if (map == null || !map.containsKey("extra") || TextUtils.isEmpty(map.get("extra"))) {
        } else {
            b(null, map);
        }
    }

    public static void b(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "69cc65c96e86f2bc9d74121638267cdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "69cc65c96e86f2bc9d74121638267cdd");
            return;
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("message", str);
        }
        com.meituan.mmp.lib.mp.a e = com.meituan.mmp.lib.mp.a.e();
        hashMap.put("process", e == null ? "" : e.b());
        MetricsModule.a("mmp.ipc.exception", hashMap);
    }
}
