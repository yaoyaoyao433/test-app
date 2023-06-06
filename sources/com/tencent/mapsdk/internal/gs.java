package com.tencent.mapsdk.internal;

import com.meituan.android.common.statistics.Constants;
import com.tencent.map.tools.json.annotation.Json;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class gs extends gt {
    @Json(name = "create")
    public long a;
    @Json(name = "destroy")
    public long b;
    @Json(name = "mapLoad")
    private go c;
    @Json(name = "oversea")
    private gq d;
    @Json(name = "indoorLog")
    private gn e;
    @Json(name = "darkMode")
    private gj f;
    @Json(name = "pointEvent")
    private gr h;
    @Json(name = "aoi")
    private gf i;
    @Json(name = "vectorHeat")
    private gw j;
    @Json(name = "heatMap")
    private gm k;
    @Json(name = "arcLine")
    private gg l;
    @Json(name = "dotScatter")
    private gk m;
    @Json(name = "bitmapScatter")
    private gh n;
    @Json(name = Constants.GestureData.KEY_TRAIL)
    private gu o;
    @Json(name = "groundOverlay")
    private gl p;
    @Json(name = "offline")
    private gp q;
    @Json(name = "customStyle")
    private gi r;
    @Json(name = "ugc")
    private gv s;

    public gs(long j) {
        super(j);
        this.a = j;
    }

    public final go a() {
        if (this.c == null) {
            this.c = new go(this.g);
        }
        return this.c;
    }

    public final gq b() {
        if (this.d == null) {
            this.d = new gq(System.currentTimeMillis() - this.g);
        }
        return this.d;
    }

    public final gv c() {
        if (this.s == null) {
            this.s = new gv(System.currentTimeMillis() - this.g);
        }
        return this.s;
    }

    public final gn d() {
        if (this.e == null) {
            this.e = new gn(System.currentTimeMillis() - this.g);
        }
        return this.e;
    }

    public final gj e() {
        if (this.f == null) {
            this.f = new gj(System.currentTimeMillis() - this.g);
        }
        return this.f;
    }

    public final gr f() {
        if (this.h == null) {
            this.h = new gr(System.currentTimeMillis() - this.g);
        }
        return this.h;
    }

    public final gf g() {
        if (this.i == null) {
            this.i = new gf(System.currentTimeMillis() - this.g);
        }
        return this.i;
    }

    public final gw h() {
        if (this.j == null) {
            this.j = new gw(System.currentTimeMillis() - this.g);
        }
        return this.j;
    }

    public final gm i() {
        if (this.k == null) {
            this.k = new gm(System.currentTimeMillis() - this.g);
        }
        return this.k;
    }

    public final gg j() {
        if (this.l == null) {
            this.l = new gg(System.currentTimeMillis() - this.g);
        }
        return this.l;
    }

    public final gk k() {
        if (this.m == null) {
            this.m = new gk(System.currentTimeMillis() - this.g);
        }
        return this.m;
    }

    public final gh l() {
        if (this.n == null) {
            this.n = new gh(System.currentTimeMillis() - this.g);
        }
        return this.n;
    }

    public final gu m() {
        if (this.o == null) {
            this.o = new gu(System.currentTimeMillis() - this.g);
        }
        return this.o;
    }

    public final gl n() {
        if (this.p == null) {
            this.p = new gl(System.currentTimeMillis() - this.g);
        }
        return this.p;
    }

    public final gp o() {
        if (this.q == null) {
            this.q = new gp(System.currentTimeMillis() - this.g);
        }
        return this.q;
    }

    public final gi p() {
        if (this.r == null) {
            this.r = new gi(System.currentTimeMillis() - this.g);
        }
        return this.r;
    }

    private gs r() {
        this.b = System.currentTimeMillis() - this.a;
        return this;
    }
}
