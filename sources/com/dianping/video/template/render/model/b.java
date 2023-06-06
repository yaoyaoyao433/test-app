package com.dianping.video.template.render.model;

import com.dianping.video.template.model.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class b {
    public static ChangeQuickRedirect b;
    protected String c;
    public int d;
    public int e;
    public int f;
    protected int g;
    protected long h;
    protected long i;
    protected boolean j;
    protected long k;

    public abstract boolean a();

    public abstract boolean a(long j);

    public long d(long j) {
        return j;
    }

    public b(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6d3eb02a075749144e459e5eaedfc35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6d3eb02a075749144e459e5eaedfc35");
            return;
        }
        this.g = -1;
        this.h = -100000L;
        this.k = 0L;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "394c6cf0036537272520e828d7b97d68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "394c6cf0036537272520e828d7b97d68");
            return;
        }
        this.h = -100000L;
        this.j = false;
    }

    public final void c() {
        this.j = true;
    }

    public final void a(int i) {
        this.g = i;
    }

    public final void a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "131d0d53d5bee6ae320e9c626073ce31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "131d0d53d5bee6ae320e9c626073ce31");
            return;
        }
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.i = i4;
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4f1bcaf4a6e02ab71b3358387be7301", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4f1bcaf4a6e02ab71b3358387be7301");
        } else {
            this.k = j;
        }
    }

    public final void c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c51093caaad69fc84cc4abe39088546d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c51093caaad69fc84cc4abe39088546d");
        } else {
            this.h = j - this.k;
        }
    }

    public final int d() {
        return this.g;
    }

    public final String e() {
        return this.c;
    }

    public final long f() {
        return this.h;
    }
}
