package com.sankuai.waimai.store.poilist.preload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.utils.ad;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.poilist.preload.a<WMLocation> b;
    public com.sankuai.waimai.store.poilist.preload.a<WmAddress> c;
    private com.sankuai.waimai.store.poilist.preload.a<Boolean> d;
    private volatile WMLocation e;
    private volatile WmAddress f;
    private volatile long g;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d025ac5758c04bedf3f9df60beb20bb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d025ac5758c04bedf3f9df60beb20bb9");
            return;
        }
        this.d = new com.sankuai.waimai.store.poilist.preload.a<>();
        this.b = new com.sankuai.waimai.store.poilist.preload.a<>();
        this.c = new com.sankuai.waimai.store.poilist.preload.a<>();
        this.g = -1L;
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "342c58ed9d08d15f18c6c849ff25ef86", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "342c58ed9d08d15f18c6c849ff25ef86") : a.a;
    }

    public final void a(WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5396607aa5e2a3ac5de3e495982c01f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5396607aa5e2a3ac5de3e495982c01f");
            return;
        }
        if (wMLocation == null) {
            wMLocation = new WMLocation("locate failed null");
        }
        if (com.sankuai.waimai.foundation.utils.log.a.b) {
            com.sankuai.waimai.foundation.utils.log.a.b("Preload", "得到了定位结果：" + wMLocation.toString(), new Object[0]);
        }
        this.e = wMLocation;
        if (ad.b()) {
            this.b.b((com.sankuai.waimai.store.poilist.preload.a<WMLocation>) wMLocation);
        } else {
            this.b.a((com.sankuai.waimai.store.poilist.preload.a<WMLocation>) wMLocation);
        }
    }

    public final void a(WmAddress wmAddress) {
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5863459d93e713bb8519108f3cc7908", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5863459d93e713bb8519108f3cc7908");
            return;
        }
        if (wmAddress == null) {
            wmAddress = new WmAddress();
            wmAddress.setStatusCode(1202);
        }
        if (com.sankuai.waimai.foundation.utils.log.a.b) {
            com.sankuai.waimai.foundation.utils.log.a.b("Preload", "得到了定位结果：" + wmAddress.toString(), new Object[0]);
        }
        this.f = wmAddress;
        if (ad.b()) {
            this.c.b((com.sankuai.waimai.store.poilist.preload.a<WmAddress>) wmAddress);
        } else {
            this.c.a((com.sankuai.waimai.store.poilist.preload.a<WmAddress>) wmAddress);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        private static final b a = new b();
    }
}
