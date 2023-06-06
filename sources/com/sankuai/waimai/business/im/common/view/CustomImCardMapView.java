package com.sankuai.waimai.business.im.common.view;

import android.content.Context;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateFactory;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.TextureMapView;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CustomImCardMapView extends TextureMapView {
    public static ChangeQuickRedirect a;
    public MTMap d;
    public LatLng e;
    public LatLng f;
    public Marker g;
    public Marker h;

    public CustomImCardMapView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c43a4d377c3c21df3109cef62cb50586", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c43a4d377c3c21df3109cef62cb50586");
        } else {
            a();
        }
    }

    public CustomImCardMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3b37206ab605247900747b63210955e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3b37206ab605247900747b63210955e");
        } else {
            a();
        }
    }

    public CustomImCardMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b8900655d599ea98f1fb7f931cd3b64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b8900655d599ea98f1fb7f931cd3b64");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "305e0cfe82cf7821eee40b6c9639adc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "305e0cfe82cf7821eee40b6c9639adc2");
        } else {
            setMapType(3);
        }
    }

    public boolean a(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7007b5874373a27062c7b3470d350cd1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7007b5874373a27062c7b3470d350cd1")).booleanValue() : (latLng == null || Double.compare(latLng.latitude, 0.0d) == 0 || Double.compare(latLng.longitude, 0.0d) == 0) ? false : true;
    }

    private ArrayList<LatLng> b(LatLng latLng, double d) {
        Object[] objArr = {latLng, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8755099688e864d9c339041fd9874ed2", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8755099688e864d9c339041fd9874ed2");
        }
        if (latLng == null) {
            return null;
        }
        ArrayList<LatLng> arrayList = new ArrayList<>();
        LatLng latLng2 = new LatLng(latLng.latitude + d, latLng.longitude);
        LatLng latLng3 = new LatLng(latLng.latitude - d, latLng.longitude);
        LatLng latLng4 = new LatLng(latLng.latitude, latLng.longitude + d);
        LatLng latLng5 = new LatLng(latLng.latitude, latLng.longitude - d);
        arrayList.add(latLng2);
        arrayList.add(latLng3);
        arrayList.add(latLng4);
        arrayList.add(latLng5);
        arrayList.add(latLng);
        return arrayList;
    }

    public void a(LatLng latLng, double d) {
        Object[] objArr = {latLng, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42a3c96a7dbee2a3aaeeb2a25c38184c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42a3c96a7dbee2a3aaeeb2a25c38184c");
            return;
        }
        ArrayList<LatLng> b = b(latLng, d);
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        for (LatLng latLng2 : b) {
            builder.include(latLng2);
        }
        this.d.moveCamera(CameraUpdateFactory.newLatLngBoundsRect(builder.build(), 0, 0, 0, 0));
    }
}
