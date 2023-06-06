package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.babel.BabelConfig;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornConfiguration;
import com.meituan.android.common.horn.extra.monitor.IHornMonitorService;
import com.meituan.android.common.horn.extra.sharkpush.ISharkPushService;
import com.meituan.android.common.horn.extra.sharkpush.SharkPushServiceMgr;
import com.meituan.android.common.horn.extra.uuid.IUUIDService;
import com.meituan.android.common.horn.extra.uuid.UUIDServiceMgr;
import com.meituan.android.common.horn.monitor.HornMonitor;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.android.common.sniffer.SnifferConfig;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.config.MetricsConfig;
import com.meituan.metrics.traffic.MetricsNetworkInterceptor;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.launcher.model.AppInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class q extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit, com.sankuai.waimai.foundation.core.init.a
    public final int process() {
        return 3;
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "MetricsInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(final Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bfd8b3b0c23d0f206247e3b308bfb0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bfd8b3b0c23d0f206247e3b308bfb0d");
            return;
        }
        Context applicationContext = application.getApplicationContext();
        com.sankuai.waimai.launcher.util.aop.b.a(applicationContext);
        Horn.init(applicationContext, new HornConfiguration() { // from class: com.sankuai.waimai.launcher.init.mainly.q.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornConfiguration
            public final IUUIDService uuidService() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29beae57e0f5fdd1858044717869c4f0", RobustBitConfig.DEFAULT_VALUE) ? (IUUIDService) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29beae57e0f5fdd1858044717869c4f0") : UUIDServiceMgr.get().service();
            }

            @Override // com.meituan.android.common.horn.HornConfiguration
            public final ISharkPushService sharkPushService() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87985fb27a1ce3cf639fc9da0bf06431", RobustBitConfig.DEFAULT_VALUE) ? (ISharkPushService) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87985fb27a1ce3cf639fc9da0bf06431") : SharkPushServiceMgr.get().service();
            }

            @Override // com.meituan.android.common.horn.HornConfiguration
            public final int getDeviceLevel() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "760c751db2639f6f277e832c5c733888", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "760c751db2639f6f277e832c5c733888")).intValue() : DeviceUtil.getDeviceLevel(application).getValue();
            }

            @Override // com.meituan.android.common.horn.HornConfiguration
            @Nullable
            public final IHornMonitorService monitorService() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ea808d0a3caa36aa183485f58388dec", RobustBitConfig.DEFAULT_VALUE) ? (IHornMonitorService) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ea808d0a3caa36aa183485f58388dec") : HornMonitor.getInstance();
            }
        });
        Horn.debug(application, com.sankuai.meituan.takeoutnew.a.f);
        Babel.init(applicationContext, new a());
        Sniffer.init(applicationContext, new SnifferConfig() { // from class: com.sankuai.waimai.launcher.init.mainly.q.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.sniffer.SnifferConfig
            @NonNull
            public final String getUserId() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a779b4b5749e263e659a9b7a00727927", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a779b4b5749e263e659a9b7a00727927") : String.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d());
            }

            @Override // com.meituan.android.common.sniffer.SnifferConfig
            public final String getCityId() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d8c891c4502f5bb9c1f3f1d49a762d84", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d8c891c4502f5bb9c1f3f1d49a762d84") : String.valueOf(AppInfo.getCityID());
            }

            @Override // com.meituan.android.common.sniffer.SnifferConfig
            public final String getApkHash() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6e5bc686e43558ccfd5e9732c9a5b8d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6e5bc686e43558ccfd5e9732c9a5b8d") : com.sankuai.waimai.platform.b.A().G();
            }
        });
        Sniffer.setDebugMode(com.sankuai.meituan.takeoutnew.a.f);
        Metrics.getInstance().setDebug(b(application)).init(application, new b()).registerTrafficListener(new c(application));
        if (com.sankuai.meituan.takeoutnew.a.f) {
            com.sankuai.waimai.launcher.config.a a2 = com.sankuai.waimai.launcher.config.a.a();
            Object[] objArr2 = {application};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.launcher.config.a.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "ccc9a6af02d6eed3439f5f59ba19dd37", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "ccc9a6af02d6eed3439f5f59ba19dd37");
            }
        }
        com.meituan.android.privacy.impl.monitor.d dVar = new com.meituan.android.privacy.impl.monitor.d() { // from class: com.sankuai.waimai.launcher.init.mainly.q.3
            @Override // com.meituan.android.privacy.impl.monitor.d
            public final boolean a() {
                return true;
            }

            @Override // com.meituan.android.privacy.impl.monitor.d
            public final boolean b() {
                return true;
            }
        };
        Object[] objArr3 = {dVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.privacy.impl.monitor.c.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "61443bdb842c398febb806cf9cf7153e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "61443bdb842c398febb806cf9cf7153e");
            return;
        }
        com.meituan.android.privacy.impl.monitor.c cVar = new com.meituan.android.privacy.impl.monitor.c();
        if (dVar.a() && cVar.d) {
            cVar.a(new com.meituan.android.privacy.impl.monitor.a(cVar));
        }
        if (dVar.b() && cVar.c) {
            cVar.a(new com.meituan.android.privacy.impl.monitor.b(cVar));
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.privacy.impl.monitor.c.a;
        if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "0ecc5c0dd7d9a40f8404f15d0e695390", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "0ecc5c0dd7d9a40f8404f15d0e695390");
        } else if (cVar.b.isEmpty()) {
        } else {
            com.meituan.android.privacy.interfaces.monitor.c.a = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "942e42df573cdbd12dc8ed4ca1e47c99", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "942e42df573cdbd12dc8ed4ca1e47c99")).booleanValue() : com.sankuai.meituan.takeoutnew.a.f && com.sankuai.waimai.platform.utils.d.b(context, "debug_metrics", false);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class c implements MetricsNetworkInterceptor {
        public static ChangeQuickRedirect a;
        private final Application b;

        public c(Application application) {
            Object[] objArr = {application};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f19d28d275375765df28f2bed151b9b9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f19d28d275375765df28f2bed151b9b9");
            } else {
                this.b = application;
            }
        }

        @Override // com.meituan.metrics.traffic.MetricsNetworkInterceptor
        public final void onNetworkTraffic(TrafficRecord trafficRecord) {
            Object[] objArr = {trafficRecord};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3879c0e0ddb49f7719c5e6f6076a6ace", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3879c0e0ddb49f7719c5e6f6076a6ace");
                return;
            }
            com.sankuai.waimai.launcher.log.perf.a.a(trafficRecord);
            if (q.b(this.b)) {
                com.sankuai.waimai.foundation.utils.log.a.c("NETWORK", "%s\n%s", trafficRecord.getUrl(), trafficRecord.toString());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends BabelConfig {
        public static ChangeQuickRedirect a;
        private boolean b;

        @Override // com.meituan.android.common.babel.BabelConfig
        public final boolean isSensitiveLocalEnable() {
            return true;
        }

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcda682b4bf26075d06f260d12afb160", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcda682b4bf26075d06f260d12afb160");
            } else {
                this.b = false;
            }
        }

        @Override // com.meituan.android.common.babel.BabelConfig
        public final String getAppVersion() {
            return com.sankuai.meituan.takeoutnew.a.d;
        }

        @Override // com.meituan.android.common.babel.BabelConfig
        public final String getToken() {
            return com.sankuai.meituan.takeoutnew.a.g;
        }

        @Override // com.meituan.android.common.babel.BabelConfig
        public final String getApkHash() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45fad981cfdbd1c7d4100784af354164", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45fad981cfdbd1c7d4100784af354164") : com.sankuai.waimai.platform.b.A().G();
        }

        @Override // com.meituan.android.common.babel.BabelConfig
        public final String getChannel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f8f722450664f24c37ec51f653e2f37", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f8f722450664f24c37ec51f653e2f37") : com.sankuai.waimai.platform.b.A().d();
        }

        @Override // com.meituan.android.common.babel.BabelConfig
        public final String getUuid() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c59d911e8196a6bf4ed73bc93620c64", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c59d911e8196a6bf4ed73bc93620c64");
            }
            if (this.b) {
                return "";
            }
            this.b = true;
            String c = com.sankuai.waimai.platform.b.A().c();
            this.b = false;
            return c;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b extends MetricsConfig {
        public b() {
        }
    }
}
