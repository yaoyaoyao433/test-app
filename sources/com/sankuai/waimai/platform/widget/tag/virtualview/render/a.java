package com.sankuai.waimai.platform.widget.tag.virtualview.render;

import android.net.Uri;
import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.platform.widget.tag.b {
    public static ChangeQuickRedirect c;
    private static final Pools.Pool<a> e = new Pools.SynchronizedPool(128);
    public Uri d;

    public final a d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de421cdbc6070c98777f0c48a38ce27d", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de421cdbc6070c98777f0c48a38ce27d");
        }
        a a = a(this.d);
        a.d = this.d;
        return a;
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "446305e07934a7c040ba0ab921081502", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "446305e07934a7c040ba0ab921081502");
        } else {
            e.release(this);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void a() {
        this.d = null;
    }

    public static a a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "637acc1bbabd47dfb805948deea355d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "637acc1bbabd47dfb805948deea355d0");
        }
        a acquire = e.acquire();
        if (acquire == null) {
            acquire = new a();
        }
        acquire.d = uri;
        acquire.b = false;
        return acquire;
    }
}
