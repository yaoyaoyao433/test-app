package com.sankuai.waimai.platform.widget.tag.model;

import android.content.Context;
import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends a {
    public static ChangeQuickRedirect o;
    private static final Pools.Pool<c> s = new Pools.SynchronizedPool(128);
    public com.sankuai.waimai.platform.widget.tag.virtualview.render.a p;
    public int q;
    public int r;

    @Override // com.sankuai.waimai.platform.widget.tag.model.b
    public final int[] b(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "530aa90fc1780e5fe7082b56afecf7be", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "530aa90fc1780e5fe7082b56afecf7be") : new int[]{this.q, this.r};
    }

    @Override // com.sankuai.waimai.platform.widget.tag.model.a, com.sankuai.waimai.platform.widget.tag.model.b, com.sankuai.waimai.platform.widget.tag.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ca46f7287491572d43adb4f7e09a33e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ca46f7287491572d43adb4f7e09a33e");
            return;
        }
        if (this.p != null) {
            this.p.c();
        }
        this.p = null;
        this.q = 0;
        this.r = 0;
        super.a();
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "561c3f6b90514fb3d71fc383664d2584", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "561c3f6b90514fb3d71fc383664d2584");
        } else {
            s.release(this);
        }
    }

    public static c d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "477ab929295484a2da1e607d766f7f91", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "477ab929295484a2da1e607d766f7f91");
        }
        c acquire = s.acquire();
        if (acquire == null) {
            acquire = new c();
        }
        acquire.b = false;
        return acquire;
    }
}
