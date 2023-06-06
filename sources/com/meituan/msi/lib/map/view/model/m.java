package com.meituan.msi.lib.map.view.model;

import android.support.annotation.NonNull;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
import com.sankuai.meituan.mapsdk.maps.model.Orientation;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class m {
    public static ChangeQuickRedirect a;
    private int A;
    private Object B;
    public String b;
    public boolean c;
    public Marker d;
    LatLng e;
    String f;
    float g;
    int h;
    float i;
    a j;
    boolean k;
    boolean l;
    public JsonObject m;
    float n;
    public boolean o;
    int p;
    boolean q;
    public boolean r;
    private float s;
    private float t;
    private BitmapDescriptor u;
    private final MTMap v;
    private boolean w;
    private int x;
    private int y;
    private int z;

    public m(MTMap mTMap) {
        Object[] objArr = {mTMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebe6a3a2c50ddbad6d32d1f5bdd50310", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebe6a3a2c50ddbad6d32d1f5bdd50310");
            return;
        }
        this.b = "BYCLICK";
        this.s = 0.5f;
        this.t = 1.0f;
        this.g = 0.0f;
        this.h = 2;
        this.i = 0.0f;
        this.u = null;
        this.k = true;
        this.l = true;
        this.w = true;
        this.n = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.o = false;
        this.q = true;
        this.r = false;
        this.v = mTMap;
    }

    public final LatLng a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ff133f99620020a09e2d5a992db0b60", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ff133f99620020a09e2d5a992db0b60");
        }
        if (this.d != null) {
            return this.d.getPosition();
        }
        return null;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6e6065883bf3c46e8ef333f1c2803d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6e6065883bf3c46e8ef333f1c2803d4");
        } else if (this.d != null) {
            this.d.remove();
            this.r = true;
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cca8a073b58be1a60ec1c44514cb89a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cca8a073b58be1a60ec1c44514cb89a");
            return;
        }
        this.c = true;
        if (this.d != null) {
            this.d.showInfoWindow();
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07bca1500a1884058eb93fc9b1c2ba14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07bca1500a1884058eb93fc9b1c2ba14");
            return;
        }
        this.c = false;
        if (this.d != null) {
            this.d.hideInfoWindow();
        }
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c6af580224d435c7b6a577c72e660c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c6af580224d435c7b6a577c72e660c6");
            return;
        }
        this.z = i;
        this.A = i2;
        if (this.d != null) {
            this.d.setInfoWindowOffset(this.z, this.A);
        }
    }

    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7bef24969422f2aac65ff7c02944689", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7bef24969422f2aac65ff7c02944689");
            return;
        }
        this.B = obj;
        if (this.d != null) {
            this.d.setObject(obj);
        }
    }

    public final void a(@NonNull BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6e53b78d62c19717f2939bb74b03aaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6e53b78d62c19717f2939bb74b03aaf");
            return;
        }
        this.u = bitmapDescriptor;
        if (this.d != null) {
            this.d.setIcon(bitmapDescriptor);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2fa2c46fc90c64698b36c57715ccf3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2fa2c46fc90c64698b36c57715ccf3c");
            return;
        }
        this.d = this.v.addMarker(new MarkerOptions().position(this.e).icon(this.u).zIndex(this.g).title(this.f).anchor(this.s, this.t).level(this.h).clickable(this.w).rotateAngle(this.i).allowOverlap(this.k).ignorePlacement(this.l).alpha(this.n).offset(this.x, this.y).fastLoad(true).useSharedLayer(this.q));
        if (this.d != null) {
            this.d.setObject(this.B);
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9e58f2199a331d2cea73a1819a3e743", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9e58f2199a331d2cea73a1819a3e743");
        } else if (this.d == null || this.j == null) {
        } else {
            Marker marker = this.d;
            a aVar = this.j;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            marker.setMarkerName(PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "9e45521d2a2b656b8de6822a08cbc5ed", RobustBitConfig.DEFAULT_VALUE) ? (MarkerOptions.MarkerName) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "9e45521d2a2b656b8de6822a08cbc5ed") : new MarkerOptions.MarkerName().markerName(aVar.b).size(aVar.c).color(aVar.d).strokeWidth(aVar.i).strokeColor(aVar.j).ignorePlacement(aVar.g).allowOverlap(aVar.h).offset(aVar.e, aVar.f).aroundIcon(aVar.k).optional(aVar.l).order(aVar.m));
        }
    }

    public final void a(float f, float f2) {
        this.s = f;
        this.t = f2;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74867d71307f8b222cf7f9e66b729016", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74867d71307f8b222cf7f9e66b729016");
            return;
        }
        this.w = z;
        if (this.d != null) {
            this.d.setClickable(z);
        }
    }

    public final void b(int i, int i2) {
        this.x = i;
        this.y = i2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        String b;
        int c;
        int d;
        float e;
        float f;
        boolean g;
        boolean h;
        int i;
        int j;
        Orientation[] k;
        boolean l;
        float m;
        private String n;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "802eb204b5c571c5af2b3518080bec11", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "802eb204b5c571c5af2b3518080bec11");
                return;
            }
            this.b = null;
            this.c = com.meituan.msi.util.f.a(11);
            this.d = -16777216;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = true;
            this.h = true;
            this.i = 0;
            this.j = -1;
            this.k = null;
            this.n = "noMode";
            this.l = false;
            this.m = 0.0f;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
            if (r13.equals("noTopMode") == false) goto L19;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(java.lang.String r13) {
            /*
                r12 = this;
                r0 = 1
                java.lang.Object[] r8 = new java.lang.Object[r0]
                r9 = 0
                r8[r9] = r13
                com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msi.lib.map.view.model.m.a.a
                java.lang.String r11 = "ea19c19ce0f0c96369df14190e8ebac2"
                r4 = 0
                r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                r1 = r8
                r2 = r12
                r3 = r10
                r5 = r11
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                if (r1 == 0) goto L1b
                com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
                return
            L1b:
                r12.n = r13
                java.lang.String r13 = r12.n
                r1 = -1
                int r2 = r13.hashCode()
                r3 = -1255891158(0xffffffffb5249f2a, float:-6.1326375E-7)
                if (r2 == r3) goto L39
                r3 = -548504681(0xffffffffdf4e7b97, float:-1.4878652E19)
                if (r2 == r3) goto L2f
                goto L44
            L2f:
                java.lang.String r2 = "noTopMode"
                boolean r13 = r13.equals(r2)
                if (r13 == 0) goto L44
                goto L45
            L39:
                java.lang.String r0 = "normalMode"
                boolean r13 = r13.equals(r0)
                if (r13 == 0) goto L44
                r0 = 0
                goto L45
            L44:
                r0 = -1
            L45:
                switch(r0) {
                    case 0: goto L51;
                    case 1: goto L4c;
                    default: goto L48;
                }
            L48:
                r13 = 0
                r12.k = r13
                return
            L4c:
                com.sankuai.meituan.mapsdk.maps.model.Orientation[] r13 = com.sankuai.meituan.mapsdk.maps.model.MarkerOptions.MarkerName.AROUND_ICON_MODE_NO_TOP
                r12.k = r13
                return
            L51:
                com.sankuai.meituan.mapsdk.maps.model.Orientation[] r13 = com.sankuai.meituan.mapsdk.maps.model.MarkerOptions.MarkerName.AROUND_ICON_MODE
                r12.k = r13
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.lib.map.view.model.m.a.a(java.lang.String):void");
        }
    }
}
