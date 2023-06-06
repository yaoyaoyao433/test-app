package com.sankuai.waimai.store.manager.globalcart;

import android.support.annotation.UiThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static a b;

    @UiThread
    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3dcb05c563491317364ce0057c68a225", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3dcb05c563491317364ce0057c68a225");
        }
        if (b == null) {
            b = new a();
        }
        return b;
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a437173cfec0237ae52a550b774d4139", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a437173cfec0237ae52a550b774d4139")).intValue();
        }
        com.sankuai.waimai.foundation.core.service.globalcart.a.a();
        return 14;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7bc3fcbc63a9f4c49d216201dc694f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7bc3fcbc63a9f4c49d216201dc694f7");
        } else {
            com.sankuai.waimai.foundation.core.service.globalcart.a.a().setDataChange();
        }
    }

    public final int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fad9e380f6398ebba689c4520d715ec7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fad9e380f6398ebba689c4520d715ec7")).intValue() : com.sankuai.waimai.foundation.core.service.globalcart.a.a().getOrderedNum(str);
    }
}
