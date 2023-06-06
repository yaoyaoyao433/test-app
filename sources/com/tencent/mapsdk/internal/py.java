package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.engine.jni.models.TappedElement;
import com.tencent.mapsdk.internal.sh;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class py extends or {
    private ap A;
    public fq a;
    public int[] n;
    public int[] o;
    public int p;
    public GeoPoint q;
    public int r;
    public a s;
    private be t;
    private boolean u;
    private Selectable.OnSelectedListener v;
    private float w;
    private int x;
    private mm y;
    private boolean z;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        public int a;
        public int b;
    }

    public py(ap apVar, ba baVar, fq fqVar) {
        super(baVar);
        this.u = true;
        this.r = -1;
        this.w = -1.0f;
        this.x = -1;
        this.A = apVar;
        this.y = baVar.c();
        a(fqVar);
    }

    @Override // com.tencent.mapsdk.internal.or
    public final void j_() {
        mm mmVar = this.y;
        if (mmVar == null) {
            return;
        }
        this.t = mmVar.a;
        so soVar = (so) this.t.b();
        if (soVar == null) {
            return;
        }
        if (this.z && this.r != -1) {
            kj.b(ki.f, "deleteLine..." + this.r);
            VectorMap vectorMap = (VectorMap) soVar.e_;
            vectorMap.o.k.b(this);
            vectorMap.o.v = true;
            sh f = this.t.f();
            f.a(new sh.AnonymousClass104(this.r, this.a.B));
            this.r = -1;
            return;
        }
        float f2 = mmVar.a.a().A.b.p;
        if (this.w == -1.0f || this.w != f2) {
            this.w = f2;
        }
        if (this.r == -1) {
            sh f3 = this.t.f();
            this.r = ((Integer) f3.a((CallbackRunnable<sh.AnonymousClass100>) new sh.AnonymousClass100(this), (sh.AnonymousClass100) (-1))).intValue();
            kj.b(ki.f, "createLine..." + this.r);
        }
        if (p()) {
            sh f4 = this.t.f();
            f4.a(new sh.AnonymousClass101(this));
        }
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public final boolean onTap(float f, float f2) {
        TappedElement a2;
        return (this.t == null || (a2 = this.t.f().a(f, f2)) == null || a2.itemId != ((long) this.r)) ? false : true;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public final void setSelected(boolean z) {
        this.u = z;
        if (this.t == null || this.t.f() == null) {
            return;
        }
        sh f = this.t.f();
        f.a(new sh.AnonymousClass103(this));
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public final boolean isSelected() {
        return this.u;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av
    public final Rect b(eq eqVar) {
        if (this.a == null || this.a.m == null || this.a.m.isEmpty()) {
            return null;
        }
        Iterator<GeoPoint> it = this.a.m.iterator();
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        while (it.hasNext()) {
            GeoPoint next = it.next();
            int latitudeE6 = next.getLatitudeE6();
            int longitudeE6 = next.getLongitudeE6();
            if (latitudeE6 > i2) {
                i2 = latitudeE6;
            }
            if (latitudeE6 < i4) {
                i4 = latitudeE6;
            }
            if (longitudeE6 > i3) {
                i3 = longitudeE6;
            }
            if (longitudeE6 < i) {
                i = longitudeE6;
            }
        }
        return new Rect(i, i2, i3, i4);
    }

    @Override // com.tencent.mapsdk.internal.av
    public final ap f_() {
        return this.A;
    }

    @Override // com.tencent.mapsdk.internal.av
    public final Rect a(eq eqVar) {
        Rect b = b(eqVar);
        if (b == null) {
            return null;
        }
        GeoPoint geoPoint = new GeoPoint(b.top, b.left);
        GeoPoint geoPoint2 = new GeoPoint(b.bottom, b.right);
        fm a2 = eqVar.a(geoPoint);
        fm a3 = eqVar.a(geoPoint2);
        return new Rect((int) a2.a, (int) a2.b, (int) a3.a, (int) a3.b);
    }

    private ArrayList<GeoPoint> e() {
        return this.a.m;
    }

    private int[] f() {
        return this.n;
    }

    private int[] g() {
        return this.o;
    }

    private boolean h() {
        return this.a.v;
    }

    private int[] i() {
        return this.a.s;
    }

    private int[] t() {
        return this.a.t;
    }

    private float u() {
        return this.a.u;
    }

    private int[] v() {
        return this.a.n;
    }

    private int[] w() {
        return this.a.o;
    }

    private String[] x() {
        return this.a.p;
    }

    public final void a(int i, GeoPoint geoPoint) {
        this.p = i;
        this.q = geoPoint;
        q();
    }

    private GeoPoint y() {
        return this.q;
    }

    private int z() {
        return this.p;
    }

    private void a(boolean z) {
        this.a.w = z;
    }

    private boolean A() {
        return this.a.w;
    }

    private boolean B() {
        return this.a.z;
    }

    private boolean C() {
        return this.a.B;
    }

    private int D() {
        return this.a.C;
    }

    private boolean E() {
        return this.a.O;
    }

    private float F() {
        return this.a.x;
    }

    private void a(float f) {
        this.a.x = f;
    }

    private void b(float f) {
        this.a.u = f;
    }

    private void a(int[] iArr) {
        this.a.t = iArr;
    }

    private void c(float f) {
        if (this.a == null || f < 0.0f || f > 1.0f) {
            return;
        }
        this.a.A = f;
    }

    private float G() {
        if (this.a == null) {
            return 1.0f;
        }
        return this.a.A;
    }

    private void a(int i, int i2) {
        this.s = new a();
        this.s.a = i;
        this.s.b = i2;
        q();
    }

    public final void d() {
        if (this.s != null) {
            this.s.a = -1;
            q();
        }
    }

    private a H() {
        return this.s;
    }

    @Deprecated
    private void a(String str) {
        this.a.y = str;
    }

    private void b(String str) {
        this.a.y = str;
    }

    private String I() {
        if (this.a.r != null && this.a.r.length > 0) {
            if (this.a.r[0] == 33) {
                return fq.j;
            }
            if (this.a.r[0] == 20) {
                return fq.k;
            }
        }
        return hb.a(this.a.y) ? fq.i : this.a.y;
    }

    @Deprecated
    private void c(String str) {
        this.a.y = str;
    }

    private int J() {
        return this.r;
    }

    private void a(int i) {
        this.r = i;
    }

    public final void a(fq fqVar) {
        if (fqVar == null || !fqVar.a()) {
            kj.b("LineOptions不能为空！");
        } else if (fqVar.equals(this.a)) {
        } else {
            q();
            this.a = fqVar;
            this.n = fqVar.q;
            this.o = fqVar.r;
        }
    }

    private boolean K() {
        return this.a.D;
    }

    private void b(boolean z) {
        this.a.E = z;
    }

    private boolean L() {
        return this.a.E;
    }

    private Rect M() {
        Rect rect;
        ArrayList<GeoPoint> arrayList = this.a.l;
        if (arrayList != null && !arrayList.isEmpty() && this.p >= 0 && this.p < arrayList.size()) {
            List<GeoPoint> subList = arrayList.subList(this.p, arrayList.size());
            if (subList == null || subList.isEmpty()) {
                rect = null;
            } else {
                GeoPoint geoPoint = subList.get(0);
                int longitudeE6 = geoPoint.getLongitudeE6();
                int longitudeE62 = geoPoint.getLongitudeE6();
                int latitudeE6 = geoPoint.getLatitudeE6();
                int latitudeE62 = geoPoint.getLatitudeE6();
                int size = subList.size();
                for (int i = 0; i < size; i++) {
                    GeoPoint geoPoint2 = subList.get(i);
                    if (geoPoint2 != null) {
                        int latitudeE63 = geoPoint2.getLatitudeE6();
                        int longitudeE63 = geoPoint2.getLongitudeE6();
                        if (longitudeE63 < longitudeE6) {
                            longitudeE6 = longitudeE63;
                        } else if (longitudeE63 > longitudeE62) {
                            longitudeE62 = longitudeE63;
                        }
                        if (latitudeE63 < latitudeE62) {
                            latitudeE62 = latitudeE63;
                        } else if (latitudeE63 > latitudeE6) {
                            latitudeE6 = latitudeE63;
                        }
                    }
                }
                rect = new Rect(longitudeE6, latitudeE6, longitudeE62, latitudeE62);
            }
            if (rect != null) {
                this.a.F = rect;
            }
        }
        return this.a.F;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final void setZIndex(int i) {
        this.a.G = i;
        if (this.t == null || this.t.f() == null) {
            return;
        }
        this.t.f().a(this.x, i);
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final int getZIndex() {
        return this.a.G;
    }

    private String N() {
        return this.a.H;
    }

    private float O() {
        return this.a.I;
    }

    private int[] P() {
        return new int[]{this.a.J, this.a.K};
    }

    private void a(List<Integer> list) {
        this.a.b(list);
    }

    private List<Integer> Q() {
        return this.a.L;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final int getLevel() {
        return this.a.M;
    }

    private static Rect b(List<GeoPoint> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        GeoPoint geoPoint = list.get(0);
        int longitudeE6 = geoPoint.getLongitudeE6();
        int longitudeE62 = geoPoint.getLongitudeE6();
        int latitudeE6 = geoPoint.getLatitudeE6();
        int latitudeE62 = geoPoint.getLatitudeE6();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            GeoPoint geoPoint2 = list.get(i);
            if (geoPoint2 != null) {
                int latitudeE63 = geoPoint2.getLatitudeE6();
                int longitudeE63 = geoPoint2.getLongitudeE6();
                if (longitudeE63 < longitudeE6) {
                    longitudeE6 = longitudeE63;
                } else if (longitudeE63 > longitudeE62) {
                    longitudeE62 = longitudeE63;
                }
                if (latitudeE63 < latitudeE62) {
                    latitudeE62 = latitudeE63;
                } else if (latitudeE63 > latitudeE6) {
                    latitudeE6 = latitudeE63;
                }
            }
        }
        return new Rect(longitudeE6, latitudeE6, longitudeE62, latitudeE62);
    }

    @Override // com.tencent.mapsdk.internal.or
    public final void h_() {
        this.z = true;
    }
}
