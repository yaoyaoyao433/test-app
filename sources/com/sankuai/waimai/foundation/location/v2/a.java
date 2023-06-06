package com.sankuai.waimai.foundation.location.v2;

import android.content.Context;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback;
import com.sankuai.waimai.foundation.utils.ab;
import com.sankuai.waimai.foundation.utils.p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    protected Context b;
    final List<DeviceLocateCallback> c;
    AtomicBoolean d;
    private volatile com.sankuai.waimai.foundation.location.locatesdk.b e;
    private com.sankuai.waimai.foundation.location.c f;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98b37bbe3120468815b901611137727a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98b37bbe3120468815b901611137727a");
            return;
        }
        this.c = new ArrayList();
        this.d = new AtomicBoolean(false);
        this.f = new com.sankuai.waimai.foundation.location.c<WMLocation>() { // from class: com.sankuai.waimai.foundation.location.v2.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.location.c
            public final /* synthetic */ void a(WMLocation wMLocation) {
                WMLocation wMLocation2 = wMLocation;
                Object[] objArr2 = {wMLocation2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1a43717cbe8022cda14696c61af24d5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1a43717cbe8022cda14696c61af24d5");
                    return;
                }
                a.this.d.compareAndSet(true, false);
                if ((wMLocation2 == null || wMLocation2.getLocationResultCode().a != 1200) && !p.f(a.this.b)) {
                    if (wMLocation2 == null) {
                        wMLocation2 = new WMLocation(WMLocation.WM_LOCATION_NETWORK_CHECK);
                    }
                    wMLocation2.setProvider(WMLocation.WM_LOCATION_NETWORK_CHECK);
                    LocationResultCode locationResultCode = new LocationResultCode();
                    locationResultCode.a = 1201;
                    locationResultCode.b = ab.a(a.this.b, (int) R.string.wm_locationsdk_failed_message);
                    wMLocation2.setLocationResultCode(locationResultCode);
                }
                synchronized (a.this.c) {
                    if (!com.sankuai.waimai.foundation.utils.d.a(a.this.c) && wMLocation2 != null) {
                        for (DeviceLocateCallback deviceLocateCallback : a.this.c) {
                            try {
                                deviceLocateCallback.a(wMLocation2);
                            } catch (Exception e) {
                                com.sankuai.waimai.foundation.utils.log.a.b(e);
                            }
                        }
                        a.this.c.clear();
                    }
                }
            }
        };
        this.b = context;
    }

    public final void a(DeviceLocateCallback deviceLocateCallback, boolean z, k kVar) {
        Object[] objArr = {deviceLocateCallback, Byte.valueOf(z ? (byte) 1 : (byte) 0), kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3ef48326f6d13b270cd7b1b6834a5e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3ef48326f6d13b270cd7b1b6834a5e7");
            return;
        }
        synchronized (this.c) {
            this.c.add(deviceLocateCallback);
        }
        if (this.d.compareAndSet(false, true)) {
            if (this.e != null) {
                this.e.a();
                if (this.e instanceof com.sankuai.waimai.foundation.location.locatesdk.a) {
                    com.sankuai.waimai.foundation.location.locatesdk.b bVar = this.e;
                    return;
                } else {
                    this.e.a(kVar);
                    return;
                }
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee25d583a8cc14bbc0cd60449f284660", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee25d583a8cc14bbc0cd60449f284660");
            } else if (this.e == null) {
                synchronized (this) {
                    if (this.e == null) {
                        this.e = com.sankuai.waimai.foundation.location.e.c().a(this.b, String.valueOf(System.currentTimeMillis()), this.f);
                    }
                }
            }
            if (this.e instanceof com.sankuai.waimai.foundation.location.locatesdk.a) {
                com.sankuai.waimai.foundation.location.locatesdk.b bVar2 = this.e;
            } else {
                this.e.a(kVar);
            }
        }
    }
}
