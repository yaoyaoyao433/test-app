package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.sh;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ab implements fe, od {
    public me a;
    public fp b;
    public VectorMap d;
    public mn e;
    private boolean h;
    private so i;
    private TencentMap.OnIndoorStateChangeListener j;
    public int c = a.a;
    public boolean f = false;
    public IndoorBuilding g = null;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a extends Enum<a> {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        private static final /* synthetic */ int[] d = {a, b, c};

        private a(String str, int i) {
            super(str, i);
        }

        public static int[] a() {
            return (int[]) d.clone();
        }
    }

    public ab(so soVar, String str) {
        JSONArray jSONArray = null;
        this.j = null;
        this.d = null;
        this.i = soVar;
        if (this.i != null) {
            if (str == null) {
                this.a = mh.a(this.i.G());
            } else {
                this.a = mg.a(this.i.G(), str);
            }
            this.d = (VectorMap) this.i.e_;
            this.e = this.i.aB;
            int b = this.a.b(ej.B);
            int b2 = this.a.b(ej.C);
            String a2 = this.a.a(ej.D);
            try {
                if (!TextUtils.isEmpty(a2)) {
                    jSONArray = new JSONArray(a2);
                }
            } catch (Exception e) {
                if (kj.a != null) {
                    kj.a.b(ki.n, "indoor auth init failed", e);
                } else {
                    kj.b(ki.n, "indoor auth init failed", e);
                }
            }
            if (b != -1 && b2 != -1 && jSONArray != null) {
                this.b = new fp(b, b2, jSONArray);
            }
            if (this.d != null) {
                this.d.a(a());
                if (b2 == 1) {
                    this.d.a(b());
                }
            }
            a(false);
        }
        if (this.d != null) {
            this.d.a((fe) this);
            this.d.o.a(this);
            this.j = new sl(this.i);
        }
    }

    private void d() {
        int b = this.a.b(ej.B);
        int b2 = this.a.b(ej.C);
        String a2 = this.a.a(ej.D);
        JSONArray jSONArray = null;
        try {
            if (!TextUtils.isEmpty(a2)) {
                jSONArray = new JSONArray(a2);
            }
        } catch (Exception e) {
            if (kj.a != null) {
                kj.a.b(ki.n, "indoor auth init failed", e);
            } else {
                kj.b(ki.n, "indoor auth init failed", e);
            }
        }
        if (b != -1 && b2 != -1 && jSONArray != null) {
            this.b = new fp(b, b2, jSONArray);
        }
        if (this.d != null) {
            this.d.a(a());
            if (b2 == 1) {
                this.d.a(b());
            }
        }
    }

    private void a(fp fpVar) {
        if (fpVar != null) {
            this.b = fpVar;
            kj.b(ki.f, "IndoorAuth:".concat(String.valueOf(fpVar)));
            this.a.a(ej.B, fpVar.c);
            this.a.a(ej.C, fpVar.d);
            if (fpVar.e != null) {
                this.a.a(ej.D, fpVar.e.toString());
            }
            if (this.d != null) {
                this.d.a(a());
                if (a() == 1) {
                    this.d.a(b());
                }
            }
        } else {
            this.a.a(new String[]{ej.B, ej.C, ej.D});
        }
        if (this.b == null) {
            this.b = new fp();
        }
        jy.a(new AnonymousClass1());
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.ab$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ab.this.c == a.a) {
                ab.this.a(ab.this.b.a());
            } else {
                ab.this.a(ab.this.c);
            }
        }
    }

    private void b(boolean z) {
        this.c = z ? a.b : a.c;
        a(this.c);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.ab$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = new int[a.a().length];

        static {
            try {
                a[a.b - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.a - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a.c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final void a(int i) {
        switch (AnonymousClass3.a[i - 1]) {
            case 1:
                a(true);
                return;
            case 2:
            case 3:
                a(false);
                return;
            default:
                return;
        }
    }

    final void a(boolean z) {
        this.h = z;
        if (this.e == null) {
            return;
        }
        if (!e()) {
            this.e.d(false);
            return;
        }
        this.e.d(z);
        if (z || !this.f) {
            return;
        }
        a(null, null, null, null, -1);
    }

    private boolean e() {
        return this.b != null && this.b.a();
    }

    public final int a() {
        return (this.b == null || !this.b.b()) ? 0 : 1;
    }

    public final String[] b() {
        if (this.b != null) {
            return this.b.f;
        }
        return null;
    }

    private boolean f() {
        return this.f;
    }

    @Override // com.tencent.mapsdk.internal.od
    public final void c() {
        if (!this.h || this.i == null || this.i.e_ == 0) {
            return;
        }
        GeoPoint geoPoint = new GeoPoint();
        sh shVar = ((VectorMap) this.i.e_).o.g;
        pv pvVar = (pv) shVar.a(new sh.AnonymousClass138(geoPoint), (sh.AnonymousClass138) null);
        if (pvVar == null) {
            return;
        }
        final LatLng latLng = new LatLng((geoPoint.getLatitudeE6() * 1.0d) / 1000000.0d, (geoPoint.getLongitudeE6() * 1.0d) / 1000000.0d);
        final String str = pvVar.a;
        final String str2 = pvVar.b;
        final String[] strArr = pvVar.d;
        final int i = pvVar.c;
        jy.a(new Runnable() { // from class: com.tencent.mapsdk.internal.ab.2
            @Override // java.lang.Runnable
            public final void run() {
                ab.this.a(str, str2, latLng, strArr, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, String str2, LatLng latLng, String[] strArr, int i) {
        gs gsVar;
        if (this.i == null || this.i.e_ == 0) {
            return;
        }
        VectorMap vectorMap = (VectorMap) this.i.e_;
        int p = vectorMap.p();
        if (str != null && strArr != null && strArr.length > 0 && i >= 0 && p >= 16) {
            if (this.j != null && !this.f) {
                this.f = true;
                this.j.onIndoorBuildingFocused();
            }
            vectorMap.b(Math.min(this.i.j, 22));
            if (this.j != null) {
                ArrayList arrayList = new ArrayList();
                for (String str3 : strArr) {
                    arrayList.add(new IndoorLevel(str3));
                }
                try {
                    if (this.g != null && this.g.getBuidlingId().equals(str)) {
                        if (this.g.getActiveLevelIndex() == i) {
                            return;
                        }
                    }
                } catch (Exception unused) {
                }
                if ((this.g == null || !str.equals(this.g.getBuidlingId())) && (gsVar = this.e.d) != null) {
                    gsVar.d().a.a();
                }
                this.g = new IndoorBuilding(str, str2, latLng, arrayList, i);
                if (this.i != null && this.i.n != null && this.i.n.c) {
                    this.i.n.a(this.g);
                }
                this.j.onIndoorLevelActivated(this.g);
                return;
            }
            return;
        }
        g();
        if (this.f) {
            this.f = false;
            this.g = null;
            if (this.i != null && this.i.n != null) {
                this.i.n.a(this.g);
            }
            if (this.j != null) {
                this.j.onIndoorBuildingDeactivated();
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.fe
    public final void b(int i) {
        if (!this.h || this.i == null || this.i.e_ == 0 || this.i.n == null || this.f) {
            return;
        }
        g();
    }

    private void g() {
        if (this.i == null || this.i.e_ == 0 || this.f) {
            return;
        }
        VectorMap vectorMap = (VectorMap) this.i.e_;
        int min = Math.min(20, this.i.j);
        if (vectorMap.o.t.a() < min) {
            vectorMap.b(min);
        }
    }

    private void h() {
        if (this.g != null) {
            String buidlingId = this.g.getBuidlingId();
            int activeLevelIndex = this.g.getActiveLevelIndex();
            List<IndoorLevel> levels = this.g.getLevels();
            if (levels == null || activeLevelIndex >= levels.size()) {
                return;
            }
            String name = levels.get(activeLevelIndex).getName();
            if (hb.a(buidlingId) || hb.a(name)) {
                return;
            }
            this.e.a(buidlingId, name);
        }
    }

    private IndoorBuilding i() {
        return this.g;
    }

    private void c(int i) {
        if (this.e == null) {
            return;
        }
        mn mnVar = this.e;
        if (mnVar.g != null) {
            sh shVar = mnVar.g;
            shVar.a(new sh.AnonymousClass135(i));
        }
        c();
    }

    private String j() {
        if (this.g == null) {
            return null;
        }
        return this.g.getBuidlingId();
    }

    private int k() {
        if (this.g == null) {
            return -1;
        }
        return this.g.getActiveLevelIndex();
    }

    private String[] l() {
        if (this.g == null || this.g.getLevels() == null || this.g.getLevels().isEmpty()) {
            return null;
        }
        List<IndoorLevel> levels = this.g.getLevels();
        String[] strArr = new String[levels.size()];
        for (int i = 0; i < levels.size(); i++) {
            strArr[i] = levels.get(i).getName();
        }
        return strArr;
    }

    private String m() {
        return this.g == null ? "" : this.g.getBuildingName();
    }

    private IndoorBuilding n() {
        return this.g;
    }

    private void c(boolean z) {
        if (this.d == null) {
            return;
        }
        mn mnVar = this.d.o;
        if (mnVar.g != null) {
            sh shVar = mnVar.g;
            if (shVar.e != 0) {
                shVar.a(new sh.AnonymousClass145(z));
            }
        }
    }

    private void a(String str, String str2) {
        if (this.e == null) {
            return;
        }
        this.e.a(str, str2);
    }

    private int a(String str) {
        if (this.d == null) {
            return -1;
        }
        VectorMap vectorMap = this.d;
        if (vectorMap.o == null) {
            return -1;
        }
        mn mnVar = vectorMap.o;
        if (mnVar.g == null) {
            return -1;
        }
        sh shVar = mnVar.g;
        return ((Integer) shVar.a((CallbackRunnable<sh.AnonymousClass40>) new sh.AnonymousClass40(str), (sh.AnonymousClass40) (-1))).intValue();
    }
}
