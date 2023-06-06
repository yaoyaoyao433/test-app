package com.sankuai.waimai.store.order;

import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class DrugOrderMonitor {
    public static ChangeQuickRedirect a;

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96d382072a13133d6c98f62e4dc3c9dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96d382072a13133d6c98f62e4dc3c9dd");
        } else if (d(str)) {
            com.sankuai.waimai.store.util.monitor.c.a(new Monitor("MEDShopCartAddStart"));
        }
    }

    public static void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28287bb9ea3221f19fa62a18ff893ee2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28287bb9ea3221f19fa62a18ff893ee2");
        } else if (d(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("success_code", String.valueOf(i));
            com.sankuai.waimai.store.util.monitor.c.b(new Monitor("MEDShopCartAdd"), "", "", hashMap);
        }
    }

    public static void a(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09d8c9de1cc06b5491d485a125411a6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09d8c9de1cc06b5491d485a125411a6c");
        } else if (d(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(i));
            hashMap.put(NetLogConstants.Details.ERROR_MSG, str2);
            com.sankuai.waimai.store.util.monitor.c.a(new Monitor("MEDShopCartAdd", "AddFail"), "", "加购失败", hashMap);
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "596881b700087dbe02928ed498395de7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "596881b700087dbe02928ed498395de7");
        } else if (d(str)) {
            com.sankuai.waimai.store.util.monitor.c.a(new Monitor("MEDShopCartDesStart"));
        }
    }

    public static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db7965f1b02601debce23127df7316cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db7965f1b02601debce23127df7316cb");
        } else if (d(str)) {
            com.sankuai.waimai.store.util.monitor.c.a(new Monitor("MEDShopCartDes"));
        }
    }

    public static void b(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd228aa4df74dffeac5c498ed20b99ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd228aa4df74dffeac5c498ed20b99ac");
        } else if (d(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(i));
            hashMap.put(NetLogConstants.Details.ERROR_MSG, str2);
            com.sankuai.waimai.store.util.monitor.c.a(new Monitor("MEDShopCartDes", "AddFail"), "", "加购失败", hashMap);
        }
    }

    private static boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e4de9fc2d8b22b4d8037714c1b3d9e5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e4de9fc2d8b22b4d8037714c1b3d9e5")).booleanValue();
        }
        com.sankuai.waimai.store.platform.domain.manager.poi.a l = a.e().l(str);
        if (l == null) {
            return false;
        }
        return l.t();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class Monitor implements IMonitor {
        public static ChangeQuickRedirect a;
        private final String b;
        private final String c;

        @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
        public final boolean a() {
            return false;
        }

        public Monitor(String str) {
            this(str, "");
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd4ec9a02bf60a2bc3c5592b2c40840e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd4ec9a02bf60a2bc3c5592b2c40840e");
            }
        }

        public Monitor(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c370f548038d54ab195d603b6bdc5e5f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c370f548038d54ab195d603b6bdc5e5f");
                return;
            }
            this.b = str;
            this.c = str2;
        }

        @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
        public String name() {
            return this.c;
        }

        @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
        public final com.sankuai.waimai.store.util.monitor.monitor.c b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8073ad1081acbbb66d9d3cb9ca43ccaa", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.util.monitor.monitor.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8073ad1081acbbb66d9d3cb9ca43ccaa") : new com.sankuai.waimai.store.util.monitor.monitor.c() { // from class: com.sankuai.waimai.store.order.DrugOrderMonitor.Monitor.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.monitor.monitor.c
                public final String a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a99c108af4678ea72200824a54d352a0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a99c108af4678ea72200824a54d352a0") : Monitor.this.b;
                }
            };
        }
    }
}
