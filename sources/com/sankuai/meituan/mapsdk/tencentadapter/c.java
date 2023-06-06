package com.sankuai.meituan.mapsdk.tencentadapter;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.CameraUpdate;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateFactory;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateMessage;
import com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    public static boolean h = true;
    int b;
    int c;
    int d;
    int e;
    final View f;
    IMTMap g;

    public c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62d14c96bb8f23e7f8ab4ee73fff89d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62d14c96bb8f23e7f8ab4ee73fff89d0");
            return;
        }
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = view;
        if (this.f == null) {
        }
    }

    public final CameraUpdate a(CameraUpdateMessage cameraUpdateMessage) {
        Object[] objArr = {cameraUpdateMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7ed3b7b62ff2c2c1cc283a36dafac1b", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7ed3b7b62ff2c2c1cc283a36dafac1b");
        }
        if (!h) {
            return new CameraUpdate(cameraUpdateMessage);
        }
        if (!a() || cameraUpdateMessage == null) {
            return new CameraUpdate(cameraUpdateMessage);
        }
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        switch (cameraUpdateMessage.type) {
            case NEW_LATLNG_BOUNDS:
            case NEW_LATLNG_BOUNDS_RECT:
                if (cameraUpdateMessage.latLngBounds == null) {
                    return new CameraUpdate(cameraUpdateMessage);
                }
                return CameraUpdateFactory.newLatLngBoundsRect(cameraUpdateMessage.latLngBounds, cameraUpdateMessage.paddingLeft + this.b, cameraUpdateMessage.paddingRight + this.d, cameraUpdateMessage.paddingTop + this.c, cameraUpdateMessage.paddingBottom + this.e);
            default:
                return new CameraUpdate(cameraUpdateMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "348de022f5966b31e47411b04d7cb0de", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "348de022f5966b31e47411b04d7cb0de")).booleanValue();
        }
        if (this.f == null || this.g == null) {
            return false;
        }
        return this.b + this.d <= this.f.getWidth() && this.c + this.e <= this.f.getHeight();
    }
}
