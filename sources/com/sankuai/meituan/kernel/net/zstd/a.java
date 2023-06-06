package com.sankuai.meituan.kernel.net.zstd;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    e b;
    private Map<Long, Object> c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72e457ed779203ed7e306b0269b0c0b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72e457ed779203ed7e306b0269b0c0b7");
        } else {
            this.c = new ConcurrentHashMap();
        }
    }

    public final Object a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f09b54c9c67e6b9f55afed328a56b98", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f09b54c9c67e6b9f55afed328a56b98");
        }
        if (j > 0) {
            return this.c.get(Long.valueOf(j));
        }
        return null;
    }
}
