package com.sankuai.meituan.mapsdk.core.render.model;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends h {
    public static ChangeQuickRedirect a;
    public LatLng[] b;

    public e(com.sankuai.meituan.mapsdk.core.render.a aVar, String str, LatLng[] latLngArr) {
        super(aVar, null);
        Object[] objArr = {aVar, null, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9340cff4bcf4e6b39de5cc56d5c6896", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9340cff4bcf4e6b39de5cc56d5c6896");
        } else {
            this.b = new LatLng[]{new LatLng(0.0d, 0.0d), new LatLng(0.0d, 0.0d), new LatLng(0.0d, 0.0d), new LatLng(0.0d, 0.0d)};
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.model.h
    public final boolean a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d0d452d2574fb082d88a31733c09bd7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d0d452d2574fb082d88a31733c09bd7")).booleanValue();
        }
        if (this.d != null) {
            this.e = this.d.createImageSource(this.f, this.b);
            this.d.addImageSource(this.e);
        }
        return com.sankuai.meituan.mapsdk.mapcore.utils.h.a(this.e);
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.model.h
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5379f76617bb363c2afa1334a7e4f45c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5379f76617bb363c2afa1334a7e4f45c");
        } else if (this.d != null) {
            this.d.removeAndDestroyImageSource(this.e);
        }
    }

    public final void a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31468ce1a7a83ea2923c4bd16e3f9846", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31468ce1a7a83ea2923c4bd16e3f9846");
        } else if (this.d != null) {
            this.d.setImageToImageSource(this.e, bitmap);
        }
    }

    public final void a(LatLng[] latLngArr) {
        Object[] objArr = {latLngArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "495113c38dcc07ab3383270790acdb7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "495113c38dcc07ab3383270790acdb7c");
        } else if (this.d != null) {
            this.d.setCoordinateToImageSource(this.e, latLngArr);
        }
    }
}
