package com.sankuai.waimai.mach.common;

import android.content.Context;
import android.support.annotation.Nullable;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.mach.s;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class i {
    public static ChangeQuickRedirect a;
    private static i h;
    public boolean b;
    public Context c;
    public h d;
    public a.InterfaceC0637a e;
    public DevSettings f;
    public b g;
    private com.sankuai.waimai.mach.e i;
    private com.sankuai.waimai.mach.e j;
    private Set<WeakReference<a>> k;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    public i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4883e9bd078e20be4ed92d0dc6fa27f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4883e9bd078e20be4ed92d0dc6fa27f");
            return;
        }
        this.b = false;
        this.j = new s();
    }

    public static i a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b5fa5372da116f0137457ee91225642", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b5fa5372da116f0137457ee91225642");
        }
        if (h == null) {
            synchronized (i.class) {
                if (h == null) {
                    h = new i();
                }
            }
        }
        return h;
    }

    public final void a(Context context, h hVar) {
        a aVar;
        Object[] objArr = {context, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8288f01d2ec6a914a40ac44a9269ac8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8288f01d2ec6a914a40ac44a9269ac8d");
            return;
        }
        this.c = context.getApplicationContext();
        this.d = hVar;
        this.e = hVar.d;
        this.i = hVar.c;
        this.f = hVar.b;
        com.sankuai.waimai.mach.debug.a.a(this.f.c);
        this.b = true;
        if (this.k == null || this.k.size() <= 0) {
            return;
        }
        for (WeakReference<a> weakReference : this.k) {
            if (weakReference != null && (aVar = weakReference.get()) != null) {
                aVar.a();
            }
        }
    }

    @Nullable
    public final Map<String, Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1a56025bbfd79572cc373740c17d065", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1a56025bbfd79572cc373740c17d065");
        }
        if (this.d == null || this.d.a == null) {
            return null;
        }
        return this.d.a.a();
    }

    public final Map<String, String> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fb8a3fc1d4e09a285e71e79188204ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fb8a3fc1d4e09a285e71e79188204ab");
        }
        if (this.d != null && this.d.a != null && this.d.b != null) {
            f fVar = this.d.a;
            HashMap hashMap = new HashMap();
            hashMap.put("app_name", fVar.b);
            hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, fVar.d);
            hashMap.put("platform", "android");
            hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_SYS_VERSION, fVar.g);
            hashMap.put(NetLogConstants.Tags.NETWORK_TYPE, com.sankuai.waimai.mach.manager_new.common.h.a().b());
            hashMap.put("uuid", fVar.i);
            hashMap.put("mach_version", fVar.h);
            return hashMap;
        }
        return Collections.emptyMap();
    }

    public final String d() {
        return (this.d == null || this.d.a == null || this.f == null) ? "" : this.d.a.m ? "debug" : this.f.b ? "test" : "prod";
    }

    public final com.sankuai.waimai.mach.e e() {
        if (this.i == null) {
            return this.j;
        }
        return this.i;
    }

    public final int f() {
        if (this.d == null || this.d.a == null) {
            return 0;
        }
        return this.d.a.n;
    }

    @Nullable
    public final f g() {
        if (this.d == null) {
            return null;
        }
        return this.d.a;
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d52f083364c689b880d5d990cae24fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d52f083364c689b880d5d990cae24fa");
            return;
        }
        if (this.k == null) {
            this.k = Collections.synchronizedSet(new HashSet());
        }
        this.k.add(new WeakReference<>(aVar));
    }

    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22c27bcdeb2c10bd3e7e03f7e128ad28", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22c27bcdeb2c10bd3e7e03f7e128ad28")).booleanValue();
        }
        f g = g();
        if (g != null) {
            return g.m;
        }
        return false;
    }
}
