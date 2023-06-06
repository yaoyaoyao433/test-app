package com.sankuai.waimai.store.widgets.tag;

import android.content.Context;
import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends b {
    public static ChangeQuickRedirect f;
    private static final Pools.Pool<c> o = new Pools.SynchronizedPool(64);
    public int g;
    public int h;
    public long i;
    public String j;
    public List<com.sankuai.waimai.platform.widget.tag.model.a> k;
    public boolean l;
    public int m;
    public boolean n;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6682db60e3053ff774b50a2463e63206", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6682db60e3053ff774b50a2463e63206");
        } else {
            this.n = false;
        }
    }

    @Override // com.sankuai.waimai.store.widgets.tag.b
    public final int[] b(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d3fe76502c8cf68daf657e500759ce7", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d3fe76502c8cf68daf657e500759ce7");
        }
        if (this.k == null || this.k.isEmpty()) {
            return d;
        }
        int i2 = 0;
        int i3 = 0;
        for (com.sankuai.waimai.platform.widget.tag.model.a aVar : this.k) {
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

    @Override // com.sankuai.waimai.store.widgets.tag.b, com.sankuai.waimai.platform.widget.tag.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "999500ecff4aef5a916ce79443237542", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "999500ecff4aef5a916ce79443237542");
            return;
        }
        this.i = 0L;
        this.h = 0;
        this.g = 0;
        this.j = null;
        if (!com.sankuai.shangou.stone.util.a.b(this.k)) {
            for (com.sankuai.waimai.platform.widget.tag.model.a aVar : this.k) {
                if (aVar != null) {
                    aVar.c();
                }
            }
            this.k.clear();
        }
        this.l = false;
        this.m = 0;
        super.a();
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fd22a021a81a58d74c704dfe172a1dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fd22a021a81a58d74c704dfe172a1dc");
        } else {
            o.release(this);
        }
    }

    public static c d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7aaa88f6f02bff9a31c85d3e4227f730", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7aaa88f6f02bff9a31c85d3e4227f730");
        }
        c acquire = o.acquire();
        if (acquire == null) {
            acquire = new c();
        }
        acquire.b = false;
        return acquire;
    }
}
