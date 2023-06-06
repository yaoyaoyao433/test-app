package com.sankuai.waimai.bussiness.order.init;

import android.app.Application;
import com.meituan.android.yoda.plugins.a;
import com.meituan.android.yoda.plugins.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.platform.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderInit extends AbsInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "OrderInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec4d5f41fe7131ebb5de76d1ca53ca46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec4d5f41fe7131ebb5de76d1ca53ca46");
        } else {
            initYodaSdk();
        }
    }

    private static void initYodaSdk() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "36b059ce4b16a0684fa5f82a397dab76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "36b059ce4b16a0684fa5f82a397dab76");
        } else {
            d.a().a(new a() { // from class: com.sankuai.waimai.bussiness.order.init.OrderInit.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.yoda.plugins.a
                public final String a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1b103746589c9c48e3825aa79c42224e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1b103746589c9c48e3825aa79c42224e") : b.A().E();
                }
            });
        }
    }
}
