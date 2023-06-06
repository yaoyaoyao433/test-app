package com.sankuai.waimai.platform.widget.tag.virtualview.render;

import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h extends com.sankuai.waimai.platform.widget.tag.b {
    public static ChangeQuickRedirect c;
    private static final Pools.Pool<h> j = new Pools.SynchronizedPool(128);
    public float d;
    public boolean e;
    public String f;
    public String g;
    public int h;
    public int i;

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64a90aeadaade6f02cd3b51cf41abcae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64a90aeadaade6f02cd3b51cf41abcae");
            return;
        }
        this.d = 0.0f;
        this.e = false;
        this.f = null;
        this.h = 0;
        this.i = 0;
    }

    public final h d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2780fde130a2ab3b06001d20f4ddeea3", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2780fde130a2ab3b06001d20f4ddeea3");
        }
        h e = e();
        e.d = this.d;
        e.e = this.e;
        e.f = this.f;
        e.g = this.g;
        e.h = this.h;
        e.i = this.i;
        return e;
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22d10f75f4c89477205f449166e925de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22d10f75f4c89477205f449166e925de");
        } else {
            j.release(this);
        }
    }

    public static h e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e2a8b7b86903accc8fcdcfdc7a2a556", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e2a8b7b86903accc8fcdcfdc7a2a556");
        }
        h acquire = j.acquire();
        if (acquire == null) {
            acquire = new h();
        }
        acquire.b = false;
        return acquire;
    }
}
