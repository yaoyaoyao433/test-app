package com.sankuai.waimai.store.search.ui.result.dynamictag;

import android.content.Context;
import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends a {
    public static ChangeQuickRedirect f;
    private static final Pools.Pool<c> m = new Pools.SynchronizedPool(64);
    public long g;
    public String h;
    public List<com.sankuai.waimai.platform.widget.tag.model.a> i;
    public boolean j;
    public int k;
    public int l;

    @Override // com.sankuai.waimai.store.search.ui.result.dynamictag.a
    public final int[] b(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53220856225d4a526dc57b9b8966eb65", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53220856225d4a526dc57b9b8966eb65");
        }
        if (this.i == null || this.i.isEmpty()) {
            return d;
        }
        int i2 = 0;
        int i3 = 0;
        for (com.sankuai.waimai.platform.widget.tag.model.a aVar : this.i) {
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            if (aVar != null) {
                int i4 = i - (aVar.f + aVar.g);
                int[] a = aVar.a(context, i4);
                i = i4 - a[0];
                i2 += aVar.f + aVar.g + a[0];
                if (a[1] > i3) {
                    i3 = a[1];
                }
            }
        }
        return new int[]{i2, Math.max(com.sankuai.waimai.platform.widget.tag.util.b.a(context, 16.0f), i3)};
    }

    @Override // com.sankuai.waimai.store.search.ui.result.dynamictag.a, com.sankuai.waimai.platform.widget.tag.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b84699f4dce0978a66c52caafc18e2e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b84699f4dce0978a66c52caafc18e2e8");
            return;
        }
        this.g = 0L;
        this.h = null;
        this.l = 0;
        if (this.i != null) {
            for (com.sankuai.waimai.platform.widget.tag.model.a aVar : this.i) {
                aVar.c();
            }
            this.i = null;
        }
        this.j = false;
        this.k = 0;
        super.a();
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efe9cf9c6813451994f27f56c3d2a5c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efe9cf9c6813451994f27f56c3d2a5c7");
        } else {
            m.release(this);
        }
    }

    public static c d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fcb576933a6f97728e26d5f4946ac422", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fcb576933a6f97728e26d5f4946ac422");
        }
        c acquire = m.acquire();
        if (acquire == null) {
            acquire = new c();
        }
        acquire.b = false;
        return acquire;
    }
}
