package com.sankuai.meituan.mapsdk.tencentadapter;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.w;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class t implements w {
    public static ChangeQuickRedirect a;
    private VisibleRegion b;
    private LatLngBounds c;
    private LatLng d;
    private LatLng e;
    private LatLng f;
    private LatLng g;

    public t(@NonNull VisibleRegion visibleRegion) {
        Object[] objArr = {visibleRegion};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c76dd23d474bf8957705007f1ba4e6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c76dd23d474bf8957705007f1ba4e6b");
        } else {
            this.b = visibleRegion;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.w
    public final LatLngBounds getLatLngBounds() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80b1e0636e029f79a0abf2f3f90926a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLngBounds) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80b1e0636e029f79a0abf2f3f90926a1");
        }
        if (this.c == null) {
            this.c = b.a(this.b.latLngBounds);
        }
        return this.c;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.w
    public final LatLng getNearLeft() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1ea31360794e4b945c31c90dc5619fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1ea31360794e4b945c31c90dc5619fa");
        }
        if (this.d == null) {
            this.d = b.a(this.b.nearLeft);
        }
        return this.d;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.w
    public final LatLng getNearRight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e9dd789e94064675aae14902174efc7", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e9dd789e94064675aae14902174efc7");
        }
        if (this.e == null) {
            this.e = b.a(this.b.nearRight);
        }
        return this.e;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.w
    public final LatLng getFarLeft() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c48295800fcb3147bd52dc8354babcf", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c48295800fcb3147bd52dc8354babcf");
        }
        if (this.f == null) {
            this.f = b.a(this.b.farLeft);
        }
        return this.f;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.w
    public final LatLng getFarRight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3f89d49f60f3639c7cfc5446c831c2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3f89d49f60f3639c7cfc5446c831c2d");
        }
        if (this.g == null) {
            this.g = b.a(this.b.farRight);
        }
        return this.g;
    }
}
