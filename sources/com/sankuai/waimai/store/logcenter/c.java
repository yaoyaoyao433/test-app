package com.sankuai.waimai.store.logcenter;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private final Map<String, Object> b;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce5d625b2096b32edc282f4ebe7d20f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce5d625b2096b32edc282f4ebe7d20f5");
        } else {
            this.b = b();
        }
    }

    @NonNull
    public final Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50bfd219af91591edabdf8fbc4729a72", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50bfd219af91591edabdf8fbc4729a72");
        }
        HashMap hashMap = new HashMap(this.b);
        hashMap.put("report_time", Long.valueOf(System.currentTimeMillis()));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        hashMap.put("report_time_test", PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1d3d005039ce142fa56a14bf2f9598ed", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1d3d005039ce142fa56a14bf2f9598ed") : new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())));
        return hashMap;
    }

    @NonNull
    private Map<String, Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e46e859cfc540dc00f2639f01203a83d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e46e859cfc540dc00f2639f01203a83d");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("category", "org.rt-health-trace-log");
        hashMap.put("os", "Android");
        hashMap.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("device", String.valueOf(Build.MODEL));
        try {
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str)) {
                str = str.trim();
            }
            hashMap.put("os-build", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (com.dianping.codelog.b.a() != null) {
            hashMap.put("uuid", com.dianping.codelog.b.a().b());
        }
        hashMap.put("user_id", Long.valueOf(com.sankuai.waimai.store.manager.user.a.a().c()));
        hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, c());
        return hashMap;
    }

    private static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f6b34d4002dbf1f19eaea7ab35e1180", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f6b34d4002dbf1f19eaea7ab35e1180");
        }
        try {
            Context a2 = com.sankuai.waimai.store.util.b.a();
            return a2.getPackageManager().getPackageInfo(a2.getPackageName(), 16384).versionName;
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return "";
        }
    }
}
