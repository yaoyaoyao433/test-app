package com.meituan.mmp.lib.engine;

import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.mmp.lib.api.report.MetricsModule;
import com.meituan.mmp.lib.engine.f;
import com.meituan.mmp.lib.utils.ac;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class p {
    public static ChangeQuickRedirect a;
    public static final List<a> b = new CopyOnWriteArrayList();
    public static final Map<f, a> c = new WeakHashMap();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public String a;
        public final long b = SystemClock.elapsedRealtime();
        public f.c c = f.c.INITIAL;
        public boolean d;
        public boolean e;
        public boolean f;
    }

    public static a a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "858d8356abe8281fa924c7328dc1084c", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "858d8356abe8281fa924c7328dc1084c") : c.get(fVar);
    }

    public static void a(String str, Intent intent) {
        Object[] objArr = {str, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4c2f768d1ad76c1bd7d18cf2b9bce88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4c2f768d1ad76c1bd7d18cf2b9bce88");
            return;
        }
        String str2 = "notStarted";
        Iterator<a> it = b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a next = it.next();
            if (TextUtils.equals(str, next.a)) {
                if (next.f) {
                    str2 = "consumed";
                } else if (next.e) {
                    str2 = "cleared";
                } else {
                    str2 = next.c == f.c.FAILED ? "failed" : "unknown";
                }
            }
        }
        if ("notStarted".equals(str2) && o.a()) {
            str2 = "preloadedOther";
        }
        String str3 = str2;
        String dataString = intent != null ? intent.getDataString() : null;
        String str4 = dataString == null ? "empty" : dataString;
        String jSONObject = intent == null ? "empty" : ac.a(intent.getExtras()).toString();
        com.meituan.mmp.lib.mp.a e = com.meituan.mmp.lib.mp.a.e();
        MetricsModule.a("mmp.launch.count.preload.miss", com.meituan.mmp.lib.utils.v.a("mmp.id", str, "process", e == null ? "" : e.b(), "reason", str3, "launchData", str4, "launchExtras", jSONObject, "mtPreloadStrategy", o.d(str), "sinceApplicationStart", Long.valueOf(com.meituan.mmp.lib.preformance.a.b())));
    }
}
