package com.sankuai.waimai.platform.widget.tag.virtualview.render;

import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.platform.widget.tag.b {
    public static ChangeQuickRedirect c;
    public static final b d = new b();
    private static final Pools.Pool<b> g = new Pools.SynchronizedPool(128);
    public int e;
    public int f;

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9af0e41388ecedfd5c12cdace2d5ae64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9af0e41388ecedfd5c12cdace2d5ae64");
        } else {
            g.release(this);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void a() {
        this.e = 0;
        this.f = 0;
    }

    public static b a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01590aae3ebed5166bf02230934fd437", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01590aae3ebed5166bf02230934fd437");
        }
        b acquire = g.acquire();
        if (acquire == null) {
            acquire = new b();
        }
        acquire.e = i;
        acquire.f = i2;
        acquire.b = false;
        return acquire;
    }
}
