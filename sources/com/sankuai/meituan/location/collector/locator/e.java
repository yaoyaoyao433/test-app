package com.sankuai.meituan.location.collector.locator;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.reporter.s;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.location.collector.c;
/* loaded from: classes4.dex */
public final class e extends b implements LocationListener {
    public static ChangeQuickRedirect e;

    public e(c.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd05fbdb8e489ed56d4a6bb0e5289439", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd05fbdb8e489ed56d4a6bb0e5289439");
        }
    }

    @Override // com.sankuai.meituan.location.collector.locator.b, com.sankuai.meituan.location.collector.locator.a
    @SuppressLint({"MissingPermission"})
    public final int a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed8ed9c2b8d00788fb7388cddf53bd44", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed8ed9c2b8d00788fb7388cddf53bd44")).intValue();
        }
        com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_trigger_entrance", "SystemLocator_onStart"));
        LogUtils.a("Collector SystemLocator onStart");
        if (z) {
            try {
                long j = s.a().n;
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                com.sankuai.meituan.location.collector.reporter.a.a().k = i > 0 ? j : 1L;
                float f = s.a().o;
                if (i <= 0) {
                    j = 1000;
                }
                long j2 = j;
                float f2 = f < 0.0f ? 0.0f : f;
                if (this.c != null) {
                    this.c.a("passive", j2, f2, this);
                    com.sankuai.meituan.location.collector.reporter.a.a().d++;
                }
            } catch (Throwable th) {
                LogUtils.a(getClass(), th);
            }
        }
        super.a(z);
        return 0;
    }

    @Override // com.sankuai.meituan.location.collector.locator.b, com.sankuai.meituan.location.collector.locator.a
    @SuppressLint({"MissingPermission"})
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b012ac80b8aad5a251b4d5781297d934", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b012ac80b8aad5a251b4d5781297d934");
            return;
        }
        com.meituan.android.common.locate.platform.logs.c.a("Collector SystemLocator::onStop ", 3);
        try {
            if (this.c != null) {
                this.c.a((LocationListener) this);
            }
        } catch (Throwable th) {
            LogUtils.a(getClass(), th);
        }
        super.a();
    }

    @Override // com.sankuai.meituan.location.collector.locator.b, android.location.LocationListener
    public final void onLocationChanged(Location location) {
        Object[] objArr = {location};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37d69487cfa1018eb9b6e4e26e977f20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37d69487cfa1018eb9b6e4e26e977f20");
            return;
        }
        com.meituan.android.common.locate.api.a.a("onLocationChanged_coll", 1);
        com.sankuai.meituan.location.collector.reporter.a.a().h++;
        com.sankuai.meituan.location.collector.reporter.c.a().h++;
        com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "type_location_get_main_collection"));
        super.onLocationChanged(location);
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
