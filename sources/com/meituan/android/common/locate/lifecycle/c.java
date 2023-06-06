package com.meituan.android.common.locate.lifecycle;

import com.meituan.android.common.locate.altbeacon.beacon.e;
import com.meituan.android.common.locate.provider.g;
import com.meituan.android.common.locate.provider.s;
import com.meituan.android.common.locate.util.FakeMainThread;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class c {
    private static boolean a = false;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {
        private static final c a = new c();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec40b676f0de6e6440eaa6c334036dca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec40b676f0de6e6440eaa6c334036dca");
        } else {
            this.b = false;
        }
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1e4ff6e8dc74c49798c55d06dcaf67d4", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1e4ff6e8dc74c49798c55d06dcaf67d4") : a.a;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "189b23bc9bfc1e79308c49737c0cceb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "189b23bc9bfc1e79308c49737c0cceb0");
        } else if (this.b) {
        } else {
            this.b = true;
            AppBus.getInstance().register(new AppBus.OnForegroundListener() { // from class: com.meituan.android.common.locate.lifecycle.c.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.metricx.helpers.AppBus.OnForegroundListener
                public void onForeground() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4f1842c6e3a9a05d13f39b24214e4cb7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4f1842c6e3a9a05d13f39b24214e4cb7");
                        return;
                    }
                    boolean unused = c.a = false;
                    if (g.a() != null && s.a(g.a()).a()) {
                        FakeMainThread.getInstance().post(new Runnable() { // from class: com.meituan.android.common.locate.lifecycle.c.1.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // java.lang.Runnable
                            public void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "6aacbbc44e43e31173c082dc2ea112e7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "6aacbbc44e43e31173c082dc2ea112e7");
                                } else if (g.a() != null) {
                                    e.a().a(com.meituan.android.common.locate.altbeacon.beacon.util.a.b);
                                }
                            }
                        });
                    }
                }
            });
            AppBus.getInstance().register(new AppBus.OnBackgroundListener() { // from class: com.meituan.android.common.locate.lifecycle.c.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.metricx.helpers.AppBus.OnBackgroundListener
                public void onBackground() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2b722f518c50e0ec239886d14ecfdcec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2b722f518c50e0ec239886d14ecfdcec");
                        return;
                    }
                    boolean unused = c.a = true;
                    if (g.a() != null && s.a(g.a()).a()) {
                        FakeMainThread.getInstance().post(new Runnable() { // from class: com.meituan.android.common.locate.lifecycle.c.2.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // java.lang.Runnable
                            public void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "3e74aa82dbcf8b8ed4713543bd301228", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "3e74aa82dbcf8b8ed4713543bd301228");
                                } else if (com.meituan.android.common.locate.altbeacon.beacon.config.a.a().c) {
                                } else {
                                    e.a().b(com.meituan.android.common.locate.altbeacon.beacon.util.a.f);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public boolean c() {
        return a;
    }
}
