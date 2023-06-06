package com.sankuai.waimai.platform.widget.tag.virtualtag;

import android.content.Context;
import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class k extends j {
    public static ChangeQuickRedirect h;
    private static final Pools.Pool<k> i = new Pools.SynchronizedPool(32);

    private k(int i2) {
        super(i2);
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20eae6c7abf3f392c164f5469bfde62c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20eae6c7abf3f392c164f5469bfde62c");
        }
    }

    @Override // com.sankuai.waimai.platform.widget.tag.virtualtag.j
    public final int[] a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd1c8412806e38e61fb4e2d8f76d9800", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd1c8412806e38e61fb4e2d8f76d9800");
        }
        List<d> d = d();
        if (d.isEmpty()) {
            return new int[2];
        }
        int i2 = 0;
        int i3 = 0;
        for (d dVar : d) {
            if (dVar != null) {
                i2 += dVar.l + dVar.m + dVar.i.e;
                if (dVar.i.f > i3) {
                    i3 = dVar.i.f;
                }
            }
        }
        return new int[]{i2, i3};
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0979c1e605339473a19f23cd3b8a0bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0979c1e605339473a19f23cd3b8a0bb");
        } else {
            i.release(this);
        }
    }

    public static k d(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98e08f1447321b49719bffc48487710c", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98e08f1447321b49719bffc48487710c");
        }
        k acquire = i.acquire();
        if (acquire == null) {
            acquire = new k(i2);
        } else {
            acquire.a(i2);
        }
        acquire.b = false;
        return acquire;
    }
}
