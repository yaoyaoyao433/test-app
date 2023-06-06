package com.sankuai.waimai.store.util.monitor.report;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.monitor.impl.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.report.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class f extends b {
    public static ChangeQuickRedirect b;
    protected m c;
    private final h d;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "669404096d44d789361eeda9e35dc4c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "669404096d44d789361eeda9e35dc4c9");
        } else {
            this.d = new h();
        }
    }

    public static /* synthetic */ String a(f fVar, IMonitor iMonitor) {
        Object[] objArr = {iMonitor};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "c6fa4028f648152ca6f80f76c4b78415", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "c6fa4028f648152ca6f80f76c4b78415");
        }
        com.sankuai.waimai.store.util.monitor.monitor.c b2 = iMonitor.b();
        if (b2 == null) {
            return b(iMonitor);
        }
        String a2 = b2.a();
        String c = b2.c();
        if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(c)) {
            return b(iMonitor);
        }
        return a2 + CommonConstant.Symbol.UNDERLINE + c;
    }

    public static /* synthetic */ void a(f fVar, com.sankuai.waimai.store.util.monitor.monitor.b bVar, Class cls, String str, String str2) {
        Object[] objArr = {bVar, cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "7487675c1c4515a974646d15734554da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "7487675c1c4515a974646d15734554da");
            return;
        }
        h hVar = fVar.d;
        Object[] objArr2 = {bVar, cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "edc07d11aa476634202449c3c891df82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "edc07d11aa476634202449c3c891df82");
        } else if (bVar == com.sankuai.waimai.store.util.monitor.monitor.b.URGENT) {
            hVar.a(cls, str, str2);
        } else {
            Object[] objArr3 = {cls, str, str2};
            ChangeQuickRedirect changeQuickRedirect3 = h.a;
            if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "7a17e68bf9da78fc060a577a0859d735", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "7a17e68bf9da78fc060a577a0859d735");
                return;
            }
            h.b.add(new h.a(cls, str, str2));
            boolean z = h.b.size() > 10;
            hVar.c.removeCallbacks(hVar.d);
            if (z) {
                hVar.c.post(hVar.d);
            } else {
                hVar.c.postDelayed(hVar.d, 15000L);
            }
        }
    }

    public static /* synthetic */ void a(f fVar, Class cls, String str, String str2) {
        Object[] objArr = {cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "82f94149129f7a1dcfd0c8586a851039", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "82f94149129f7a1dcfd0c8586a851039");
            return;
        }
        h hVar = fVar.d;
        Object[] objArr2 = {cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "76b8842d522d0c51628dd83506e69cc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "76b8842d522d0c51628dd83506e69cc7");
        } else if (cls == null || TextUtils.isEmpty(str)) {
        } else {
            if (hVar.a()) {
                hVar.a("normal", cls, str, str2);
            } else {
                com.dianping.codelog.b.a(cls, str, str2);
            }
        }
    }

    public static /* synthetic */ String c() {
        return d();
    }

    public m a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cd299ce2890e9368253565823ef6f4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cd299ce2890e9368253565823ef6f4a");
        }
        if (this.c == null) {
            synchronized (f.class) {
                if (this.c == null) {
                    this.c = new m(b(z), com.sankuai.waimai.store.util.b.a());
                }
            }
        }
        a(this.c);
        return this.c;
    }

    public static void a(@NonNull m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e847b319658cd2612d55bea25a6e9e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e847b319658cd2612d55bea25a6e9e1");
        } else {
            mVar.a("os_type", "2").a("os_version", String.valueOf(Build.VERSION.SDK_INT)).a("app", d()).a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, b()).a("env", com.sankuai.waimai.foundation.core.a.b() ? "test" : "prod");
        }
    }

    private static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06cac495418ad4a86dc8a0c8c79a73c4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06cac495418ad4a86dc8a0c8c79a73c4") : com.sankuai.waimai.foundation.core.a.d() ? "外卖" : com.sankuai.waimai.foundation.core.a.f() ? "点评" : com.sankuai.waimai.foundation.core.a.e() ? "美团" : "unknown";
    }

    public static int b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2caa2e1eb71742fb03b06267e9cf96a1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2caa2e1eb71742fb03b06267e9cf96a1")).intValue();
        }
        if (z && !com.sankuai.waimai.foundation.core.a.d()) {
            if (com.sankuai.waimai.foundation.core.a.f()) {
                return 1;
            }
            return com.sankuai.waimai.foundation.core.a.e() ? 10 : 11;
        }
        return 11;
    }

    public static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6543ee10a4ffb28a8ae0cf17270b526d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6543ee10a4ffb28a8ae0cf17270b526d");
        }
        try {
            Context a2 = com.sankuai.waimai.store.util.b.a();
            return a2.getPackageManager().getPackageInfo(a2.getPackageName(), 16384).versionName;
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return "";
        }
    }

    @Override // com.sankuai.waimai.store.util.monitor.report.c
    public final void a(IMonitor iMonitor, String str, String str2) {
        Object[] objArr = {iMonitor, str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a14c3cc640be650334b36ce49cab5c07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a14c3cc640be650334b36ce49cab5c07");
        } else {
            a(iMonitor, str, str2, (Map<String, String>) null);
        }
    }

    @Override // com.sankuai.waimai.store.util.monitor.report.c
    public final void a(IMonitor iMonitor, String str, String str2, Map<String, String> map) {
        Object[] objArr = {iMonitor, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3771bab06069d93dc5d13c0c9ecd27ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3771bab06069d93dc5d13c0c9ecd27ee");
        } else if (iMonitor != null) {
            String a2 = a(iMonitor);
            String b2 = b(iMonitor);
            boolean c = c(iMonitor);
            g.a().a(1002, a2);
            a(c, a2 + "Error", b2, "2000", str2, map);
            a(1002, iMonitor, str, str2);
        }
    }

    @Override // com.sankuai.waimai.store.util.monitor.report.c
    public final void d(IMonitor iMonitor) {
        Object[] objArr = {iMonitor};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee984af9d0c51d698d201d0c1b4c8466", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee984af9d0c51d698d201d0c1b4c8466");
        } else {
            b(iMonitor, "", "");
        }
    }

    @Override // com.sankuai.waimai.store.util.monitor.report.c
    public final void b(IMonitor iMonitor, String str, String str2) {
        Object[] objArr = {iMonitor, str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24b271666bfdb4836fffa1c38864db26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24b271666bfdb4836fffa1c38864db26");
        } else {
            b(iMonitor, str, str2, null);
        }
    }

    @Override // com.sankuai.waimai.store.util.monitor.report.c
    public final void b(IMonitor iMonitor, String str, String str2, Map<String, String> map) {
        Object[] objArr = {iMonitor, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e96a2059a831b44f6082273a17cda9fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e96a2059a831b44f6082273a17cda9fe");
        } else if (iMonitor != null) {
            String a2 = a(iMonitor);
            String b2 = b(iMonitor);
            boolean c = c(iMonitor);
            g.a().a(1001, a2);
            a(c, a2 + "Success", b2, "1000", str2, map);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            a(1001, iMonitor, str, str2);
        }
    }

    public final void a(final int i, @NonNull final IMonitor iMonitor, final String str, final String str2) {
        Object[] objArr = {Integer.valueOf(i), iMonitor, str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a59881cf64c2a45013ac55e59cf93f91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a59881cf64c2a45013ac55e59cf93f91");
            return;
        }
        final String a2 = a(iMonitor);
        final String b2 = b(iMonitor);
        final String a3 = a(a2, b2) ? a() : "";
        al.a(new al.a() { // from class: com.sankuai.waimai.store.util.monitor.report.f.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.util.al.a
            public final void a() {
                String simpleName;
                Map map;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67a252e7539958fc74077af909a04eac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67a252e7539958fc74077af909a04eac");
                    return;
                }
                String str3 = a2;
                String str4 = b2;
                boolean a4 = iMonitor.a();
                Object[] objArr3 = {str3, str4, Byte.valueOf(a4 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "7c894d759d856953bef1457d5ecc5ed6", RobustBitConfig.DEFAULT_VALUE)) {
                    map = (Map) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "7c894d759d856953bef1457d5ecc5ed6");
                } else {
                    HashMap hashMap = new HashMap();
                    com.sankuai.waimai.store.config.i h = com.sankuai.waimai.store.config.i.h();
                    boolean a5 = h.a("sniffer_log_reporter_key/" + str3 + CommonConstant.Symbol.UNDERLINE + str4, false);
                    if (a4 || a5) {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = b.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "52ef4d1864530740091008565be78408", RobustBitConfig.DEFAULT_VALUE)) {
                            simpleName = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "52ef4d1864530740091008565be78408");
                        } else {
                            Activity c = com.sankuai.waimai.foundation.utils.activity.a.a().c();
                            simpleName = c == null ? "" : c.getClass().getSimpleName();
                        }
                        hashMap.put("currentActivity", simpleName);
                        hashMap.put("machEventCache", com.sankuai.waimai.store.util.monitor.cache.b.a());
                        hashMap.put("clickBidCache", com.sankuai.waimai.store.util.monitor.cache.b.b());
                    }
                    map = hashMap;
                }
                if (!TextUtils.isEmpty(str)) {
                    map.put("extra", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    map.put("describe", str2);
                }
                if (!TextUtils.isEmpty(a3)) {
                    map.put("stack", a3);
                }
                map.put("app", f.c());
                com.sankuai.waimai.store.util.monitor.monitor.c b3 = iMonitor.b();
                if (b3 == null) {
                    b3 = new a();
                }
                if (i == 1001) {
                    f.a(f.this, iMonitor.getClass(), f.a(f.this, iMonitor), com.sankuai.waimai.store.util.i.a(map));
                } else {
                    f.a(f.this, b3.b(), iMonitor.getClass(), f.a(f.this, iMonitor), com.sankuai.waimai.store.util.i.a(map));
                }
            }
        }, getClass().getSimpleName());
    }

    private void a(boolean z, String str, String str2, String str3, String str4, Map<String, String> map) {
        String str5;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, str2, str3, str4, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d65fc454ef2bd835b69be62ce472f65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d65fc454ef2bd835b69be62ce472f65");
            return;
        }
        m a2 = a(z);
        if (a2 == null) {
            return;
        }
        a2.a(str, Collections.singletonList(Float.valueOf(1.0f)));
        a2.a("code", str3);
        if (!TextUtils.isEmpty(str2)) {
            a2.a("error_type", str2);
            a2.a("error_reason", str2);
        }
        if (TextUtils.isEmpty(str4)) {
            str5 = str4;
        } else {
            if ("SMTUPViewController".equals(str4)) {
                a2.a("source_vc", "SMTUPViewController");
                str5 = "";
            } else {
                str5 = str4;
            }
            if ("WMSMTileChannelViewController".equals(str5)) {
                a2.a("source_vc", "WMSMTileChannelViewController");
                str5 = "";
            }
            if ("SMVegetablesViewController".equals(str5)) {
                a2.a("source_vc", "SMVegetablesViewController");
                str5 = "";
            }
        }
        if (!TextUtils.isEmpty(str5)) {
            a2.a("description", str5);
        }
        if (map != null && map.size() > 0) {
            for (String str6 : map.keySet()) {
                if (!TextUtils.isEmpty(str6)) {
                    a2.a(str6, map.get(str6));
                }
            }
        }
        a2.a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends com.sankuai.waimai.store.util.monitor.monitor.c {
        public a() {
        }
    }
}
