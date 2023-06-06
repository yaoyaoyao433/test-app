package com.sankuai.waimai.popup.spfx;

import android.content.Context;
import android.hardware.Sensor;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.popup.spfx.listener.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public MtSensorManager b;
    public Sensor c;
    public com.sankuai.waimai.popup.spfx.listener.b d;
    public boolean e;

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f9f31b8d9b2973c6fa6d0d1c2ec5923", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f9f31b8d9b2973c6fa6d0d1c2ec5923");
            return;
        }
        this.b = Privacy.createSensorManager(context, "irmo");
        if (this.b == null) {
            return;
        }
        this.c = this.b.getDefaultSensor(1);
    }

    public final void a(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45cdc5bcd919a63a1526119f61ebb228", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45cdc5bcd919a63a1526119f61ebb228");
        } else if (this.e || this.b == null || this.c == null) {
        } else {
            this.d = new com.sankuai.waimai.popup.spfx.listener.b(aVar);
            this.b.registerListener(this.d, this.c, 1);
            com.sankuai.waimai.foundation.utils.log.a.b("ShakeSensorManager", "registerListener", new Object[0]);
            this.e = true;
        }
    }
}
