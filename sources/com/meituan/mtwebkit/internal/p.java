package com.meituan.mtwebkit.internal;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class p {
    public static ChangeQuickRedirect a;
    private Map<String, String> b;

    public p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c6ed5f1ebed7d37a7a8c2b8aef103a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c6ed5f1ebed7d37a7a8c2b8aef103a0");
        } else {
            this.b = new HashMap();
        }
    }

    public final p a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d12da9f50aa502e863fe7983984ec10a", RobustBitConfig.DEFAULT_VALUE)) {
            return (p) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d12da9f50aa502e863fe7983984ec10a");
        }
        if (str2 != null) {
            this.b.put(str, str2);
        }
        return this;
    }

    public void a(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4c9f8dfc152b7e2c036a21cfd4d5f13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4c9f8dfc152b7e2c036a21cfd4d5f13");
        } else {
            a().a(str, Arrays.asList(Float.valueOf(f))).a();
        }
    }

    private com.dianping.monitor.impl.m a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bbdd220ba416766fc3a1f6a5ca37ddf", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.monitor.impl.m) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bbdd220ba416766fc3a1f6a5ca37ddf");
        }
        Application a2 = a.a();
        com.dianping.monitor.impl.m mVar = new com.dianping.monitor.impl.m(10, a2);
        Object[] objArr2 = {mVar, a2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f880a09dd355c2542dd9310789de0deb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f880a09dd355c2542dd9310789de0deb");
        } else {
            mVar.a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, a(a2));
            mVar.a("system_version", Build.VERSION.RELEASE);
            mVar.a("model", Build.MANUFACTURER);
        }
        for (Map.Entry<String, String> entry : this.b.entrySet()) {
            mVar.a(entry.getKey(), entry.getValue());
        }
        return mVar;
    }

    private String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "833760609793024e504bd35321b4ff79", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "833760609793024e504bd35321b4ff79");
        }
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (Throwable unused) {
            return "";
        }
    }
}
