package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.mapsdk.internal.em;
import com.tencent.mapsdk.internal.pe;
import com.tencent.mapsdk.internal.rg;
import com.tencent.mapsdk.internal.ri;
import com.tencent.mapsdk.internal.sh;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class bk implements al, bd, ez, ff, fj {
    public static final String a = "key_change_style";
    public ViewGroup b;
    so c;
    public ri d;
    public rg e;
    pd f;
    pe.a g;
    Bundle h;
    private TencentMapOptions n;
    private pw o;
    private int p;
    List<em> i = new CopyOnWriteArrayList();
    private boolean q = false;
    public Handler j = new Handler(jy.a("gesture")) { // from class: com.tencent.mapsdk.internal.bk.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message == null || message.obj == null) {
                return;
            }
            fs fsVar = (fs) message.obj;
            if (fsVar.f != 0) {
                if (fsVar.f != 1) {
                    if (fsVar.f == 3 && gy.i == 1) {
                        if (TextUtils.equals(sd.c, ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE) || bk.this.b == null) {
                            return;
                        }
                        if (bk.this.f == null) {
                            bk.this.f = new pd(bk.this.b.getContext().getApplicationContext(), bk.this.c.d_);
                            bk.this.f.b = bk.this.g;
                        }
                        bk.this.f.a(bk.this.b, null);
                    } else if (fsVar.f == 2 && bk.this.c.S) {
                        boolean b = v.b(fsVar.l);
                        VectorMap vectorMap = (VectorMap) bk.this.c.e_;
                        String str = b ? ns.b : ns.a;
                        mn mnVar = vectorMap.o;
                        if (mnVar.g != null) {
                            sh shVar = mnVar.g;
                            if (0 != shVar.e) {
                                shVar.a(new sh.AnonymousClass129(str));
                            }
                        }
                    }
                } else if (bk.this.e != null) {
                    rg rgVar = bk.this.e;
                    int i = fsVar.i;
                    double d = fsVar.j;
                    rgVar.h = i;
                    rgVar.i = d;
                    int log10 = (int) Math.log10(rgVar.n * rgVar.i);
                    int i2 = 0;
                    int pow = (int) (rg.e[0] * Math.pow(10.0d, log10));
                    int i3 = (int) (pow / rgVar.i);
                    if (i3 > 0 && !Double.isNaN(rgVar.i)) {
                        while (i3 < rgVar.n) {
                            i2++;
                            pow = (int) (rg.e[i2 % rg.e.length] * Math.pow(10.0d, (i2 / rg.e.length) + log10));
                            i3 = (int) (pow / rgVar.i);
                        }
                        String str2 = "米";
                        if (pow >= 1000) {
                            pow /= 1000;
                            str2 = "公里";
                        }
                        rgVar.f = pow + str2;
                        rgVar.g = i3;
                        jy.a(new rg.AnonymousClass5());
                    }
                    rgVar.f();
                }
            } else if (bk.this.d != null) {
                ri riVar = bk.this.d;
                boolean z = fsVar.g;
                boolean z2 = fsVar.h;
                if (riVar.b != null) {
                    jy.a(new ri.AnonymousClass4(z, z2));
                }
            }
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    public bk(be beVar, ViewGroup viewGroup, bu buVar) {
        this.b = null;
        this.b = viewGroup;
        if (buVar == null) {
            return;
        }
        this.c = (so) beVar.b();
        this.n = this.c.K();
        ((VectorMap) this.c.e_).o.i.a(this);
        if (buVar instanceof View) {
            View view = (View) buVar;
            if (this.b.indexOfChild(view) < 0) {
                this.b.addView(view, 0, new FrameLayout.LayoutParams(-1, -1));
                this.b.requestLayout();
            }
        }
        this.e = new rg(this.b.getContext().getApplicationContext(), this.c);
        this.c.m = this.e;
        this.o = new pw(beVar);
        this.e.r = this.o;
        this.c.n = this.o;
        this.d = new ri(this.b.getContext(), this.c);
        this.i.add(this.e);
        this.i.add(this.d);
        this.i.add(this.o);
        this.c.a((ez) this);
        so soVar = this.c;
        soVar.at.remove(this);
        soVar.at.add(this);
        this.c.a((ff) this);
    }

    private void k() {
        ViewGroup viewGroup = this.b;
        so soVar = this.c;
        if (viewGroup == null || soVar == null) {
            return;
        }
        if (this.j != null) {
            this.j.removeCallbacksAndMessages(null);
        }
        ((VectorMap) soVar.e_).o.i.b(this);
        soVar.at.remove(this);
        soVar.b((ez) this);
        viewGroup.removeAllViews();
        for (em emVar : this.i) {
            emVar.c();
        }
        this.i.clear();
    }

    private void a(a aVar) {
        if (this.d != null) {
            this.d.d = aVar;
        }
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void a(boolean z) {
        ri riVar = this.d;
        riVar.g = z;
        if (z && riVar.b == null) {
            riVar.a(riVar.a);
        }
        if (riVar.b != null) {
            riVar.b.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void b(boolean z) {
        so soVar = this.c;
        if (soVar.S != z) {
            fs fsVar = new fs();
            fsVar.f = 2;
            for (ez ezVar : soVar.q) {
                ezVar.a(fsVar);
            }
        }
        soVar.S = z;
        ad adVar = ((VectorMap) soVar.e_).o.i;
        adVar.G = z;
        adVar.z.f().b(adVar.G);
        ((VectorMap) soVar.e_).o.v = true;
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void c(boolean z) {
        this.q = z;
        ri riVar = this.d;
        riVar.f = z;
        if (z && riVar.c == null) {
            riVar.b(riVar.a);
        }
        if (riVar.c != null) {
            riVar.c.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void d(boolean z) {
        this.c.b(z);
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void e(boolean z) {
        this.c.c(z);
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void f(boolean z) {
        this.c.d(z);
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void g(boolean z) {
        this.c.e(z);
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void h(boolean z) {
        this.c.f(z);
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void i(boolean z) {
        this.c.aw = z;
        d(z);
        f(z);
        g(z);
        h(z);
    }

    @Override // com.tencent.mapsdk.internal.al
    public final boolean a() {
        ri riVar = this.d;
        return riVar.b != null && riVar.b.getVisibility() == 0;
    }

    @Override // com.tencent.mapsdk.internal.al
    public final boolean b() {
        return this.c.S;
    }

    @Override // com.tencent.mapsdk.internal.al
    public final boolean c() {
        return this.q;
    }

    @Override // com.tencent.mapsdk.internal.al
    public final boolean d() {
        return this.c.g();
    }

    @Override // com.tencent.mapsdk.internal.al
    public final boolean e() {
        return this.c.h();
    }

    @Override // com.tencent.mapsdk.internal.al
    public final boolean f() {
        return this.c.i();
    }

    @Override // com.tencent.mapsdk.internal.al
    public final boolean g() {
        return this.c.j();
    }

    @Override // com.tencent.mapsdk.internal.al
    public final boolean h() {
        if (this.o != null) {
            return this.o.c;
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.ff
    public final void b(int i, int i2) {
        this.p = i2;
        for (em emVar : this.i) {
            emVar.b(i, i2);
        }
        j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j() {
        jy.a(new Runnable() { // from class: com.tencent.mapsdk.internal.bk.2
            @Override // java.lang.Runnable
            public final void run() {
                bk bkVar = bk.this;
                Bundle bundle = bk.this.h;
                for (em emVar : bkVar.i) {
                    emVar.a(bkVar.b, bundle);
                }
            }
        });
    }

    private void a(Bundle bundle) {
        for (em emVar : this.i) {
            emVar.a(this.b, bundle);
        }
    }

    @Override // com.tencent.mapsdk.internal.fj
    public final void i(int i) {
        if (this.h == null) {
            this.h = new Bundle();
        }
        this.h.putInt(a, i);
        j();
        fs fsVar = new fs();
        fsVar.f = 2;
        fsVar.l = i;
        a(fsVar);
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void j(boolean z) {
        if (this.e != null) {
            rg rgVar = this.e;
            if (rgVar.j != z) {
                rgVar.j = z;
                if (rgVar.o != null) {
                    for (rg.c cVar : rgVar.o) {
                        cVar.b(rgVar.l, new Rect(rgVar.p, rgVar.q, 0, 0), rgVar.j);
                    }
                }
            }
            rgVar.e();
        }
    }

    @Override // com.tencent.mapsdk.internal.al
    public final boolean i() {
        if (this.e != null) {
            return this.e.j;
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void a(int i, float f) {
        if (this.e != null) {
            rg rgVar = this.e;
            em.a a2 = em.a.a(i);
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > 1.0f) {
                f = 1.0f;
            }
            rgVar.c[a2.e] = f;
            rgVar.h();
            j();
        }
    }

    @Override // com.tencent.mapsdk.internal.al
    public final float a(int i) {
        if (this.e != null) {
            return this.e.c[em.a.a(i).e];
        }
        return 0.0f;
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void b(int i) {
        if (this.e != null) {
            this.e.a(em.b.a(i));
            j();
        }
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void a(int i, int i2, int i3, int i4, int i5) {
        if (this.e != null) {
            this.e.a(em.b.a(i));
            this.e.a(em.a.TOP, i2);
            this.e.a(em.a.BOTTOM, i3);
            this.e.a(em.a.LEFT, i4);
            this.e.a(em.a.RIGHT, i5);
            this.e.h();
            j();
        }
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void a(int i, int[] iArr) {
        if (this.e != null) {
            em.b a2 = em.b.a(i);
            this.e.a(a2);
            switch (a2) {
                case LEFT_TOP:
                    this.e.a(em.a.TOP, iArr[0]);
                    this.e.a(em.a.LEFT, iArr[1]);
                    break;
                case LEFT_BOTTOM:
                    this.e.a(em.a.BOTTOM, iArr[0]);
                    this.e.a(em.a.LEFT, iArr[1]);
                    break;
                case RIGHT_BOTTOM:
                    this.e.a(em.a.BOTTOM, iArr[0]);
                    this.e.a(em.a.RIGHT, iArr[1]);
                    break;
                case RIGHT_TOP:
                    this.e.a(em.a.TOP, iArr[0]);
                    this.e.a(em.a.RIGHT, iArr[1]);
                    break;
            }
            this.e.h();
            j();
        }
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void e(int i) {
        if (this.e != null) {
            this.e.b(em.b.a(i));
            j();
        }
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void b(int i, int i2, int i3, int i4, int i5) {
        if (this.e != null) {
            this.e.b(em.b.a(i));
            this.e.b(em.a.TOP, i2);
            this.e.b(em.a.BOTTOM, i3);
            this.e.b(em.a.LEFT, i4);
            this.e.b(em.a.RIGHT, i5);
            this.e.i();
            j();
        }
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void c(int i) {
        if (this.e != null) {
            this.e.a(em.a.LEFT, i);
            this.e.h();
            j();
        }
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void k(boolean z) {
        if (this.e != null) {
            rg rgVar = this.e;
            rgVar.b = z;
            if (rgVar.a != null) {
                rgVar.a.setVisibility(z ? 0 : 4);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void d(int i) {
        if (this.e != null) {
            this.e.a(em.a.BOTTOM, i);
            this.e.h();
            j();
        }
    }

    private void b(boolean z, List<rp> list) {
        if (this.e == null || this.c == null || this.c.e_ == 0) {
            return;
        }
        this.e.a(list);
        if (z) {
            this.e.g();
        }
        this.e.a(this.c.U(), ((mn) this.c.d_).l());
    }

    @Override // com.tencent.mapsdk.internal.ez
    public final void a(fs fsVar) {
        if (fsVar.f != -1) {
            this.j.sendMessage(this.j.obtainMessage(fsVar.f, fsVar));
        }
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void f(int i) {
        if (this.c != null) {
            this.c.a(i);
        }
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void a(int i, int i2) {
        if (this.c != null) {
            this.c.a(i, i2);
        }
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void g(int i) {
        if (this.e != null) {
            rg rgVar = this.e;
            rgVar.d = i;
            rgVar.m = Float.MIN_VALUE;
            rgVar.h();
        }
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void h(int i) {
        if (this.d != null) {
            this.d.a(em.b.a(i));
        }
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void l(boolean z) {
        if (this.c == null || this.c.e_ == 0) {
            return;
        }
        VectorMap vectorMap = (VectorMap) this.c.e_;
        if (vectorMap.o != null) {
            mn mnVar = vectorMap.o;
            if (mnVar.i != null) {
                mnVar.i.L = z;
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void m(boolean z) {
        pw pwVar = this.o;
        if (pwVar.b == null || pwVar.f == null) {
            return;
        }
        if (z) {
            pwVar.c = true;
        } else {
            pwVar.c = false;
        }
        boolean z2 = pwVar.c;
        if (pwVar.b == null || pwVar.f == null) {
            return;
        }
        if (pwVar.a == null) {
            if (!z2) {
                return;
            }
            pwVar.e();
        }
        VectorMap vectorMap = (VectorMap) pwVar.f.e_;
        if (pwVar.c && z2 && pwVar.e != null && pwVar.e.f) {
            pwVar.a(vectorMap.q.u());
            return;
        }
        pwVar.a((IndoorBuilding) null);
        if (pwVar.a.getVisibility() != 8) {
            pwVar.a.setVisibility(8);
        }
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void a(float f) {
        if (this.e != null) {
            rg rgVar = this.e;
            if (f > 1.3f) {
                f = 1.3f;
            }
            if (f < 0.7f) {
                f = 0.7f;
            }
            rgVar.d = 0;
            rgVar.m = f;
            rgVar.h();
        }
    }

    @Override // com.tencent.mapsdk.internal.al
    public final void n(boolean z) {
        if (this.e != null) {
            rg rgVar = this.e;
            rgVar.k = !z;
            rgVar.e();
        }
    }

    private void a(rg.c cVar, TencentMapOptions tencentMapOptions) {
        if (tencentMapOptions == null || tencentMapOptions.getExtSurface() == null || this.e == null || tencentMapOptions == null) {
            return;
        }
        rg rgVar = this.e;
        if (rgVar.o != null && cVar != null) {
            rgVar.o.add(cVar);
        }
        int extSurfaceWidth = tencentMapOptions.getExtSurfaceWidth();
        int extSurfaceHeight = tencentMapOptions.getExtSurfaceHeight();
        this.b.measure(View.MeasureSpec.makeMeasureSpec(extSurfaceWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(extSurfaceHeight, 1073741824));
        b(extSurfaceWidth, extSurfaceHeight);
    }

    public final void a(pe.a aVar, TencentMapOptions tencentMapOptions) {
        if (tencentMapOptions == null || tencentMapOptions.getExtSurface() == null) {
            return;
        }
        this.g = aVar;
        int extSurfaceWidth = tencentMapOptions.getExtSurfaceWidth();
        int extSurfaceHeight = tencentMapOptions.getExtSurfaceHeight();
        this.b.measure(View.MeasureSpec.makeMeasureSpec(extSurfaceWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(extSurfaceHeight, 1073741824));
        b(extSurfaceWidth, extSurfaceHeight);
    }

    @Override // com.tencent.mapsdk.internal.bd
    public final void a(boolean z, List<rp> list) {
        if (this.e == null || this.c == null || this.c.e_ == 0) {
            return;
        }
        this.e.a(list);
        if (z) {
            this.e.g();
        }
        this.e.a(this.c.U(), ((mn) this.c.d_).l());
    }

    private static /* synthetic */ void a(bk bkVar, Bundle bundle) {
        for (em emVar : bkVar.i) {
            emVar.a(bkVar.b, bundle);
        }
    }
}
