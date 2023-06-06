package com.sankuai.meituan.mapsdk.core.widgets;

import android.support.annotation.NonNull;
import android.support.v4.view.GravityCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.core.widgets.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class b {
    public static ChangeQuickRedirect b;
    protected static final AtomicLong c = new AtomicLong(0);
    protected List<c> d;
    public d.a e;
    protected com.sankuai.meituan.mapsdk.core.d f;
    protected d g;
    protected float h;
    protected float i;
    protected float j;
    protected float k;
    protected int l;
    protected int m;
    protected int[] n;
    protected int o;

    public b(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f2a209e14725247857188a62aa36562", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f2a209e14725247857188a62aa36562");
            return;
        }
        this.n = new int[]{0, 0, 0, 0};
        this.o = 8388691;
        this.f = dVar.g;
        this.g = dVar;
        this.d = new ArrayList(1);
    }

    public final void a(@NonNull int[] iArr, int i) {
        Object[] objArr = {iArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2126a61bd33ee7121e93c7b20907bb44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2126a61bd33ee7121e93c7b20907bb44");
        } else if (Arrays.equals(this.n, iArr) && this.o == i) {
        } else {
            System.arraycopy(iArr, 0, this.n, 0, iArr.length);
            this.o = i;
            b();
        }
    }

    public final void b() {
        int b2;
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdfd7ac64ff90985b0a3e3c1ddd912ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdfd7ac64ff90985b0a3e3c1ddd912ce");
            return;
        }
        com.sankuai.meituan.mapsdk.core.render.a aVar = this.f.d;
        if (this.f.i || aVar == null) {
            return;
        }
        if (this.n == null || this.o < 0) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.c("ScreenUI:updatePosition failed with mMargins:" + this.n + ", mGravity:" + this.o);
            return;
        }
        int i2 = this.m;
        int i3 = this.l;
        if ((this.o & GravityCompat.START) == 8388611) {
            b2 = this.n[0];
        } else if ((this.o & GravityCompat.END) == 8388613) {
            b2 = (aVar.b() - this.n[2]) - this.l;
        } else {
            b2 = (this.o & 1) == 1 ? (int) (((aVar.b() - this.l) + 0.5f) / 2.0f) : 0;
        }
        int i4 = i3 + b2;
        if ((this.o & 80) == 80) {
            i = this.n[3];
        } else if ((this.o & 48) == 48) {
            i = (aVar.c() - this.n[1]) - this.m;
        } else if ((this.o & 16) == 16) {
            i = (int) (((aVar.c() - this.m) + 0.5f) / 2.0f);
        }
        a(b2, i2 + i, i4, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.mapsdk.core.widgets.b.a(int, int, int, int):void");
    }

    public final void b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7450869754f2610ecef21d7cc7c3fc9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7450869754f2610ecef21d7cc7c3fc9f");
            return;
        }
        this.j = f;
        for (c cVar : this.d) {
            cVar.i[2] = (float) ((f / 180.0f) * 3.141592653589793d);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44b5ba8e481b9b4a36ac1cd8e807cb00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44b5ba8e481b9b4a36ac1cd8e807cb00");
            return;
        }
        this.k = i;
        for (c cVar : this.d) {
            cVar.j[2] = this.k;
        }
    }

    public final void a(float f, float f2) {
        Object[] objArr = {Float.valueOf(0.5f), Float.valueOf(0.5f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da13f906f86d2d3f866273f464a2e089", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da13f906f86d2d3f866273f464a2e089");
            return;
        }
        this.h = 0.5f;
        this.i = 0.5f;
        for (c cVar : this.d) {
            cVar.h[0] = this.h;
            cVar.h[1] = this.i;
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f1e999b7df0219a8f48a07b43d61faa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f1e999b7df0219a8f48a07b43d61faa");
            return;
        }
        for (c cVar : this.d) {
            d dVar = this.g;
            Object[] objArr2 = {cVar};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "b45cecd6463e73d448d8d3d602b9557c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "b45cecd6463e73d448d8d3d602b9557c");
            } else {
                com.sankuai.meituan.mapsdk.core.render.a aVar = dVar.g.d;
                if (!dVar.g.i && aVar != null) {
                    aVar.removeScreenImage(cVar.d);
                    dVar.i.remove(cVar.d);
                    if (cVar.e != null) {
                        aVar.removeImage(cVar.e);
                    }
                    cVar.d = 0;
                    cVar.e = null;
                    cVar.g = null;
                }
            }
        }
        this.d.clear();
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9c9cb5859d07ba76d8e8406e57dee24", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9c9cb5859d07ba76d8e8406e57dee24");
        }
        return "screenui_" + c.addAndGet(1L);
    }
}
