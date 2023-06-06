package com.sankuai.meituan.mapsdk.core.annotations;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.mtmap.rendersdk.DynamicMapObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class n implements q, com.sankuai.meituan.mapsdk.maps.interfaces.f {
    public static ChangeQuickRedirect a;
    boolean b;
    private com.sankuai.meituan.mapsdk.core.d c;
    private String d;
    private l e;
    private DynamicMapObserver f;
    private final Map<BitmapDescriptor, Integer> g;

    public n(@NonNull final com.sankuai.meituan.mapsdk.core.d dVar, String str) {
        Object[] objArr = {dVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "056fbd3e493d046eb257ba275207d2bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "056fbd3e493d046eb257ba275207d2bf");
            return;
        }
        this.c = dVar;
        this.d = str;
        this.e = this.c.f.d;
        this.g = new ConcurrentHashMap();
        this.f = new DynamicMapObserver() { // from class: com.sankuai.meituan.mapsdk.core.annotations.n.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mtmap.rendersdk.DynamicMapObserver
            public final void onLoaded(String str2, long[] jArr) {
                Object[] objArr2 = {str2, jArr};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "221d2997658d6e0ef9015d3e070d9067", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "221d2997658d6e0ef9015d3e070d9067");
                } else if (!n.this.a() || n.this.b || jArr == null || jArr.length <= 0) {
                } else {
                    n.this.b = true;
                    long currentTimeMillis = System.currentTimeMillis() - jArr[0];
                    Context context = dVar.c.getContext();
                    String str3 = dVar.o;
                    Class<?> cls = getClass();
                    com.sankuai.meituan.mapsdk.mapcore.report.f.a(context, 3, str3, cls, "onLoaded", 2003L, "dynamicMap load style duration: " + currentTimeMillis, "MTMapAndroidOverlayExceptionStatus", (float) currentTimeMillis);
                }
            }
        };
    }

    boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5f3a11c17d3eb24fdda686f05552d8f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5f3a11c17d3eb24fdda686f05552d8f")).booleanValue() : (this.c.i || this.c.d == null || this.e == null) ? false : true;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void initDynamicMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35af5e8c4729063c1f206702cbd3b934", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35af5e8c4729063c1f206702cbd3b934");
        } else if (a()) {
            this.c.d.createDynamicMap(this.d);
            this.c.d.setOnDynamicMapObserver(this.d, this.f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void initDynamicMap(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f94449f528daeb083a31e1db9ebda583", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f94449f528daeb083a31e1db9ebda583");
        } else if (a()) {
            this.c.d.createDynamicMap(this.d, str);
            this.c.d.setOnDynamicMapObserver(this.d, this.f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void removeDynamicMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "403b75bae21a9f287da3a6dd359ccfef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "403b75bae21a9f287da3a6dd359ccfef");
        } else if (a()) {
            for (BitmapDescriptor bitmapDescriptor : this.g.keySet()) {
                Integer num = this.g.get(bitmapDescriptor);
                if (num != null) {
                    for (int i = 0; i < num.intValue(); i++) {
                        removeDynamicMapImage(bitmapDescriptor);
                    }
                }
            }
            this.c.d.destroyDynamicMap(this.d);
            this.c.d.setOnDynamicMapObserver(this.d, null);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void addDynamicMapImage(BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c89118c248980348b136aa797fe76db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c89118c248980348b136aa797fe76db");
        } else if (!a() || bitmapDescriptor == null) {
        } else {
            this.g.put(bitmapDescriptor, Integer.valueOf(this.g.get(bitmapDescriptor) != null ? 1 + this.g.get(bitmapDescriptor).intValue() : 1));
            this.e.a(this, bitmapDescriptor);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void removeDynamicMapImage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3dbb8667347afbc6572e2d4efe3951b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3dbb8667347afbc6572e2d4efe3951b");
        } else if (a() && str != null) {
            for (BitmapDescriptor bitmapDescriptor : this.g.keySet()) {
                if (str.equals(bitmapDescriptor.getId())) {
                    removeDynamicMapImage(bitmapDescriptor);
                }
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void removeDynamicMapImage(BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4592387fd0c97f4860a9f535a8348ff0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4592387fd0c97f4860a9f535a8348ff0");
        } else if (!a() || bitmapDescriptor == null) {
        } else {
            this.e.b(this, bitmapDescriptor);
            Integer num = this.g.get(bitmapDescriptor);
            if (num != null) {
                this.g.put(bitmapDescriptor, Integer.valueOf(Math.max(num.intValue() - 1, 0)));
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void addDynamicMapGeoJSON(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c182b01c9b7de2207cb19e974700279e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c182b01c9b7de2207cb19e974700279e");
        } else if (a()) {
            this.c.d.addDynamicMapGeoJSON(this.d, str, str2);
            this.c.d.recordDynamicMap(this.d, System.currentTimeMillis());
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void addDynamicMapGeoJSONWithSize(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f1bc46c68b8a61ea99b46d509f57793", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f1bc46c68b8a61ea99b46d509f57793");
        } else if (a()) {
            this.c.d.addDynamicMapGeoJSONWithSize(this.d, str, str2, i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void removeDynamicMapGeoJSON(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f93b4fd53fcaf76aa3828cdee918a4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f93b4fd53fcaf76aa3828cdee918a4c");
        } else if (a()) {
            this.c.d.removeDynamicMapGeoJSON(this.d, str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void setDynamicMapFeature(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43681e7ccfb1b907f7e571177ff3ddb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43681e7ccfb1b907f7e571177ff3ddb9");
        } else if (a()) {
            this.c.d.setDynamicMapFeature(this.d, str, Long.parseLong(str2), str3, str4);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void resetDynamicMapFeature(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bad1b23da439a8591888208bc0895a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bad1b23da439a8591888208bc0895a6");
        } else if (a()) {
            this.c.d.resetDynamicMapFeature(this.d, str, Long.parseLong(str2));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void removeDynamicMapFeature(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d1da3e68424d120c7e0d2889af4ac67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d1da3e68424d120c7e0d2889af4ac67");
        } else if (a()) {
            this.c.d.removeDynamicMapFeature(this.d, str, Long.parseLong(str2));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void resetDynamicMapFeatures() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2274a9393b4744204488a8ad6948b8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2274a9393b4744204488a8ad6948b8e");
        } else if (a()) {
            this.c.d.resetDynamicMapFeatures(this.d);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.q
    public final String b() {
        return this.d;
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.q
    public final void a(Collection<String> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f572ef9cbf9c217d38139f63cfa715b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f572ef9cbf9c217d38139f63cfa715b4");
        } else {
            this.c.d.setDynamicMapImages(this.d, new ArrayList(collection));
        }
    }
}
