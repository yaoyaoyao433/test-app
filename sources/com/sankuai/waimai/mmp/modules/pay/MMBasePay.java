package com.sankuai.waimai.mmp.modules.pay;

import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.mmp.lib.router.AppBrandRouterCenter;
import com.meituan.mmp.lib.router.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class MMBasePay extends MTCashierActivity implements d {
    public static ChangeQuickRedirect q;

    @Override // com.meituan.android.cashier.activity.MTCashierActivity
    public final void v_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ed521bf0f992f4d273b3982739f72f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ed521bf0f992f4d273b3982739f72f9");
            return;
        }
        super.v_();
        r();
    }

    @Override // com.meituan.android.cashier.activity.MTCashierActivity
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c2bb356f1430daa41bd6c1e905726de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c2bb356f1430daa41bd6c1e905726de");
            return;
        }
        r();
        super.g();
    }

    @Override // com.meituan.android.cashier.activity.MTCashierActivity
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff080a30f9682837028c3121a92e42ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff080a30f9682837028c3121a92e42ce");
            return;
        }
        r();
        super.a(str);
    }

    private void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c8dafd456f356f1251e5d24caee9f62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c8dafd456f356f1251e5d24caee9f62");
            return;
        }
        AppBrandRouterCenter appBrandRouterCenter = AppBrandRouterCenter.INSTANCE;
        AppBrandRouterCenter.a((Class<? extends d>) getClass());
    }
}
