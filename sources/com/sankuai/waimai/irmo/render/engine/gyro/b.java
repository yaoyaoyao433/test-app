package com.sankuai.waimai.irmo.render.engine.gyro;

import android.hardware.Sensor;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.render.engine.gyro.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    MtSensorManager b;
    Sensor c;
    private a d;
    private boolean e;

    public final void a(a.InterfaceC0975a interfaceC0975a) {
        Object[] objArr = {interfaceC0975a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbef1e1e1b1160fa9f34b4b8b8a9b61c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbef1e1e1b1160fa9f34b4b8b8a9b61c");
        } else if (this.e || this.b == null || this.c == null) {
        } else {
            this.d = new a(interfaceC0975a);
            com.sankuai.waimai.foundation.utils.log.a.b("GyroSensorManager", "registerListener", new Object[0]);
            this.b.registerListener(this.d, this.c, 1);
            this.e = true;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ed000370464b27713f9c289cc4c17c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ed000370464b27713f9c289cc4c17c4");
            return;
        }
        this.e = false;
        if (this.b == null || this.c == null) {
            return;
        }
        this.b.unregisterListener(this.d, this.c);
        com.sankuai.waimai.foundation.utils.log.a.b("GyroSensorManager", "unregisterListener", new Object[0]);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd3ff207f57e951c06414165091a8fd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd3ff207f57e951c06414165091a8fd2");
        } else if (this.d != null) {
            a aVar = this.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "268f2268019e133a17c9580f9fa47420", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "268f2268019e133a17c9580f9fa47420");
                return;
            }
            aVar.b = 0.0d;
            aVar.c = 0.0d;
        }
    }
}
