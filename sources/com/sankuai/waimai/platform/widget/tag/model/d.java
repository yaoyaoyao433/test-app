package com.sankuai.waimai.platform.widget.tag.model;

import android.content.Context;
import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends b {
    public static ChangeQuickRedirect c;
    private static final Pools.Pool<d> p = new Pools.SynchronizedPool(64);
    public long d;
    public String e;
    public List<a> f;
    public boolean g;
    public int h;
    public int i;
    public com.sankuai.waimai.platform.widget.tag.api.c j;
    public Map<String, String> o;

    @Override // com.sankuai.waimai.platform.widget.tag.model.b
    public final int[] b(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f175110ed06626c6aa607f4a79bd1650", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f175110ed06626c6aa607f4a79bd1650");
        }
        if (this.f == null || this.f.isEmpty()) {
            return m;
        }
        int i2 = 0;
        int i3 = 0;
        for (a aVar : this.f) {
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
        int[] iArr = new int[2];
        iArr[0] = i2;
        iArr[1] = Math.max(this.i > 0 ? this.i : com.sankuai.waimai.platform.widget.tag.util.b.a(context, 16.0f), i3);
        return iArr;
    }

    @Override // com.sankuai.waimai.platform.widget.tag.model.b, com.sankuai.waimai.platform.widget.tag.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59873baa81bdc2d30a724f0949e57402", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59873baa81bdc2d30a724f0949e57402");
            return;
        }
        this.d = 0L;
        this.e = null;
        if (this.f != null) {
            for (a aVar : this.f) {
                aVar.c();
            }
            this.f = null;
        }
        this.g = false;
        this.h = 0;
        this.i = 0;
        this.j = null;
        this.o = null;
        super.a();
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05c7e758a5fc0add5c842ee98da66382", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05c7e758a5fc0add5c842ee98da66382");
        } else {
            p.release(this);
        }
    }

    public static d d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6acd212296b76be181cafe926fce6bd5", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6acd212296b76be181cafe926fce6bd5");
        }
        d acquire = p.acquire();
        if (acquire == null) {
            acquire = new d();
        }
        acquire.b = false;
        return acquire;
    }
}
