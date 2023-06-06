package com.sankuai.waimai.platform.mach.monitor;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.mach.common.i;
import com.sankuai.waimai.platform.mach.monitor.c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b {
    public static ChangeQuickRedirect a = null;
    private static final String c = "b";
    private static b g;
    public List<WeakReference<Map<String, Object>>> b;
    private List<WeakReference<Map<String, Object>>> d;
    private List<WeakReference<Map<String, Object>>> e;
    private List<WeakReference<Map<String, Object>>> f;
    private i.a h;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56e5953c174d8caef70b27e17588a496", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56e5953c174d8caef70b27e17588a496");
            return;
        }
        this.b = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
        this.e = new CopyOnWriteArrayList();
        this.f = new CopyOnWriteArrayList();
        this.h = new i.a() { // from class: com.sankuai.waimai.platform.mach.monitor.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.common.i.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cbc26886c84a035a38d2f57245f8e15d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cbc26886c84a035a38d2f57245f8e15d");
                } else {
                    b.this.b();
                }
            }
        };
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1af51ff6507eb15d4a7675195822f87e", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1af51ff6507eb15d4a7675195822f87e");
        }
        if (g == null) {
            synchronized (b.class) {
                if (g == null) {
                    g = new b();
                }
            }
        }
        return g;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "712500015e53b94a6660e073a9d6e38e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "712500015e53b94a6660e073a9d6e38e");
        } else if (!i.a().b) {
            i.a().a(this.h);
        } else {
            c.a aVar = new c.a();
            aVar.c = "ad_type_1";
            aVar.b = "首页_0";
            aVar.a();
            c();
            c.a aVar2 = new c.a();
            aVar2.c = "ad_type_5";
            aVar2.b = "首页_0";
            aVar2.a();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "851a9112d188ad309d8ae27b7548bcea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "851a9112d188ad309d8ae27b7548bcea");
            return;
        }
        c.a aVar = new c.a();
        aVar.c = "ad_type_2";
        aVar.b = "首页_0";
        aVar.a();
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fb5b67034cc24d847cad6852f6b9027", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fb5b67034cc24d847cad6852f6b9027");
            return;
        }
        c.a aVar = new c.a();
        aVar.c = "ad_type_3";
        aVar.b = "首页_0";
        aVar.a();
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b7f2192e550deb1f09acbfa4abd5831", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b7f2192e550deb1f09acbfa4abd5831");
            return;
        }
        c.a aVar = new c.a();
        aVar.c = "ad_type_8";
        aVar.b = "搜索结果页_0";
        aVar.a();
    }

    public final void a(c cVar, Map<String, Object> map) {
        Object[] objArr = {cVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a39ae1d9be0dbaaeafce2afdc7090599", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a39ae1d9be0dbaaeafce2afdc7090599");
        } else if (c(cVar, map)) {
            try {
                com.sankuai.waimai.mach.utils.e.c(this.d);
                if (com.sankuai.waimai.mach.utils.e.a(this.d, map)) {
                    return;
                }
                a("BizTraceMachBundleLoadSuccess", cVar, 0);
                a("BizTraceNRTMachBundleLoadSuccess", cVar, map, 0);
                this.d.add(new WeakReference<>(map));
            } catch (Exception e) {
                a(e);
            }
        }
    }

    public final void a(c cVar, Map<String, Object> map, int i) {
        Object[] objArr = {cVar, map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10323f0014e5008812bfc75945ec85f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10323f0014e5008812bfc75945ec85f3");
        } else if (c(cVar, map)) {
            try {
                com.sankuai.waimai.mach.utils.e.c(this.e);
                if (com.sankuai.waimai.mach.utils.e.a(this.e, map)) {
                    return;
                }
                a("BizTraceMachRenderSuccess", cVar, i);
                a("BizTraceNRTMachRenderSuccess", cVar, map, i);
                this.e.add(new WeakReference<>(map));
            } catch (Exception e) {
                a(e);
            }
        }
    }

    public final void b(c cVar, Map<String, Object> map) {
        Object[] objArr = {cVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47f19b2186812c3d4a1ec4531564d616", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47f19b2186812c3d4a1ec4531564d616");
        } else if (c(cVar, map)) {
            try {
                com.sankuai.waimai.mach.utils.e.c(this.f);
                if (com.sankuai.waimai.mach.utils.e.a(this.f, map)) {
                    return;
                }
                a("BizTraceMachExposeSuccess", cVar, 0);
                a("BizTraceNRTMachExposeSuccess", cVar, map, 0);
                this.f.add(new WeakReference<>(map));
            } catch (Exception e) {
                a(e);
            }
        }
    }

    public boolean c(c cVar, Map<String, Object> map) {
        Object[] objArr = {cVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cdf179d481bb55d57fb20c11ce47511", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cdf179d481bb55d57fb20c11ce47511")).booleanValue() : !com.sankuai.waimai.mach.utils.e.a(map) && a(cVar);
    }

    public void a(String str, c cVar, Map<String, Object> map, int i) {
        Object[] objArr = {str, cVar, map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce9424c8b5a693aa29844f42ec6cf72f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce9424c8b5a693aa29844f42ec6cf72f");
            return;
        }
        cVar.a(com.meituan.android.time.c.b());
        cVar.h = i;
        com.sankuai.waimai.mach.common.f g2 = i.a().g();
        if (g2 != null) {
            cVar.g = g2.k;
            cVar.f = g2.i;
        }
        String str2 = c;
        com.sankuai.waimai.foundation.utils.log.a.b(str2, "traceReportNRT::key=" + str + ",traceModel=" + cVar.toString(), new Object[0]);
        HashMap hashMap = new HashMap();
        hashMap.put(str, 1);
        g().a(hashMap, b(cVar));
    }

    public void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ecda42e806c26c42aea1d213ed715ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ecda42e806c26c42aea1d213ed715ef");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(NetLogConstants.Details.ERROR_MSG, Log.getStackTraceString(exc));
            com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.platform.mach.statistics.c().a("mach_trace").d(new JSONObject(hashMap).toString()).c("全链路监控上报失败").b());
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    private Map<String, String> b(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad15b07b895b84b74f2c93efeaacb287", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad15b07b895b84b74f2c93efeaacb287");
        }
        HashMap hashMap = new HashMap();
        if (cVar != null) {
            hashMap.put("channel", cVar.b);
            hashMap.put("product_line", cVar.c);
            if (cVar.h > 0) {
                hashMap.put("poi_num", String.valueOf(cVar.h));
            }
            if (cVar.e > 0) {
                hashMap.put("add_time", String.valueOf(cVar.e));
            }
            if (a(cVar.f)) {
                hashMap.put("uuid", cVar.f);
            }
            if (a(cVar.g)) {
                hashMap.put("user_id", cVar.g);
            }
            if (a(cVar.d)) {
                hashMap.put("template_id", cVar.d);
            }
        }
        hashMap.putAll(f());
        return hashMap;
    }

    private Map<String, String> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3716561f37875091e36218701f6c9d48", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3716561f37875091e36218701f6c9d48");
        }
        HashMap hashMap = new HashMap();
        hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, com.sankuai.waimai.platform.b.A().i());
        hashMap.put("ctype", com.sankuai.waimai.platform.b.A().o());
        hashMap.put("env", i.a().d());
        return hashMap;
    }

    private boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92674c09c8ff48575f46e16fdee20083", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92674c09c8ff48575f46e16fdee20083")).booleanValue() : !TextUtils.isEmpty(str);
    }

    private com.sankuai.waimai.mach.e g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "035ae07e1fee7860ed98a8771cf58985", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "035ae07e1fee7860ed98a8771cf58985") : i.a().e();
    }

    private boolean a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0358c440afc7b7668b51667da1ca557a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0358c440afc7b7668b51667da1ca557a")).booleanValue() : (cVar == null || com.sankuai.waimai.mach.utils.e.a(cVar.c) || com.sankuai.waimai.mach.utils.e.a(cVar.b)) ? false : true;
    }

    public void a(String str, c cVar, int i) {
        Object[] objArr = {str, cVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "033fb86225615b746c13922e76e5a7d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "033fb86225615b746c13922e76e5a7d3");
            return;
        }
        cVar.h = i;
        String str2 = c;
        com.sankuai.waimai.foundation.utils.log.a.e(str2, "traceReportRT::key=" + str + ",traceModel=" + cVar.toString(), new Object[0]);
        HashMap hashMap = new HashMap();
        hashMap.put(str, 1);
        g().a(hashMap, b(cVar));
    }
}
