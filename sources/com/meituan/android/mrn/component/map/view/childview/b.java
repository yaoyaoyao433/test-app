package com.meituan.android.mrn.component.map.view.childview;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.Circle;
import com.sankuai.meituan.mapsdk.maps.model.CircleOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
/* loaded from: classes2.dex */
public final class b extends com.facebook.react.views.view.f implements d {
    public static ChangeQuickRedirect a;
    public MTMap b;
    public Circle c;
    private int d;
    private int e;
    private float f;
    private double g;
    private int h;
    private int i;
    private LatLng j;
    private boolean k;

    public b(ao aoVar) {
        super(aoVar);
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "895736f0efff3afa7bc479c7fe74aca1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "895736f0efff3afa7bc479c7fe74aca1");
            return;
        }
        this.d = -7829368;
        this.e = -16711936;
        this.f = 10.0f;
        this.g = 0.0d;
        this.h = 0;
        this.i = 1;
        this.j = null;
        this.k = true;
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "542bd6b5dc8d87a76ace62e5fa9737da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "542bd6b5dc8d87a76ace62e5fa9737da");
        } else if (this.b == null || this.c != null || this.j == null || !this.j.isValid()) {
        } else {
            this.c = this.b.addCircle(new CircleOptions().center(this.j).radius(this.g).zIndex(this.h).strokeWidth(this.f).strokeColor(this.d).fillColor(this.e).level(this.i).visible(this.k));
            if (this.c == null) {
                com.meituan.android.mrn.component.map.utils.e.a(new RuntimeException("Map sdk error! circle is null :" + toString()), "other");
            }
        }
    }

    @Override // com.meituan.android.mrn.component.map.view.childview.d
    public final void a(MTMap mTMap) {
        Object[] objArr = {mTMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6df8c9395360c257a67f54adf427a190", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6df8c9395360c257a67f54adf427a190");
        } else if (this.c != null) {
            this.c.remove();
            this.c = null;
            this.b = null;
        }
    }

    @Override // com.meituan.android.mrn.component.map.view.childview.d
    public final com.sankuai.meituan.mapsdk.maps.interfaces.l getFeature() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d01ec855274381e69165bd45962f2fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mapsdk.maps.interfaces.l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d01ec855274381e69165bd45962f2fc");
        }
        if (this.c == null) {
            return null;
        }
        return this.c.getMapElement();
    }

    public final void setCenter(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d163a44f4858bfa2979a2fefa6b38a31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d163a44f4858bfa2979a2fefa6b38a31");
            return;
        }
        LatLng b = com.meituan.android.mrn.component.map.utils.a.b(readableMap);
        if (b == null) {
            com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("MRNCircle must has center coordinate"), "param");
        } else if (!b.isValid()) {
            com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("MRNCircle center coordinate is invalid"), "param");
        } else {
            this.j = b;
            if (this.c != null) {
                this.c.setCenter(this.j);
            } else {
                a();
            }
        }
    }

    public final void setDisplayLevel(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e5ccaaba0d9aa98e0c25eaa3671d5af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e5ccaaba0d9aa98e0c25eaa3671d5af");
            return;
        }
        this.i = i;
        if (this.c == null) {
            a();
        }
    }

    public final void setFillColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bba59f9119ac780e5736c68eb1b986b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bba59f9119ac780e5736c68eb1b986b");
            return;
        }
        this.e = i;
        if (this.c != null) {
            this.c.setFillColor(this.e);
        } else {
            a();
        }
    }

    public final void setRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b9eeb25548bfa53140437ee6c08c5e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b9eeb25548bfa53140437ee6c08c5e5");
            return;
        }
        double d = f;
        this.g = d;
        if (this.c != null) {
            this.c.setRadius(d);
        } else {
            a();
        }
    }

    public final void setStrokeColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaa4068da1b50156b32c6160f0ef51bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaa4068da1b50156b32c6160f0ef51bd");
            return;
        }
        this.d = i;
        if (this.c != null) {
            this.c.setStrokeColor(this.d);
        } else {
            a();
        }
    }

    public final void setStrokeWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e57a9083c6ca4d978724d2a3647fc03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e57a9083c6ca4d978724d2a3647fc03");
            return;
        }
        this.f = com.meituan.android.mrn.component.map.utils.b.a(getContext(), f);
        if (this.c != null) {
            this.c.setStrokeWidth(this.f);
        } else {
            a();
        }
    }

    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c214080fc2f79ff0e4f170064f1efe0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c214080fc2f79ff0e4f170064f1efe0");
            return;
        }
        this.k = z;
        if (this.c != null) {
            this.c.setVisible(z);
        } else {
            a();
        }
    }

    public final void setZIndex(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f41d97f99351c5b7dfa18575602f9b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f41d97f99351c5b7dfa18575602f9b6");
            return;
        }
        this.h = i;
        if (this.c != null) {
            this.c.setZIndex(this.h);
        } else {
            a();
        }
    }
}
