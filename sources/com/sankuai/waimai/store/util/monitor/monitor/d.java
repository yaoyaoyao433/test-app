package com.sankuai.waimai.store.util.monitor.monitor;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends c {
    public static ChangeQuickRedirect a;
    private String b;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.c
    public final boolean d() {
        return true;
    }

    public d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc5c2d218903ee99169c28acbc9f8329", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc5c2d218903ee99169c28acbc9f8329");
        } else {
            this.b = str;
        }
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.c
    public final b b() {
        return b.NORMAL;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.c
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e5446a9b9d63f24bbd2d1465da13c18", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e5446a9b9d63f24bbd2d1465da13c18") : TextUtils.isEmpty(this.b) ? super.a() : this.b;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.c
    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bbe31ab76d9a136c111eda5f988714d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bbe31ab76d9a136c111eda5f988714d") : super.c();
    }
}
