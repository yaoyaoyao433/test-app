package com.sankuai.meituan.mapsdk.core.annotations;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class ab implements com.sankuai.meituan.mapsdk.maps.interfaces.x {
    public static ChangeQuickRedirect a;
    private final com.sankuai.meituan.mapsdk.core.d b;

    public ab(@NonNull com.sankuai.meituan.mapsdk.core.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "956193a88d2d68826b709c9174e3b7e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "956193a88d2d68826b709c9174e3b7e1");
        } else {
            this.b = dVar;
        }
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7984a8ab14c411980a8070948111258b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7984a8ab14c411980a8070948111258b")).booleanValue() : (this.b.i || this.b.d == null) ? false : true;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.x
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dffd4de3be045b4fa764876138909669", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dffd4de3be045b4fa764876138909669");
        } else if (b()) {
            this.b.d.setWeatherType(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.x
    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d34927690963582d84d87cb5a1ee8a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d34927690963582d84d87cb5a1ee8a7");
        } else if (b()) {
            this.b.d.setWeatherIntensity(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.x
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8a4a9b27782299bb0011027eb2d9f3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8a4a9b27782299bb0011027eb2d9f3b");
        } else if (b()) {
            this.b.d.setWeatherAutoUpdate(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.x
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32873ce1217da88a3d395cb63306b12a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32873ce1217da88a3d395cb63306b12a");
        } else if (b()) {
            this.b.d.disableWeather();
        }
    }
}
