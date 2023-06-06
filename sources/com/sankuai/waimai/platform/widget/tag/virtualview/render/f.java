package com.sankuai.waimai.platform.widget.tag.virtualview.render;

import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends com.sankuai.waimai.platform.widget.tag.b {
    public static ChangeQuickRedirect c;
    public int e;
    public int f;
    private static final Pools.Pool<f> g = new Pools.SynchronizedPool(128);
    public static final f d = new f();

    public static f a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d3f4b31c1699e5693f6a108a34608cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d3f4b31c1699e5693f6a108a34608cc");
        }
        f fVar = new f();
        fVar.e = i;
        fVar.f = i2;
        return fVar;
    }

    public static f a(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a875c214ae3b736ba6a602f51d9b5d35", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a875c214ae3b736ba6a602f51d9b5d35");
        }
        if (iArr == null || iArr.length < 2) {
            return d;
        }
        return a(iArr[0], iArr[1]);
    }

    public final f d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9619ad0604054aa3ec1e22ce2ee2a44d", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9619ad0604054aa3ec1e22ce2ee2a44d") : b(this.e, this.f);
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void a() {
        this.e = 0;
        this.f = 0;
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73e8514d68a0afd9b31ab220e096f70e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73e8514d68a0afd9b31ab220e096f70e");
        } else {
            g.release(this);
        }
    }

    private static f b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf4255bb5b496c2a4178780d951ba8dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf4255bb5b496c2a4178780d951ba8dc");
        }
        f acquire = g.acquire();
        if (acquire == null) {
            acquire = new f();
        }
        acquire.e = i;
        acquire.f = i2;
        acquire.b = false;
        return acquire;
    }
}
