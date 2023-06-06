package com.sankuai.waimai.mach.manager.load;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends RuntimeException {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.mach.manager.exception.a b;

    public b() {
    }

    public b(com.sankuai.waimai.mach.manager.exception.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24ac37f1d9ef6fc1f3d3f841f8257c4a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24ac37f1d9ef6fc1f3d3f841f8257c4a");
        } else {
            this.b = aVar;
        }
    }

    @Nullable
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3dbcc8d3764d95aabe9828a3547e20e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3dbcc8d3764d95aabe9828a3547e20e");
        }
        if (this.b != null) {
            return this.b.a();
        }
        return null;
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11f3c13d27d44e92234d07e25e2cd98a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11f3c13d27d44e92234d07e25e2cd98a")).intValue();
        }
        if (this.b != null) {
            return this.b.c;
        }
        return 0;
    }
}
