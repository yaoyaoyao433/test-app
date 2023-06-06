package com.meituan.android.mrn.component.map.view.childview;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.HoleOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.Polygon;
import com.sankuai.meituan.mapsdk.maps.model.PolygonOptions;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class g extends com.facebook.react.views.view.f implements d {
    public static ChangeQuickRedirect a;
    public ao b;
    public MTMap c;
    public Polygon d;
    private int e;
    private int f;
    private List<LatLng> g;
    private float h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private volatile Bitmap m;
    private volatile List<HoleOptions> n;
    private Map<String, g> o;
    private int[] p;

    public g(ao aoVar) {
        super(aoVar);
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80792329ddd83ddf18978a8dd28599ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80792329ddd83ddf18978a8dd28599ec");
            return;
        }
        this.e = -7829368;
        this.f = -16711936;
        this.h = 10.0f;
        this.i = 0;
        this.j = 1;
        this.k = true;
        this.n = new ArrayList();
        this.p = new int[]{0, 0};
        this.b = aoVar;
    }

    public Polygon a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4710d04bf8c111eb98b1da30bb63b5f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Polygon) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4710d04bf8c111eb98b1da30bb63b5f2");
        }
        if (this.c == null || this.d != null || this.g == null || this.g.size() < 3) {
            return null;
        }
        this.d = this.c.addPolygon(new PolygonOptions().addAll(this.g).strokeColor(this.e).fillColor(this.f).strokeWidth(this.h).zIndex(this.i).visible(this.k).clickable(this.l).addHoles(this.n).level(this.j).dashArray(this.p).fillTexture(BitmapDescriptorFactory.fromBitmap(this.m)));
        if (this.d == null) {
            com.meituan.android.mrn.component.map.utils.e.a(new RuntimeException("Map sdk error! polygon is null :" + toString()), "other");
        }
        return this.d;
    }

    @Override // com.meituan.android.mrn.component.map.view.childview.d
    public final void a(MTMap mTMap) {
        Object[] objArr = {mTMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbda12193634fa7c9b37b674ca211398", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbda12193634fa7c9b37b674ca211398");
        } else if (this.d != null) {
            this.d.remove();
            this.d = null;
            this.c = null;
        }
    }

    @Override // com.meituan.android.mrn.component.map.view.childview.d
    public final com.sankuai.meituan.mapsdk.maps.interfaces.l getFeature() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d50d8a97142e23e44b19077cda876b6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mapsdk.maps.interfaces.l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d50d8a97142e23e44b19077cda876b6b");
        }
        if (this.d == null) {
            return null;
        }
        return this.d.getMapElement();
    }

    public final Polygon getPolygon() {
        return this.d;
    }

    public final String getPolygonId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "468eac0781372ea95e5aa28082fa2eb4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "468eac0781372ea95e5aa28082fa2eb4");
        }
        if (this.d == null) {
            return null;
        }
        return this.d.getId();
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb64086b3450a71fcc6608f5bdebb6ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb64086b3450a71fcc6608f5bdebb6ce");
            return;
        }
        this.l = z;
        if (this.d != null) {
            this.d.setClickable(z);
        } else {
            a();
        }
    }

    public final void setCoordinates(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efc47c8d8c3ce1e230afa2c959f8b8d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efc47c8d8c3ce1e230afa2c959f8b8d9");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (readableArray != null && readableArray.size() > 0) {
            for (int i = 0; i < readableArray.size(); i++) {
                LatLng b = com.meituan.android.mrn.component.map.utils.a.b(readableArray.getMap(i));
                if (b != null && b.isValid()) {
                    arrayList.add(b);
                }
            }
        }
        if (arrayList.size() < 3) {
            com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("MRNPolygon must has three valid coordinates"), "param");
            return;
        }
        this.g = arrayList;
        if (this.d != null) {
            this.d.setPoints(this.g);
        } else {
            a();
        }
    }

    public final void setDashArray(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02c90e3df73d838cc6f2cfcb7f2e2e4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02c90e3df73d838cc6f2cfcb7f2e2e4c");
            return;
        }
        if (readableArray == null && readableArray.size() <= 0) {
            com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("MRNPolygon must has 2 valid dash index"), "param");
        }
        this.p[0] = readableArray.getInt(0);
        this.p[1] = readableArray.getInt(1);
        if (this.d != null) {
            this.d.remove();
            this.d = null;
            a();
        }
    }

    public final void setDisplayLevel(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3187875a1c0d37b618e10166bbf8c215", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3187875a1c0d37b618e10166bbf8c215");
            return;
        }
        this.j = i;
        if (this.d == null) {
            a();
        }
    }

    public final void setFillColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a50eea6c70b1f085927a1d763ec2f5da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a50eea6c70b1f085927a1d763ec2f5da");
            return;
        }
        this.f = i;
        if (this.d != null) {
            this.d.setFillColor(i);
        } else {
            a();
        }
    }

    public final void setFillTexture(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b533f4b3ed5ea88149af6e3ffbe154bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b533f4b3ed5ea88149af6e3ffbe154bf");
        } else if (!TextUtils.isEmpty(str)) {
            com.meituan.android.mrn.component.map.utils.c.a(getContext()).a(str, new Target() { // from class: com.meituan.android.mrn.component.map.view.childview.g.1
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.Target
                public final void onBitmapFailed(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60dc4749a93b6b20d823c7ce60cee324", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60dc4749a93b6b20d823c7ce60cee324");
                    } else {
                        g.this.a();
                    }
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                    Object[] objArr2 = {bitmap, loadedFrom};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "142f7b90a14815d06bae2d3c4a4b06dd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "142f7b90a14815d06bae2d3c4a4b06dd");
                    } else if (bitmap == null) {
                        com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("MRNPolygonView bitmap is null"), "param");
                    } else {
                        g.this.m = bitmap;
                        if (g.this.d != null) {
                            g.this.d.setFillTexture(BitmapDescriptorFactory.fromBitmap(bitmap));
                        } else {
                            g.this.a();
                        }
                    }
                }

                @Override // com.squareup.picasso.Target
                public final void onPrepareLoad(Drawable drawable) {
                }
            });
        } else {
            this.m = null;
            if (this.d != null) {
                this.d.setFillTexture(null);
            }
        }
    }

    public final void setPolygonMap(Map<String, g> map) {
        this.o = map;
    }

    public final void setStrokeColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "829802c0f4fcffc4ea80049164124ffe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "829802c0f4fcffc4ea80049164124ffe");
            return;
        }
        this.e = i;
        if (this.d != null) {
            this.d.setStrokeColor(i);
        } else {
            a();
        }
    }

    public final void setStrokeWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e7b70347ce9bc2c0340114a6833bd86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e7b70347ce9bc2c0340114a6833bd86");
            return;
        }
        this.h = com.meituan.android.mrn.component.map.utils.b.a(getContext(), f);
        if (this.d != null) {
            this.d.setStrokeWidth(this.h);
        } else {
            a();
        }
    }

    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b76eefba9ea7672bf1bf7f302264290f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b76eefba9ea7672bf1bf7f302264290f");
            return;
        }
        this.k = z;
        if (this.d != null) {
            this.d.setVisible(z);
        } else {
            a();
        }
    }

    public final void setZIndex(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4b25a28020498b82284f439939328c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4b25a28020498b82284f439939328c4");
            return;
        }
        this.i = i;
        if (this.d != null) {
            this.d.setZIndex(i);
        } else {
            a();
        }
    }

    public final void setHoles(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a428bb73ab8270307de82b190d1a6628", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a428bb73ab8270307de82b190d1a6628");
            return;
        }
        if (readableArray == null && readableArray.size() <= 0) {
            com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("MRNPolygon must has three valid holes"), "param");
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableArray array = readableArray.getArray(i);
            if (array != null && array.size() > 0) {
                HoleOptions holeOptions = new HoleOptions();
                for (int i2 = 0; i2 < array.size(); i2++) {
                    LatLng b = com.meituan.android.mrn.component.map.utils.a.b(array.getMap(i2));
                    if (b != null && b.isValid()) {
                        holeOptions.add(b);
                    }
                }
                arrayList.add(holeOptions);
            }
        }
        this.n = arrayList;
        if (this.d != null && this.o != null) {
            this.o.remove(this.d.getId());
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc62bc09374b767a1b94b0a740561a65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc62bc09374b767a1b94b0a740561a65");
        } else if (this.d != null) {
            this.d.remove();
            this.d = null;
        }
        Polygon a2 = a();
        if (a2 == null || this.o == null) {
            return;
        }
        this.o.put(a2.getId(), this);
    }
}
