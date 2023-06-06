package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.sdk.comps.offlinemap.OfflineMapComponent;
import com.tencent.mapsdk.core.MapDelegate;
import com.tencent.mapsdk.internal.fk;
import com.tencent.mapsdk.internal.gc;
import com.tencent.tencentmap.mapsdk.maps.TencentMapComponent;
import com.tencent.tencentmap.mapsdk.maps.TencentMapContext;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.TencentMapProtocol;
import com.tencent.tencentmap.mapsdk.maps.TencentMapResource;
import com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import com.tencent.tencentmap.mapsdk.maps.model.MapViewType;
import com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class bn implements TencentMapContext {
    private static final Map<Class<? extends TencentMapComponent.Component>, TencentMapComponent.Component> g = new ConcurrentHashMap();
    private static final Set<a> h;
    private static final String i = "map-context.cache";
    private static final String j = "navi_marker_location.png";
    private static final String k = "color_texture_flat_style.png";
    public final TencentMapOptions a;
    public final bo b;
    gc c;
    public gs d;
    public boolean e = false;
    public volatile boolean f = true;
    private final Context l;
    private mi m;

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapContext
    public TencentMapComponent getMapComponent() {
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapContext
    public TencentMapResource getMapResource() {
        return this;
    }

    public abstract boolean l();

    protected abstract void p();

    protected Map<Class<? extends TencentMapComponent.Component>, Class<? extends TencentMapComponent.Component>> q() {
        return null;
    }

    public abstract String v();

    public abstract String w();

    public abstract String x();

    public abstract bs y();

    static {
        HashSet hashSet = new HashSet();
        h = hashSet;
        hashSet.add(new a(TencentMapProtocol.class, ck.class));
        h.add(new a(OfflineMapComponent.class, ca.class));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        Class<? extends TencentMapComponent.Component> a;
        Class<? extends TencentMapComponent.Component> b;

        public a(Class<? extends TencentMapComponent.Component> cls, Class<? extends TencentMapComponent.Component> cls2) {
            this.a = cls;
            this.b = cls2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == null ? aVar.a == null : this.a.equals(aVar.a)) {
                return this.b != null ? this.b.equals(aVar.b) : aVar.b == null;
            }
            return false;
        }

        public final int hashCode() {
            return ((this.a != null ? this.a.hashCode() : 0) * 31) + (this.b != null ? this.b.hashCode() : 0);
        }
    }

    public bn(Context context, TencentMapOptions tencentMapOptions, bo boVar) {
        this.l = context.getApplicationContext();
        this.a = tencentMapOptions;
        this.b = boVar;
        BitmapDescriptorFactory.attachMapContext(this);
        mf.a(tencentMapOptions);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        b u = u();
        gy.a(this.l, u.a, u.b, u.f);
        this.c = new gc(this);
        gc gcVar = this.c;
        if (gcVar.a == 0) {
            gcVar.a(new gc.AnonymousClass1(new gc.AnonymousClass2()));
        }
        gcVar.a++;
        long currentTimeMillis = System.currentTimeMillis();
        gc.e.a(gc.c.CREATE).e = Long.valueOf(currentTimeMillis);
        this.d = new gs(currentTimeMillis);
        Map<Class<? extends TencentMapComponent.Component>, Class<? extends TencentMapComponent.Component>> q = q();
        if (q != null) {
            for (Map.Entry<Class<? extends TencentMapComponent.Component>, Class<? extends TencentMapComponent.Component>> entry : q.entrySet()) {
                h.add(new a(entry.getKey(), entry.getValue()));
            }
        }
        for (a aVar : h) {
            Class<? extends TencentMapComponent.Component> cls = aVar.a;
            TencentMapComponent.Component component = g.get(cls);
            Class<? extends TencentMapComponent.Component> cls2 = aVar.b;
            if (component == null && cls2 != null && cls.isAssignableFrom(cls2)) {
                component = (TencentMapComponent.Component) ha.a(cls2, new Object[0]);
                if (component instanceof bm) {
                    ((bm) component).a(getContext());
                }
                g.put(cls, component);
            }
            if (component instanceof bm) {
                ((bm) component).a(this);
            }
        }
    }

    private void a() {
        this.c = new gc(this);
        gc gcVar = this.c;
        if (gcVar.a == 0) {
            gcVar.a(new gc.AnonymousClass1(new gc.AnonymousClass2()));
        }
        gcVar.a++;
        this.d = gc.a(System.currentTimeMillis());
    }

    private gs c() {
        return this.d;
    }

    private boolean e() {
        return this.e;
    }

    private void a(boolean z) {
        this.e = z;
    }

    private boolean f() {
        return this.f;
    }

    private void b(boolean z) {
        this.f = z;
    }

    private void g() {
        gc gcVar = this.c;
        gs gsVar = this.d;
        gsVar.b = System.currentTimeMillis() - gsVar.a;
        gcVar.a--;
        if (gsVar != null) {
            synchronized (gcVar) {
                gcVar.b.add(gsVar);
            }
        }
        if (gcVar.a == 0 && !gcVar.b.isEmpty()) {
            gcVar.a(gc.a(gcVar.b, (gc.e) null), new gc.AnonymousClass4());
        }
        Bundle bundle = new Bundle();
        if (bundle.size() > 0) {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            kc.a(kc.b(kc.d, i), obtain.marshall());
            obtain.recycle();
        }
        s();
        BitmapDescriptorFactory.detachMapContext(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle r() {
        byte[] c;
        File file = new File(kc.d, i);
        if (!file.exists() || (c = kc.c(file)) == null || c.length <= 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(c, 0, c.length);
        Bundle bundle = new Bundle();
        bundle.readFromParcel(obtain);
        kc.b(file);
        obtain.recycle();
        return bundle;
    }

    private static void a(Bundle bundle) {
        if (bundle.size() > 0) {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            kc.a(kc.b(kc.d, i), obtain.marshall());
            obtain.recycle();
        }
    }

    private void h() {
        Map<Class<? extends TencentMapComponent.Component>, Class<? extends TencentMapComponent.Component>> q = q();
        if (q != null) {
            for (Map.Entry<Class<? extends TencentMapComponent.Component>, Class<? extends TencentMapComponent.Component>> entry : q.entrySet()) {
                h.add(new a(entry.getKey(), entry.getValue()));
            }
        }
        for (a aVar : h) {
            Class<? extends TencentMapComponent.Component> cls = aVar.a;
            TencentMapComponent.Component component = g.get(cls);
            Class<? extends TencentMapComponent.Component> cls2 = aVar.b;
            if (component == null && cls2 != null && cls.isAssignableFrom(cls2)) {
                component = (TencentMapComponent.Component) ha.a(cls2, new Object[0]);
                if (component instanceof bm) {
                    ((bm) component).a(getContext());
                }
                g.put(cls, component);
            }
            if (component instanceof bm) {
                ((bm) component).a(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s() {
        for (Map.Entry<Class<? extends TencentMapComponent.Component>, TencentMapComponent.Component> entry : g.entrySet()) {
            TencentMapComponent.Component value = entry.getValue();
            if (value instanceof bm) {
                bm bmVar = (bm) value;
                bmVar.b(this);
                if (bmVar.c_() == null) {
                    g.remove(entry.getKey());
                }
            }
        }
        gy.p();
    }

    private <T extends TencentMapComponent.Component> T a(Class<T> cls) {
        T t = (T) g.get(cls);
        if (t instanceof bm) {
            ((bm) t).a(this, null);
        }
        return t;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapComponent
    public TencentMapServiceProtocol getMapServiceProtocol() {
        return (TencentMapServiceProtocol) getMapComponent(TencentMapProtocol.class);
    }

    private TencentMapProtocol i() {
        return (TencentMapProtocol) getMapComponent(TencentMapProtocol.class);
    }

    private TencentMapOptions j() {
        return this.a;
    }

    public final MapDelegate b() {
        return this.b;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapContext
    public Context getContext() {
        return this.l;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapResource
    public int getScreenPixels() {
        return gy.f();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapResource
    public MyLocationStyle getDefaultMyLocationStyle() {
        MyLocationStyle myLocationStyle = new MyLocationStyle();
        myLocationStyle.icon(createBitmapDescriptor(j, 2));
        return myLocationStyle;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapResource
    public Typeface getTypeface() {
        return this.a.getTypeface();
    }

    private File k() {
        return t().c();
    }

    public final mi t() {
        if (this.m == null) {
            this.m = mi.a(this.l, this.a);
        }
        return this.m;
    }

    private OverSeaSource m() {
        return this.a.getOverSeaSource();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapResource
    public BitmapDescriptor createBitmapDescriptor(int i2, int i3) {
        fk fkVar = new fk(getContext(), i3);
        fkVar.a = i2;
        return new BitmapDescriptor(fkVar);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapResource
    public BitmapDescriptor createBitmapDescriptor(String str, int i2) {
        fk fkVar = new fk(getContext(), i2);
        if (i2 == 2) {
            fkVar.b = str;
            return new BitmapDescriptor(fkVar);
        } else if (i2 == 3) {
            fkVar.c = str;
            return new BitmapDescriptor(fkVar);
        } else if (i2 == 4) {
            fkVar.d = str;
            return new BitmapDescriptor(fkVar);
        } else if (i2 == 8) {
            fkVar.f = str;
            return new BitmapDescriptor(fkVar);
        } else {
            return null;
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapResource
    public BitmapDescriptor createBitmapDescriptor(float f, int i2) {
        fk fkVar = new fk(getContext(), i2);
        fkVar.e = f;
        return new BitmapDescriptor(fkVar);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapResource
    public BitmapDescriptor createBitmapDescriptor(Parcelable parcelable, int i2) {
        fk fkVar = new fk(getContext(), i2);
        if (i2 == 9) {
            if (parcelable instanceof fk.a) {
                fkVar.g = (fk.a) parcelable;
                return new BitmapDescriptor(fkVar);
            }
            return null;
        } else if (i2 == 7 && (parcelable instanceof Bitmap)) {
            return new BitmapDescriptor(fkVar.a((Bitmap) parcelable));
        } else {
            return null;
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapResource
    public BitmapDescriptor createBitmapDescriptor(Bitmap bitmap, int i2) {
        return new BitmapDescriptor(new fk(getContext(), i2).a(bitmap));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapResource
    public BitmapDescriptor createBitmapDescriptor(Bitmap[] bitmapArr, int i2) {
        fk fkVar = new fk(getContext(), i2);
        fkVar.h = bitmapArr;
        fkVar.getBitmap(fkVar.i);
        return new BitmapDescriptor(fkVar);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapResource
    public BitmapDescriptor createBitmapDescriptor(int i2) {
        fk fkVar = new fk(getContext(), i2);
        if (i2 == 5) {
            return new BitmapDescriptor(fkVar);
        }
        return null;
    }

    public final b u() {
        return new b(this.a);
    }

    private MapViewType n() {
        return this.a.getMapViewType();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class b {
        public String a;
        public String c;
        public String d;
        String f;
        public String b = gy.l();
        String e = gy.m();

        b(TencentMapOptions tencentMapOptions) {
            this.f = Constants.UNDEFINED;
            this.a = gy.a();
            if (tencentMapOptions != null) {
                if (!TextUtils.isEmpty(tencentMapOptions.getMapKey())) {
                    this.a = tencentMapOptions.getMapKey();
                }
                if (!TextUtils.isEmpty(tencentMapOptions.getSubKey())) {
                    this.c = tencentMapOptions.getSubKey();
                }
                if (!TextUtils.isEmpty(tencentMapOptions.getSubId())) {
                    this.d = tencentMapOptions.getSubId();
                }
                this.f = tencentMapOptions.getCustomUserId();
            }
        }

        private String d() {
            return this.a;
        }

        private String e() {
            return this.b;
        }

        private String f() {
            return this.c;
        }

        private String g() {
            return this.d;
        }

        private String h() {
            return this.e;
        }

        private String i() {
            return this.f;
        }

        public final String a() {
            return this.e + CommonConstant.Symbol.MINUS + this.a + CommonConstant.Symbol.MINUS + this.b + CommonConstant.Symbol.MINUS + this.c + CommonConstant.Symbol.MINUS + this.d;
        }

        private String j() {
            return this.a + CommonConstant.Symbol.MINUS + this.b + CommonConstant.Symbol.MINUS + this.c + CommonConstant.Symbol.MINUS + this.d;
        }

        public final String b() {
            if (TextUtils.isEmpty(this.c)) {
                return this.a;
            }
            return this.c;
        }

        private String k() {
            return kt.a(a());
        }

        public final String c() {
            return kt.a(this.a + CommonConstant.Symbol.MINUS + this.b + CommonConstant.Symbol.MINUS + this.c + CommonConstant.Symbol.MINUS + this.d);
        }
    }

    private cm d() {
        TencentMapProtocol tencentMapProtocol = (TencentMapProtocol) getMapComponent(TencentMapProtocol.class);
        if (!(tencentMapProtocol instanceof ck)) {
            return ck.e();
        }
        return ((ck) tencentMapProtocol).d().b;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapComponent
    public <T extends TencentMapComponent.Component> T getMapComponent(Class<T> cls) {
        T t = (T) g.get(cls);
        if (t instanceof bm) {
            ((bm) t).a(this, null);
        }
        return t;
    }
}
