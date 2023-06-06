package com.sankuai.waimai.irmo.mach.effect.gyro;

import android.hardware.Sensor;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.mach.effect.gyro.b;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public MtSensorManager b;
    public Sensor c;
    public Sensor d;
    private b e;
    private boolean f;

    public final void a(b.InterfaceC0971b interfaceC0971b) {
        Object[] objArr = {interfaceC0971b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea0975a8c9d2432f48b030d2219a4b25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea0975a8c9d2432f48b030d2219a4b25");
        } else if (this.f || this.b == null || this.d == null || this.c == null) {
        } else {
            this.e = new b(interfaceC0971b);
            com.sankuai.waimai.foundation.utils.log.a.b("GyroSensorManager", "registerListener", new Object[0]);
            this.b.registerListener(this.e, this.d, 1);
            this.b.registerListener(this.e, this.c, 1);
            this.f = true;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49f24ab5abbb72179266ba471919be02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49f24ab5abbb72179266ba471919be02");
            return;
        }
        this.f = false;
        if (this.b == null || this.d == null || this.c == null) {
            return;
        }
        this.b.unregisterListener(this.e, this.c);
        this.b.unregisterListener(this.e, this.d);
        if (this.e != null) {
            b bVar = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "3e556766adf71a0d59f61d12acd98508", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "3e556766adf71a0d59f61d12acd98508");
            } else if (bVar.e != null && !bVar.e.isCancelled()) {
                bVar.e.cancel(true);
            }
            this.e = null;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("GyroSensorManager", "unregisterListener", new Object[0]);
    }
}
