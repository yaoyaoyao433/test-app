package com.sankuai.waimai.platform.widget.tag.virtualview.render;

import android.support.v4.util.Pools;
import android.text.Layout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.platform.widget.tag.b {
    public static ChangeQuickRedirect c;
    private static final Pools.Pool<e> n = new Pools.SynchronizedPool(128);
    public float d;
    public boolean e;
    public String f;
    public String g;
    public Integer h;
    public int i;
    public int j;
    public int k;
    public int l;
    @Nullable
    public Layout m;

    public final e d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5ac341f1053caf702dd3e3386aea03c", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5ac341f1053caf702dd3e3386aea03c");
        }
        e e = e();
        e.d = this.d;
        e.e = this.e;
        e.f = this.f;
        e.g = this.g;
        e.h = this.h;
        e.i = this.i;
        e.j = this.j;
        e.k = this.k;
        e.m = this.m;
        e.l = this.l;
        return e;
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43e2225db8e3d4dee8303978ee1f92d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43e2225db8e3d4dee8303978ee1f92d3");
            return;
        }
        this.d = 0.0f;
        this.e = false;
        this.f = null;
        this.g = null;
        this.h = null;
        this.m = null;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "420bc016106298b3191f93047aa9227d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "420bc016106298b3191f93047aa9227d");
        } else {
            n.release(this);
        }
    }

    public static e e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "615a7edcf0f8f5e2786fe7c154866c8b", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "615a7edcf0f8f5e2786fe7c154866c8b");
        }
        e acquire = n.acquire();
        if (acquire == null) {
            acquire = new e();
        }
        acquire.b = false;
        return acquire;
    }
}
