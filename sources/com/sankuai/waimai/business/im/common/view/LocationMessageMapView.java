package com.sankuai.waimai.business.im.common.view;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateFactory;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.TextureMapView;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LocationMessageMapView extends TextureMapView {
    public static ChangeQuickRedirect a;
    public MTMap d;
    public LatLng e;
    private Marker f;

    public LocationMessageMapView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "845b1a88876c5a6fbd1d463a0a0a32a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "845b1a88876c5a6fbd1d463a0a0a32a4");
        } else {
            b();
        }
    }

    public LocationMessageMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c55dcd3e2530733029f6f307f6fd3599", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c55dcd3e2530733029f6f307f6fd3599");
        } else {
            b();
        }
    }

    public LocationMessageMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fe2b3be4ace43b63ed4bc29a5e7e023", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fe2b3be4ace43b63ed4bc29a5e7e023");
        } else {
            b();
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cb21206564fa274ff8c634605a79aa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cb21206564fa274ff8c634605a79aa8");
        } else {
            setMapType(3);
        }
    }

    public final void a() {
        ArrayList<LatLng> arrayList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3d6e9db9d9d867344bce639b2e10272", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3d6e9db9d9d867344bce639b2e10272");
            return;
        }
        if (this.f != null) {
            this.f.remove();
        }
        if (this.d != null && a(this.e)) {
            this.f = this.d.addMarker(new MarkerOptions().anchor(0.5f, 0.5f).position(this.e).draggable(false).title("").icon(BitmapDescriptorFactory.fromBitmap(com.sankuai.waimai.launcher.util.image.a.a(getResources(), (int) R.drawable.wm_im_ic_location_message_marker))));
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b6cb9a85642618c31d85c2b557b7143", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b6cb9a85642618c31d85c2b557b7143");
        } else if (this.d != null && a(this.e)) {
            LatLng latLng = this.e;
            Object[] objArr3 = {latLng, Double.valueOf(0.001d)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a152da3958ac0583a27e28c8281ba3cc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a152da3958ac0583a27e28c8281ba3cc");
                return;
            }
            Object[] objArr4 = {latLng, Double.valueOf(0.001d)};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5c83ce88bfb817a5ad374e6e9c69d2eb", RobustBitConfig.DEFAULT_VALUE)) {
                arrayList = (ArrayList) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5c83ce88bfb817a5ad374e6e9c69d2eb");
            } else if (latLng == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                LatLng latLng2 = new LatLng(latLng.latitude + 0.001d, latLng.longitude);
                LatLng latLng3 = new LatLng(latLng.latitude - 0.001d, latLng.longitude);
                LatLng latLng4 = new LatLng(latLng.latitude, latLng.longitude + 0.001d);
                LatLng latLng5 = new LatLng(latLng.latitude, latLng.longitude - 0.001d);
                arrayList.add(latLng2);
                arrayList.add(latLng3);
                arrayList.add(latLng4);
                arrayList.add(latLng5);
                arrayList.add(latLng);
            }
            LatLngBounds.Builder builder = new LatLngBounds.Builder();
            for (LatLng latLng6 : arrayList) {
                builder.include(latLng6);
            }
            this.d.moveCamera(CameraUpdateFactory.newLatLngBoundsRect(builder.build(), 0, 0, 0, 0));
        }
    }

    private boolean a(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3faf2fafa7d6d431c72a615d845149b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3faf2fafa7d6d431c72a615d845149b")).booleanValue() : (latLng == null || Double.compare(latLng.latitude, 0.0d) == 0 || Double.compare(latLng.longitude, 0.0d) == 0) ? false : true;
    }
}
