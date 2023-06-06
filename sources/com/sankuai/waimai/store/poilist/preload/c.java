package com.sankuai.waimai.store.poilist.preload;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.location.v2.k;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.sankuai.waimai.store.util.ae;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    public static volatile int c = -1;
    public static long d;
    public AtomicBoolean b;
    private AtomicInteger e;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a31667f4acc5902ad1890f2fb3fc179", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a31667f4acc5902ad1890f2fb3fc179");
            return;
        }
        this.b = new AtomicBoolean(false);
        this.e = new AtomicInteger(0);
    }

    public final void a(FragmentActivity fragmentActivity, final b bVar, String str) {
        Object[] objArr = {fragmentActivity, bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e79586079bb6b34d8410987fcf39c979", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e79586079bb6b34d8410987fcf39c979");
        } else if (this.b.compareAndSet(false, true)) {
            this.e.incrementAndGet();
            a(new k(fragmentActivity, str), new DeviceLocateCallback() { // from class: com.sankuai.waimai.store.poilist.preload.c.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback
                public final void a(@Nullable WMLocation wMLocation) {
                    Object[] objArr2 = {wMLocation};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "356fe66cab61b712a07d0cf9cefa3eaf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "356fe66cab61b712a07d0cf9cefa3eaf");
                        return;
                    }
                    c.c = 2;
                    bVar.a(wMLocation);
                    c.this.b.compareAndSet(true, false);
                }
            }, new com.sankuai.waimai.foundation.location.v2.callback.a() { // from class: com.sankuai.waimai.store.poilist.preload.c.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.foundation.location.v2.callback.a
                public final void a(@Nullable WmAddress wmAddress) {
                    Object[] objArr2 = {wmAddress};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9eab558e386b111bc77569fae55b1e02", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9eab558e386b111bc77569fae55b1e02");
                    } else {
                        bVar.a(wmAddress);
                    }
                }
            });
        }
    }

    private void c(FragmentActivity fragmentActivity, final b bVar, String str) {
        Object[] objArr = {fragmentActivity, bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b0acf1774d5d37ccfbded7368d0fa54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b0acf1774d5d37ccfbded7368d0fa54");
            return;
        }
        if (g.a().g()) {
            g.a().d();
        }
        if (g.a().h()) {
            g.a().e();
        }
        a(new k(fragmentActivity, str), new DeviceLocateCallback() { // from class: com.sankuai.waimai.store.poilist.preload.c.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback
            public final void a(@Nullable WMLocation wMLocation) {
                Object[] objArr2 = {wMLocation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "777768a6dce750c82ec27e2c7794a347", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "777768a6dce750c82ec27e2c7794a347");
                    return;
                }
                c.c = 2;
                bVar.a(wMLocation);
            }
        }, new com.sankuai.waimai.foundation.location.v2.callback.a() { // from class: com.sankuai.waimai.store.poilist.preload.c.7
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.location.v2.callback.a
            public final void a(@Nullable WmAddress wmAddress) {
                Object[] objArr2 = {wmAddress};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86b331d75206ecf14cc4cbbaa949546c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86b331d75206ecf14cc4cbbaa949546c");
                } else {
                    bVar.a(wmAddress);
                }
            }
        });
    }

    public final void b(FragmentActivity fragmentActivity, b bVar, String str) {
        Object[] objArr = {fragmentActivity, bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94ba735caedcd82e613357cb324a75cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94ba735caedcd82e613357cb324a75cb");
            return;
        }
        boolean k = o.k();
        c = 1;
        d = System.currentTimeMillis();
        if (k) {
            c(fragmentActivity, bVar, str);
        } else {
            a(fragmentActivity, bVar, str);
        }
    }

    public final void a(Fragment fragment, final b bVar, String str) {
        Object[] objArr = {fragment, bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0d65fd7372177c61dd3cc4f4b201ffb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0d65fd7372177c61dd3cc4f4b201ffb");
            return;
        }
        ae.a("PreloadLocationTask", "startLocate, sToken=" + str + ",mIsLocating=" + this.b.get());
        if (this.b.compareAndSet(false, true)) {
            this.e.incrementAndGet();
            a(new k(fragment, str), new DeviceLocateCallback() { // from class: com.sankuai.waimai.store.poilist.preload.c.8
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback
                public final void a(@Nullable WMLocation wMLocation) {
                    Object[] objArr2 = {wMLocation};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e02d69b942b8eea95b2c13def7d439d8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e02d69b942b8eea95b2c13def7d439d8");
                        return;
                    }
                    bVar.a(wMLocation);
                    c.this.b.compareAndSet(true, false);
                }
            }, new com.sankuai.waimai.foundation.location.v2.callback.a() { // from class: com.sankuai.waimai.store.poilist.preload.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.foundation.location.v2.callback.a
                public final void a(@Nullable WmAddress wmAddress) {
                    Object[] objArr2 = {wmAddress};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1809de48c830683c498f3d13b9442c71", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1809de48c830683c498f3d13b9442c71");
                    } else {
                        bVar.a(wmAddress);
                    }
                }
            });
        }
    }

    public final void b(Fragment fragment, final b bVar, String str) {
        Object[] objArr = {fragment, bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a8ba417e6d4b547ad243cfa39236b58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a8ba417e6d4b547ad243cfa39236b58");
            return;
        }
        ae.a("PreloadLocationTask", "startLocateAndCancelBefore, sToken=" + str);
        if (g.a().g()) {
            g.a().d();
        }
        if (g.a().h()) {
            g.a().e();
        }
        a(new k(fragment, str), new DeviceLocateCallback() { // from class: com.sankuai.waimai.store.poilist.preload.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback
            public final void a(@Nullable WMLocation wMLocation) {
                Object[] objArr2 = {wMLocation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98cd79389017170e954b811788998c23", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98cd79389017170e954b811788998c23");
                } else {
                    bVar.a(wMLocation);
                }
            }
        }, new com.sankuai.waimai.foundation.location.v2.callback.a() { // from class: com.sankuai.waimai.store.poilist.preload.c.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.location.v2.callback.a
            public final void a(@Nullable WmAddress wmAddress) {
                Object[] objArr2 = {wmAddress};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba3e549dd10d80bfcafc687e3864bac2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba3e549dd10d80bfcafc687e3864bac2");
                } else {
                    bVar.a(wmAddress);
                }
            }
        });
    }

    private void a(k kVar, DeviceLocateCallback deviceLocateCallback, com.sankuai.waimai.foundation.location.v2.callback.a aVar) {
        Object[] objArr = {kVar, deviceLocateCallback, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae6864e648949ac3a9002c9790fc7280", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae6864e648949ac3a9002c9790fc7280");
        } else {
            g.a().a(deviceLocateCallback, aVar, true, DefaultHeaderService.KEY_STORE, true, kVar);
        }
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e27e4c21737dce31ce9d84231b18bd9", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e27e4c21737dce31ce9d84231b18bd9") : a.a;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60f93674170f82015d9619568c20faab", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60f93674170f82015d9619568c20faab")).booleanValue() : this.e.get() > 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a {
        private static final c a = new c();
    }
}
