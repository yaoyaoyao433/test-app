package com.sankuai.waimai.store.util.monitor;

import android.content.Context;
import android.os.Build;
import com.dianping.monitor.impl.m;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.store.util.i;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static m b;

    private static m a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f9baafbc1931348c21f43a169ea3b26", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f9baafbc1931348c21f43a169ea3b26");
        }
        if (b == null) {
            m mVar = new m(com.sankuai.waimai.config.a.a().d(), com.sankuai.waimai.store.util.b.a());
            b = mVar;
            Object[] objArr2 = {mVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8bf3b41bcb46a8cebd540291c2605a2c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8bf3b41bcb46a8cebd540291c2605a2c");
            } else {
                mVar.a("platform", "android").a("env", com.sankuai.waimai.foundation.core.a.b() ? "test" : "prod").a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, a(com.meituan.android.singleton.b.a)).a("system_version", String.valueOf(Build.VERSION.SDK_INT));
            }
        }
        return b;
    }

    private static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1042059b0f9d9ae8184fd1df7bb201df", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1042059b0f9d9ae8184fd1df7bb201df");
        }
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    private static void a(Class cls, String str, String str2) {
        Object[] objArr = {cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b09a09f3806d65345c76976b8fc2e84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b09a09f3806d65345c76976b8fc2e84");
        } else if (cls == null) {
        } else {
            com.dianping.codelog.b.b(cls, str, str2);
        }
    }

    public static void a(Class cls, String str, String str2, String str3) {
        Object[] objArr = {cls, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5791e76e310a0099eb055834b2157bfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5791e76e310a0099eb055834b2157bfe");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("description", str2);
        hashMap.put(SnifferDBHelper.COLUMN_LOG, str3);
        String a2 = i.a(hashMap);
        a(cls, str, a2);
        m a3 = a();
        a3.a(str, Collections.singletonList(Float.valueOf(0.0f)));
        a3.a("class_name", cls.getSimpleName());
        a3.a("error_type", str2);
        a3.a(a2);
        a3.a();
    }
}
