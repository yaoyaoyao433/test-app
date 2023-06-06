package com.meituan.msi.lib.map.location;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.lib.map.utils.c;
import com.meituan.msi.util.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.MyLocationStyle;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import com.tencent.rtmp.TXLiveConstants;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    int b;
    int c;
    public boolean d;
    BitmapDescriptor e;
    public com.meituan.msi.lib.map.view.map.b f;
    private String g;
    private float h;
    private float i;
    private int j;
    private int k;
    private int l;
    private MsiContext m;
    private float n;
    private JsonObject o;

    private int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a68b803402fd5a80b8b9b79fb267eaf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a68b803402fd5a80b8b9b79fb267eaf")).intValue();
        }
        if (i > 6 || i < 0) {
            return 5;
        }
        switch (i) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 2:
                return 6;
            case 3:
                return 2;
            case 4:
                return 0;
            case 5:
                return 1;
            case 6:
                return 3;
            default:
                return i;
        }
    }

    public b(com.meituan.msi.lib.map.view.map.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81b2a2a30bab4dd3fe58d265d231be8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81b2a2a30bab4dd3fe58d265d231be8c");
            return;
        }
        this.g = null;
        this.b = -1;
        this.c = -1;
        this.h = 1000.0f;
        this.i = 0.0f;
        this.j = 0;
        this.k = Color.argb(100, 0, 0, (int) TXLiveConstants.RENDER_ROTATION_180);
        this.d = false;
        this.l = 5;
        this.e = BitmapDescriptorFactory.fromResource(R.drawable.mmp_map_loc);
        this.m = null;
        this.f = null;
        this.n = 1.0f;
        this.f = bVar;
    }

    public b(JsonObject jsonObject, MsiContext msiContext, com.meituan.msi.lib.map.view.map.b bVar) {
        Object[] objArr = {jsonObject, msiContext, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc55136f1afe755375201e2dfcdd1c2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc55136f1afe755375201e2dfcdd1c2b");
            return;
        }
        this.g = null;
        this.b = -1;
        this.c = -1;
        this.h = 1000.0f;
        this.i = 0.0f;
        this.j = 0;
        this.k = Color.argb(100, 0, 0, (int) TXLiveConstants.RENDER_ROTATION_180);
        this.d = false;
        this.l = 5;
        this.e = BitmapDescriptorFactory.fromResource(R.drawable.mmp_map_loc);
        this.m = null;
        this.f = null;
        this.n = 1.0f;
        this.o = jsonObject;
        this.m = msiContext;
        this.f = bVar;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a717cf5a5e47d70861089d41a4419913", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a717cf5a5e47d70861089d41a4419913");
        } else if (this.o != null) {
            this.g = this.o.has("iconPath") ? this.o.get("iconPath").getAsString() : "";
            if (TextUtils.isEmpty(this.g)) {
                this.m.onError(1201, "Location icon path is null");
                return;
            }
            this.b = this.o.has("iconWidth") ? this.o.get("iconWidth").getAsInt() : -1;
            this.c = this.o.has("iconHeight") ? this.o.get("iconHeight").getAsInt() : -1;
            this.h = this.o.has("iconZIndex") ? this.o.get("iconZIndex").getAsInt() : 1000.0f;
            this.l = this.o.has("locationType") ? a(this.o.get("locationType").getAsInt()) : 5;
            this.d = this.o.has("showAccuracyCircle") && this.o.get("showAccuracyCircle").getAsBoolean();
            if (this.o.has("accuracyCircleColor")) {
                this.k = com.meituan.msi.lib.map.utils.a.a(this.o.get("accuracyCircleColor").getAsString(), "accuracyCircleColor");
            }
            this.i = f.a(this.o.has("accuracyStrokeWidth") ? this.o.get("accuracyStrokeWidth").getAsInt() : 0);
            if (this.o.has("accuracyStrokeColor")) {
                this.j = com.meituan.msi.lib.map.utils.a.a(this.o.get("accuracyStrokeColor").getAsString(), "accuracyStrokeColor");
            }
            this.n = this.o.has("accuracyCeiling") ? this.o.get("accuracyCeiling").getAsFloat() : 0.0f;
            a(new c.a() { // from class: com.meituan.msi.lib.map.location.b.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.lib.map.utils.c.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8826dbee83ca0a419b5dda333aa6fcb6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8826dbee83ca0a419b5dda333aa6fcb6");
                    } else {
                        b.this.b();
                    }
                }
            });
        } else {
            b();
        }
    }

    private void a(final c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ab84836b90c569f1bb929e5c9a87072", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ab84836b90c569f1bb929e5c9a87072");
        } else {
            c.a(this.m.getActivity()).a(this.m, this.g, "userLocation", new Target() { // from class: com.meituan.msi.lib.map.location.b.2
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.Target
                public final void onPrepareLoad(Drawable drawable) {
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                    int i;
                    int i2;
                    Object[] objArr2 = {bitmap, loadedFrom};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d5d3d06e6d63d34da2e3f75fdde7649f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d5d3d06e6d63d34da2e3f75fdde7649f");
                        return;
                    }
                    if (b.this.b == -1) {
                        i = bitmap.getWidth();
                    } else {
                        i = b.this.b;
                    }
                    int a2 = f.a(i);
                    if (b.this.c == -1) {
                        i2 = bitmap.getHeight();
                    } else {
                        i2 = b.this.c;
                    }
                    b.this.e = BitmapDescriptorFactory.fromBitmap(c.a(bitmap, a2, f.a(i2)));
                    if (aVar != null) {
                        aVar.a();
                    }
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapFailed(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "05fefb90c547010b84d01125500e5efa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "05fefb90c547010b84d01125500e5efa");
                    } else if (aVar != null) {
                        aVar.a();
                    }
                }
            });
        }
    }

    void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ca493dd1e823e52395dd4e1c55cbde8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ca493dd1e823e52395dd4e1c55cbde8");
            return;
        }
        this.f.getMtMap().setMyLocationStyle(new MyLocationStyle().myLocationIcon(this.e).myLocationType(this.l).circleShow(this.d).radiusFillColor(this.k).strokeWidth(this.i).strokeColor(this.j).zIndex(this.h).radiusCeiling(this.n).iconIgnorePlacement(true));
    }
}
