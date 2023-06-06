package com.sankuai.waimai.platform.widget.tag.model;

import android.content.Context;
import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends a {
    public static ChangeQuickRedirect o;
    private static final Pools.Pool<f> p = new Pools.SynchronizedPool(128);
    private int q;
    private int r;

    @Override // com.sankuai.waimai.platform.widget.tag.model.b
    public final int[] b(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29d1966b90ee9289cc19ec7acd16bc1d", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29d1966b90ee9289cc19ec7acd16bc1d") : new int[]{this.q, this.r};
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45b200fc2494441718fe676b427f446d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45b200fc2494441718fe676b427f446d");
        } else {
            p.release(this);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.tag.model.a, com.sankuai.waimai.platform.widget.tag.model.b, com.sankuai.waimai.platform.widget.tag.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64021c51d971a8eb072874bbd870db2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64021c51d971a8eb072874bbd870db2e");
            return;
        }
        this.q = 0;
        this.r = 0;
        super.a();
    }

    public static f a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a24a18a98ba425ef0dd964650b7e1caa", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a24a18a98ba425ef0dd964650b7e1caa");
        }
        f acquire = p.acquire();
        if (acquire == null) {
            acquire = new f();
        }
        acquire.q = i;
        acquire.r = i2;
        acquire.b = false;
        return acquire;
    }
}
