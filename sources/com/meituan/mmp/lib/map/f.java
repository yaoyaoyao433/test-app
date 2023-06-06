package com.meituan.mmp.lib.map;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public String b;
    public boolean c;
    Marker d;

    public f(Marker marker) {
        Object[] objArr = {marker};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21394238be6cf29f0f5375aeecd0b9e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21394238be6cf29f0f5375aeecd0b9e3");
            return;
        }
        this.b = "ALWAYS";
        this.d = marker;
    }

    public final LatLng a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c813c39ff85f93246a4f7067a1c5f35", RobustBitConfig.DEFAULT_VALUE) ? (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c813c39ff85f93246a4f7067a1c5f35") : this.d.getPosition();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "828bb9decad4070af9b24889e201f3b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "828bb9decad4070af9b24889e201f3b1");
        } else {
            this.d.remove();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0af46ad5f09fcb3a5c5d352cca90346a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0af46ad5f09fcb3a5c5d352cca90346a");
            return;
        }
        this.c = true;
        this.d.showInfoWindow();
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b584b48b57d3b8af9bc04bdb0829583", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b584b48b57d3b8af9bc04bdb0829583");
            return;
        }
        this.c = false;
        this.d.hideInfoWindow();
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da57abb12c5377e3008a65eefaac6c6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da57abb12c5377e3008a65eefaac6c6b");
        } else {
            this.d.setInfoWindowOffset(i, i2);
        }
    }

    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "315af44b24e5299f6f4caef94683e821", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "315af44b24e5299f6f4caef94683e821");
        } else {
            this.d.setObject(obj);
        }
    }
}
