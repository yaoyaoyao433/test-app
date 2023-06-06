package com.sankuai.waimai.business.order.api.pay;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e implements IOrderPayResultManager {
    public static ChangeQuickRedirect a;
    private IOrderPayResultManager b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a {
        private static final e a = new e();
    }

    public e() {
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f96a5ebb3470c17639241964648375b8", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f96a5ebb3470c17639241964648375b8") : a.a;
    }

    private IOrderPayResultManager b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6c002f95a3e8091b70546749685247c", RobustBitConfig.DEFAULT_VALUE)) {
            return (IOrderPayResultManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6c002f95a3e8091b70546749685247c");
        }
        if (this.b != null) {
            return this.b;
        }
        this.b = (IOrderPayResultManager) com.sankuai.waimai.router.a.a(IOrderPayResultManager.class, IOrderPayResultManager.KEY);
        return this.b;
    }

    @Override // com.sankuai.waimai.business.order.api.pay.IOrderPayResultManager
    @Deprecated
    public final void handlePayResult(Activity activity, int i, String str, long j, String str2, f fVar) {
        Object[] objArr = {activity, Integer.valueOf(i), str, new Long(j), str2, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b90d340585e58dcd5b37454de8aad568", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b90d340585e58dcd5b37454de8aad568");
        } else {
            b().handlePayResult(activity, i, str, j, str2, fVar);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.pay.IOrderPayResultManager
    public final void handlePayResult(Activity activity, int i, String str, String str2, String str3, f fVar) {
        Object[] objArr = {activity, Integer.valueOf(i), str, str2, str3, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e802a4468a594d9a48a83de6c242d419", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e802a4468a594d9a48a83de6c242d419");
        } else {
            b().handlePayResult(activity, i, str, str2, str3, fVar);
        }
    }
}
